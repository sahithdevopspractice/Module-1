package do_while;

public class even_and_odd {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Even numbers...");
		i = 0;
		do
		{
			System.out.println(i);
			 i = i + 2;
		}while ( i < 20);
		
		System.out.println("Odd numbers...");
		i = 1;
		do
		{
			System.out.println(i);
			 i = i + 2;
		}while ( i < 20);
	}

}
