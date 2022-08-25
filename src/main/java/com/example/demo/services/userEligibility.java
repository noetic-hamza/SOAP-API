package com.example.demo.services;


import com.ericsson.schemas.sopapi.Acknowledgment;
import com.ericsson.schemas.sopapi.UserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userEligibility {
    private String username= "noetic";
    private String password ="123456";
    public Acknowledgment checkNumber (UserRequest request){

        Acknowledgment acknowledgment= new Acknowledgment();
        List<String> mismatchCriteriaList = acknowledgment.getCriteriaMismatch();
        if(request.getUserName().equals(username) && request.getUserName().equals(password)) {
            mismatchCriteriaList.add("username :" + request.getUserName() +
                    "password" + request.getUsePassword() +
                    "DN" + request.getDN() +
                    "Retn"+ request.getResponse() +
                    "DESC" + request.getDN());
        }

        return acknowledgment;

    }


}
