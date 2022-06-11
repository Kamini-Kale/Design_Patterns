class HomeTheaterRemote
{
Light l;
AC ac;
PopcornPopper po;
Projector p;
Screen s;
Amplifier amf;
DVDPlayer dvd;
CDPlayer cd;
HomeTheaterRemote(Light l,AC ac,PopcornPopper po,Projector p,Screen s,Amplifier amf,DVDPlayer dvd,CDPlayer cd)
{
this.l=l;
this.ac=ac;
this.po=po;
this.p=p;
this.s=s;
this.amf=amf;
this.dvd=dvd;
this.cd=cd;
}
void watchmovie()
{
System.out.println("Watch The Movie........................");
l.dim();
po.pon();
p.on();
s.down();
amf.aon();
amf.setvolume(5);
dvd.don();
cd.con();

}
void endmovie()
{
System.out.println("End The Movie.........................");
l.on();
po.poff();
p.off();
s.up();
amf.aoff();
dvd.doff();
cd.coff();
}

}

