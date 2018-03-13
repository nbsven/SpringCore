package com.epam.spring.core.loggers;

import com.epam.spring.core.EventLogger;
import com.epam.spring.core.beans.Event;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsoleEventLogger implements EventLogger {

  public void logEvent(Event event) {
    System.out.println(event);
  }
}
