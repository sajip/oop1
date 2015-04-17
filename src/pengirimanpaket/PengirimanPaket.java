/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanpaket;
import java.util.Date;


/**
 *
 * @author Aji
 */
public class PengirimanPaket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Petugas petugasA = new Petugas();
        LayananPaket layananPaketA = new LayananPaket();
        Barang barangA = new Barang();
        Penerima penerimaA = new Penerima();
        Nota notaA = new Nota();
        Pengirim pengirimA = new Pengirim();
        Transaksi transaksiA = new Transaksi();
        
       
        petugasA.setNamaPetugas("Aman Sentosa");
        petugasA.setNoID("564-2341-AD4");
        
        try{
            layananPaketA.setLayananPaket("kilat");
        } catch (Exception e){
            System.out.println("Terjadi eror " + e.getMessage());
        }
        
        try{
            layananPaketA.setLamaPengiriman(2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        try{        
            transaksiA.setBiaya(58000);
        }catch  (Exception e){
            System.out.println(e.getMessage());
        }
        
        transaksiA.setKodeTransaksi("116042015");
        
        
        barangA.setIsiPaket("Buku-Buku dan Alat Tulis");
        barangA.setKodeBarang("1604201508292");
        
        try{
            barangA.setBerat(3);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        penerimaA.setNamaPenerima("Suryadi");
        penerimaA.setNoTelepon("0282-909021");
        penerimaA.setAlamatPenerima("Jl. Bulaksumur no 56, Komplek UGM, Yogyakarta, 78642");
        
        pengirimA.setNamaPengirim("Sukanto");
        pengirimA.setNoTelepon("0281-67534271");
        pengirimA.setAlamatPengirim("Jl. Jend Sudirman no 147, Purwokerto, Banyumas, 53181");
        
        
         notaA.setPetugas(petugasA);
         notaA.setPengirim(pengirimA);
         notaA.setPenerima(penerimaA);
         notaA.setPaket(layananPaketA);
         notaA.setJenisBarang(barangA);
         notaA.setTransaksil(transaksiA);
         notaA.setWaktu(new Date());
         
                    
          cetak(notaA);          
                    }
       

          

static void cetak(Nota nota){
System.out.println();System.out.println();
    System.out.println("Nama Petugas : "+nota.getPetugas().getNamaPetugas());
        System.out.println("No id : "+nota.getPetugas().getNoID());
        System.out.println();
        System.out.println("Layanan Paket : "+nota.getPaket().getLayananPaket());
        System.out.println("Isi Paket : "+nota.getJenisBarang().getIsiPaket());
        System.out.println("Kode Paket : "+nota.getJenisBarang().getKodeBarang());
        System.out.println();
        System.out.println("Nama Pengirim : "+nota.getPengirim().getNamaPengirim());
        System.out.println("Alamat Pengirim : "+nota.getPengirim().getAlamatPengirim());
        System.out.println("No Telepon Pengirim : "+nota.getPengirim().getNoTelepon());
        System.out.println();
        System.out.println("Nama Penerima : "+nota.getPenerima().getNamaPenerima());
        System.out.println("Alamat Penerima : "+nota.getPenerima().getAlamatPenerima());
        System.out.println("No Telepon Penerima :"+nota.getPenerima().getNoTelepon());
        System.out.println();
        System.out.println("Sampai dalam : "+nota.getPaket().getLamaPengiriman()+" hari");
        System.out.println("Total Biaya : "+nota.getTransaksil().getBiaya());
        System.out.println("=========================================================");
        System.out.println("                   "+nota.getTransaksil().getKodeTransaksi());
        System.out.println("             "+nota.getWaktu());
    }
}
                
        
        
        
        
        
        
        
        
        
        
        
    

