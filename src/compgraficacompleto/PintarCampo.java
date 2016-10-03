package compgraficacompleto;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica 
 * Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class PintarCampo {

    private static BufferedImage bufferedImage;
    private static Point pontoInicial;
    private static Color corAtual;
    private static Color corNova;

    public PintarCampo () {
    }

    public static BufferedImage pinta(BufferedImage bufferedImageP, Point pontoInicialP, Color corNovaP) {
        bufferedImage = bufferedImageP;
        pontoInicial = pontoInicialP;
        corNova = corNovaP;
        corAtual = new Color(bufferedImage.getRGB(pontoInicial.x, pontoInicial.x));
        floodFill(pontoInicial);
        return bufferedImage;
    }

    private static void floodFill(Point ponto) {
        if (ponto.x >= 0 && ponto.x < bufferedImage.getWidth() && ponto.y >= 0 && ponto.y < bufferedImage.getHeight()) {
            if (bufferedImage.getRGB(ponto.x, ponto.y) == corAtual.getRGB()) {
                
                bufferedImage.setRGB(ponto.x, ponto.y, corNova.getRGB());                
                ponto = new Point(ponto.x - 1, ponto.y);
                floodFill(ponto);
                ponto = new Point(ponto.x + 2, ponto.y);
                floodFill(ponto);
                ponto = new Point(ponto.x - 1, ponto.y - 1);
                floodFill(ponto);
                ponto = new Point(ponto.x, ponto.y + 2);
                floodFill(ponto);
            }
        }
    }

}
