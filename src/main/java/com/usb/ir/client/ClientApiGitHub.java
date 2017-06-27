/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usb.ir.client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Jersey REST client generated for REST resource:WSCc [/catastro]<br>
 * USAGE:
 * <pre>
 *        ClientApiGitHub client = new ClientApiGitHub();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author SONY
 */
public class ClientApiGitHub {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "https://api.github.com/";

    public ClientApiGitHub() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("/search/code");
    }

     public String findApiGitHub(String q,String accessToken,String rows) {
      
        Response res = webTarget
                .queryParam("access_token", accessToken)
                .queryParam("q", q)
                //.queryParam("rows", rows)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get();
        return res.readEntity(String.class);
    }
    

    public void close() {
        client.close();
    }
    
}
