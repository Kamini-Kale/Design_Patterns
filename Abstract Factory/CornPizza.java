class CornPizza extends Pizza
{
   PizzaIngredientFactory pif;
   CornPizza(PizzaIngredientFactory pif)
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
