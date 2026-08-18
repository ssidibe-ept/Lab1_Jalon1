package sn.edu.groupeisi;


import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Ce logiciel permet de compter de 1 a un nombre que vous entrez en parametre");
        System.out.println("Entrer le nombre");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Le nombre entré est :"+n);
        for (int i = 1; i <= n; i++) {
            IO.println("index = " + i);
        }
    }
}
