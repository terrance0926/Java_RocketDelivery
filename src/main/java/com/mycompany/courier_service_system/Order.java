package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.FileReader;

public class Order {

    private String oid;  
    private String ocd;
    private String odd;
    private String odt;
    private String status;
    private String remarks;
    private String priority;
    private String address;
    private String rid;
    private String cid;

    public String getoid() {

        return this.oid;

    }

    public String getocd() {

        return this.ocd;

    }

    public String getodd() {

        return this.odd;

    }

    public String getodt() {

        return this.odt;

    }

    public String getstatus() {

        return this.status;

    }

    public String getremarks() {

        return this.remarks;

    }

    public String getpriority() {

        return this.priority;

    }

    public String getaddress() {

        return this.address;

    }
    
    public String getrid() {
        
        return this.rid;
        
    }
    
    public String getcid() {
        
        return this.cid;
        
    }

    public void loaddata(String oid) {
        
        this.oid = oid;

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object lines : tableLines) {

                String line = lines.toString().trim();
                String[] data = line.split(",");

                if (oid.equals(data[0])) {
                   
                    this.status = data[4];
                    this.ocd = data[1];
                    this.odd = data[2];
                    this.odt = data[3];
                    this.address = data[7];
                    this.remarks = data[5];
                    this.priority = data[6];
                    this.rid = data[9];
                    this.cid = data[8];

                }
            }

        } catch (Exception e) {
        }

    }

}
