
package com.pcce2.demo.customer.executor;

import com.alibaba.cola.dto.Response;
import com.pcce2.demo.domain.customer.Mail;
import com.pcce2.demo.domain.customer.gateway.CustomerGateway;
import com.pcce2.demo.domain.customer.gateway.MailGateway;
import com.pcce2.demo.dto.CustomerAddCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerDeleteCmdExe {
    @Autowired
    private CustomerGateway customerGateway;

    @Autowired
    private MailGateway mailGateway;

    public Response execute(CustomerAddCmd cmd) {
        customerGateway.del(cmd.getCustomerDTO().getCustomerId());
        Mail mail = new Mail();
        mailGateway.sendMail(mail);
        return Response.buildSuccess();
    }

}
