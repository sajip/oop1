/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanpaket;


/**
 *
 * @author Aji
 */
public class LayananPaket {
    private String layananPaket;
    private int lamaPengiriman;
  

    /**
     * @return the layananPaket
     */
    public String getLayananPaket() {
        return layananPaket;
    }

    /**
     * @param layananPaket the layananPaket to set
     */
    public void setLayananPaket(String layananPaket) throws Exception {
        if(layananPaket.equalsIgnoreCase("Super")|| layananPaket.equalsIgnoreCase("Kilat")||layananPaket.equalsIgnoreCase("biasa")){
                this.layananPaket = layananPaket;
        }
        else {
            throw new Exception ("Paket yang tersedia hanya SUPER KILAT BIASA");
        }
            
    }
    /**
     * @return the lamaPengiriman
     */
    public int getLamaPengiriman() {
        return lamaPengiriman;
    }

    /**
     * @param lamaPengiriman the lamaPengiriman to set
     */
    public void setLamaPengiriman(int lamaPengiriman)throws Exception {
        if(lamaPengiriman>1){
        this.lamaPengiriman = lamaPengiriman;
    }
        else{
            throw new Exception("Pengiriman minimal 2 Hari");
        }

    

    
}
}
