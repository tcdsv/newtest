/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smtpserver;

/**
 *
 * @author ojepc
 * 
 */

public interface Commands {
    public void helo();
    public void mail();
    public void rcpt();
    public void data();
    public void rset();
    public void noop();
    public void quit();
}
