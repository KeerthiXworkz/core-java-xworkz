class MusicalInstrumentsTester{

public static void main(String main[]){

MusicalInstruments instrument1 =new MusicalInstruments();
instrument1.name="Acoustic Guitar";
instrument1.type="String";
instrument1.price=200;
instrument1.color="white";
instrument1.forMusic();

System.out.println(instrument1.name+"|"+instrument1.type+"|"+instrument1.price+"|"+instrument1.color);

MusicalInstruments instrument2 =new MusicalInstruments();
instrument2.name="Electric Keyboard";
instrument2.type="Keyboard";
instrument2.price=100;
instrument2.color="Black";
instrument2.forMusic();

System.out.println(instrument2.name+"|"+instrument2.type+"|"+instrument2.price+"|"+instrument2.color);

MusicalInstruments instrument3 =new MusicalInstruments();
instrument3.name="Violin";
instrument3.type="String";
instrument3.price=50;
instrument3.color="blue";
instrument3.forMusic();

System.out.println(instrument3.name+"|"+instrument3.type+"|"+instrument3.price+"|"+instrument3.color);

MusicalInstruments instrument4 =new MusicalInstruments();
instrument4.name="Drum Set";
instrument4.type="Percussion";
instrument4.price=60;
instrument4.color="Red";
instrument4.forMusic();

System.out.println(instrument4.name+"|"+instrument4.type+"|"+instrument4.price+"|"+instrument4.color);

MusicalInstruments instrument5 =new MusicalInstruments();
instrument5.name="Saxophone";
instrument5.type="Woodwind";
instrument5.price=150;
instrument5.color="black";
instrument5.forMusic();

System.out.println(instrument5.name+"|"+instrument5.type+"|"+instrument5.price+"|"+instrument5.color);

MusicalInstruments instrument6 =new MusicalInstruments();
instrument6.name="Trumpet";
instrument6.type="Brass";
instrument6.price=120;
instrument6.color="Blue";
instrument6.forMusic();

System.out.println(instrument6.name+"|"+instrument6.type+"|"+instrument6.price+"|"+instrument6.color);

MusicalInstruments instrument7 =new MusicalInstruments();
instrument7.name="Electric Bass Guitar";
instrument7.type="String";
instrument7.price=200;
instrument7.color="sky blue";
instrument7.forMusic();

System.out.println(instrument7.name+"|"+instrument7.type+"|"+instrument7.price+"|"+instrument7.color);

MusicalInstruments instrument8 =new MusicalInstruments();
instrument8.name="Piano";
instrument8.type="Keyboard";
instrument8.price=250;
instrument8.color="Grey";
instrument8.forMusic();

System.out.println(instrument8.name+"|"+instrument8.type+"|"+instrument8.price+"|"+instrument8.color);

MusicalInstruments instrument9 =new MusicalInstruments();
instrument9.name="Cello";
instrument9.type="String";
instrument9.price=300;
instrument9.color="orange";
instrument9.forMusic();

System.out.println(instrument9.name+"|"+instrument9.type+"|"+instrument9.price+"|"+instrument9.color);

MusicalInstruments instrument10 =new MusicalInstruments();
instrument10.name="Digital Drum Pad";
instrument10.type="Percussion";
instrument10.price=500;
instrument10.color="Brown";
instrument10.forMusic();

System.out.println(instrument10.name+"|"+instrument10.type+"|"+instrument10.price+"|"+instrument10.color);
}
}