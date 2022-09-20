package com.pcce2.demo.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.pcce2.demo.api.CustomerServiceI;
import com.pcce2.demo.customer.executor.CustomerDeleteCmdExe;
import com.pcce2.demo.dto.CustomerAddCmd;
import com.pcce2.demo.dto.CustomerListByNameQry;
import com.pcce2.demo.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcce2.demo.customer.executor.CustomerAddCmdExe;
import com.pcce2.demo.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerDeleteCmdExe customerDeleteCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

    @Override
    public Response deleteCustomer(CustomerAddCmd customerAddCmd) {
        return customerDeleteCmdExe.execute(customerAddCmd);
    }

}