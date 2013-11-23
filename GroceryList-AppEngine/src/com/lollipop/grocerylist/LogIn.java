package com.lollipop.grocerylist;
import java.util.Date;

import com.google.appengine.api.datastore.Key;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Key key;
    private String itemDetails;
    private String userEmail;
    private Date checkinDate;
    
    public Key getKey() {
        return key;
    }

    public String getPlaceId() {
        return itemDetails;
    }
    public void setPlaceId(String placeId) {
        this.itemDetails = placeId;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }
    public void setCheckinDate(Date date) {
        checkinDate = date;
    }
}
