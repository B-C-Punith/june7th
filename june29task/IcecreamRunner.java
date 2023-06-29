class Icecream
{

    String name = "candy";
    String teast = "Sweet";
    int prize = 10;
    int numpices = 1;

    Icecream()
    {
        System.out.println("Running Icecream main ");

    }
}

class IcecreamRunner
{
    public static void main(String [] args)
    {
        Icecream ref = new Icecream();

        System.out.println("Name of the Icecream is : "+ref.name);
        System.out.println("The teast of the Icecream is :"+ref.teast);
        System.out.println("Prize of the Icecream is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}