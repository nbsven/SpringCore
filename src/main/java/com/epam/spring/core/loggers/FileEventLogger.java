package com.epam.spring.core.loggers;

import com.epam.spring.core.EventLogger;
import com.epam.spring.core.beans.Event;
import java.io.File;
import java.io.IOException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.FileUtils;

@Getter
@Setter
public class FileEventLogger implements EventLogger {

  private String filename;
  private File file;

  public FileEventLogger(String filename) {
    this.filename = filename;
  }

  public void logEvent(Event event){
    try {
      FileUtils.writeStringToFile(file, event.getMsg(), true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void init() throws IOException {
    this.file = new File(filename);
    if (!file.canWrite()) {
      throw new IOException();
    }
  }
}
