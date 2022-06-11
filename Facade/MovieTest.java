class MovieTest
{
public static void main(String args[])
{
Light l=new Light();
PopcornPopper po=new PopcornPopper();
AC ac=new AC();
Screen s=new Screen();
Projector p=new Projector();
Tuner t= new Tuner();
CDPlayer cd=new CDPlayer();
DVDPlayer dvd= new DVDPlayer();
Amplifier amf=new Amplifier();

HomeTheaterRemote r= new HomeTheaterRemote(l,ac,po,p,s,amf,dvd,cd);
r.watchmovie();
r.endmovie();
}
}
