package day35_Week07_Review;

public class C14_Double {

    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        for (double price : prices) {
            if(price > 100.0){
                System.out.print(price+" ");
            }
        }

        System.out.println();

        int count= 0;
        for (double each : prices) {
            if(each > 50.0){
               count++;
            }
        }
        System.out.print(count);

        


    }
}
