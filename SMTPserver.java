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
public class SMTPserver {

    InitState init_state;
    MailState mail_state;
    RcptState rcpt_state;
    DataState data_state;
    State current_state;
    
    public static void main(String[] args) {
        SMTPserver server = new SMTPserver();
        server.start();
    }
    
    public void start(){
        init_state = new InitState(this);
        mail_state = new MailState(this);
        rcpt_state = new RcptState(this);
        data_state = new DataState(this);
        
        current_state = init_state;        
        
        current_state.mail();
        current_state.helo();
        current_state.mail();
        current_state.rcpt();
        current_state.rset();
        current_state.rcpt();
        current_state.data();
        
    }
    
    public void setState(State state){
        System.out.println("current state: ");
        System.out.print(current_state+"\n");
        current_state = state;
        System.out.println("new state: ");
        System.out.print(current_state+"\n");
    }
    
    public State getMailState(){
        return mail_state;
    }
    
    public State getDataState(){
        return data_state;
    }
    
    public State getRcptState(){
        return rcpt_state;
    }
}
