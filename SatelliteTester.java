class SatelliteTester{

    public static void main(String[] args){
	
        Satellite satellite1 = new Satellite();
        satellite1.name = "Hubble Space Telescope";
        satellite1.country = "United States";
        satellite1.orbitAltitude = 559.0;
        satellite1.purpose = "Astronomical observation";
        System.out.println(satellite1.name + "|" + satellite1.country + "|" + satellite1.orbitAltitude + "|" + satellite1.purpose);

        Satellite satellite2 = new Satellite();
        satellite2.name = "GPS Satellite";
        satellite2.country = "United States";
        satellite2.orbitAltitude = 20200.0;
        satellite2.purpose = "Navigation and positioning";
        System.out.println(satellite2.name + "|" + satellite2.country + "|" + satellite2.orbitAltitude + "|" + satellite2.purpose);

        Satellite satellite3 = new Satellite();
        satellite3.name = "ISS (International Space Station)";
        satellite3.country = "Multiple (International project)";
        satellite3.orbitAltitude = 408.0;
        satellite3.purpose = "Space research and habitation";
        System.out.println(satellite3.name + "|" + satellite3.country + "|" + satellite3.orbitAltitude + "|" + satellite3.purpose);

        Satellite satellite4 = new Satellite();
        satellite4.name = "GOES Satellite";
        satellite4.country = "United States";
        satellite4.orbitAltitude = 35786.0;
        satellite4.purpose = "Weather monitoring";
        System.out.println(satellite4.name + "|" + satellite4.country + "|" + satellite4.orbitAltitude + "|" + satellite4.purpose);

        Satellite satellite5 = new Satellite();
        satellite5.name = "Communication Satellite";
        satellite5.country = "Various countries";
        satellite5.orbitAltitude = 35786.0;
        satellite5.purpose = "Telecommunication";
        System.out.println(satellite5.name + "|" + satellite5.country + "|" + satellite5.orbitAltitude + "|" + satellite5.purpose);

        Satellite satellite6 = new Satellite();
        satellite6.name = "Weather Satellite";
        satellite6.country = "Various countries";
        satellite6.orbitAltitude = 35786.0;
        satellite6.purpose = "Weather forecasting";
        System.out.println(satellite6.name + "|" + satellite6.country + "|" + satellite6.orbitAltitude + "|" + satellite6.purpose);

        Satellite satellite7 = new Satellite();
        satellite7.name = "Earth Observation Satellite";
        satellite7.country = "Various countries";
        satellite7.orbitAltitude = 800.0;
        satellite7.purpose = "Monitoring Earth's surface";
        System.out.println(satellite7.name + "|" + satellite7.country + "|" + satellite7.orbitAltitude + "|" + satellite7.purpose);

        Satellite satellite8 = new Satellite();
        satellite8.name = "Spy Satellite";
        satellite8.country = "Various countries";
        satellite8.orbitAltitude = 400.0;
        satellite8.purpose = "Military reconnaissance";
        System.out.println(satellite8.name + "|" + satellite8.country + "|" + satellite8.orbitAltitude + "|" + satellite8.purpose);

        Satellite satellite9 = new Satellite();
        satellite9.name = "Scientific Research Satellite";
        satellite9.country = "Various countries";
        satellite9.orbitAltitude = 800.0;
        satellite9.purpose = "Scientific experiments";
        System.out.println(satellite9.name + "|" + satellite9.country + "|" + satellite9.orbitAltitude + "|" + satellite9.purpose);

        Satellite satellite10 = new Satellite();
        satellite10.name = "Navigation Satellite";
        satellite10.country = "Various countries";
        satellite10.orbitAltitude = 20200.0;
        satellite10.purpose = "Global positioning and navigation";
        System.out.println(satellite10.name + "|" + satellite10.country + "|" + satellite10.orbitAltitude + "|" + satellite10.purpose);
    }
}
