package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Manager {

    String mid, mname, memail, mphone;

    public String getmid() {

        return this.mid;

    }

    public String getmname() {

        return this.mname;

    }

    public String getmemail() {

        return this.memail;

    }

    public String getmphone() {

        return this.mphone;

    }
    
    public void loaddata(String mid) {
        
        this.mid = mid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (mid.equals(data[3])) {
                   
                    this.mname = data[4];
                    this.memail = data[5];
                    this.mphone = data[6];

                }
            }

        } catch (Exception e) {
        }

    }

}
