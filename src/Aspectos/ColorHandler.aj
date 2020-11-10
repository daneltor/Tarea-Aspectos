package Aspectos;

import java.awt.Color;

public aspect ColorHandler {
	pointcut success(): call(* *setBackground(* .YELLOW));
    after(): success(){
    	System.out.println("---- Color nuevo: Amarillo ----");    	
    }
    
	pointcut success1(): call(* *setBackground(* .BLUE));
    after(): success1(){
    	System.out.println("---- Color nuevo: Azul ----");    	
    }
    
	pointcut success2(): call(* *setBackground(* .RED));
    after(): success2(){
    	System.out.println("---- Color nuevo: Rojo ----");    	
    }
}
