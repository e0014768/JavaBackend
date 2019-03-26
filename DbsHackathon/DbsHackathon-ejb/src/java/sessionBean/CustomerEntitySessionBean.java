/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import entity.CustomerEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author subar
 */
@Stateless
public class CustomerEntitySessionBean implements CustomerEntitySessionBeanLocal {
    @PersistenceContext(unitName = "DbsHackathon-ejbPU")
    private EntityManager em;

    
    @Override
    public CustomerEntity createCustomer(CustomerEntity customerEntity ) {
        em.persist(customerEntity);
        em.flush();
        return customerEntity;
    }
    
    

    public void persist(Object object) {
        em.persist(object);
    }
}
