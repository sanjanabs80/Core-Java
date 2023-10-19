public class Number {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 5, 8, 10, 11, 14, 15, 18, 20};
		
		System.out.println("even number");
		for(int j=0;j<intArray.length;j++){
				if(intArray[j]%2==0){
				
					System.out.println(intArray[j]);
				
				}
		}
        
        int middleIndex = intArray.length / 2;
        System.out.println("Values from the middle:");
       if (intArray.length % 2 == 0) {
          System.out.println(intArray[middleIndex - 1]);
	   }
        System.out.println(intArray[middleIndex]);

       
        System.out.println("Reversed array by skipping one value:");
        for (int i = intArray.length - 1; i >= 0; i -= 2) {
            System.out.println(intArray[i] + " ");
		
			
		
				}
			}
		}
	


			


