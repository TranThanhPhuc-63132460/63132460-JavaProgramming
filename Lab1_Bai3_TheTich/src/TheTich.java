/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Khởi tạo Scanner
		Scanner scanner = new Scanner(System.in);
        
        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        
        // Tính thể tích khối lập phương
        double thetich = Math.pow(canh, 3);
        
        // Xuất kết quả
        System.out.println("Thể tích của khối lập phương: " + thetich);
        
        //Đóng scanner
        scanner.close();

	}

}