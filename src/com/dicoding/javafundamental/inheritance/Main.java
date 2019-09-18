package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah kucing IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("------------------------");

        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();

//        o.makan();
        h.makan();
        k.makan();

        Object object = k;
        Hewan hewan1 = h;

//        object.makan();
        hewan1.makan();

        Kucing kucing1 = (Kucing) h;
        kucing1.makan();

        Hewan harimau = new Hewan();
//        Kucing anggora = (Kucing) harimau;

        Mamalia mamalia = new Kucing();

        String s1 = "geeksquiz";
        String s2 = "geeksquiz";
        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
