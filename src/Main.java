// Bir sayının basamak sayılarının toplamını hesaplayan program.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayi2, sayi3, basamak = 0, toplam = 0;
        System.out.print("sayı: ");
        sayi = input.nextInt();
        sayi2 = sayi;
        sayi3 = sayi;

        while(sayi>0){
            sayi = sayi/10;
            basamak++;
        }

        for(int i = 1; i<=basamak; i++){
            toplam = toplam + (sayi2%10);
            sayi2 = sayi2/10;
        }


        System.out.println(sayi3+"'nın basamakları toplamı: "+toplam);

    }
}