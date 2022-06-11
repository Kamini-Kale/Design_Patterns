abstract class Pizza
{
 String name;
 String sauce;
 String dough;


 abstract public void recipe();
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
{System.out.println("Pizza Name:"+name+"Sauce:"+sauce+"Dough:"+dough);
}


}

