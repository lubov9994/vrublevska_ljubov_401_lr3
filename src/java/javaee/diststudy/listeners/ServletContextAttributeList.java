/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.diststudy.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Администратор
 */

@WebListener
public class ServletContextAttributeList implements ServletContextAttributeListener{

     /*
   * This method is invoked when an attribute is added to the ServletContext object
   */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("=====================================");
        System.out.println("An attribute was added to the ServletContext object");
    }

     /*
    * This method is invoked when an attribute is removed from the ServletContext object
    */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("-=====================================");
        System.out.println("An attribute was removed from the ServletContext object");
    }

    /*
    * This method is invoked when an attribute is replaced in the ServletContext object
    */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("=====================================");
        System.out.println("An attribute was replaced in the ServletContext object");
    }
    
}
