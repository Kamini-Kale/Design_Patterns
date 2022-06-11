abstract class Starbuzz
{
void preparebeverage()
{
 boilwater();
 addingredients();
 addsugar();
 addmilk();
 boil();
 pourincup();
}

void boilwater()
{
System.out.println("Boil Water");
}
abstract void addingredients();

void addsugar()
{
System.out.println("Add Sugar");
}
void addmilk()
{
System.out.println("Add Milk");
}
void boil()
{
System.out.println("Boil the Mixture");
}
void pourincup()
{
System.out.println("Pour in Cup");
}
}
