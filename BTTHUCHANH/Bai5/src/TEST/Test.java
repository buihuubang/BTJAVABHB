/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import static DAL.ChatLieuDAL.getALL;
import java.sql.Connection;
import javax.swing.JOptionPane;
import DAL.DBConnect;
import DAL.KhachDAL;
import DAL.NhanVienDAL;
import DTO.ChatLieu;
import DTO.Khach;
import java.util.ArrayList;

/**
 *
 * @author buihu
 */
public class Test {
    public static void main(String[] args) {
//        Connection con = DBConnect.MoKetNoi();
//        if(con !=  null){
//            System.out.println("OK");
//        } else {
//            JOptionPane.showMessageDialog(null,"Lỗi","Error",JOptionPane.ERROR_MESSAGE);
//        }
//        //TEST DAL.ChatLieuDAL.getAll()
//        ArrayList<ChatLieu> test = getALL();
//        System.out.println(""+ test.size());
//        for(int i = 0 ; i < test.size(); i++){
//            System.out.println(test.get(i).getMaChatLieu() +"\t"+test.get(i).getTenChatLieu());
//        }
//        //TEST DAL.ChatLieuDAL.Insert()
//        int Insert = DAL.ChatLieuDAL.Insert("MCL005", "Vàng");
//        System.out.println(Insert);
//        //TEST DAL.ChatLieuDAL.Update()
//        int Update = DAL.ChatLieuDAL.Update("MCL005", "Vải");
//        System.out.println(Update);
//        //TEST DAL.ChatLieuDAL.Delete()
//        int Delete = DAL.ChatLieuDAL.Delete("MCL005");
//        System.out.println(Delete);
        //TEST DAL KHACH
//        ArrayList<Khach> test2 = KhachDAL.getAll();
//        System.out.println(""+ test2.size());
//        for(int i = 0 ; i < test2.size(); i++){
//            System.out.println(test2.get(i).getMaKhach() +"\t"+test2.get(i).getTenKhach() +"\t"+ test2.get(i).getDiaChi()+"\t"+ test2.get(i).getDienThoai());
//        }
        System.out.println(NhanVienDAL.TenNhanVien("NV001"));
    }
}
