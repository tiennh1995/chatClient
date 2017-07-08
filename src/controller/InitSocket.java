package controller;

import modal.*;

import java.io.IOException;
import java.net.Socket;

public class InitSocket implements Runnable {
  Socket socket;
  
  public InitSocket() {
    try {
      socket = new Socket(Constant.IP, Constant.DEFAULT_PORT);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    try {
//      while(true) {
        Thread dataController = new Thread(new DataController(socket));
        dataController.start();
//      }
    } catch (Exception ex) {
      System.out.println("Init socket fail!\n");
    }
  }
}