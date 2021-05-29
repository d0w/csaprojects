public class StringExplorer {
    public static void main(String[] array){
        int num = 1980;
        String olympics = "The olympics were held in Los Angeles in " + num;
        //java automatically typecasts ints to strings when concant
        String yes = "The olympics " + false;
        //java automaticalyl typecasts boolean to string
        /*
        / Strings take prio (Strings are object) / objects take prio over primitives
        / int/long/short are convertible
        / boolean own category
        */

        System.out.println(olympics);
        System.out.println("2" + 2); //prints 22 not 4, concant takes priority rather than add
        System.out.println(yes);

        System.out.println("---LINE BREAK---");

        String s1 = "Hello";
        String s2 = "Goodbye";
        String s3 = "yay";

        s1 = s2;
        s3 = s1;

        System.out.println(s1.equals(s2)); //when comparing content, use .equals()
        System.out.println(s1 == s2); //when comparing objects themselves, use == (testing to see if signs are pointing at same object)
        System.out.println(s1 == s3);

        System.out.print(s3 + " Hmmm....");

    }
}
