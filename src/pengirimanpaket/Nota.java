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
public class Nota {
    private LayananPaket paket;
    private Petugas petugas;
    private Barang jenisBarang;
    private Pengirim pengirim;
    private Penerima penerima;
    private Transaksi transaksil;
    private Date waktu;

    /**
     * @return the paket
     */
    public LayananPaket getPaket() {
        return paket;
    }

    /**
     * @param paket the paket to set
     */
    public void setPaket(LayananPaket paket) {
        this.paket = paket;
    }

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the jenisBarang
     */
    public Barang getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(Barang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the pengirim
     */
    public Pengirim getPengirim() {
        return pengirim;
    }

    /**
     * @param pengirim the pengirim to set
     */
    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }

    /**
     * @return the penerima
     */
    public Penerima getPenerima() {
        return penerima;
    }

    /**
     * @param penerima the penerima to set
     */
    public void setPenerima(Penerima penerima) {
        this.penerima = penerima;
    }

    /**
     * @return the transaksil
     */
    public Transaksi getTransaksil() {
        return transaksil;
    }

    /**
     * @param transaksil the transaksil to set
     */
    public void setTransaksil(Transaksi transaksil) {
        this.transaksil = transaksil;
    }

    /**
     * @return the waktu
     */
    public Date getWaktu() {
        return waktu;
    }

    /**
     * @param waktu the waktu to set
     */
    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

   
 


}