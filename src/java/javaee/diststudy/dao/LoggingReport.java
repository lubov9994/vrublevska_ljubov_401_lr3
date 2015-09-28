/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.diststudy.dao;

/**
 *
 * @author Администратор
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingReport {
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        
         long curTime = System.currentTimeMillis(); 
        Date curDate = new Date(curTime); 
        String curStringDate = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z").format(curTime); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" \n Method Name: " + ic.getMethod().getName() + " / " + curStringDate + " / class name class " + ic.getTarget().getClass().toString() + " ");
        return ic.proceed();
    }
}
