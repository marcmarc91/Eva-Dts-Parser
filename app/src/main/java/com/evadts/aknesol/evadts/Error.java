package com.evadts.aknesol.evadts;

public class Error {

    String eventDescription;
    String eventCode;
    String eventDate;
    String eventDefinition;

    public Error(String eventDescription, String eventCode, String eventDate, String eventDefinition) {
        this.eventDescription = eventDescription;
        this.eventCode = eventCode;
        this.eventDate = eventDate;
        this.eventDefinition = eventDefinition;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDefinition() {
        return eventDefinition;
    }

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }
}


