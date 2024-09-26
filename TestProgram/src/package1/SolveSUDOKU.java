package package1;

import java.util.Scanner;

public class SolveSUDOKU{
    private int[][] board = new int[9][9];

    // Hàm khởi tạo, khởi tạo tất cả các giá trị trong bảng là 0
    public SolveSUDOKU(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }
    }

    // Hàm in bảng Sudoku
    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Hàm kiểm tra tính hợp lệ của một số trong bảng Sudoku
    public boolean isValid(int row, int col, int num) {
        // Kiểm tra hàng
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Kiểm tra cột
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Kiểm tra ô 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Hàm giải Sudoku bằng đệ quy
    public boolean solveSudoku() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // Ô trống
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku()) {
                                return true; // Đã giải xong
                            }

                            board[row][col] = 0; // Quay lui nếu không thành công
                        }
                    }
                    return false; // Không có số hợp lệ cho ô này
                }
            }
        }
        return true; // Sudoku đã được giải
    }

    // Hàm khởi tạo bảng Sudoku từ người dùng
    public void inputBoard() {
        Scanner scanner = new Scanner(System.in);
        
    scanner.close();
    }

    public static void main(String[] args) {
        // Sửa tên class để khởi tạo đối tượng
        SolveSUDOKU game = new SolveSUDOKU();

        // Nhập bảng Sudoku từ người dùng
        game.inputBoard();

        // In bảng Sudoku đã nhập
        System.out.println("\nBảng Sudoku ban đầu:");
        game.printBoard();

        // Giải Sudoku
        if (game.solveSudoku()) {
            System.out.println("\nBảng Sudoku sau khi giải:");
            game.printBoard();
        } else {
            System.out.println("\nKhông thể giải được bảng Sudoku.");
        }
    }
}
