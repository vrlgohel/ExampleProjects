package org.resteasy.simple.deployment.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Date;
import java.util.Optional;

@XmlRootElement
public class Person {
    private String name;
    private String family;
    private Optional<String> email;
    private DayOfWeek dayOfWeek;
    private Duration duration;

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Person toString method. Name = " + name + "; family = " + family;
    }
}
