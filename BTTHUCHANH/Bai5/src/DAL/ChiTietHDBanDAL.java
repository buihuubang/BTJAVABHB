/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author buihu
 */
public class ChiTietHDBanDAL {
    public static ArrayList<ChiTienHDBan> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from ChiTienHDBan";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<ChiTienHDBan> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MaHDBan");
                    String MaHang = rs.getString("MaHang");
                    float SoLuong = rs.getFloat("SoLuong");
                    float DonGia = rs.getFloat("DonGia");
                    float GiamGia = rs.getFloat("GiamGia");
                    float ThanhTien = rs.getFloat("ThanhTien");
                    ChiTienHDBan chiTiet = new ChiTienHDBan(MaHDBan, MaHang,SoLuong, DonGia, GiamGia, ThanhTien);
                    ds.add(chiTiet);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into ChiTienHDBan(MaHDBan, MaHang, SoLuong,DonGia,GiamGia,ThanhTien) values ('"+ MaHDBan +"','"+ MaHang +"',"+ SoLuong +","+ DonGia +","+ GiamGia +","+ ThanhTien +")";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String MaHDBan, String MaHang, float SoLuong, float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update ChiTienHDBan set SoLuong = "+ SoLuong +",DonGia = "+ DonGia +",GiamGia="+ GiamGia +",ThanhTien = "+ ThanhTien +" where MaHDBan = '"+ MaHDBan +"' and MaHang='"+MaHang+"'";
                int rs = stmt.executeUpdate(Sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaHDBan){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChiTienHDBan where MaHDBan = '"+MaHDBan+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
