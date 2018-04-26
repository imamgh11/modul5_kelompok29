/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_kelompok29;

/**
 *
 * @author Thoshiba
 */
//zul elek

public class Mobil {
public String merkMobil;
public String tipeMobil;
public Integer jumlahPintu;
private Integer tenagaKuda;
private float konsumsiBahanBakar;
private float besarTangki;
public String warnaDasar;
public String warnaAksen;

public Mobil(String merkMobil, String tipeMobil, IntegerjumlahPintu, Integer tenagaKuda, float konsumiBahanBakar, float besarTangki, String warnaDasar){
  this.merkMobil = merkMobil;
  this.tipeMobil = tipeMobil;
  this.jumlahPintu = jumlahPintu;
  this.tenagaKuda  = tenagaKuda;
  this.konsumsiBahanBakar = konsumsiBahanBakar;
  this.besarTangki = besarTangki;
  this.warnaDasar  = warnaDasar;
  this.warnaAksen  = warnaDasar;
  System.out.println("Mobil ber-merk"+merkMobil+" termasuk mobil tidak beraksen");
}

public Mobil(String merkMobil, String tipeMobil, Integer jumlahPintu, Integer tenagaKuda, float konsumsiBahanBakar, float besarTangki, String warnaDasar, String warnaAksen){
  this.merkMobil = merkMobil;
  this.tipeMobil = tipeMobil;
  this.jumlahPintu = jumlahPintu;
  this.tenagaKuda  = tenagaKuda;
  this.konsumsiBahanBakar = konsumsiBahanBakar;
  this.besarTangki = besarTangki;
  this.warnaDasar  = warnaDasar;
  this.warnaAksen  = warnaAksen;
  System.out.println("Mobil ber-merk"+merkMobil+" termasuk mobil beraksen");
}

public float hitungJarakTempuh(){
  float x = this.besarTangki / this.konsumsiBahanBakar;
  return x;
}

public void modifikasiMesin(int tenagaKudaBaru, floatbesarTangkiBaru){
  this.tenagaKuda  = tenagaKudaBaru;
  this.besarTangki = besarTangkiBaru;
}

public void ubahWarna(String warnaDasar){
  this.warnaDasar = warnaDasar;
}

public void ubahWarna(String warnaDasar, String warnaAksen){
  this.warnaDasar = warnaDasar;
  this.warnaAksen = warnaAksen;
}

    void modifikasiMesin(Integer tenagaKudaBaru) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
