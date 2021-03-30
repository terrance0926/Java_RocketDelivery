package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class AllUsers {
    
    String un, pass, role, id, name, email, contact;
    
    public String getun() {
        
        return this.un;
        
    }
    
    public String getpass() {
        
        return this.pass;
        
    }
    
    public String getrole() {
        
        return this.role;
        
    }
    
    public String getid() {
        
        return this.id;
        
    }
    
    public String getname() {
        
        return this.name;
        
    }
    
    public String getemail() {
        
        return this.email;
        
    }
    
    public String getcontact() {
        
        return this.contact;
        
    }
    
    public void loaddata(String id) {
        
        this.id = id;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (id.equals(data[3])) {
                   
                    this.un = data[0];
                    this.pass = data[1];
                    this.role = data[2];
                    this.id = data[3];
                    this.name = data[4];
                    this.email = data[5];
                    this.contact = data[6];

                }
            }

        } catch (Exception e) {
        }

    }

}
