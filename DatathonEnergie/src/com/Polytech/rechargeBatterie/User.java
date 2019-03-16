/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Polytech.rechargeBatterie;

/**
 *
 * @author kh
 */
public class User {
    public String username;
    public int id;
    public String password;
    
    public User(){
        username = "";
        id = -1;
        password = "";
    }
    
    public User(int iid, String iun, String ipsw){
        username = iun;
        id = iid;
        password = ipsw;
    }
}
