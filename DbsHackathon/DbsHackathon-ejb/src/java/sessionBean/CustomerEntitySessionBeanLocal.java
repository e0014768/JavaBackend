/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import entity.CustomerEntity;
import javax.ejb.Local;

/**
 *
 * @author subar
 */
@Local
public interface CustomerEntitySessionBeanLocal {

    public CustomerEntity createCustomer(CustomerEntity customerEntity);
    
}
