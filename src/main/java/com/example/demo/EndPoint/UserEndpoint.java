package com.example.demo.EndPoint;


import com.ericsson.schemas.Acknowledgment;
import com.ericsson.schemas.UserRequest;
import com.example.demo.services.userEligibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    private static final String NAMESPACE="http://schemas.ericsson.com/";
    @Autowired
    private userEligibility service;


    @PayloadRoot(namespace = NAMESPACE,localPart = "UserRequest")
    @ResponsePayload
    public Acknowledgment getLoanStatus (@RequestPayload UserRequest request)
    {
        return service.checkNumber(request);

    }
}
