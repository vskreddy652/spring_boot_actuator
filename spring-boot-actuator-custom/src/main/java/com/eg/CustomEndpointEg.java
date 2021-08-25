package com.eg;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "act-custom-endpoint")
public class CustomEndpointEg{

    @ReadOperation
    public String custom() {
        return "act-custom-end-point";
    }

    @ReadOperation
    public String customEndPointByName(@Selector String name) {
        return "act-custom-end-point";
    }

    @WriteOperation
    public void writeOperation(@Selector String name) {
        //add logic for write operation
    	return;
    }
    
	   @DeleteOperation
	   public void deleteOperation(@Selector String name){
	    //add logic for delete operation
	  }
}