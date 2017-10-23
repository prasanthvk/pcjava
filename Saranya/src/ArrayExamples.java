
public class ArrayExamples {
    public static char firstNonRepeatChar(String s){
    	char[] a = new char[s.length()];
    	s.getChars(0, s.length(), a, 0);
    	System.out.println(a);
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abacabad";
        firstNonRepeatchar(s);
        //String s1 = "abacabaabacaba";
        //firstNonRepeatchar(s1);
        	
	}

}
a -- bacabad
