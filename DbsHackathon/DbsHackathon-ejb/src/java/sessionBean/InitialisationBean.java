/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import entity.CustomerEntity;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author subar
 */
@Singleton
@LocalBean
@Startup
public class InitialisationBean {
    @EJB
    private CustomerEntitySessionBeanLocal customerEntitySessionBean;
    @PersistenceContext(unitName = "DbsHackathon-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    @PostConstruct
    public void postConstruct() {
        initialise();
    }
    
    private void initialise() {
        CustomerEntity ce = new CustomerEntity();
        ce.setFirstName("John");
        ce.setLastName("Doe");
        customerEntitySessionBean.createCustomer(ce);
    }
    
}
