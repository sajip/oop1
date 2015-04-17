/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanpaket;

/**
 *
 * @author Aji
 */
public class Barang {
    private String isiPaket;
    private String kodeBarang;
    private float berat;

    /**
     * @return the isiPaket
     */
    public String getIsiPaket() {
        return isiPaket;
    }

    /**
     * @param isiPaket the isiPaket to set
     */
    public void setIsiPaket(String isiPaket) {
        this.isiPaket = isiPaket;
    }

    /**
     * @return the kodeBarang
     */
    public String getKodeBarang() {
        return kodeBarang;
    }

    /**
     * @param kodeBarang the kodeBarang to set
     */
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    /**
     * @return the berat
     */
    public Float getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(float berat) throws Exception {
        if(berat<100 && berat>0){
            this.berat = berat;
        }
        else{
            throw new Exception("Berat Barang Tidak Boleh Melebihi 100 kg");
        }
    }

  


}
