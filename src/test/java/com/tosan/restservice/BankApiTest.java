package com.tosan.restservice;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;

public class BankApiTest {
    @Test
    public void insertTest() {
        Client client = Client.create();
        WebResource webResource = client.resource("http://192.168.7.191:1369/first-sample/rest/bank");
        String input = "{\"name\":\"Shobe3\",\"bankType\":\"1\"}";
        ClientResponse response = webResource.type("application/json").accept("application/json")
                .put(ClientResponse.class, input);
        System.out.println(response);
    }
}
