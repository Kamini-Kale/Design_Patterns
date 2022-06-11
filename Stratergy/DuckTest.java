class DuckTest
{
public static void main(String[] args)
{
Duck d;
d= new RubberDuck();
d.display();
d.swim();
d.performfly();
d.performquack();

Duck r;
r= new RedHeadDuck();
r.display();
r.swim();
r.performfly();
r.performquack();

Duck m;
m= new Mallard();
m.display();
m.swim();
m.performfly();
m.performquack();

Duck w;
w= new WoodenDuck();
w.display();
w.swim();
w.performfly();
w.performquack();
}
}
