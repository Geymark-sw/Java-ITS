
public class Main {
	
	private static void stampaVint(int[] vint) {
		for(int v: vint){
			System.out.print(v + " ");
			
		}
		System.out.println();
	}
	
	private static void Eratostene(int n) {
		
		boolean[] v = new boolean[1000000000];
		
		for(int i=2; i<v.length; i++) {
			v[i] = true;
		}
		
		for(int i=2; i<v.length; i++) {
			
			if(v[i]==true) {
				System.out.println(i + " è un numer primo");
				
				
				for(int k=i+i; k<v.length; k+=i) {
					v[k] = false;
				}
			}
			
		}
		
		
	}
	
	private static int fattoriale(int n) {
		int p = 1;
		
		for(int i=2; i<n; i++) {
			
			p*=i;
			
		}
		
		return p;
		
	}
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}else  {
			
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		int[] vint = new int[100];
		double[] vdou = new double[100];
		
		System.out.println(vint);
		System.out.println(vdou);
		
		for(int i=0; i<100; i++) {
			vint[i]= i+1;
			
		}
		
		for(int i=100; i>0; i--) {
			vint[100-i] = i;
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(vint[i]);
			
		}
		
		stampaVint(vint);
		
		for(int i=0; i<100; i++) {
			vint[i] = (i+1)*2;
		}
		
		//fibonacci
		
		vint[0] = 1;
		vint[1] = 1;
		
		for(int i=2; i<=100; i++) {
			vint[i] = vint[i-1] + vint[i-2];
		}
		
		
		Eratostene(10000);
		
		
		//fattoriale
		System.out.println(fattoriale(15));
		
		
		//Inserire ne vettore vdou la seguente serie geometrica;
		//1/2^0, 1/2^1, 1/2^2, 1/2^3
		for(int i=0; i<100; i++) {
			vdou[i] = 1.0/Math.pow(2, i);
			
		}
		
		//Stessa cosa senza pow()
		
		for
		
		}

	
	}

