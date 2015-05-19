/**
 * Created by TOSHIBA on 5/19/2015.
 */
public class TestBangun {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga(2, 4, 6);
        sgt.CetakSegitiga();
        System.out.println("");
        sgt.HitungSegitiga();

        System.out.println();
        System.out.println();

        Lingkaran ling = new Lingkaran(7);
        ling.CetakLingkaran();
        System.out.println("");
        ling.HitungLingkaran();
    }
}