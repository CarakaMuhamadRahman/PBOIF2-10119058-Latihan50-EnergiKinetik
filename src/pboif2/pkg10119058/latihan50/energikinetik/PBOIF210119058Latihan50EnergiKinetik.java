/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung Energi kinetik.
 */
public class PBOIF210119058Latihan50EnergiKinetik {


    public static void main(String[] args) {
        Baseball baseball = new Baseball();    
        baseball.setMassa(145.0);
        baseball.setKecepatan(25.0);
        double massa = baseball.getMassa();
        double kecepatan = baseball.getKecepatan();
        System.out.println("Sebuah bola baseball dengan massa " + massa + " g dilempar dengan kecepatan " + kecepatan + " m/s");
        System.out.println("a. Berapakah energi kinetiknya ? " +baseball.hitungEnergiKinetik(massa, kecepatan));
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam? " + baseball.hitungUsaha(0));
        System.out.println("Alasan : Karena energi kinetik awal adalah nol, maka usaha total yang dilakukan sama dengan energi kinetik akhir, yaitu 45 joule.");
    }
    
}

