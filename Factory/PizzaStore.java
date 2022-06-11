abstract class PizzaStore 
{
 Pizza p;
   Pizza orderPizza(String name)
  {
  
 p= createpizza(name);
 p.bake();
 p.cut();
 p.pack();
 p.DisplayIngredients();
 return p;
}

 abstract Pizza  createpizza(String name);
}
