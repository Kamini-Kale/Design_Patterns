abstract class Duck
{
FlyBehavior fb;
QuackBehavior qb;
public void swim()
{
System.out.println(" I can swim");
}

abstract void display();

public void performfly()
{
fb.fly();
}
public void performquack()
{
qb.quack();
}
}
