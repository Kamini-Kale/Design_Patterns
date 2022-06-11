class AmericanPizzaStore extends PizzaStore 
{
  Pizza  createpizza(String name){

 Pizza p = null;
   if(name.equalsIgnoreCase("American corn pizza"))
{
             p = new  AmericanCornPizza();
}

 else if(name.equalsIgnoreCase("American cheese pizza"))
{
   p= new  AmericanCheesePizza();
}

 else if(name.equalsIgnoreCase("American veggie pizza"))
{
   p= new  AmericanVeggiePizza();
}
 return (p);
}
}
