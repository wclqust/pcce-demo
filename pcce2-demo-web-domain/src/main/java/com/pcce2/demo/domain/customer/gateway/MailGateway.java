package com.pcce2.demo.domain.customer.gateway;

import com.pcce2.demo.domain.customer.Mail;

//Assume that the credit info is in another distributed Service
public interface MailGateway {
    Boolean sendMail(Mail mail);
}
