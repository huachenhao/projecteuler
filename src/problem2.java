
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1;
		int f2;
		int f3;
		int sum = 0;
		
		f1 = 1;
		f2 = 2;
		f3 = f1 + f2;
		while (f1 <= 4000000) {
//			System.out.println(f1);
			if (f1 % 2 == 0) {
				sum += f1;
			}
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println(sum);
	}

}
