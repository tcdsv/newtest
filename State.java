/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smtpserver;

/**
 *
 * @author ojepc
 */
public abstract class State {
    
    public void helo(){
        System.out.println("HELO error E: 500, 501, 504, 421");
    };
    
    public void mail(){
        System.out.println("MAIL error F: 552, 451, 452\n"+"E: 500, 501, 421");
    };
    
    public void rcpt(){
        System.out.println("RCPT Error F: 550, 551, 552, 553, 450, 451, 452\n"+"E: 500, 501, 503, 421");
    };
    
    public void data(){
        System.out.println("Data Error");
    };
    
    public void rset(){
        System.out.println("RSET Error");
    };
    
    public void noop(){
        System.out.println("NOOP Error");
    };
    
    public void quit(){
        System.out.println("QUIT Error");
    };    

}
