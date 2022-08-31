package com.smv;

public class java_practice_set3 {
    public static void main(String[] args) {
        //1
        String name = "JACK";
        String lcase = name.toLowerCase();
        System.out.println(lcase);

        //2
        String sirname = "v i r k a r";
        String sirname2 = sirname.replace(' ','_');
        System.out.println(sirname2);

        //3
        String letter = "Dear <|name|>, Thanks alot!";
        String rep = letter.replace("<|name|>","Ketan");
        System.out.println(rep);

        //4
        String a = "coding  is   superpower!";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

        //5
        String letter2 = "Dear Ketan,\n\tYou are good man \nThanks!";
        System.out.println(letter2);

    }
}
