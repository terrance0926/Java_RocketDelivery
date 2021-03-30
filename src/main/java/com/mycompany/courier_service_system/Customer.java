package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Customer {
    
    String cid, cname, cemail, cphone;
    
    public String getcid() {
        
        return this.cid;
        
    }
    
    public String getcname() {
        
        return this.cname;
        
    }
    
    public String getcemail() {
        
        return this.cemail;
        
    }
    
    public String getcphone() {
        
        return this.cphone;
        
    }
    
    public void loaddata(String cid) {
        
        this.cid = cid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (cid.equals(data[3])) {
                   
                    this.cname = data[4];
                    this.cemail = data[5];
                    this.cphone = data[6];

                }
            }

        } catch (Exception e) {
        }

    }

}
