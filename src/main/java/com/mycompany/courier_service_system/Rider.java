package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Rider {

    String rid, rname, remail, rphone;

    public String getrid() {

        return this.rid;

    }

    public String getrname() {

        return this.rname;

    }

    public String getremail() {

        return this.remail;

    }

    public String getrphone() {

        return this.rphone;

    }
    
    public void loaddata(String rid) {
        
        this.rid = rid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (rid.equals(data[3])) {
                   
                    this.rname = data[4];
                    this.remail = data[5];
                    this.rphone = data[6];

                }
            }

        } catch (Exception e) {
        }

    }

}
