abstract class ATMhandler
{
ATMhandler nexth;
int level;
void setnexth(ATMhandler nexth)
{
this.nexth=nexth;
}
void handlerrequest(Request r)
{
if((r.amount%100)==0)
{
if(level<=r.amount)
{
calculate(r.amount,level);
}
else if(nexth!=null)
{
nexth.handlerrequest(r);
}
}
else
{
System.out.println("Amount"+r.amount+" not multiple of 100");
}
}
void calculate(int amount,int level)
{
int no=amount/level; 
int amt=amount%level;
System.out.println(level+"Rupees note:"+no);
if(amt!=0)
{
this.handlerrequest(new Request(amt));
}
}
}
