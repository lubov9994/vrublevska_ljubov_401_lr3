/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.diststudy.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Администратор
 */

@WebListener
public class ContextList implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=====================================");
        System.out.println("ContextList destroyed");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=====================================");
        System.out.println("ContextList started:  run my code before the web application is started");	
    }
    
}
