package cinema_Seller;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

public class Body_Cinema_SELL extends JPanel implements Method_For_Button {
    private static final long serialVersionUID = 1L;
    private JTextArea receiptArea;
    private JTextField totalField;
    private JCheckBox chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros,chkFilm_Marvel,
    					chkFilm_JohnWick,chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
    					chkPopcorn, chkDrink;
    private JSpinner spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros,spnFilm_Marvel,
					 spnFilm_JohnWick,spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde, 
    				 spnPopcorn, spnDrink;
    private JLabel JTxTTime, JTxTDate;
    private JLabel lblImage;
    
    @Override
    public void calculateTotal(ActionEvent e) {
        CinemaMethods.calculateTotal(receiptArea, totalField, 
            chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros, chkFilm_Marvel,
            chkFilm_JohnWick, chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
            spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros, spnFilm_Marvel,
            spnFilm_JohnWick, spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde,
            chkPopcorn, spnPopcorn, chkDrink, spnDrink);
    }

    @Override
    public void resetFields() {
        CinemaMethods.resetFields(receiptArea, totalField, 
            chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros, chkFilm_Marvel,
            chkFilm_JohnWick, chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
            spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros, spnFilm_Marvel,
            spnFilm_JohnWick, spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde,
            chkPopcorn, spnPopcorn, chkDrink, spnDrink);
    }

    @Override
    public void saveReceipt(ActionEvent e) {
    	CinemaMethods.saveReceipt(receiptArea, this);
    }

    public Body_Cinema_SELL() {
        setLayout(new BorderLayout());

        // Panel chứa hóa đơn và tổng tiền
        JPanel receiptPanel = new JPanel();
        receiptPanel.setPreferredSize(new Dimension(450, 600));
        receiptPanel.setBorder(new LineBorder(Color.BLACK));
        receiptPanel.setLayout(null);

        
        receiptArea = new JTextArea("⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️\n"
        						  + "⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️CINEMA RECEIPT⭐️⭐️⭐️⭐️⭐️⭐️⭐\n"
        						  +"⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐\n");
        
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);
        scrollPane.setBounds(10, 10, 430, 450);
        receiptPanel.add(scrollPane);

        JLabel lblTotal = new JLabel("TOTAL :");
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblTotal.setBounds(10, 470, 80, 30);
        receiptPanel.add(lblTotal);

        totalField = new JTextField("0 VND");
        totalField.setFont(new Font("Segoe UI", Font.BOLD, 16));
        totalField.setBounds(100, 470, 300, 30);
        totalField.setEditable(false);
        receiptPanel.add(totalField);

    
        
        
        JPanel panel = new JPanel();
        panel.setBounds(20, 518, 380, 78);
        receiptPanel.add(panel);
        panel.setLayout(null);

        JTxTDate = new JLabel("Loading...");
        JTxTDate.setBounds(0, 0, 380, 42);
        JTxTDate.setForeground(new Color(0, 128, 255));
        JTxTDate.setFont(new Font("Yu Mincho Light", Font.BOLD, 25));
        panel.add(JTxTDate);

        JTxTTime = new JLabel("Loading...");
        JTxTTime.setForeground(new Color(255, 0, 0));
        JTxTTime.setVerticalAlignment(SwingConstants.BOTTOM);
        JTxTTime.setFont(new Font("Yu Mincho Light", Font.BOLD, 25));
        JTxTTime.setBounds(0, 36, 380, 42);
        panel.add(JTxTTime);

        setTime(); 

        add(receiptPanel, BorderLayout.WEST);

        
        JPanel productContainer = new JPanel();
        productContainer.setLayout(new BoxLayout(productContainer, BoxLayout.Y_AXIS));
        productContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Thêm các sản phẩm vào container
        
        addProduct(productContainer, "Popcorn", "30,000 VND", true, 10, "/icon_flim/Popcorn.png");
        addProduct(productContainer, "drink", "20,000 VND", true, 10, "/icon_flim/Drink.png");
        
        
        //flim
      //addProduct(productContainer, "ticket Film Dune: Part Two", " 55,000 VND", true, 10,"/icon_flim/film Titanic ticket.png.jpg");
        addProduct(productContainer, "ticket Film Elemental", " 50,000 VND", true, 10,"/icon_flim/film Elemental ticket.png");
        addProduct(productContainer, "ticket Film Encanto", " 45,000 VND", true, 10,"/icon_flim/film Encanto ticket.png");
        addProduct(productContainer, "ticket Film Puss in Boots", "50,000 VND", true, 10,"/icon_flim/film Puss in Boots ticket.png");
        addProduct(productContainer, "ticket Film Mario Bros Movie", "45,000 VND", true, 10,"/icon_flim/film Mario Bros ticket.png");
        addProduct(productContainer, "ticket Film Marvel", " 60,000 VND", true, 10,"/icon_flim/film Marvel ticket.png");
        addProduct(productContainer, "ticket Film John Wick", " 50,000 VND", true, 10,"/icon_flim/film John Wick ticket.png");
        addProduct(productContainer, "ticket Film Oppenheimer", " 55,000 VND", true, 10,"/icon_flim/film Oppenheimer ticket.png");
        addProduct(productContainer, "ticket Film Dune", " 60,000 VND", true, 10,"/icon_flim/film Dune ticket.png");
        addProduct(productContainer, "ticket Film Blonde", " 45,000 VND", true, 10,"/icon_flim/film Blonde ticket.png");



