package com.generator.mybatis.mapper;

import com.generator.mybatis.po.PaymentBillGroup;
import com.generator.mybatis.po.PaymentBillGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentBillGroupMapper {
    int countByExample(PaymentBillGroupExample example);

    int deleteByExample(PaymentBillGroupExample example);

    int deleteByPrimaryKey(String billGroupId);

    int insert(PaymentBillGroup record);

    int insertSelective(PaymentBillGroup record);

    List<PaymentBillGroup> selectByExample(PaymentBillGroupExample example);

    PaymentBillGroup selectByPrimaryKey(String billGroupId);

    int updateByExampleSelective(@Param("record") PaymentBillGroup record, @Param("example") PaymentBillGroupExample example);

    int updateByExample(@Param("record") PaymentBillGroup record, @Param("example") PaymentBillGroupExample example);

    int updateByPrimaryKeySelective(PaymentBillGroup record);

    int updateByPrimaryKey(PaymentBillGroup record);
}