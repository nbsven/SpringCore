package com.epam.spring.core;

import com.epam.spring.core.beans.Client;
import com.epam.spring.core.beans.Event;
import com.epam.spring.core.loggers.ConsoleEventLogger;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@AllArgsConstructor
@NoArgsConstructor
public class App {

  private Client client;
  private EventLogger eventLogger;

  private void logEvent(Event event) {
    String message = event.getMsg().replaceAll(client.getId(), client.getFullName());
    event.setMsg(message);
    eventLogger.logEvent(event);
  }

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

    App app = (App) context.getBean("app");

    Event event = context.getBean("event", Event.class);
    event.setMsg("Some event for 1");
    app.logEvent(event);

    Event event1 = context.getBean("event", Event.class);
    event1.setMsg("Some event for 2");
    app.logEvent(event1);

  }
}
