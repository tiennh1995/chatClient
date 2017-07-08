package controller;

public class InitClient {  
  public void runClient() {
    Thread listen = new Thread(new InitSocket());
    listen.start();
  }
}
