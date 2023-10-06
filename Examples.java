public class Examples
{
	public static void main(String[] args)
	{
		
		String metro="travel from one place to another";
		String famousTemple="iskcon";
		String location="mahalakshmi";
		String god="krishna";
		String birthplace="mathura";
		String mother="devaki";
		String wife="rukmini";
		String brother="balram";
		String festival="Janmashtami";
		String Charioteer="arjuna";
		
		
		boolean returnBoolean=mother.isEmpty();
		System.out.println(returnBoolean);
		
		int returnedlength=metro.length();
		System.out.println(returnedlength);
		
		boolean returnedBoolean=location.equals(birthplace);
		System.out.println(returnedBoolean);
		
		char returnCharacter=mother.charAt(4);
		System.out.println(returnCharacter);
		
		
		String convertedStringToUpper=brother.toUpperCase();
		System.out.println(convertedStringToUpper);
		
		String convertedStringToLower=festival.toLowerCase();
		System.out.println(convertedStringToLower);
		
		String trimmedString=famousTemple.trim();
		System.out.println(trimmedString);
		
		String charioteer=String.valueOf(4);
		System.out.println(charioteer);
		
		int returnAscii=festival.codePointAt(2);
		System.out.println(returnAscii);
		
		
		boolean returnValue=location.equalsIgnoreCase(brother);
		System.out.println(returnValue);
		
		String returnConcat=god.concat(festival);
		System.out.println(returnConcat);
		
	 
		 String returnReplace=god.replace('r','i');
		 System.out.println(returnReplace);
		 
		 System.out.println("-----------------------------");
		 
		 //additional methods
		 
		 System.out.println("-----------------------------");
		 
		boolean returnStartWord=god.startsWith("krishna");
		System.out.println(returnStartWord);
		
		boolean endingWord=festival.endsWith("janmashtami");
		System.out.println(endingWord);
		
		char[] charArray=festival.toCharArray();
		for(int i=0;i<charArray.length;i++)
	    System.out.println(charArray[i]);
		
		String[] splittedString=location.split(" ");
		for(int i=0;i<splittedString.length;i++)
		System.out.println(splittedString[i]);
				
		int returnIndexValue=god.indexOf('r');
		System.out.println(returnIndexValue);
		
		int returnCodeBefore=god.codePointBefore(3);
		System.out.println(returnCodeBefore);
		
	}
}
		
		
		
		
	
	