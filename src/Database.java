/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolei
 */
public class Database {
    private String p_names;
    
    
    private byte[] picture;
    
    public Database(String pname, byte[] pimg){
        this.p_names = pname;
        this.picture = pimg;
    }

    public String getName() {
        return p_names;
    }

    public byte[] getPicture() {
        return picture;
    }
}
