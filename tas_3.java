package day20_for_Each;

import java.util.Arrays;

public class tas_3 {
    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java"};


        int num = 0;

        for (String each : words) {
            String reverse = "";//Bir kelimenin palindrom olup olmadığını kontrol etmek için, kelimenin karakterlerini
                                 // tersten okuyarak yeni bir kelime elde etmek gerekir.o yuzden tersten okutacagimiz Stringi actik.

            for (int i= each.length()-1 ; i>=0; i--){// butun kelimeleri tersten okutuyoruz.
                reverse +=each.charAt(i);//Bu satırda, her bir karakteri tersten okuyarak reverse String'ine eklenir.
                                         // Bu sayede, reverse değişkeni döngü bittiğinde, o kelimenin tersini içerir.

            }
            if (each.equalsIgnoreCase(reverse)){//Orijinal kelime ile ters kelime karşılaştırılır. equalsIgnoreCase metodu
                                               // kullanılarak büyük/küçük harf duyarsız bir karşılaştırma yapılır.
                num++;
            }

         

        }
        System.out.println(num);
    }

}
/*
 write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
