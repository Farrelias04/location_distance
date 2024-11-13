public class Places2
{
    public static void main(String[] args)
    {
        Location2 uni = new Location2("University", 2.45, 100.3);

        System.out.println(uni);

        System.out.println(uni.getName());

        uni.setName("University of Birmingham");

        System.out.println(uni);

        uni.setXcoord(3.14);
        uni.setYcoord(50.5);

        System.out.println(uni.getXcoord());
        System.out.println(uni.getYcoord());

        uni.moveTo(25, 25);
        System.out.println(uni);

        Location2 home = new Location2("Home", 0.0, 0.0);
        Location2 shop = new Location2("Sainsburys", 3.0, 4.0);

        double d = home.distance(shop);

        System.out.println(d);


    }
}

/// Public static void mains are for the 'running' source file only, the file containing constructors, setters and getters are ONLY compiled
