import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi văn bản
        System.out.print("Nhập chuỗi văn bản: ");
        String text = scanner.nextLine();

        // Nhập từ cần tìm
        System.out.print("Nhập từ cần tìm: ");
        String word = scanner.nextLine();

        // Tìm vị trí đầu tiên của từ trong chuỗi
        int position = text.indexOf(word);

        // Kiểm tra kết quả
        if (position != -1) {
            System.out.println("Tìm thấy từ \"" + word + "\" tại vị trí: " + position);
        } else {
            System.out.println("Không tìm thấy từ \"" + word + "\" trong chuỗi.");
        }

        scanner.close();
    }
}