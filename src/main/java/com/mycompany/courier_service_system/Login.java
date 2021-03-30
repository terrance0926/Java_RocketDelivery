package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {

    private String username;
    private String pass;
    private String role;
    private String id;
    private String name;
    private String email;
    private String contact;

    public String getusername() {

        return this.username;

    }

    public String getpass() {

        return this.pass;

    }

    public String getRole() {

        return this.role;

    }

    public String getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public String getEmail() {

        return this.email;

    }

    public String getContact() {

        return this.contact;

    }

    public void setusername(String username) {

        this.username = username;

    }

    public void setpass(String pass) {

        this.pass = pass;

    }

    public void setid(String id) {

        this.id = id;

    }

    public void setname(String name) {

        this.name = name;

    }

    public void setemail(String email) {

        this.email = email;

    }

    public boolean login() {

        boolean a = false;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (this.username.equals(data[0]) && this.pass.equals(data[1])) {

                    this.role = data[2];
                    a = true;

                }
            }

            br.close();

        } catch (IOException ex) {
            
            a = false;
            
        }
        
        return a;
    }

//    public void loadprofile(String username) {
//
//        this.username = username;
//
//        try {
//
//            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));
//
//            Object[] tableLines = br.lines().toArray();
//            br.close();
//
//            for (Object tableLine : tableLines) {
//
//                String line = tableLine.toString().trim();
//                String[] data = line.split(",");
//
//                if (username.equals(data[0])) {
//
//                    this.id = data[3];
//                    this.name = data[4];
//                    this.email = data[5];
//                    this.contact = data[6];
//                    this.pass = data[1];
//
//                }
//            }
//
//        } catch (IOException ex) {
//        }
//    }

}
