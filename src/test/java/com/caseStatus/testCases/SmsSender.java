package com.caseStatus.testCases;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class SmsSender {
	// Find your Account Sid and Auth Token at twilio.com/console
	
	public static final String ACCOUNT_SID =System.getenv("account_sid");
    public static final String AUTH_TOKEN =System.getenv("auth_token");    
    
	  

    public void sendtext(String msg) {
    	
    	System.out.println(ACCOUNT_SID.length());
    	System.out.println(AUTH_TOKEN.length());

    	System.out.println("ACCOUNT_SID:"+ACCOUNT_SID+":END");
    	System.out.println("AUTH_TOKEN:"+ AUTH_TOKEN+":END");
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        Message message = Message
//                .creator(new PhoneNumber("+13184369326"), // to
//                        new PhoneNumber("+17744692483"), // from
//                        msg)
//                .create();
//
//        System.out.println(message.getSid());
    }
}
