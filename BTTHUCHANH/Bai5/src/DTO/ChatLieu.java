/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author buihu
 */
public class ChatLieu {

    private String MaChatLieu;
    private String TenChatLieu;
    private Hang hang;

    /**
     * @return the MaChatLieu
     */
    public ChatLieu(String MaChatLieu, String TenChatLieu){
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
    }
    
    public String getMaChatLieu() {
        return MaChatLieu;
    }

    /**
     * @param MaChatLieu the MaChatLieu to set
     */
    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    /**
     * @return the TenChatLieu
     */
    public String getTenChatLieu() {
        return TenChatLieu;
    }

    /**
     * @param TenChatLieu the TenChatLieu to set
     */
    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    /**
     * @return the hang
     */
    public Hang getHang() {
        return hang;
    }

    /**
     * @param hang the hang to set
     */
    public void setHang(Hang hang) {
        this.hang = hang;
    }
}
