package MiniProject;

import java.util.Scanner;

public class aracSigortaPrim {

    public static void main(String[] args) {
        start();

    }

    public static void start() {
        boolean isFail;
        Scanner inp = new Scanner(System.in);

        do {
            isFail = false;
            // menu ve tarife dönemi seçimi yaptıralım
            System.out.println("-----Zorunlu araç Sigorta Primi Hesaplama -----");
            System.out.println("Tarife dönemini seçiniz");
            System.out.println("1. Dönem Haziran 2022");
            System.out.println("2. Dönem  Aralik 2022");
            int term = inp.nextInt();

            if (term == 1 || term == 2) {

            } else {
                System.out.println("Hatali giris");
                isFail = true;
            }

        } while (isFail);

    }

}

/*
 * Araç sigorta Primi
 * Araç tiplerine göre hesaplama
 * 
 */