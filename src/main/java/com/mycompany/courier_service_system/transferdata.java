package com.mycompany.courier_service_system;

public class transferdata {

    public static String datatransfer, transferoid;

    public static void setdata(String data) {

        transferdata.datatransfer = data;

    }

    public static String getdata() {

        return datatransfer;

    }

    public static void setoid(String oid) {

        transferdata.transferoid = oid;

    }

    public static String getoid() {

        return transferoid;

    }

}
