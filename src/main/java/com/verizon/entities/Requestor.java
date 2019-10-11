package com.verizon.entities;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "requestor_info")
public class Requestor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @NotNull
    private String requestor_name;

    @NotNull
    private String associate_director;


    @NotNull
    private String contact;

    @NotNull
    @Email(message = "Email is not valid!")
    private String contact_email;

    @NotBlank
    private String requesting_region;

    @NotBlank
    private String requesting_area;

    @NotBlank
    private String channel;

    @NotNull
    @FutureOrPresent
    private Date expected_date;


    @NotNull
    private String subscriber_outlet_id;


    private String ecode;


    @Email(message = "Email is not valid!")
    private String ccemail_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestor_name() {
        return requestor_name;
    }

    public void setRequestor_name(String requestor_name) {
        this.requestor_name = requestor_name;
    }

    public String getAssociate_director() {
        return associate_director;
    }

    public void setAssociate_director(String associate_director) {
        this.associate_director = associate_director;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getRequesting_region() {
        return requesting_region;
    }

    public void setRequesting_region(String requesting_region) {
        this.requesting_region = requesting_region;
    }

    public String getRequesting_area() {
        return requesting_area;
    }

    public void setRequesting_area(String requesting_area) {
        this.requesting_area = requesting_area;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Date getExpected_date() {
        return expected_date;
    }

    public void setExpected_date(Date expected_date) {
        this.expected_date = expected_date;
    }

    public String getSubscriber_outlet_id() {
        return subscriber_outlet_id;
    }

    public void setSubscriber_outlet_id(String subscriber_outlet_id) {
        this.subscriber_outlet_id = subscriber_outlet_id;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getCcemail_id() {
        return ccemail_id;
    }

    public void setCcemail_id(String ccemail_id) {
        this.ccemail_id = ccemail_id;
    }

    public Requestor(Long id,String requestor_name,String contact,String contact_email,String associate_director,String channel
            ,String requesting_area,String requesting_region,Date expected_date,String ecode,String ccemail_id)
    {

        this.id=id;
        this.requestorName=requestorName;
        this.contact=contact;
        this.contact_email=contact_email;
        this.associate_director=associate_director;
        this.channel=channel;
        this.requesting_area=requesting_area;
        this.requesting_region=requesting_region;
        this.expected_date=expected_date;
        this.ecode=ecode;
        this.ccemail_id=ccemail_id;

    }
    public Requestor(Long id,String requestor_name,String contact,String contact_email,String associate_director,String channel
            ,String requesting_area,String requesting_region,Date expected_date)
    {
        this.id=id;
        this.requestor_name=requestor_name;
        this.contact=contact;
        this.contact_email=contact_email;
        this.associate_director=associate_director;
        this.channel=channel;
        this.requesting_area=requesting_area;
        this.requesting_region=requesting_region;
        this.expected_date=expected_date;
         }

         public  Requestor()
         {

         }



}
