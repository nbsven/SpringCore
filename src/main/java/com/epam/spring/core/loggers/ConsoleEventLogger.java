package com.epam.spring.core.loggers;

import com.epam.spring.core.EventLogger;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsoleEventLogger implements EventLogger {

  public void logEvent(String msg) {
    System.out.println(msg);
  }
}
