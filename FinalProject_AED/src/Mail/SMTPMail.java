/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author sujithkaluva
 */
public class SMTPMail {

    public static void sendEmailMessage(String emailId) {
//// Recipient's email ID needs to be mentioned.
//        String to = emailId;
//        String from = "donotreplyers@gmail.com";
//        String pass = "devhuskies";
//// Assuming you are sending email from localhost
//// String host = "192.168.0.16";
//
//// Get system properties
//        Properties properties = System.getProperties();
//        String host = "smtp.gmail.com";
//
//        properties.put("mail.smtp.starttls.enable", "true");
//
//        properties.put("mail.smtp.ssl.trust", host);
//        properties.put("mail.smtp.user", from);
//// properties.put("mail.smtp.password", pass);
//        properties.put("mail.smtp.port", "25");
//        properties.put("mail.smtp.auth", "true");
//
//        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
//// Setup mail server
//// properties.setProperty("mail.smtp.host", host);
//// properties.put("mail.smtp.starttls.enable", "true");
//// Get the default Session object.
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//// Create a default MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//
//// Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//
//// Set To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//// Set Subject: header field
//            message.setSubject("Volunteer Registration");
//            message.setText("Thank you for registering with us. Your account will be activated within 24 hours. We will keep you posted in case of emergencies.");
//// Send message
//            Transport transport = session.getTransport("smtp");
//            transport.connect(host, from, pass);
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();
//            System.out.println("Sent message successfully....");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Invalid email id");
//        }

//    System.out.println("SimpleEmail Start");
//
//        String smtpHostServer = "smtp.gmail.com";
//        String emailID = emailId;
//
//        Properties props = System.getProperties();
//
//        props.put("mail.smtp.host", smtpHostServer);
//
//        Session session = Session.getInstance(props, null);
//
//        EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
        final String fromEmail = "sujithkaluva25@gmail.com"; //requires valid gmail id
        final String password = "s9908419243"; // correct password for gmail id
        final String toEmail = "sujithkaluva1999@gmail.com"; // can be any email id 

        System.out.println("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        props.put("mail.smtp.port", "465"); //SMTP Port//465

        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

//        Session session = Session.getDefaultInstance(props, auth);
Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(fromEmail, password);
    }
});
        System.out.println("Session created");
        EmailUtil.sendEmail(session, toEmail, "SSLEmail Testing Subject", "SSLEmail Testing Body");

        //EmailUtil.sendAttachmentEmail(session, toEmail,"SSLEmail Testing Subject with Attachment", "SSLEmail Testing Body with Attachment");
        //EmailUtil.sendImageEmail(session, toEmail,"SSLEmail Testing Subject with Image", "SSLEmail Testing Body with Image");
    }

}
