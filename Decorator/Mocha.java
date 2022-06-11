class Mocha extends Toppings
{
Coffee c;
Mocha(Coffee c)
{
this.c=c;
}
public String getDescription()
{
return(c.getDescription()+"With Mocha");
}
double cost(){
double Coffeecost=c.cost();
return(Coffeecost+40);
}
}
