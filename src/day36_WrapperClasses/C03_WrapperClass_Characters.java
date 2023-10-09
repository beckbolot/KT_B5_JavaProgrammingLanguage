package day36_WrapperClasses;

public class C03_WrapperClass_Characters {
    public static void main(String[] args) {
        /*
        Character.isLetter() --- harf olup olmadığını
        Character.isDigit()   --  sayı rakam olup olmadığını
        Character.isAlphabetic() --- harf olup olmadığını

         */

        System.out.println(Character.isAlphabetic('a'));
        System.out.println("Character.isLetter(\"1\") = " + Character.isLetter('1'));


        String str = "^+!j4564*/-a_|v-:!a ???()&+";

        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }

        }

        System.out.println("result = " + result);


//        String değer içindeki gömülü cümleyi çıkartın
        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345l679--a**//##++34r``~~((ı[234]+||";


    }






}
