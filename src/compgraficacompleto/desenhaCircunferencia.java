/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compgraficacompleto;

import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica 
 * Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class desenhaCircunferencia {

    public BufferedImage drawCircle(BufferedImage img1, int x0, int y0, int radius){        
	  int x = radius;
	  int y = 0;
	  int decisionOver2 = 1 - x;   // critério de divisão dividido por 2  relacionado com x=r, y=0
	  while(x >= y){
            img1.setRGB(x + x0,  y + y0, 225);
	    img1.setRGB( y + x0,  x + y0, 225);            
	    img1.setRGB(-x + x0,  y + y0, 225);            
	    img1.setRGB(-y + x0,  x + y0, 225);            
	    img1.setRGB(-x + x0, -y + y0, 225);           
	    img1.setRGB(-y + x0, -x + y0, 225);            
	    img1.setRGB( x + x0, -y + y0, 225);            
	    img1.setRGB( y + x0, -x + y0, 225);            
	    y++;
            //atribuindo o novo valor para o ponto que passa em cima da circunferência
	    if (decisionOver2<=0){
	      decisionOver2 += 2 * y + 1;   
	    }else{
	      x--;
	      decisionOver2 += 2 * (y - x) + 1;   
	    }
	  }
          return img1;
          
	}
    }

