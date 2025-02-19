/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Khởi tạo scanner
		Scanner scanner = new Scanner(System.in);
        
        // Nhập các hệ số của phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Xuất kết quả
        System.out.println("Delta = " + delta);
        
        // Nếu delta >= 0, tính căn delta
        if (delta >= 0) {
            double sqrtDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + sqrtDelta);
        } else {
            System.out.println("Delta âm, không có căn delta thực.");
        }
        
        scanner.close();
	}

}