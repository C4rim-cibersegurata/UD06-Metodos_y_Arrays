package bootcamp_java_UD06;

public class Ex5 {
	public static String decToBinary(int num) {
		String binari = "";
	     int binary[] = new int[0];    
	    /* while(num > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }*/    
	    /*for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }*/ 
		/*while (num>0) {
			if (num % 2 == 0 || num % 2 == 1) {
				binari = binari + (String.valueOf(num % 2));
				num = num / 2;
			} 
			
		}*/
		return binari;
	}

	public static void main(String[] args) {
		System.out.print(decToBinary(31));
	}

}
