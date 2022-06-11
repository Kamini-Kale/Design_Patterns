abstract class Pizza
{     
      Sauce s;
      Dough d;
      Cheese c;
 abstract public void prepare();
 public void bake()
 {
System.out.println("Pizza getting baked...");

 }

public void cut()
 {
  System.out.println("Pizza is cut into the pieces");
 }

public void pack()
 {
  System.out.println("Pizza is packed into the boxex.....");
 }


public void DisplayIngredients()
{
d.display();
s.display();
c.display();
}

}

