package com.co.manuel.patterns.structural.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource implements DataSource {

  private String fileName;

  public FileDataSource(String name) {
    this.fileName = name;
  }

  @Override
  public void write(String data) {
    File file = new File(fileName);
    try (OutputStream os = new FileOutputStream(file)) {
      os.write(data.getBytes(), 0, data.length());
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  @Override
  public String read() {
    char[] charData = null;
    File file = new File(this.fileName);
    try (FileReader fr = new FileReader(file)) {
      charData = new char[(int) file.length()];
      fr.read(charData);

    } catch (IOException ie) {
      ie.printStackTrace();
    }
    return new String(charData);
  }

}
