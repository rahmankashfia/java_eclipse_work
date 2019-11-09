public class PlayWithBinary{

	public static void main(String[] args) {

		int n = 99;
		int count = 0;

		
		while (n != 0) {

			System.out.println(Integer.toBinaryString(n));
			System.out.println(Integer.toBinaryString(n-1));
			System.out.println("-------------------------------");
			n = n & (n - 1);
			System.out.println(Integer.toBinaryString(n));
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			count++;

		}
	}
}