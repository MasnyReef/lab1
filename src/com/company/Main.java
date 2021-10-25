package com.company;

public class Main {

    public static void main(String[] args) {
       String launch, imie;

       launch="Witaj";
       imie="Piotrek";

       System.out.println(String.format("%s posiadacz imienia: %s",launch,imie));

       for (int i=1;i<=12;i++)
       {
           for (int j=1;j<=12;j++)
           {
               System.out.print(String.format("%4d",i*j));
           }
           System.out.println();
       }

       System.exit( 0);
    }
}
