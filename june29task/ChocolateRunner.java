class Chocolate
{

    String name = "DairyMilk";
    String teast = "Sweet";
    int prize = 10;
    int numpices = 1;

    Chocolate()
    {
        System.out.println("Running Chocolate main ");

    }
}

class ChocolateRunner
{
    public static void main(String [] args)
    {
        Chocolate ref = new Chocolate();

        System.out.println("Name of the Chocolate is : "+ref.name);
        System.out.println("The teast of the Chocolate is :"+ref.teast);
        System.out.println("Prize of the Chocolate is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}