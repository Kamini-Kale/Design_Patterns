abstract class PizzaStore 
{
 Pizza p;
   Pizza orderPizza(String name)
  {
  
 p=createPizza(name);
 p.prepare();
 p.bake();
 p.cut();
 p.pack();
p.DisplayIngredients();
 return p;
}

 abstract Pizza createPizza(String name);
}
