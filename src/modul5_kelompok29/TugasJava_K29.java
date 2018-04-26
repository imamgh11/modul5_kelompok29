/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_kelompok29;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Thoshiba
 */


public class TugasJava_K29 {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean lanjut = true;
int pilih;
String pilihLanjut;

ArrayList<Mobil> mobilKe = new ArrayList<>();
Scanner sc = new Scanner(System.in);

Mobil fortuner = new Mobil("Toyota", "Fortuner", 4, 174, 100,2755, "Hitam", "Biru");
mobilKe.add(fortuner);

Mobil pajero = new Mobil("Mitsubishi", "Pajero", 4, 150, 80,2500, "Putih");
mobilKe.add(pajero);
    
while(lanjut == true){
  System.out.println("--- Selamat Datang di Showroom MobilKelompok 14 ---");
  System.out.println("1. Membuat mobil\n2. Hitung JarakTempuh\n3. Modifikasi Mesin\n4. Ubah Warna\n5. Keluar");
  System.out.print("Pilih operasi Anda : ");
  pilih = sc.nextInt();
  
  while(!(pilih >= 1 && pilih <= 5)){
    System.out.println("Menu pilihan "+pilih+" tidak ada dalam menu, silahkan pilih kembali");
    System.out.println("1. Membuat mobil\n2. Hitung jarak tempuh\n3. Modifikasi mesin\n4. Ubah warna\n5. Keluar");
    System.out.print("Pilih operasi Anda : ");
    pilih = sc.nextInt();
  }  
  switch(pilih){
    case (1):
      String merk, tipe, warnaDasar, warnaAksen;
      Integer pintu, tenagaKuda;
      float konsumsiBahanBakar, tangki;
      
      System.out.println("Ini adalah menu Membuat Mobil");
      System.out.println("Pilih jenis pembuatan mobil");
      System.out.println("1. Mobil dengan warna aksen\n2. Mobil tanpa warna aksen");
      pilih = sc.nextInt();
      
      while(!(pilih >= 1 && pilih <= 2)){
        System.out.println("Menu pilihan "+pilih+" tidak ada dalam menu, silahkan pilih kembali");
        System.out.println("1. Mobil dengan warna aksen\n2. Mobil tanpa warna aksen");
        pilih = sc.nextInt();
      }
      
      if(pilih == 1){
        System.out.print("Merk : ");
        merk = sc.next();
        System.out.print("Tipe : ");
        tipe = sc.next();
        System.out.print("Jumlah pintu : ");
        pintu = sc.nextInt();
        System.out.print("Tenaga Kuda : ");
        tenagaKuda = sc.nextInt();
        System.out.print("Konsumsi BBM : ");
        konsumsiBahanBakar = sc.nextFloat();
        System.out.print("Besar tangki : ");
        tangki = sc.nextFloat();
        System.out.print("Warna dasar : ");
        warnaDasar = sc.next();
        System.out.print("Warna aksen : ");
        warnaAksen = sc.next();

        Mobil mobilBaruWarnaAksen = new Mobil(merk, tipe, pintu, tenagaKuda, konsumsiBahanBakar, tangki, warnaDasar, warnaAksen);
        mobilKe.add(mobilBaruWarnaAksen);
      }
      else if(pilih == 2){
        System.out.print("Merk : ");
        merk = sc.next();
        System.out.print("Tipe : ");
        tipe = sc.next();
        System.out.print("Jumlah pintu : ");
        pintu = sc.nextInt();
        System.out.print("Tenaga Kuda : ");
        tenagaKuda = sc.nextInt();
        System.out.print("Konsumsi BBM : ");
        konsumsiBahanBakar = sc.nextFloat();
        System.out.print("Besar tangki : ");
        tangki = sc.nextFloat();
        System.out.print("Warna dasar : ");
        warnaDasar = sc.next();

        Mobil mobilBaruWarnaDasar = new Mobil(merk, tipe, pintu, tenagaKuda, konsumsiBahanBakar, tangki, warnaDasar);
        mobilKe.add(mobilBaruWarnaDasar);
      }
      else {
        System.out.println("Input salah");
      }
      
      //akhir menu 1
      break;
    
    case (2):
      System.out.println("Ini adalah menu Menghitung Jarak Tempuh");
      System.out.print("Pilih no mobil : ");
      pilih = sc.nextInt();
      
      Mobil mobil;
      mobil = mobilKe.get(pilih - 1);
      
      System.out.println("Jarak tempuh mobil "+ mobil.tipeMobil +" adalah "+ mobil.hitungJarakTempuh());
      
      //akhir menu 2
      break;
        
    case (3):
      Integer tenagaKudaBaru;
      Integer besarTangkiBaru;      
System.out.println("Ini adalah menu Modifikasi Mesin");;
      System.out.print("Pilih no mobil : ");;
      pilih = sc.nextInt();
      
      Mobil mobilModif;
      mobilModif = mobilKe.get(pilih - 1);
      
      System.out.print("Masukkan tenaga kuda baru : ");
      tenagaKudaBaru = sc.nextInt();
      System.out.print("Mauskkan besar tangki baru : ");
      besarTangkiBaru = sc.nextInt();
      
      mobilModif.modifikasiMesin(tenagaKudaBaru);
      
      System.out.println("Mobil " + mobilModif.merkMobil + "berhasil dimodifikasi.");
      
      //akhir menu 3
      break;
        
    case (4):
      String warnaDasarBaru, warnaAksenBaru;
      
     System.out.println("Ini adalah menu Ubah Warna");
     System.out.println("Pilih no mobil : ");
     pilih = sc.nextInt();
      
     Mobil mobilWarnaBaru;
     mobilWarnaBaru = mobilKe.get(pilih - 1);
      
      System.out.println("Pilih jenis ubah warna\n1. Warnadasar\n2. Warna dasar dan warna aksen");
      System.out.print("Pilih operasi : ");
      pilih = sc.nextInt();
      
      while(!(pilih >= 1 && pilih <= 2)){
          System.out.println("Pilihan "+pilih+" tidak adadalam pilihan menu");
          System.out.println("Pilih jenis ubah warna\n1. Warna dasar\n2. Warna dasar dan warna aksen");
          System.out.print("Pilih operasi : ");
          pilih = sc.nextInt();
      }
      
      if(pilih == 1){
          System.out.print("Warna dasar baru : ");
          warnaDasarBaru = sc.next();
          mobilWarnaBaru.ubahWarna(warnaDasarBaru);
      }
      else if(pilih == 2){
          System.out.print("Warna dasar baru : ");
          warnaDasarBaru = sc.next();
          System.out.print("Warna aksen baru : ");
          warnaAksenBaru = sc.next();
          mobilWarnaBaru.ubahWarna(warnaDasarBaru, warnaAksenBaru);
      }
      
      //akhir menu 3[]
      break;
        
    case (5):
      lanjut = false;
      break;
        
    default:
      System.out.println("Input salah");
      break;
  } //akhir switch pilihan menu utama
    
  System.out.println("--- End of Operation ---");
  
    }
  }    
}
