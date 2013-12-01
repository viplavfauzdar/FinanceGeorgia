/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viplav.financegeorgia.db;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;


/**
 *
 * @author Viplav
 */
public class GenericDAO<T> {
    
        private T t;
        
        public void set(T t){
            this.t=t;
        }
        
        public T get(){
            return t;
        }
    
	//private static final Log log = LogFactory.getLog(this.getClass().getName());
        private Log log = LogFactory.getLog(this.getClass().getName());

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(T transientInstance) {
		log.debug("persisting instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().persist(transientInstance);
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(T instance) {
		log.debug("attaching dirty instance");
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
                        sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

        //lock is deperecated. 
	public void attachClean(T instance) {
		log.debug("attaching clean instance");
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
                        sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(T persistentInstance) {
		log.debug("deleting instance");
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().delete(persistentInstance);
                        sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User merge(T detachedInstance) {
		log.debug("merging instance");
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			User result = (User) sessionFactory.getCurrentSession().merge(
					detachedInstance);
                        sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public T findById(java.lang.Integer id){
		log.debug("getting instance with id: " + id);
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			T instance = (T) sessionFactory.getCurrentSession().get(
					t.getClass().getName(), id);
                        sessionFactory.getCurrentSession().getTransaction().commit();
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(T instance) {
		log.debug("finding instance by example");
		try {
                        sessionFactory.getCurrentSession().beginTransaction();
			List results = sessionFactory.getCurrentSession()
					.createCriteria(t.getClass().getName())
					.add(Example.create(instance)).list();
                        sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
