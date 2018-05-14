/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author buihu
 */
public class KhachDAL {
    public static DBConnect getDAL(){
        return new DBConnect();
    }

}
