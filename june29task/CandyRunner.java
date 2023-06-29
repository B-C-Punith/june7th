class  Candy 
{
    String candytype ="orenge";
    int weight = 10;
    String ingredients;
    int prize=20;

    Candy()
    {
        System.out.println("Runnning  Candy main");
    }
}


class CandyRunner
{
    public static void main(String[] args)
    {
         Candy ref = new Candy();


        System.out.println(" Candy flaver is :  "+ref.Candytype);
        System.out.println("The weight of the  Candy is : "+ref.weight);
        System.out.println("The ingredients used in the : "+ref.ingredients);
        System.out.println("The prize for each kg of  Candy is : "+ref.prize);
}

}