
public class exchange_Reverrse_String {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("arka");
		
		for(int a=0;a<sb.length()/2;a++) {//we've to perform only half of the hello
			int front=a;							//Defined Index
			int back=sb.length()-1-a;				
			
			char frontChar=sb.charAt(front);		//Defined stored char
			char backChar=sb.charAt(back);
			
			sb.setCharAt(front, backChar);			//Reverse
			sb.setCharAt(back, frontChar);
		}
				
				System.out.println(sb);
			
	}

}
