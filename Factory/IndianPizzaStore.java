class IndianPizzaStore extends PizzaStore 
{
  Pizza  createpizza(String name){

 Pizza p = null;
   if(name.equalsIgnoreCase("Indian corn pizza"))
{
             p = new IndianCornPizza();
}

 else if(name.equalsIgnoreCase("Indian cheese pizza"))
{
   p= new IndianCheesePizza();
}

 else if(name.equalsIgnoreCase("Indian veggie pizza"))
{
   p= new IndianVeggiePizza();
}
 return p;
}
}
