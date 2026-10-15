import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String text = scanner.nextLine();

        // Thay thế tất cả các chữ số bằng *
        String result = text.replaceAll("\\d", "*");

        // In kết quả
        System.out.println("Kết quả: " + result);

        scanner.close();
    }
}