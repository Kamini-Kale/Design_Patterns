class TurkeyAdapter implements Duck
{
Turkey t;
int i;
TurkeyAdapter(Turkey t)
{
this.t=t;
}
public void quack()
{
t.gobble();
}
public void fly()
{
for(i=0;i<5;i++)
{
t.fly();
}
}


}
