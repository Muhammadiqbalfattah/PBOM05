package Latuhanclass;

public class latihanbiodata {
    private String nim;
    private String nama;
    private int umur;
    private String kelamin;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getKelamin() {
        String jeniskelamin = "Perempuan";

        if(this.kelamin == "L"){
            jeniskelamin = "Laki-laki";
        }
        return jeniskelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public static void main(String[] args){
        latihanbiodata biodata = new latihanbiodata();
        biodata.setNim("2021071002");
        biodata.setNama("Bagas");
        biodata.setUmur(20);
        biodata.setKelamin("L");


        System.out.println("Nim : " + biodata.getNim());
        System.out.println("Nama : " + biodata.getNama());
        System.out.println("Umur : " + biodata.getUmur() + " Tahun");
        System.out.println("Jenis Kelamin :  " + biodata.getKelamin());

    }
}

/* Buat program untuk menghitung luas segitiga dan luas lingkaran menggunakan OOP, dimana
inputan dari keyboard.
Tampilan, fungsi2 bebas.
jangan lupa upload di github
 */