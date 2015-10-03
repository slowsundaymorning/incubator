package com.hsyc.javafx;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


  private enum Padding {
    HGAP(10), VGAP(10);
    private final int value;
    private Padding(int _value) { this.value = _value; }
    private int getValue() { return value; }
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    GridPane main = new GridPane();
    main.setHgap(10);
  }

}
