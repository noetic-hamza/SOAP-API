package com.example.demo.services;


import com.ericsson.schemas.Acknowledgment;
import com.ericsson.schemas.UserRequest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userEligibility {
     String username= "noetic";
     String password ="123456";
    public Acknowledgment checkNumber (UserRequest request){

        Acknowledgment acknowledgment= new Acknowledgment();
        List<String> mismatchCriteriaList = acknowledgment.getCriteriaMismatch();
//        System.out.println(request.getUserName());
        if(request.getUserName().equals("noetic") && request.getUsePassword().equals("123456")) {
            // if 175 retrun 0000 else 1111


            mismatchCriteriaList.add("Username and Password matched : \n"+"username :" + request.getUserName() +"\n"+
                    "password" + request.getUsePassword() +"\n"+
                    "DN" + request.getDN() +"\n"
            );
        }
        else
        {
            mismatchCriteriaList.add("Check your usernameeeeee and password");
        }




        return acknowledgment;

    }


}
