/**
 * 
 */
import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập họ và tên sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        // Nhập điểm trung bình của sinh viên
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        
        // Xuất thông tin sinh viên ra màn hình
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        
        // Đóng scanner
        scanner.close();
    }
}