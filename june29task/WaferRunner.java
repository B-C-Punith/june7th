class Wafer
{

    String name = "manch";
    String teast = "Sweet";
    int prize = 10;
    int numpices = 1;

    Wafer()
    {
        System.out.println("Running Wafer main ");

    }
}

class WaferRunner
{
    public static void main(String [] args)
    {
        Wafer ref = new Wafer();

        System.out.println("Name of the Wafer is : "+ref.name);
        System.out.println("The teast of the Wafer is :"+ref.teast);
        System.out.println("Prize of the Wafer is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}