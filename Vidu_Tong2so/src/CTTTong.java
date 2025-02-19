import java.util.Scanner;

/**
 * 
 */
public class CTTTong {

	/**
	 * @param args
	 */
	public static void main(String[]2 args) {
		//In ra 1 dòng tiêu đề App
		System.out.print("CT TINH TONG \n");
		
		//Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		
		//In dòng huong nhan moi nhập A
		System.out.println("Mời nhập a: ");
		double a = banPhim.nextDouble();
		System.out.println("Mời nhập b: ");
		double b = banPhim.nextDouble();

		//Tính toán 
		double Tong = a + b;
		
		//In ra kết quả
		System.out.print("Tong la : ");
		System.out.print(Tong);
		
	}

}