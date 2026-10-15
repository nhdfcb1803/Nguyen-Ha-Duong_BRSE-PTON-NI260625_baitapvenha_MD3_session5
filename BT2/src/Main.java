public class Main {
    public static void main(String[] args) {

        // Khởi tạo chuỗi ban đầu
        StringBuilder sb = new StringBuilder("Hello, Java World!");

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + sb);

        // Xóa các ký tự từ vị trí 5 đến 9
        sb.delete(5, 10);
        System.out.println("Chuỗi sau khi xóa: " + sb);

        // Thay thế đoạn "World" bằng "Universe"
        int start = sb.indexOf("World");

        if (start != -1) {
            sb.replace(start, start + 5, "Universe");
        }

        // In chuỗi sau khi thay thế
        System.out.println("Chuỗi sau khi thay thế: " + sb);
    }
}