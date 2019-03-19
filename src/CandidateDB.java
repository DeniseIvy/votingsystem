/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolei
 */
public class CandidateDB {
    
    String names, yearcourse, party, position;
    private byte[] picture;
    
    public CandidateDB(String dbname, String dbyc, String dbparty, String dbposition, byte[] dbimg){
        this.names = dbname;
        this.yearcourse = dbyc;
        this.party = dbparty;
        this.position = dbposition;
        this.picture = dbimg;   
    }

    public String getName() {
        return names;
    }
    
    public String getYearCourse() {
        return yearcourse;
    }
    
    public String getParty() {
        return party;
    }
    
    public String getPosition() {
        return position;
    }
    
    public byte[] getImg() {
        return picture;
    }
    
}
