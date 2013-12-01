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
        //u.setId(33);
        //u.setFirstName("Fauzdar");
        u.setUsername("someone1235");
        u.setLastName("Clinton");
        GenericDAO g = new GenericDAO();
        g.set(u);
        //g.persist(u); //only inserts
        g.attachDirty(u); //inserts or updates - update will work only if either pkey is used or the object fetched first
                
        //log.info(((User)g.findById(21)).getFirstName());
        //log.info(((User)g.findByExample(u).get(0)).getFirstName());
        //g.delete(u); //have to use pkey and any not-null fields or fetch the object
        
        //g.attachDirty(u);
        
        //update
        //User u2 = (User)g.findById(29);
        //u2.setFirstName("Raffa");
        //g.attachDirty(u2);
        //g.attachClean(u2); //doesn't work

    }
}
