package com.pcce2.demo.gatewayimpl.rpc;

import com.pcce2.demo.convertor.CustomerConvertor;
import com.pcce2.demo.domain.customer.Customer;
import com.pcce2.demo.domain.customer.gateway.CustomerGateway;

import com.pcce2.demo.gatewayimpl.database.CustomerMapper;
import com.pcce2.demo.gatewayimpl.database.dataobject.CustomerDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> listByCustomerName(String customerName) {
        List<CustomerDO> customerDOList = customerMapper.listByCustomerName(customerName);
        List<Customer> customerList = new ArrayList<>();
        //convert customerDOList -->customerList
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        CustomerDO customerDO = CustomerConvertor.toDataObject(customer);
        customerMapper.create(customerDO);
        log.debug("AutoCustomerDOId: "+customerDO.getId());
    }

    @Override
    public void del(String customerId) {
        customerMapper.del(customerId);
    }
}
