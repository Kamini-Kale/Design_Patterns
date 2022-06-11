class NagpurIngredientFactory implements PizzaIngredientFactory
{
  public Sauce createsauce()
{
    return new ChilliSauce();
}
  public Dough createdough()
{

    return new ThickDough();
}
   public Cheese createcheese()
{
   return new MozarellaCheese();
}
}
