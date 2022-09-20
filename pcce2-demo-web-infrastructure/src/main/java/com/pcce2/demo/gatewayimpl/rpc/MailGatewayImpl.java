package com.pcce2.demo.gatewayimpl.rpc;

import com.pcce2.demo.domain.customer.Mail;
import com.pcce2.demo.domain.customer.gateway.MailGateway;
import org.springframework.stereotype.Component;

@Component
public class MailGatewayImpl implements MailGateway {
    @Override
    public Boolean sendMail(Mail mail) {
        return null;
    }
}
