package com.co.manuel.patterns.creation;

public class AbstractFactoryConcreteWindows implements AbstractFactoryGUI {

  public class InnerAbstractFactoryConcreteWindowsButton implements AbstractFactoryButton {
    @Override
    public void render() {
      System.out.println("Rendering windows button");
    }
  }

  public class InnerAbstractFactoryConcreteWindowsCheckbox implements AbstractFactoryCheckbox {
    @Override
    public void pain() {
      System.out.println("Render the pain method for windows check box");
    }

  }

  @Override
  public AbstractFactoryButton createButton() {
    System.out.println("Creating concrete Windows Button object.");
    return new InnerAbstractFactoryConcreteWindowsButton();
  }

  @Override
  public AbstractFactoryCheckbox createCheckbox() {
    System.out.println("Creating concrete Windows Checkbox object.");
    return new InnerAbstractFactoryConcreteWindowsCheckbox();
  }

}
