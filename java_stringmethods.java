package com.smv;

public class java_stringmethods {
    public static void main(String[] args) {
        String name = "ketan";
        String ucase = name.toUpperCase();
        System.out.println(ucase);
        int len = name.length();
        System.out.println(len);
        String name2 = "   virkar   ";
        System.out.println(name2);
        String trimmed = name2.trim();
        System.out.println(trimmed);
        String sub = name.substring(1);
        System.out.println(sub);
        String subb = name.substring(1,4);
        System.out.println(subb);
        String rep = name.replace('k','w');
        System.out.println(rep);
        String repp = name.replace("ke","che");
        System.out.println(repp);
        System.out.println(name.startsWith("ke"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ta"));
        System.out.println(name.indexOf("n",3));
        System.out.println(name.lastIndexOf("et",3));
        System.out.println(name.equals("ketan"));
        System.out.println(name.equalsIgnoreCase("KetAn"));



    }
}

