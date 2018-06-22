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


public class InitState extends State {
    
    SMTPserver server;
    
    public InitState(SMTPserver server){
        this.server = server;
    }
    
    public void helo(){
        System.out.println("S: 250");
        server.setState(server.getMailState());
    };    
}
