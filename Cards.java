public class Cards {
    // Instance variables
     int cardNumber;
     String cardSuit;
     boolean isFaceCard;
     String cardColor;
     String shape;
     boolean isBlack;
    boolean isQueen;

    // Static variables
     static int numberOfCards = 52;
     static int numberOfRedCards = 26;
     static int numberOfBlackCards = 26;

    // Constructor
    public Cards(int cardNumber, String cardSuit, boolean isFaceCard, String cardColor,String shape,boolean isBlack,boolean isQueen) {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
        this.isFaceCard = isFaceCard;
        this.cardColor = cardColor;
		this.shape=shape;
		this.isBlack=isBlack;
		this.isQueen=isQueen;
	}

       public static void main(String[] args){
		   Cards obj1=new Cards(3,"king",true,"red","diamond",true,false);
		   System.out.println(obj1.cardColor);
		   
		   
		   Cards obj2=new Cards(4,"ace",false,"black","club",false,true);
		   System.out.println(obj2.isFaceCard);
		   
		   Cards obj3=new Cards(2,"queen",true,"red","hearts",true,false);
		   System.out.println(obj3.shape);
		   
		   
	   }
	}