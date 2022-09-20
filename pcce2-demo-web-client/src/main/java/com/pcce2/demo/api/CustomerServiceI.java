package com.pcce2.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.pcce2.demo.dto.CustomerAddCmd;
import com.pcce2.demo.dto.CustomerListByNameQry;
import com.pcce2.demo.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);

    Response deleteCustomer(CustomerAddCmd customerAddCmd);

}
