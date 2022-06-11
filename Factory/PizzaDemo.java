class PizzaDemo
{
  public static void main(String[] args){

       PizzaStore ps;
       ps = new IndianPizzaStore();
       ps.orderPizza("Indian cheese pizza");
       ps.orderPizza("Indian corn pizza");
       ps.orderPizza("Indian veggie pizza");


       PizzaStore ps1;
       ps1 = new AmericanPizzaStore();
       ps1.orderPizza("American cheese pizza");
       ps1.orderPizza("American corn pizza");
       ps1.orderPizza("American veggie pizza");

}
}
