/**
 * Created by TOSHIBA on 5/19/2015.
 */
public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String x, int y){
        nama = x;
        umur = y;
    }

    public void tampilkanBiodata(){
        System.out.println("=== BIODATA ===");
        System.out.println("Nama Mahasiswa = " +nama);
        System.out.println("Umur Mahasiswa = " +umur);
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String x){
        this.nama = x;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int y){
        this.umur = y;
    }
}