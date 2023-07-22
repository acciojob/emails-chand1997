package com.driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mail {
    private Date d;
    private String sender;
    private String message;

    public Mail(Date d, String sender, String message) {
        this.d = d;
        this.sender = sender;
        this.message = message;
    }


}
