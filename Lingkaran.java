/**
 * Created by TOSHIBA on 5/19/2015.
 */
public class Lingkaran {
    private int jari;
    private double LuasLing;
    private double KelilingLing;

    public Lingkaran(int jr){
        jari = jr;
    }
    public void CetakLingkaran(){
        System.out.println("=== LINGKARAN ===");
        System.out.println("Jari-jari Lingkaran = " + jari);
    }
    public void HitungLingkaran(){
        LuasLing = Math.PI*jari*jari;
        System.out.println("Luas Lingkaran : 3,14 x jari-jari x jari-jari = " +LuasLing);

        KelilingLing = Math.PI*(jari+jari);
        System.out.println("Keliling Lingkaran : 3,14 x diameter = " +KelilingLing);
    }
}
