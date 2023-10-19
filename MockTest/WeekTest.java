public class WeekTest {
	public static void main(String[] args){
     String bank="deposit";
	 String car="bmw";
	 String bike="honda";
	 String tv="watch movies";
     String bag="carry";
	
	
	    String obj= new String("welcome to java");
		String concepts= new String("strings");
		String definition= new String("sequence of characters");
		String enclosed= new String("double quotes");
        String methods=new String("isempty");
		
	
		
		
		int returnedlength=bank.length();
		System.out.println(returnedlength);
		
		boolean returnBoolean=tv.isEmpty();
		System.out.println(returnBoolean);
		
	
		boolean returnedBoolean=obj.equals(methods);
		System.out.println(returnedBoolean);
		
		char returnCharacter=definition.charAt(4);
		System.out.println(returnCharacter);
		
		
		String convertedStringToUpper=bag.toUpperCase();
		System.out.println(convertedStringToUpper);

		
		String trimmedString=bike.trim();
		System.out.println(trimmedString);
	
		
		int returnAscii=concepts.codePointAt(2);
		System.out.println(returnAscii);
	
		boolean returnStartWord=concepts.startsWith("strings");
		System.out.println(returnStartWord);
		
		char[] charArray=tv.toCharArray();
		for(int i=0;i<charArray.length;i++)
	    System.out.println(charArray[i]);
		
		String[] splittedString=definition.split(" ");
		for(int i=0;i<splittedString.length;i++)
		System.out.println(splittedString[i]);
				
		
		
	}
}	
	
   /* public static void main(String[] args) {
        
        WeekTest test = new WeekTest();
        
        test.length();
		test.isEmpty();
		test.equals();
		test.charAt();
		test.toUpperCase();
		test.trim();
		test.codePointAt();
		test.startsWith();
		test.charArray();
		test.split();*/
    


