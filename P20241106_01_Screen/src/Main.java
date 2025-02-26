
public class Main {
	
	public static void main(String[] args) {
		
		byte[] schermo = new byte[8];
        schermo[0] = 0b00000000;
        schermo[1] = 0b00011000;
        schermo[2] = 0b00100100;
        schermo[3] = 0b01100110;
        schermo[4] = 0b01111110;
        schermo[5] = 0b01100110;
        schermo[6] = (byte)0b11100111;
        schermo[7] = 0b00000000;

        disegna(schermo);
        
	}
	
	private static void disegna(byte[] schermo) {
		
		for(int i= 0; i < schermo.length; i++) {
			byte b = schermo[i];
			
			int valore = 128;
			for(int pos = 0; pos < 8; pos++) {
				
				/* se il bit in posizione pos vale 0, stampo ' '
				 * se il bit in posizione pos vale 1, stampo '*'
				 */
				if(!((b & valore) == 0)) {
					System.out.print(' ');
					
				}else {
					System.out.print('x');
				}
				
				valore /= 2;
				
			}
			System.out.println();
			
		}
    	
    }

}
