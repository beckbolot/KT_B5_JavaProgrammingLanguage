package day57_MapANdFinish;

import java.util.ArrayList;

public class Ogrenci {

    private String isim;

    private String soyIsım;

    private int no;
    private ArrayList<String> dersler=new ArrayList<>();


    public Ogrenci(String isim, String soyIsım, int no) {
        this.isim = isim;
        this.soyIsım = soyIsım;
        this.no = no;
    }



    public int getNo() {
        return no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



    public String getSoyIsım() {
        return soyIsım;
    }

    public void setSoyIsım(String soyIsım) {
        this.soyIsım = soyIsım;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void ekleDersler(String ders) {
        this.dersler.add(ders);
    }



    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsım='" + soyIsım + '\'' +
                ", no=" + no +
                ", dersler=" + dersler +
                '}';
    }
}
