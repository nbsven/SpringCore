package com.epam.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Event {

  private int id = new Random().nextInt();
  private String msg;
  private Date date;
  private DateFormat dateFormat;

  public Event(Date date, DateFormat dateFormat) {
    this.date = date;
    this.dateFormat = dateFormat;
  }

  public String toString() {
    return "Event(id=" + this.getId()
        + ", msg=" + this.getMsg()
        + ", date=" + dateFormat.format(date)
        + ", dateFormat=" + this.getDateFormat() + ")";
  }
}
