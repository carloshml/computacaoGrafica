package compgraficacompleto;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class passaAlto {

    public BufferedImage doPassaAlta(BufferedImage img, int largNova, int altNova) {

        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());
        BufferedImage auxfinal = new BufferedImage(largNova, altNova, img.getType());
        int red = 0, blue = 0, green = 0;
        int[] valor = new int[9];
        //    1 0 -1
        //    2 0 -2 
        //    1 0 -1 
        valor[0] = 1;
        valor[1] = 0;
        valor[2] = -1;
        valor[3] = 2;
        valor[4] = 0;
        valor[5] = -2;
        valor[6] = 1;
        valor[7] = 0;
        valor[8] = -1;
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
                blue = Math.abs(cor1.getBlue() * valor[0] + cor2.getBlue() * valor[1]
                        + cor3.getBlue() * valor[2] + cor4.getBlue() * valor[3]
                        + cor5.getBlue() * valor[4] + cor6.getBlue() * valor[5] + cor7.getBlue() * valor[6] + cor8.getBlue() * valor[7]
                        + cor9.getBlue() * valor[8]);

                red = Math.abs((cor1.getRed() * valor[0] + cor2.getRed() * valor[1] + cor3.getRed() * valor[2] + cor4.getRed() * valor[3] + cor5.getRed() * valor[4]
                        + cor6.getRed() * valor[5] + cor7.getRed() * valor[6] + cor8.getRed() * valor[7] + cor9.getRed() * valor[8]));

                green = Math.abs((cor1.getGreen() * valor[0] + cor2.getGreen() * valor[1] + cor3.getGreen() * valor[2] + cor4.getGreen() * valor[3]
                        + cor5.getGreen() * valor[4] + cor6.getGreen() * valor[5] + cor7.getGreen() * valor[6]
                        + cor8.getGreen() * valor[7] + cor9.getGreen() * valor[8]));
                //System.out.println(blue+" "+red+" "+green  );
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
        //    1 2 1
        //    0 0 0
        //    -1 -2 -1
        valor[0] = 1;
        valor[1] = 2;
        valor[2] = 1;
        valor[3] = 0;
        valor[4] = 0;
        valor[5] = 0;
        valor[6] = -1;
        valor[7] = -2;
        valor[8] = -1;
        for (int y = 1; y < img.getHeight() - 1; y++) {
            for (int x = 1; x < img.getWidth() - 1; x++) {
                Color cor1 = new Color(img.getRGB(x - 1, y + 1));
                Color cor2 = new Color(img.getRGB(x, y + 1));
                Color cor3 = new Color(img.getRGB(x + 1, y + 1));
                Color cor4 = new Color(img.getRGB(x - 1, y));
                Color cor5 = new Color(img.getRGB(x, y));
                Color cor6 = new Color(img.getRGB(x + 1, y));
                Color cor7 = new Color(img.getRGB(x - 1, y - 1));
                Color cor8 = new Color(img.getRGB(x, y - 1));
                Color cor9 = new Color(img.getRGB(x + 1, y - 1));
                blue = Math.abs(cor1.getBlue() * valor[0] + cor2.getBlue() * valor[1]
                        + cor3.getBlue() * valor[2] + cor4.getBlue() * valor[3]
                        + cor5.getBlue() * valor[4] + cor6.getBlue() * valor[5] + cor7.getBlue() * valor[6] + cor8.getBlue() * valor[7]
                        + cor9.getBlue() * valor[8]);

                red = Math.abs((cor1.getRed() * valor[0] + cor2.getRed() * valor[1] + cor3.getRed() * valor[2] + cor4.getRed() * valor[3] + cor5.getRed() * valor[4]
                        + cor6.getRed() * valor[5] + cor7.getRed() * valor[6] + cor8.getRed() * valor[7] + cor9.getRed() * valor[8]));

                green = Math.abs((cor1.getGreen() * valor[0] + cor2.getGreen() * valor[1] + cor3.getGreen() * valor[2] + cor4.getGreen() * valor[3]
                        + cor5.getGreen() * valor[4] + cor6.getGreen() * valor[5] + cor7.getGreen() * valor[6]
                        + cor8.getGreen() * valor[7] + cor9.getGreen() * valor[8]));
                if (red > 254) {
                    red = 254;
                }
                if (blue > 254) {
                    blue = 254;
                }
                if (green > 254) {
                    green = 254;
                }
                if (red + green + blue != 0) {
                    cor9 = new Color(red, green, blue);
                    aux.setRGB(x, y, cor9.getRGB());
                }
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

                blue = Math.abs(cor5.getBlue() * 9 - cor2.getBlue() - cor3.getBlue() - cor4.getBlue()
                        - cor1.getBlue() - cor6.getBlue() - cor7.getBlue() - cor8.getBlue() - cor9.getBlue()) / 9;

                red = Math.abs((cor5.getRed() * 9 - cor2.getRed() - cor3.getRed() - cor4.getRed() - cor1.getRed()
                        - cor6.getRed() - cor7.getRed() - cor8.getRed() - cor9.getRed()) / 9);

                green = Math.abs((cor5.getGreen() * 9 - cor2.getGreen() - cor3.getGreen() - cor4.getGreen()
                        - cor1.getGreen() - cor6.getGreen() - cor7.getGreen() - cor8.getGreen() - cor9.getGreen()) / 9);

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
        
                for (int y = 0; y < img.getHeight() ; y++) {
            for (int x = 0; x < img.getWidth() ; x++) {
                Color cor1 = new Color(img.getRGB(x , y ));                
                cor1 = new Color(255-cor1.getRed(),255-cor1.getGreen(), 255-cor1.getBlue());   
                aux.setRGB(x, y, cor1.getRGB());
            }
        }
        return aux;

    }
}
