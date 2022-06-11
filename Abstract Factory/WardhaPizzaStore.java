class WardhaPizzaStore extends PizzaStore 
{
  Pizza createPizza(String name){

 Pizza p = null;
 PizzaIngredientFactory pif = new WardhaIngredientFactory();

   if(name.equalsIgnoreCase("Cheese"))
{
   p = new CheesePizza(pif);
}
   else if(name.equalsIgnoreCase("Corn"))
{
   p = new CornPizza(pif);
}
  else if(name.equalsIgnoreCase("Veggie"))
{
   p = new VeggiePizza(pif);
}
return (p);
}
}
