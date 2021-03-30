package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Feedback {

    String fid, detail, cid, oid;

    public String getfid() {

        return this.fid;

    }

    public String getdetail() {

        return this.detail;

    }

    public String getcid() {

        return this.cid;

    }
    
    public String getoid() {
        
        return this.oid;
        
    }

    public void loaddata(String fid) {

        this.fid = fid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (fid.equals(data[0])) {

                    this.detail = data[1];
                    this.cid = data[2];
                    this.oid = data[3];

                }
            }

        } catch (Exception e) {
        }

    }
}
