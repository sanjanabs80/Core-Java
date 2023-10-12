public class Demo1{
Day day;
Month month;
Season season;
Card card;
Coin coin;
FontStyle fontStyle;
FileType fileType;
Planet planet;
LeapYear leapYear;
ProfessionType professionType;
Meal meal;
Temp temp;
MathOperation mathOperation;
Size size;
Direction direction;

    
Demo1(Day day,Month month,Season season,Card card,Coin coin,FontStyle fontStyle,FileType fileType,Planet planet,LeapYear leapYear,ProfessionType professionType,Temp temp,Meal meal,MathOperation mathOperation,Size size,Direction direction)
{
this.day=day;
this.month=month;
this.season=season;
this.card=card;
this.coin=coin;
this.fileType=fileType;
this.fontStyle=fontStyle;
this.planet=planet;
this.leapYear=leapYear;
this.professionType=professionType;
this.meal=meal;
this.temp=temp;
this.mathOperation=mathOperation;
this.size=size;
this.direction=direction;

}
void display(){
 System.out.println(day);
System.out.println(month);
System.out.println(season);
System.out.println(card);
System.out.println(coin);
System.out.println(fileType);
System.out.println(fontStyle);
System.out.println(planet);
System.out.println(leapYear);
System.out.println(professionType);
System.out.println(meal);
System.out.println(temp);
System.out.println(mathOperation);
System.out.println(size);
System.out.println(direction);
}

}

