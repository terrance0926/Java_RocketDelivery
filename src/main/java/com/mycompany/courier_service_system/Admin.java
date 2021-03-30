package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Admin {

    String aid, aname, aemail, aphone;

    public String getaid() {

        return this.aid;

    }

    public String getaname() {

        return this.aname;

    }

    public String getaemail() {

        return this.aemail;

    }

    public String getaphone() {

        return this.aphone;

    }
    
    public void loaddata(String aid) {
        
        this.aid = aid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (aid.equals(data[3])) {
                   
                    this.aname = data[4];
                    this.aemail = data[5];
                    this.aphone = data[6];

                }
            }

        } catch (Exception e) {
        }

    }

}
