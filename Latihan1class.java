import java.util.Scanner;

/*Buatlah program untuk menginput dan menampilkan biodata mahasiswa seperti NIM dan nama dengan konsep PBO!
    1. Analisis spesifikasi kebutuhan sistem
    1.1) spesifikasi kebutuhan input datanke sistem (nim,nama)
    1.2) Spesifikasi kebutuhan output data dari sistem (nim,nama)
    1.3) Rekayasa proses ( inputData(String a, String b): void), vieweData():void      */
public class Latihan1class {
    public static void main(String[] args) {

        //menggunakan konsep yang sudah dimengerti
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama dan Nim !");
        System.out.print("Masukkan nama :");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        int nim = sc.nextInt();

        System.out.println("Namamu adalah " + nama);
        System.out.println("Nim adalah " + nim);


    }
    //menggunakan konsep pbo dan class
    //rekayasa proses (harusnya menggunakan package tapi belum paham..)
    private String name;
    private String nomor;
    public void inputData(String a, String b){
        this.name = a;
        this.nomor= b;

    }
    public void viewData(){
        System.out.println("Nim " + this.nomor);
        System.out.println("Nama " + this.name);

    }



}
