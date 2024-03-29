package day13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {
    /* Kullanicidan bir harf isteyin
      o harfle baslayan gun ismi varsa yazdirin
      yoksa "gecersiz harf" yazdirin*/
    public static void main(String[] args) {
//           String name = "kerem";
        //             01234
//           System.out.println(name);
//           System.out.println(name.charAt(4));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Bir harf giriniz : ");
        char harf = scanner.next().charAt(0); //scanenr classi ile harf alamiyoruz. Ancak String olarak alip
        //chatAt() metodunu kullanrak ilk harfi almis oluyorum.

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazar, Pazartesi, Persembe");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("Sali");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Carsamba, Cuma, Cumartesi");
        } else {
            System.out.println("Gecersiz Harf");
        }

        System.out.println("-----------------------------------");

        switch (harf) {

            case 'p', 'P':
                System.out.println("Pazar, Pazartesi, Persembe");
                break;
            case 's', 'S':
                System.out.println("Sali");
                break;
            case 'c', 'C':
                System.out.println("Carsamba, Cuma, Cumartesi");
                break;
            default:
                System.out.println("Gecersiz Harf");
        }
        // breakleri yoruma al ve farkı gör...
        System.out.println("-----------------------------------");
//          ternary
//           (condition ) ? (return if true) : (return if false)
//           (condition ) ? (return if true) : (new Ternary)
        String result = (harf == 'p' || harf == 'P')
                ? "Pazar, Pazartesi, Persembe"
                : ((harf == 's' || harf == 'S')
                ? "Sali"
                : (harf == 'c' || harf == 'C')
                ? ("Carsamba, Cuma, Cumartesi")
                : ("Gecersiz Harf"));
        System.out.println("result = " + result);


        System.out.println("-----------------------------------");


        int outerSwitch = 1;
        int innerSwitch = 2;

        switch (outerSwitch) {
            case 1 -> {
                System.out.println("Outer switch case 1");
                switch (innerSwitch) {
                    case 1 -> System.out.println("Inner switch case 1");
                    case 2 -> System.out.println("Inner switch case 2");
                    default -> System.out.println("Inner switch default case");
                }
            }
            case 2 -> System.out.println("Outer switch case 2");
            default -> System.out.println("Outer switch default case");
        }
    }
}