        // Thêm container vào JScrollPane
        JScrollPane productScrollPane = new JScrollPane(productContainer);
        productScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(productScrollPane, BorderLayout.CENTER);

        // Thêm các nút chức năng
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton btnCalculate = createButton("Calculate", Color.GREEN, e -> {
        	CinemaMethods.calculateTotal(receiptArea, totalField, 
        	        chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros,chkFilm_Marvel,
        	        chkFilm_JohnWick,chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
        	        spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros,spnFilm_Marvel,
        	        spnFilm_JohnWick,spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde,
        	        chkPopcorn, spnPopcorn, chkDrink, spnDrink);
        });

        JButton btnReset = createButton("RESET", Color.YELLOW, e -> {
            CinemaMethods.resetFields(receiptArea, totalField, 
            		chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros,chkFilm_Marvel,
					chkFilm_JohnWick,chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
					spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros,spnFilm_Marvel,
					 spnFilm_JohnWick,spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde,
                     chkPopcorn, spnPopcorn, chkDrink, spnDrink);
        });

        JButton btnSave = createButton("PRINT RECEIPT", Color.CYAN, e -> {
            CinemaMethods.saveReceipt(receiptArea, Body_Cinema_SELL.this);
        });

        buttonPanel.add(btnCalculate);
        buttonPanel.add(btnReset);
        buttonPanel.add(btnSave);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addProduct(JPanel panel, String name, String price, boolean isSelectable, int maxQty, String imagePath) {
        JPanel product = new JPanel();
        product.setLayout(null);
        product.setBorder(new LineBorder(Color.GRAY));  // Thêm viền cho panel chứa sản phẩm
        product.setPreferredSize(new Dimension(400, 100));

        JLabel lblName = new JLabel(name);
        lblName.setBounds(10, 10, 200, 20);
        product.add(lblName);

        JLabel lblPrice = new JLabel("Price: " + price);
        lblPrice.setBounds(10, 40, 200, 20);
        product.add(lblPrice);

        JCheckBox checkBox = new JCheckBox("Select");
        checkBox.setBounds(10, 70, 80, 20);
        product.add(checkBox);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, maxQty, 1));
        spinner.setBounds(95, 71, 50, 20);
        product.add(spinner);
        
        // Tải ảnh từ classpath và căn giữa ảnh
        URL resource = getClass().getResource(imagePath);
        if (resource != null) {
            ImageIcon icon = new ImageIcon(resource);
            lblImage = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH)));
            
            // Đặt ảnh ở giữa panel
            lblImage.setBounds(200, 10, 100, 80); 
            lblImage.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
            											
            lblImage.setHorizontalAlignment(SwingConstants.CENTER);  
            product.add(lblImage);
        } else {
            System.err.println("Không tìm thấy ảnh: " + imagePath);
        }

        // Gắn checkbox và spinner vào các đối tượng đúng
        if (name.contains("Film Elemental")) {
            chkFilm_Elemental = checkBox;
            spnFilm_Elemental = spinner;
        }
        else if (name.contains("Film Encanto")) 
        {
        	chkFilm_Encanto = checkBox;
        	spnFilm_Encanto = spinner;
        } 
        else if (name.contains("Film Puss in Boots")) 
        {
        	chkFilm_PussinBoots = checkBox;
        	spnFilm_PussinBoots = spinner;
        } 
        else if (name.contains("Film Mario Bros Movie")) 
        {
        	chkFilm_MarioBros = checkBox;
        	spnFilm_MarioBros = spinner;
        } 
        else if (name.contains("Film Marvel")) 
        {
        	chkFilm_Marvel = checkBox;
        	spnFilm_Marvel = spinner;
        } 
        else if (name.contains("Film John Wick")) 
        {
        	chkFilm_JohnWick = checkBox;
        	spnFilm_JohnWick = spinner;
        } 
        else if (name.contains("Film Oppenheimer")) 
        {
        	chkFilm_Oppenheimer = checkBox;
        	spnFilm_Oppenheimer = spinner;
        } 
        else if (name.contains("Film Dune")) 
        {
        	chkFilm_Dune = checkBox;
        	spnFilm_Dune = spinner;
        } 
        else if (name.contains("Film Blonde")) 
        {
        	chkFilm_Blonde = checkBox;
        	spnFilm_Blonde = spinner;
        }
        else if (name.contains("Popcorn")) 
        {
            chkPopcorn = checkBox;
            spnPopcorn = spinner;
        } 
        else if (name.contains("drink")) 
        {
            chkDrink = checkBox;
            spnDrink = spinner;
        }

        panel.add(product);
    }


    private JButton createButton(String text, Color color, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button.setBackground(color);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(actionListener);
        return button;
    }

    private void setTime() {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Date date = new Date();
                SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                String time = tf.format(date);
                JTxTTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                JTxTDate.setText(df.format(date));
            }
        }).start();
    }
}
