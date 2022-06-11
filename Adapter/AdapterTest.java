class AdapterTest
{
public static void main(String[] args)
{
Duck d=new MallardDuck();
testduck(d);

Turkey wt=new WhiteTurkey();
//testduck(wt); -----error
Duck d2=new TurkeyAdapter(wt);
testduck(d2);
}
static void testduck(Duck d)
{
d.quack();
d.fly();
}

}
