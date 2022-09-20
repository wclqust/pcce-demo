package com.pcce2.demo.domain.customer.gateway;

import com.pcce2.demo.domain.customer.Customer;

import java.util.List;

public interface CustomerGateway {
    List<Customer> listByCustomerName(String customerName);

    void save(Customer customer);

    void del(String customerId);
}
