public class Person{
	String name;
	int age;
	float height;
	float weight;
	String[] skill;
	
Person(String name,int age,float height,float weight,String[] skill)
{
	this.name=name;
	this.age=age;
	this.height=height;
	this.weight=weight;
	this.skill=skill;
}
String getName(){
	return this.name;
}
int getage(){
	return this.age;
}
void setheight(float height)
{
	this.height=height;
}
void setweight(float weight){
	this.weight=weight;
}
}