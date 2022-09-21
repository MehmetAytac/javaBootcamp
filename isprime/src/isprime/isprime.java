package isprime;

public class isprime {
	public static void main(String[] args) {
		
		
		int num=-5;
		
		boolean prime = true;
		
		if(num==1) {
			System.out.println("Asal değildir");
			return;
		}
		
		if(num < 1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				prime = false;
			}
			
		}
		if (prime) {
			System.out.println("Asaldır");
			
		}
		
		else {
			System.out.println("Asal değildir");
		}
	}
}
