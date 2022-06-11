class IceCream extends Toppings
{
Coffee c;
IceCream(Coffee c)
{
this.c=c;
}
String getDescription()
{
return(c.getDescription()+"With IceCream");
}
double cost(){
double Coffeecost=c.cost();
return(Coffeecost+60);
}
