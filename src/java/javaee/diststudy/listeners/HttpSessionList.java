/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.diststudy.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Администратор
 */
@WebListener
public class HttpSessionList implements HttpSessionListener {
    private static int sessions;

    public static int getTotalActiveSession() {
        return sessions;
    }
  
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        sessions++;
        System.out.println("=====================================");
        System.out.println("sessionCreated add one session into counter");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        sessions--;
        System.out.println("=====================================");
        System.out.println("sessionDestroyed deduct one session from counter");
    }
    
}
