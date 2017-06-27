package com.usb.ir.main;

import com.usb.ir.client.ClientApiGitHub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class GetStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ClientApiGitHub cm = new ClientApiGitHub();
        System.out.println( cm.findApiGitHub("jwt+in:file+filename:pom+extension:xml", "a70080066176032fd5badc5063b750d3098fcc43", "20"));
        cm.close();
    }
    
}
