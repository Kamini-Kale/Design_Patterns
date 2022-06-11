class PizzaDemo
{
  public static void main(String[] args){

       PizzaStore ps;
       ps = new NagpurPizzaStore();
       ps.orderPizza("Cheese");

       PizzaStore ps1;
       ps1 = new NagpurPizzaStore();
       ps1.orderPizza("Corn");

       PizzaStore ps2;
       ps2 = new NagpurPizzaStore();
       ps2.orderPizza("Veggie");

        PizzaStore ps3;
       ps3 = new WardhaPizzaStore();
       ps3.orderPizza("Cheese");

        PizzaStore ps4;
       ps4 = new WardhaPizzaStore();
       ps4.orderPizza("Cheese");


        PizzaStore ps5;
       ps5 = new WardhaPizzaStore();
       ps5.orderPizza("Cheese");
}
}
