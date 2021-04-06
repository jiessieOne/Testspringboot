package com.duying.controller;

import com.duying.domain.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Controller
public class TestValidation {

    @RequestMapping("/validation")
    @ResponseBody
    public String testValidationData(@Valid Guest guest){
//        //创建普通验证器对象
//        Validator validator=Validation.buildDefaultValidatorFactory().getValidator();
//
//        //开启一个快速失败模式的验证器，当第一个验证对象出现问题时则不会验证一下个对象。
//        Validator speedFailValidator=Validation.byDefaultProvider().configure().
//                addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
//
//        //普通验证器，传递一个需要验证的参数，返回一个set集合里面存储着错误信息。
//        Set<ConstraintViolation<Guest>> constraintViolations=validator.validate(guest);
//        for(ConstraintViolation cv:constraintViolations){
//            System.out.println(cv.getPropertyPath()+"--"+cv.getMessage());
//        }
//
//        //快速失败模式验证器
//        Set<ConstraintViolation<Guest>> constraintValidators=speedFailValidator.validate(guest);
//        for(ConstraintViolation cv:constraintValidators){
//            System.out.println("快速失败模式"+cv.getPropertyPath()+"---"+cv.getMessage());
//        }

        return "测试完毕";
    }


    @RequestMapping("/testError")
    public void testError() throws Exception {
        throw new Exception("一个大大滴异常");
    }

}
