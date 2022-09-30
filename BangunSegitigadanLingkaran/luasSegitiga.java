package BangunSegitigadanLingkaran;

import java.util.Scanner;

    public class luasSegitiga {
    private int tinggi;
    private int alas;
    private double luas;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public double getLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;

    }
  //  public class luaslingkaran{
        private int diameter;
        private double luasLingkaran;

        public int getDiameter() {
            return diameter;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }

        public double getLuasLingkaran() {
            luasLingkaran = 3.14 * diameter * diameter;
            return luasLingkaran;
        }

        public void setLuasLingkaran(double luasLingkaran) {
            this.luasLingkaran = luasLingkaran;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            luasSegitiga luasSegitiga = new luasSegitiga();

        // Program Luas Segitiga

            luasSegitiga.getAlas();
            luasSegitiga.getTinggi();

            System.out.println(" --------------------------------");
            System.out.println(" Nama : Muhammad Iqbal Fattah    ");
            System.out.println(" NIM  : 2021071002               ");
            System.out.println(" -------------------------------- ");
            System.out.println(" Program menghitung Luas Segitiga ");
            System.out.println(" -------------------------------- ");
            System.out.print(" Masukkan nilai alas : ");
            luasSegitiga.alas = sc.nextInt();
            System.out.print(" Masukkan Nilai Tinggi : ");
            luasSegitiga.tinggi = sc.nextInt();
            System.out.println(" -------------------------------- ");
            System.out.println(" Luas segitiga " + luasSegitiga.getLuas());
            System.out.println(" -------------------------------- ");
        //Program luas lingkaran

            luasSegitiga luaslingkaran = new luasSegitiga();
            luaslingkaran.getDiameter();
            System.out.println(" Program menghitung Luas Lingkaran ");
            System.out.println(" -------------------------------- ");
            System.out.print(" Masukkan nilai diameter (r) : ");
            luaslingkaran.diameter = sc.nextInt();
            System.out.println(" ---------------------------------");
            System.out.println(" Luas Lingkaran " + luaslingkaran.getLuasLingkaran());
            System.out.println(" ---------------------------------");







        }
}
