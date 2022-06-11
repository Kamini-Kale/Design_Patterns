class CheesePizza extends Pizza
{
   PizzaIngredientFactory pif;
   CheesePizza(PizzaIngredientFactory pif)
{
  this.pif=pif;
}
  public void prepare()
{
    s=pif.createsauce();
    d=pif.createdough();
    c=pif.createcheese();
  
}
}
