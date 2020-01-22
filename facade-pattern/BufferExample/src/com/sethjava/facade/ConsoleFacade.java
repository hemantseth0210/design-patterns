package com.sethjava.facade;

import java.util.ArrayList;
import java.util.List;

public class ConsoleFacade {
    private List<ViewPort> viewports = new ArrayList<>();
    int width, height;

    public ConsoleFacade(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(ViewPort viewPort){
        viewports.add(viewPort);
    }

    public void render(){
        for (int y = 0; y < height; ++y){
            for (int x = 0; x < width; ++x){
                for(ViewPort vp : viewports){
                    System.out.println(vp.charAt(x, y));
                }
            }
            System.out.println();
        }
    }

    public static ConsoleFacade newConsole(int width, int height){
        Buffer buffer = new Buffer(width, height);
        ViewPort viewPort = new ViewPort(buffer, width, height,0, 0);
        ConsoleFacade consoleFacade = new ConsoleFacade(width, height);
        consoleFacade.addViewport(viewPort);
        return consoleFacade;
    }
}
