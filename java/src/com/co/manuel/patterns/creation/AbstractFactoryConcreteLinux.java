package com.co.manuel.patterns.creation;

public class AbstractFactoryConcreteLinux implements AbstractFactoryGUI {

  public class InnerAbstractFactoryConcreteLinuxButton implements AbstractFactoryButton {
    @Override
    public void render() {
      System.out.println("Rendering Linux button");
    }
  }

  public class InnerAbstractFactoryConcreteLinuxCheckbox implements AbstractFactoryCheckbox {
    @Override
    public void pain() {
      System.out.println("Render the pain method for Linux check box");
    }
  }

  @Override
  public AbstractFactoryButton createButton() {
    System.out.println("Creating concrete Linux Button object.");
    return new InnerAbstractFactoryConcreteLinuxButton();
  }

  @Override
  public AbstractFactoryCheckbox createCheckbox() {
    System.out.println("Creating concrete Linux Checkbox object.");
    return new InnerAbstractFactoryConcreteLinuxCheckbox();
  }

}
