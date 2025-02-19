/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class ChuviDT {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			//Khởi tạo Scanner
			 Scanner scanner = new Scanner(System.in);
		        
	        // Nhập 2 cạnh của hình chữ nhật
	        System.out.print("Nhập chiều dài của hình chữ nhật: ");
	        double dai = scanner.nextDouble();
	        
	        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	        double rong = scanner.nextDouble();
	        
	        // Tính chu vi, diện tích và cạnh nhỏ
	        double chuvi = 2 * (dai + rong);
	        double dientich = dai * rong;
	        double canhnho = Math.min(dai, rong);
	        
	        // Xuất kết quả
	        System.out.println("Chu vi của hình chữ nhật: " + chuvi);
	        System.out.println("Diện tích của hình chữ nhật: " + dientich);
	        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhnho);
	        
	        //Đóng scanner
	        scanner.close();

	}

}