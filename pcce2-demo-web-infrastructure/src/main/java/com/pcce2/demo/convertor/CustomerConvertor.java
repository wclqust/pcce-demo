package com.pcce2.demo.convertor;


import com.pcce2.demo.domain.customer.Customer;
import com.pcce2.demo.gatewayimpl.database.dataobject.CustomerDO;

/**
 * @author frankzhang
 */
public class CustomerConvertor {

    public static CustomerDO toDataObject(Customer customer){
        CustomerDO customerDO = new CustomerDO();
        customerDO.setCustomerId(customer.getCustomerId());
        customerDO.setCompanyName(customer.getCompanyName());
        customerDO.setGlobalId(customer.getGlobalId());
        return customerDO;
    }

}
