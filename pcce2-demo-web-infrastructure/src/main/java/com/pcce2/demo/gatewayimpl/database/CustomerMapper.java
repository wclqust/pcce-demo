package com.pcce2.demo.gatewayimpl.database;

import com.pcce2.demo.domain.customer.Customer;
import com.pcce2.demo.gatewayimpl.database.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper{

  List<CustomerDO> listByCustomerName(@Param("customerName") String customerName);

  void create(CustomerDO customerDO);

  void del(@Param("customerId") String customerId);
}
