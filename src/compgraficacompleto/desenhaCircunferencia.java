/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compgraficacompleto;

import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class desenhaCircunferencia {

    public BufferedImage drawCircle(BufferedImage img1, int pontoInicalx, int pontoInicaly, int radius) {
        int finalDoRaio = radius;
        int inicioDoRaio = 0;
        int decisionOver2 = 1 - finalDoRaio;   // critério de divisão dividido por 2  relacionado com finalDoRaio=r, inicioDoRaio=0
        //sempre do centro até as bordas 
        while (finalDoRaio >= inicioDoRaio) {
            img1.setRGB(finalDoRaio + pontoInicalx, inicioDoRaio + pontoInicaly, 225);   //( 1,1 )
            img1.setRGB(inicioDoRaio + pontoInicalx, finalDoRaio + pontoInicaly, 225);   // ( 0, 1)           
            img1.setRGB(-finalDoRaio + pontoInicalx, inicioDoRaio + pontoInicaly, 225);  //  (-1 ,0 )        
            img1.setRGB(-inicioDoRaio + pontoInicalx, finalDoRaio + pontoInicaly, 225);  //  0,1
            img1.setRGB(-finalDoRaio + pontoInicalx, -inicioDoRaio + pontoInicaly, 225); // -1 0
            img1.setRGB(-inicioDoRaio + pontoInicalx, -finalDoRaio + pontoInicaly, 225); // 0 -1
            img1.setRGB(finalDoRaio + pontoInicalx, -inicioDoRaio + pontoInicaly, 225);  //1 0 
            img1.setRGB(inicioDoRaio + pontoInicalx, -finalDoRaio + pontoInicaly, 225);  // 0 -1
            // dominuindo o tamnho do raio 
            inicioDoRaio++;
            //atribuindo o novo valor para o ponto que passa em cima da circunferência
            if (decisionOver2 <= 0) {
                decisionOver2 += 2 * inicioDoRaio + 1;
            } else {
                finalDoRaio--;
                decisionOver2 += 2 * (inicioDoRaio - finalDoRaio) + 1;
            }
        }
        return img1;

    }
}
