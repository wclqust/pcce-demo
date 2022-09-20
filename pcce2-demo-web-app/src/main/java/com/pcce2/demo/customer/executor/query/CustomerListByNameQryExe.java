package com.pcce2.demo.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.exception.Assert;
import com.pcce2.demo.domain.customer.Customer;
import com.pcce2.demo.domain.customer.gateway.CustomerGateway;
import com.pcce2.demo.dto.CustomerListByNameQry;
import com.pcce2.demo.dto.data.CustomerDTO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerListByNameQryExe{
    @Autowired
    private CustomerGateway customerGateway;

    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry cmd) {
        List<Customer> customerList = customerGateway.listByCustomerName(cmd.getName());
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTOList.add(customerDTO);
        return MultiResponse.of(customerDTOList);
    }
}
