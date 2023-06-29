class Eggpuff 
{
    String Eggpufftype ="chacoalte";
    int weight = 60;
    String ingredients;
    int prize=20;

    Eggpuff()
    {
        System.out.println("Runnning Eggpuff main");
    }
}


class Eggpuffrunner
{
    public static void main(String[] args)
    {
        Eggpuff ref = new Eggpuff();


        System.out.println("Eggpuff flaver is :  "+ref.Eggpufftype);
        System.out.println("The weight of the Eggpuff is : "+ref.weight);
        System.out.println("The ingredients used in the : "+ref.ingredients);
        System.out.println("The prize for each kg of Eggpuff is : "+ref.prize);
}

}