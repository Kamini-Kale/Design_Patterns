class VeggiePizza extends Pizza
{
   PizzaIngredientFactory pif;
   VeggiePizza(PizzaIngredientFactory pif)
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
