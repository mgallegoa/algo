package com.co.manuel.patterns.structural.decorator;

public abstract class DataSourceDecorator implements DataSource {

  private DataSource wrapper;

  public DataSourceDecorator(DataSource dataSource) {
    this.wrapper = dataSource;
  }

  @Override
  public String read() {
    return wrapper.read();
  }

  @Override
  public void write(String data) {
    wrapper.write(data);

  }

}
