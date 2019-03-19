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
    
    String pres_names;
    int pres_vote_1; 
    int pres_vote_2;

    String vpres_names;
    int vpres_vote_1;
    int vpres_vote_2;

    String sec_names;
    int sec_vote_1;
    int sec_vote_2;

    String tres_names;
    int tres_vote_1;
    int tres_vote_2;

    String aud_names;
    int aud_vote_1;
    int aud_vote_2;
    
    private byte[] picture;
    
    public Database(String pname, int pvote1, int pvote2, String vpname, int vpvote1, int vpvote2, String secname, int secvote1, int secvote2, String tresname, int tresvote1, int tresvote2, String audname, int audvote1, int audvote2, byte[] pimg){
        this.pres_names = pname;
        this.pres_vote_1 = pvote1;
        this.pres_vote_2 = pvote2;
        
        this.vpres_names = vpname;
        this.vpres_vote_1 = vpvote1;
        this.vpres_vote_2 = vpvote2;
        
        this.sec_names = secname;
        this.sec_vote_1 = secvote1;
        this.sec_vote_2 = secvote2;
        
        this.tres_names = tresname;
        this.tres_vote_1 = tresvote1;
        this.tres_vote_2 = tresvote2;
        
        this.aud_names = audname;
        this.aud_vote_1 = audvote1;
        this.aud_vote_2 = audvote2;        
        
        this.picture = pimg;
    }

    public String getPName() {
        return pres_names;
    }
    
    public int getPvote1() {
        return pres_vote_1;
    }
    
    public int getPvote2() {
        return pres_vote_2;
    }
    
    public String getVPName() {
        return vpres_names;
    }
    
    public int getVPvote1() {
        return vpres_vote_1;
    }
    
    public int getVPvote2() {
        return vpres_vote_2;
    }
    
    public String getSecName() {
        return sec_names;
    }
    
    public int getSecvote1() {
        return sec_vote_1;
    }
    
    public int getSecvote2() {
        return sec_vote_2;
    }
    
    public String getTresName() {
        return tres_names;
    }
    
    public int getTresvote1() {
        return tres_vote_1;
    }
    
    public int getTresvote2() {
        return tres_vote_2;
    }
    
    public String getAudName() {
        return pres_names;
    }
    
    public int getAudvote1() {
        return aud_vote_1;
    }
    
    public int getAudvote2() {
        return aud_vote_2;
    }

    public byte[] getPicture() {
        return picture;
    }
}
