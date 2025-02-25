package GarbageCollection;

class GarbageExample {
    protected void finalize() {
        System.out.println("Đối tượng bị thu gom");
    }

    public static void main(String[] args) {
        GarbageExample obj1 = new GarbageExample();
        GarbageExample obj2 = new GarbageExample();
        obj1 = null;
        obj2 = null;
        System.gc(); // Gợi ý chạy Garbage Collector
    }
}
//Java có cơ chế tự động thu dọn bộ nhớ thông qua Garbage Collector
//**finalize():** Được gọi khi đối tượng bị xóa khỏi bộ nhớ