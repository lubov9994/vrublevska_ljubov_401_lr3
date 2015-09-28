/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.diststudy.db;

import java.sql.Connection;

/**
 *
 * @author Администратор
 */
public interface ConnectDB {
    public Connection createConnection();
}
