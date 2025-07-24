package com.co.manuel.patterns.creation;

/*
 * Produce families of related objects without specifying their concrete classes.
 * */
public class AbstractFactory {

  public static void main(String[] args) {
    System.out.println("AbstractFactory pattern -->");

    AbstractFactoryGUI abstractFactoryGUI;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("linux")) {
      abstractFactoryGUI = new AbstractFactoryConcreteLinux();
    } else {
      abstractFactoryGUI = new AbstractFactoryConcreteWindows();
    }

    AbstractFactoryButton aButton = abstractFactoryGUI.createButton();
    AbstractFactoryCheckbox aCheckbox = abstractFactoryGUI.createCheckbox();

    aButton.render();
    aCheckbox.pain();
  }
}
