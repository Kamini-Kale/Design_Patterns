class CafeCoffee {
public static void main (String args[])
{
Coffee Espresso=new Espresso();
Toppings Mocha=new Mocha(Espresso);

System.out.println("Your order is "+Mocha.getDescription());
System.out.println("Total cost is "+Mocha.cost());
}
}
