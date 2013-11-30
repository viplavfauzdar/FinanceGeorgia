/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viplav.financegeorgia.test;

import com.viplav.financegeorgia.db.*;

/**
 *
 * @author Viplav
 */
public class Test1 {

    public static void main(String[] args) {

        User u = new User();
        u.setFirstName("Viplav");
        try {
            HibernateUtil.getSessionFactory().getCurrentSession().persist(u);
            System.out.println("persist successful");
        } catch (RuntimeException re) {
            System.out.println("persist failed " + re);
            throw re;
        }


        //GenericDAO g = new GenericDAO();
        //g.persist(u);



    }
}
