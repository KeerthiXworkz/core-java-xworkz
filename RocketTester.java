class RocketTester{

    public static void main(String[] args){
	
        Rocket rocket1 = new Rocket();
        rocket1.name = "Falcon 9";
        rocket1.manufacturer = "SpaceX";
        rocket1.height = 70;
        rocket1.diameter = 3.7;
        rocket1.payloadCapacity = 22800;
        System.out.println(rocket1.name + "|" + rocket1.manufacturer + "|" + rocket1.height + "|" + rocket1.diameter + "|" + rocket1.payloadCapacity);

        Rocket rocket2 = new Rocket();
        rocket2.name = "Delta IV";
        rocket2.manufacturer = "United Launch Alliance";
        rocket2.height = 63.4;
        rocket2.diameter = 5.1;
        rocket2.payloadCapacity = 14100;
        System.out.println(rocket2.name + "|" + rocket2.manufacturer + "|" + rocket2.height + "|" + rocket2.diameter + "|" + rocket2.payloadCapacity);

        Rocket rocket3 = new Rocket();
        rocket3.name = "Atlas V";
        rocket3.manufacturer = "United Launch Alliance";
        rocket3.height = 58.3;
        rocket3.diameter = 3.81;
        rocket3.payloadCapacity = 20000;
        System.out.println(rocket3.name + "|" + rocket3.manufacturer + "|" + rocket3.height + "|" + rocket3.diameter + "|" + rocket3.payloadCapacity);

        Rocket rocket4 = new Rocket();
        rocket4.name = "Space Launch System";
        rocket4.manufacturer = "NASA";
        rocket4.height = 98.1;
        rocket4.diameter = 8.4;
        rocket4.payloadCapacity = 130000;
        System.out.println(rocket4.name + "|" + rocket4.manufacturer + "|" + rocket4.height + "|" + rocket4.diameter + "|" + rocket4.payloadCapacity);

        Rocket rocket5 = new Rocket();
        rocket5.name = "GSLV Mk III";
        rocket5.manufacturer = "Indian Space Research Organisation";
        rocket5.height = 43.43;
        rocket5.diameter = 4;
        rocket5.payloadCapacity = 10000;
        System.out.println(rocket5.name + "|" + rocket5.manufacturer + "|" + rocket5.height + "|" + rocket5.diameter + "|" + rocket5.payloadCapacity);

        Rocket rocket6 = new Rocket();
        rocket6.name = "Long March 5";
        rocket6.manufacturer = "China National Space Administration";
        rocket6.height = 57;
        rocket6.diameter = 5;
        rocket6.payloadCapacity = 25000;
        System.out.println(rocket6.name + "|" + rocket6.manufacturer + "|" + rocket6.height + "|" + rocket6.diameter + "|" + rocket6.payloadCapacity);

        Rocket rocket7 = new Rocket();
        rocket7.name = "H-IIA";
        rocket7.manufacturer = "Mitsubishi Heavy Industries";
        rocket7.height = 53;
        rocket7.diameter = 4;
        rocket7.payloadCapacity = 10000;
        System.out.println(rocket7.name + "|" + rocket7.manufacturer + "|" + rocket7.height + "|" + rocket7.diameter + "|" + rocket7.payloadCapacity);

        Rocket rocket8 = new Rocket();
        rocket8.name = "Proton-M";
        rocket8.manufacturer = "Khrunichev State Research and Production Space Center";
        rocket8.height = 58.2;
        rocket8.diameter = 7.4;
        rocket8.payloadCapacity = 23500;
        System.out.println(rocket8.name + "|" + rocket8.manufacturer + "|" + rocket8.height + "|" + rocket8.diameter + "|" + rocket8.payloadCapacity);

        Rocket rocket9 = new Rocket();
        rocket9.name = "Ariane 5";
        rocket9.manufacturer = "Arianespace";
        rocket9.height = 57;
        rocket9.diameter = 5.4;
        rocket9.payloadCapacity = 21000;
        System.out.println(rocket9.name + "|" + rocket9.manufacturer + "|" + rocket9.height + "|" + rocket9.diameter + "|" + rocket9.payloadCapacity);

        Rocket rocket10 = new Rocket();
        rocket10.name = "Vega";
        rocket10.manufacturer = "Arianespace";
        rocket10.height = 30;
        rocket10.diameter = 3;
        rocket10.payloadCapacity = 1500;
        System.out.println(rocket10.name + "|" + rocket10.manufacturer + "|" + rocket10.height + "|" + rocket10.diameter + "|" + rocket10.payloadCapacity);
    }
}
