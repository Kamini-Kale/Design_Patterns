class Demo
{
static ATMhandler createchain()
{
ATMhandler Twothousand=new Twothousandhandler();
ATMhandler FiveHundred=new FiveHundredhandler();
ATMhandler TwoHundred=new  TwoHundredhandler();
ATMhandler Hundred=new  Hundredhandler();

Twothousand.setnexth(FiveHundred);
FiveHundred.setnexth(TwoHundred);
TwoHundred.setnexth( Hundred);

return(Twothousand);
}
public static void main(String args[]){
ATMhandler handler= Demo.createchain();
handler.handlerrequest(new Request(1800));
}
}
