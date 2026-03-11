package com.co.manuel.patterns.structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressDecorator extends DataSourceDecorator {

  private int compLavel = 6;

  public CompressDecorator(DataSource dataSource) {
    super(dataSource);
  }

  public int getCompLavel() {
    return compLavel;
  }

  public void setCompLavel(int compLavel) {
    this.compLavel = compLavel;
  }

  @Override
  public String read() {
    return decompress(super.read());
  }

  @Override
  public void write(String data) {
    super.write(compress(data));
  }

  private String compress(String data) {

    byte[] byteData = data.getBytes();
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
      DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(this.compLavel));
      dos.write(byteData);
      dos.close();
      baos.close();
      return Base64.getEncoder().encodeToString(baos.toByteArray());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return "";
  }

  private String decompress(String data) {
    byte[] byteData = Base64.getDecoder().decode(data);
    try {
      InputStream is = new ByteArrayInputStream(byteData);
      InflaterInputStream iis = new InflaterInputStream(is);
      ByteArrayOutputStream baos = new ByteArrayOutputStream(512);

      int b;
      while ((b = iis.read()) != -1) {
        baos.write(b);
      }
      baos.close();
      iis.close();
      is.close();
      return new String(baos.toByteArray());

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return "";
  }

}
