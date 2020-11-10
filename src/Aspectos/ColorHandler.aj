package Aspectos;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public aspect ColorHandler {
	Map<Color,String> mapa = getConfig();
	
	
	pointcut success(Color c): args(c) && call(** changeColor(**));
    after(Color c): success(c){
    	imprimir(c);
    }
    
    pointcut success1(): call(** invertColor(**));
    after(): success1(){
    	System.out.println("Color invertido");
    }
    
    void imprimir(Color color) {
    	System.out.println(mapa.get(color));
    }
    
    Map<Color, String> getConfig(){
    	Map<Color,String> response = new HashMap<>();
    	response.put(Color.GREEN, "Verde");
    	response.put(Color.BLUE, "Azul");
    	response.put(Color.RED, "Rojo");
    	return response;
    }
    
}