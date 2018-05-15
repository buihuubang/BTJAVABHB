/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;
import DTO.*;
import DAL.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author buihu
 */
public class XuLy {
    
    //FORM CHẤT LIỆU
    
    public static ArrayList<ChatLieu> ChatLieuArray(){
        return ChatLieuDAL.getALL();
    }
    
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chất Liệu");
        model.addColumn("Tên Chất Liệu");
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMaChatLieu());
                h.add(ChatLieuArray().get(i).getTenChatLieu());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
            return null;
        }
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
        try{
            return ChatLieuDAL.Insert(MaChatLieu, TenChatLieu);
        } catch (Exception e){
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
        try{
            return ChatLieuDAL.Update(MaChatLieu, TenChatLieu);
        } catch (Exception e) {
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
//    public static int DeleteChatLieu(int selectedRow){
//        if(selectedRow > -1){
//            ChatLieuModel().removeRow(selectedRow);
//            ChatLieuArray().remove(selectedRow);
//        }
//    }
    public static int DeleteChatLieu(String MaChatLieu, int n){
        try {
            if(n < -1){
                return 0;
            } else {
                ChatLieuModel().removeRow(n);
                ChatLieuArray().remove(n);
                return ChatLieuDAL.Delete(MaChatLieu);
            }
        } catch (Exception e) {
            System.out.println("Lỗi:" + e);
            return 0;
        }
    }
}
