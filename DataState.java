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
public class DataState extends State{
    
    SMTPserver server;
    
    public DataState(SMTPserver server){
        this.server = server;
    }
    
    public void data(){
        System.out.println("Receiving data...");
    }
}
