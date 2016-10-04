/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compgraficacompleto;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author carloscasca
 */
public class passaAlto {

//    
//    1 2 1
//    0 0 0
//    -1 -2 -3
    public BufferedImage doPassaAlta(BufferedImage img, int largNova, int altNova) {

        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());
        int red, blue, green;
        for (int y = 1; y < img.getHeight() - 1; y++) {
            for (int x = 1; x < img.getWidth() - 1; x++) {
                //Math.abs(catetoOposto) ; 
                Color cor1 = new Color(img.getRGB(x - 1, y + 1));
                Color cor2 = new Color(img.getRGB(x, y + 1));
                Color cor3 = new Color(img.getRGB(x + 1, y + 1));
                Color cor4 = new Color(img.getRGB(x - 1, y));
                Color cor5 = new Color(img.getRGB(x, y));
                Color cor6 = new Color(img.getRGB(x + 1, y));
                Color cor7 = new Color(img.getRGB(x - 1, y - 1));
                Color cor8 = new Color(img.getRGB(x, y - 1));
                Color cor9 = new Color(img.getRGB(x + 1, y - 1));

                //    1 0 -1
                //    2 0 -2 
                //    1 0 -1 
                blue = Math.abs(cor1.getBlue() * 1 + cor2.getBlue() * 0 + cor3.getBlue() * -1 + cor4.getBlue() * 2
                        + cor5.getBlue() * 0 + cor6.getBlue() * -2 + cor7.getBlue() * 1 + cor8.getBlue() * 0
                        + cor9.getBlue() * 0 * -1);

                red = Math.abs((cor1.getRed() * 1 + cor2.getRed()*0 + cor3.getRed()*-1 + cor4.getRed()*2 + cor5.getRed()*0
                        + cor6.getRed()*-2 + cor7.getRed()*1 + cor8.getRed()*0 + cor9.getRed()*-1));

                green = Math.abs((cor1.getGreen() * 1 + cor2.getGreen()*0 + cor3.getGreen()*-1 + cor4.getGreen()*2
                        + cor5.getGreen()*0 + cor6.getGreen()*-2  + cor7.getGreen()*1 + cor8.getGreen()*0 + cor9.getGreen()*-1));

                if (red > 254) {
                    red = 254;
                }
                if (blue > 254) {
                    blue = 254;
                }
                if (green > 254) {
                    green = 254;
                }
                cor9 = new Color(red, green, blue);
                aux.setRGB(x, y, cor9.getRGB());
            }
        }
        return aux;

    }
    
        public BufferedImage doPassaAltaAula(BufferedImage img, int largNova, int altNova) {

        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());
        int red, blue, green;
        for (int y = 1; y < img.getHeight() - 1; y++) {
            for (int x = 1; x < img.getWidth() - 1; x++) {
                //Math.abs(catetoOposto) ; 
                Color cor1 = new Color(img.getRGB(x - 1, y + 1));
                Color cor2 = new Color(img.getRGB(x, y + 1));
                Color cor3 = new Color(img.getRGB(x + 1, y + 1));
                Color cor4 = new Color(img.getRGB(x - 1, y));
                Color cor5 = new Color(img.getRGB(x, y));
                Color cor6 = new Color(img.getRGB(x + 1, y));
                Color cor7 = new Color(img.getRGB(x - 1, y - 1));
                Color cor8 = new Color(img.getRGB(x, y - 1));
                Color cor9 = new Color(img.getRGB(x + 1, y - 1));

                //    1 0 -1
                //    2 0 -2 
                //    1 0 -1 
                blue = Math.abs(cor1.getBlue() * 9 - cor2.getBlue() - cor3.getBlue() - cor4.getBlue() -
                        cor5.getBlue()- cor6.getBlue() - cor7.getBlue() - cor8.getBlue() -cor9.getBlue() * 0 * -1)/9;

                red = Math.abs((cor1.getRed() * 9 - cor2.getRed()- cor3.getRed()- cor4.getRed()-cor5.getRed()-
                         cor6.getRed()- cor7.getRed()- cor8.getRed()- cor9.getRed())/9);

                green = Math.abs((cor1.getGreen() * 9 - cor2.getGreen()- cor3.getGreen()- cor4.getGreen()-
                        cor5.getGreen()- cor6.getGreen()- cor7.getGreen()- cor8.getGreen()- cor9.getGreen())/9);

                if (red > 254) {
                    red = 254;
                }
                if (blue > 254) {
                    blue = 254;
                }
                if (green > 254) {
                    green = 254;
                }
                cor9 = new Color(red, green, blue);
                aux.setRGB(x, y, cor9.getRGB());
            }
        }
        return aux;

    }
}
