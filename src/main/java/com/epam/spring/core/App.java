package com.epam.spring.core;

import com.epam.spring.core.beans.Client;
import com.epam.spring.core.loggers.ConsoleEventLogger;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class App {

  private Client client;
  private EventLogger eventLogger;

  private void logEvent(String msg) {
    String message = msg.replaceAll(client.getId(), client.getFullName());
    eventLogger.logEvent(message);
  }

  public static void main(String[] args) {


  }
}
