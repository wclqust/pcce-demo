
package com.pcce2.demo.customer.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.pcce2.demo.domain.customer.Customer;
import com.pcce2.demo.domain.customer.gateway.CustomerGateway;
import com.pcce2.demo.domain.customer.gateway.MailGateway;
import com.pcce2.demo.dto.CustomerAddCmd;
import com.pcce2.demo.dto.data.ErrorCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerAddCmdExe{

    @Autowired
    private CustomerGateway customerGateway;

    @Autowired
    private MailGateway mailGateway;

    public Response execute(CustomerAddCmd cmd) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(cmd, customer);
        customerGateway.save(customer);
        return Response.buildSuccess();
    }

}
