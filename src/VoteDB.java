/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolei
 */
public class VoteDB {
    
    
    int pres_vote_1; 
    int pres_vote_2;

    
    int vpres_vote_1;
    int vpres_vote_2;

    
    int sec_vote_1;
    int sec_vote_2;

    
    int tres_vote_1;
    int tres_vote_2;

    
    int aud_vote_1;
    int aud_vote_2;
    
    
    
    public VoteDB(int pvote1, int pvote2, int vpvote1, int vpvote2, int secvote1, int secvote2, int tresvote1, int tresvote2, int audvote1, int audvote2){
        
        this.pres_vote_1 = pvote1;
        this.pres_vote_2 = pvote2;
        
        
        this.vpres_vote_1 = vpvote1;
        this.vpres_vote_2 = vpvote2;
        
        
        this.sec_vote_1 = secvote1;
        this.sec_vote_2 = secvote2;
        
        
        this.tres_vote_1 = tresvote1;
        this.tres_vote_2 = tresvote2;
        
        
        this.aud_vote_1 = audvote1;
        this.aud_vote_2 = audvote2;        
        

    }

    
    
    public int getPvote1() {
        return pres_vote_1;
    }
    
    public int getPvote2() {
        return pres_vote_2;
    }
    
    
    public int getVPvote1() {
        return vpres_vote_1;
    }
    
    public int getVPvote2() {
        return vpres_vote_2;
    }
    
    
    public int getSecvote1() {
        return sec_vote_1;
    }
    
    public int getSecvote2() {
        return sec_vote_2;
    }
    
  
    
    public int getTresvote1() {
        return tres_vote_1;
    }
    
    public int getTresvote2() {
        return tres_vote_2;
    }
    
   
    public int getAudvote1() {
        return aud_vote_1;
    }
    
    public int getAudvote2() {
        return aud_vote_2;
    }

    
}
