package compgraficacompleto;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica 
 * Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class passaBaixa {

    int valor[] = new int[8];

    public BufferedImage doPassaBaixa(BufferedImage img, int largNova, int altNova) {
        
        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());
        int red, blue , green;
        Color cor5;
        for (int y = 1; y < img.getHeight()-1; y++) {
            for (int x = 1; x < img.getWidth()-1; x++) {
                //Math.abs(catetoOposto) ;               
                Color cor = new Color(img.getRGB(x+1, y));                
                Color cor2 = new Color(img.getRGB(x, y+1));                
                Color cor3 = new Color(img.getRGB(x-1, y));                
                Color cor4 = new Color(img.getRGB(x, y-1));
                blue = (cor.getBlue()+ cor2.getBlue()+ cor3.getBlue()+
                cor4.getBlue())/4;
                
                
                red = (cor.getRed()+ cor2.getRed()+cor3.getRed()+
                cor4.getRed())/4;
                
                green= (cor.getGreen()+cor2.getGreen()+cor3.getGreen()+
                cor4.getGreen())/4;
                
                cor5 = new Color(red,green,blue);
                
                aux.setRGB(x, y, cor5.getRGB());

            }
        }
        return aux;
    }

}
