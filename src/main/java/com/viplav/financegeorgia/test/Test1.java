/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viplav.financegeorgia.test;

import com.viplav.financegeorgia.db.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Viplav
 */
public class Test1 {
    
    private static Log log = LogFactory.getLog(Test1.class);
    
    public static void main(String[] args) {

        User u = new User();
        u.setFirstName("Viplav123345");
        u.setUsername("fauzdar1234567");
        
        GenericDAO g = new GenericDAO();
        g.set(u);
        //g.persist(u);
                
        //log.info(((User)g.findById(21)).getFirstName());
        //log.info(((User)g.findByExample(u).get(0)).getFirstName());
        g.delete(u);


    }
}
