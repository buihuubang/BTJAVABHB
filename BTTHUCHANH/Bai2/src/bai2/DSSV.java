/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author bang
 */
public class DSSV {
    private int STT;
    private String name;
    private String gioiTinh;
    private String namSinh;
    public int getSTT(){
        return this.STT;
    }
    public String getName(){
        return this.name;
    }
    public String getGioiTinh(){
        return this.gioiTinh;
    }
    public String getNamSinh(){
        return this.namSinh;
    }
    public void STT(int STT){
        this.STT = STT;
    }
    public void GioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void Name(String name){
        this.name = name;
    }
    public void NamSinh(String namSinh){
        this.namSinh = namSinh;
    }

    void getName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
