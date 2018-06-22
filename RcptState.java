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
public class RcptState extends State{
    
    SMTPserver server;
    
    public RcptState(SMTPserver server){
        this.server = server;
    }
    
    public void rcpt(){
        System.out.println("Rcpt..... Staying in the same state");
    }
    
    public void data(){
        System.out.println("Moving to DATA state");
        server.setState(server.getDataState());
    }
    
}
