package com.sethjava.facade;

public class Demo {

    public static void main(String[] args) {
	    Buffer buffer = new Buffer(30, 20);
	    ViewPort viewPort = new ViewPort(buffer, 30, 20,0, 0);
	    ConsoleFacade consoleFacade = new ConsoleFacade(30, 20);
	    consoleFacade.addViewport(viewPort);
	    consoleFacade.render();

	    ConsoleFacade consoleFacade1 = new ConsoleFacade(30, 20);
	    consoleFacade1.render();

    }
}
