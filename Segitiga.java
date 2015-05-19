/**
 * Created by TOSHIBA on 5/19/2015.
 */
public class Segitiga {
    private int alas;
    private int tinggi;
    private int sisiMiring;
    private double Luas;
    private double Keliling;

    public Segitiga(int al, int tg, int sm){
        alas = al;
        tinggi = tg;
        sisiMiring = sm;
    }
    public void CetakSegitiga(){
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas = " +alas);
        System.out.println("Tinggi = " +tinggi);
        System.out.println("Sisi Miring = " +sisiMiring);
    }
    public void HitungSegitiga(){
        Luas = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : 0.5 x alas x tinggi = " +Luas);

        Keliling = alas+tinggi+sisiMiring;
        System.out.println("Keliling Segitiga : alas + tinggi + sisi miring = " +Keliling);
    }
    
}