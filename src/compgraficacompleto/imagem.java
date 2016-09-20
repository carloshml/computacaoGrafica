/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compgraficacompleto;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * Universidade Federal do Tocantins Computação Gráfica Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class imagem {

    public BufferedImage doPretoBranco(BufferedImage img) {

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {

                Color minhacor = new Color(img.getRGB(x, y));
                Color Branco = new Color(255, 255, 255);
                Color Preto = new Color(0, 0, 0);
                // System.err.println( minhacor.getBlue()+ "  "+  minhacor.getRed()+ "  "+ minhacor.getGreen()+ "   " );
                if ((minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen()) / 3 < 124) {
                    img.setRGB(x, y, Preto.getRGB());
                } else {
                    img.setRGB(x, y, Branco.getRGB());
                }
            }
        }

        return img;

    }

    public BufferedImage doMenosCor(BufferedImage img, int cores) {
        int[] vetCor = new int[17];
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        // atribui os indices    
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                numbers.put(img.getRGB(x, y), 1);
            }
        }
        // com os indices atribuidos contar as cores     
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                numbers.put(img.getRGB(x, y), numbers.get(img.getRGB(x, y)) + 1);
            }
        }
        for (Integer key : numbers.keySet()) {
            if (numbers.get(key) > vetCor[1]) {
                vetCor[16] = vetCor[15];
                vetCor[15] = vetCor[14];
                vetCor[14] = vetCor[13];
                vetCor[13] = vetCor[12];
                vetCor[12] = vetCor[11];
                vetCor[11] = vetCor[10];
                vetCor[10] = vetCor[9];
                vetCor[9] = vetCor[8];
                vetCor[8] = vetCor[7];
                vetCor[7] = vetCor[6];
                vetCor[6] = vetCor[5];
                vetCor[5] = vetCor[4];
                vetCor[4] = vetCor[3];
                vetCor[3] = vetCor[2];
                vetCor[2] = vetCor[1];
                vetCor[1] = key;
            }
        }

        //inicializa as cores que serão usadas 
        Color minhacor = new Color(vetCor[1]);
        Color minhacor1 = new Color(vetCor[2]);
        Color minhacor2 = new Color(vetCor[3]);
        Color minhacor3 = new Color(vetCor[4]);
        Color minhacor4 = new Color(vetCor[5]);
        Color minhacor5 = new Color(vetCor[6]);
        Color minhacor6 = new Color(vetCor[7]);
        Color minhacor7 = new Color(vetCor[8]);
        Color minhacor8 = new Color(vetCor[9]);
        Color minhacor9 = new Color(vetCor[10]);
        Color minhacor10 = new Color(vetCor[11]);
        Color minhacor11 = new Color(vetCor[12]);
        Color minhacor12 = new Color(vetCor[13]);
        Color minhacor13 = new Color(vetCor[14]);
        Color minhacor14 = new Color(vetCor[15]);
        Color minhacor15 = new Color(vetCor[16]);
        switch (cores) {
            case 0:

                // achar as 4 maiores cores 
//                Map<Integer, Integer> coresOrdenadas = new TreeMap<>(numbers);
//                ArrayList<Integer> cores16 = new ArrayList<>(coresOrdenadas.keySet());
//                System.out.println("" + cores16.get(0) + "   " + cores16.get(1) + "   " + cores16.get(2) + "   " + cores16.get(3) + "   ");
// atribuir as coler para poder fazer a distancia euclidiana. 
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        Color corComparacao = new Color(img.getRGB(x, y));
                        int distanCor1 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor.getGreen(), 2));
                        int distanCor2 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor1.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor1.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor1.getGreen(), 2));
                        int distanCor3 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor2.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor2.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor2.getGreen(), 2));
                        int distanCor4 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor3.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor3.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor3.getGreen(), 2));
//                        System.out.println("" + distanCor1 + "   " + distanCor2 + "   " + distanCor3 + "   " + distanCor4 + "   ");            
                        if ((distanCor4 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor3 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor1)) {
                            img.setRGB(x, y, minhacor2.getRGB());
                        } else if ((distanCor2 < distanCor1) && (distanCor2 < distanCor3) && (distanCor2 < distanCor4)) {
                            img.setRGB(x, y, minhacor1.getRGB());
                        } else if ((distanCor1 < distanCor2) && (distanCor1 < distanCor2) && (distanCor1 < distanCor4)) {
                            img.setRGB(x, y, minhacor.getRGB());
                        }
                    }
                }

                break;

            case 1:

                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        Color corComparacao = new Color(img.getRGB(x, y));
                        int distanCor1 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor.getGreen(), 2));
                        int distanCor2 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor1.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor1.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor1.getGreen(), 2));
                        int distanCor3 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor2.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor2.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor2.getGreen(), 2));
                        int distanCor4 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor3.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor3.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor3.getGreen(), 2));
                        int distanCor5 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor4.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor4.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor4.getGreen(), 2));
                        int distanCor6 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor5.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor5.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor5.getGreen(), 2));
                        int distanCor7 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor6.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor6.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor6.getGreen(), 2));
                        int distanCor8 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor7.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor7.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor7.getGreen(), 2));

//                        System.out.println("" + distanCor1 + "   " + distanCor2 + "   " + distanCor3 + "   " + distanCor4 + "   ");            
                        if ((distanCor4 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)
                                && (distanCor4 < distanCor5) && (distanCor4 < distanCor6) && (distanCor4 < distanCor7)
                                && (distanCor4 < distanCor8)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor3 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor3 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor3 < distanCor8)) {
                            img.setRGB(x, y, minhacor2.getRGB());
                        } else if ((distanCor2 < distanCor1) && (distanCor2 < distanCor4) && (distanCor2 < distanCor3)
                                && (distanCor2 < distanCor5) && (distanCor2 < distanCor6) && (distanCor2 < distanCor7)
                                && (distanCor2 < distanCor8)) {
                            img.setRGB(x, y, minhacor1.getRGB());
                        } else if ((distanCor1 < distanCor4) && (distanCor1 < distanCor2) && (distanCor1 < distanCor3)
                                && (distanCor1 < distanCor5) && (distanCor1 < distanCor6) && (distanCor1 < distanCor7)
                                && (distanCor1 < distanCor8)) {
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if ((distanCor5 < distanCor1) && (distanCor5 < distanCor2) && (distanCor5 < distanCor3)
                                && (distanCor5 < distanCor4) && (distanCor5 < distanCor6) && (distanCor5 < distanCor7)
                                && (distanCor5 < distanCor8)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor6 < distanCor1) && (distanCor6 < distanCor2) && (distanCor6 < distanCor3)
                                && (distanCor6 < distanCor4) && (distanCor6 < distanCor5) && (distanCor6 < distanCor7)
                                && (distanCor6 < distanCor8)) {
                            img.setRGB(x, y, minhacor2.getRGB());
                        } else if ((distanCor7 < distanCor1) && (distanCor7 < distanCor2) && (distanCor7 < distanCor3)
                                && (distanCor7 < distanCor4) && (distanCor7 < distanCor5) && (distanCor7 < distanCor6)
                                && (distanCor7 < distanCor8)) {
                            img.setRGB(x, y, minhacor1.getRGB());
                        } else if ((distanCor8 < distanCor1) && (distanCor8 < distanCor2) && (distanCor8 < distanCor3)
                                && (distanCor8 < distanCor5) && (distanCor8 < distanCor6) && (distanCor8 < distanCor7)
                                && (distanCor8 < distanCor4)) {
                            img.setRGB(x, y, minhacor.getRGB());
                        }
                    }
                }
                break;
            case 2:
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        Color corComparacao = new Color(img.getRGB(x, y));
                        int distanCor1 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor.getGreen(), 2));
                        int distanCor2 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor1.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor1.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor1.getGreen(), 2));
                        int distanCor3 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor2.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor2.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor2.getGreen(), 2));
                        int distanCor4 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor3.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor3.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor3.getGreen(), 2));
                        int distanCor5 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor4.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor4.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor4.getGreen(), 2));
                        int distanCor6 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor5.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor5.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor5.getGreen(), 2));
                        int distanCor7 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor6.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor6.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor6.getGreen(), 2));
                        int distanCor8 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor7.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor7.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor7.getGreen(), 2));
                        int distanCor9 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor8.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor8.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor8.getGreen(), 2));
                        int distanCor10 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor9.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor8.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor9.getGreen(), 2));
                        int distanCor11 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor10.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor10.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor10.getGreen(), 2));
                        int distanCor12 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor11.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor11.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor11.getGreen(), 2));
                        int distanCor13 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor12.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor12.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor12.getGreen(), 2));
                        int distanCor14 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor13.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor13.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor13.getGreen(), 2));
                        int distanCor15 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor14.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor14.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor14.getGreen(), 2));
                        int distanCor16 = (int) Math.sqrt(Math.pow(corComparacao.getBlue() - minhacor15.getBlue(), 2) + Math.pow(corComparacao.getRed() - minhacor15.getRed(), 2) + Math.pow(corComparacao.getGreen() - minhacor15.getGreen(), 2));

//                        System.out.println("" + distanCor1 + "   " + distanCor2 + "   " + distanCor3 + "   " + distanCor4 + "   ");            
                        if ((distanCor4 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)
                                && (distanCor4 < distanCor5) && (distanCor4 < distanCor6) && (distanCor4 < distanCor7)
                                && (distanCor4 < distanCor8) && (distanCor4 < distanCor9) && (distanCor4 < distanCor10)
                                && (distanCor4 < distanCor11) && (distanCor4 < distanCor12) && (distanCor4 < distanCor13)
                                && (distanCor4 < distanCor14) && (distanCor4 < distanCor15) && (distanCor4 < distanCor16)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor3 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor3 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor3 < distanCor8) && (distanCor3 < distanCor9) && (distanCor3 < distanCor10)
                                && (distanCor3 < distanCor11) && (distanCor3 < distanCor12) && (distanCor3 < distanCor13)
                                && (distanCor3 < distanCor14) && (distanCor3 < distanCor15) && (distanCor3 < distanCor16)) {
                            img.setRGB(x, y, minhacor2.getRGB());
                        } else if ((distanCor2 < distanCor1) && (distanCor2 < distanCor4) && (distanCor2 < distanCor3)
                                && (distanCor2 < distanCor5) && (distanCor2 < distanCor6) && (distanCor2 < distanCor7)
                                && (distanCor2 < distanCor8) && (distanCor2 < distanCor9) && (distanCor2 < distanCor10)
                                && (distanCor2 < distanCor11) && (distanCor2 < distanCor12) && (distanCor2 < distanCor13)
                                && (distanCor2 < distanCor14) && (distanCor2 < distanCor15) && (distanCor2 < distanCor16)) {
                            img.setRGB(x, y, minhacor1.getRGB());
                        } else if ((distanCor1 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor1 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor1 < distanCor8) && (distanCor3 < distanCor9) && (distanCor3 < distanCor10)
                                && (distanCor1 < distanCor11) && (distanCor3 < distanCor12) && (distanCor3 < distanCor13)
                                && (distanCor1 < distanCor14) && (distanCor3 < distanCor15) && (distanCor3 < distanCor16)) {
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if ((distanCor5 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)
                                && (distanCor5 < distanCor5) && (distanCor4 < distanCor6) && (distanCor4 < distanCor7)
                                && (distanCor5 < distanCor8) && (distanCor4 < distanCor9) && (distanCor4 < distanCor10)
                                && (distanCor5 < distanCor11) && (distanCor4 < distanCor12) && (distanCor4 < distanCor13)
                                && (distanCor5 < distanCor14) && (distanCor4 < distanCor15) && (distanCor4 < distanCor16)) {
                            img.setRGB(x, y, minhacor4.getRGB());
                        } else if ((distanCor6 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor6 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor6 < distanCor8) && (distanCor3 < distanCor9) && (distanCor3 < distanCor10)
                                && (distanCor6 < distanCor11) && (distanCor3 < distanCor12) && (distanCor3 < distanCor13)
                                && (distanCor6 < distanCor14) && (distanCor3 < distanCor15) && (distanCor3 < distanCor16)) {
                            img.setRGB(x, y, minhacor5.getRGB());
                        } else if ((distanCor7 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)
                                && (distanCor7 < distanCor5) && (distanCor4 < distanCor6) && (distanCor4 < distanCor7)
                                && (distanCor7 < distanCor8) && (distanCor4 < distanCor9) && (distanCor4 < distanCor10)
                                && (distanCor7 < distanCor11) && (distanCor4 < distanCor12) && (distanCor4 < distanCor13)
                                && (distanCor7 < distanCor14) && (distanCor4 < distanCor15) && (distanCor4 < distanCor16)) {
                            img.setRGB(x, y, minhacor6.getRGB());
                        } else if ((distanCor8 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor8 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor8 < distanCor8) && (distanCor3 < distanCor9) && (distanCor3 < distanCor10)
                                && (distanCor8 < distanCor11) && (distanCor3 < distanCor12) && (distanCor3 < distanCor13)
                                && (distanCor8 < distanCor14) && (distanCor3 < distanCor15) && (distanCor3 < distanCor16)) {
                            img.setRGB(x, y, minhacor7.getRGB());
                        } else if ((distanCor9 < distanCor1) && (distanCor4 < distanCor2) && (distanCor4 < distanCor3)
                                && (distanCor9 < distanCor5) && (distanCor4 < distanCor6) && (distanCor4 < distanCor7)
                                && (distanCor9 < distanCor8) && (distanCor4 < distanCor9) && (distanCor4 < distanCor10)
                                && (distanCor9 < distanCor11) && (distanCor4 < distanCor12) && (distanCor4 < distanCor13)
                                && (distanCor9 < distanCor14) && (distanCor4 < distanCor15) && (distanCor4 < distanCor16)) {
                            img.setRGB(x, y, minhacor8.getRGB());
                        } else if ((distanCor10 < distanCor1) && (distanCor3 < distanCor2) && (distanCor3 < distanCor4)
                                && (distanCor10 < distanCor5) && (distanCor3 < distanCor6) && (distanCor3 < distanCor7)
                                && (distanCor10 < distanCor8) && (distanCor3 < distanCor9) && (distanCor3 < distanCor10)
                                && (distanCor10 < distanCor11) && (distanCor3 < distanCor12) && (distanCor3 < distanCor13)
                                && (distanCor10 < distanCor14) && (distanCor3 < distanCor15) && (distanCor3 < distanCor16)) {
                            img.setRGB(x, y, minhacor9.getRGB());
                        } else if ((distanCor11 < distanCor1) && (distanCor11 < distanCor2) && (distanCor11 < distanCor3)
                                && (distanCor11 < distanCor5) && (distanCor11 < distanCor6) && (distanCor11 < distanCor7)
                                && (distanCor11 < distanCor8) && (distanCor11 < distanCor9) && (distanCor11 < distanCor10)
                                && (distanCor11 < distanCor4) && (distanCor11 < distanCor12) && (distanCor11 < distanCor13)
                                && (distanCor11 < distanCor14) && (distanCor11 < distanCor15) && (distanCor11 < distanCor16)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor12 < distanCor1) && (distanCor12 < distanCor2) && (distanCor12 < distanCor3)
                                && (distanCor12 < distanCor5) && (distanCor12 < distanCor6) && (distanCor12 < distanCor7)
                                && (distanCor12 < distanCor8) && (distanCor12 < distanCor9) && (distanCor12 < distanCor10)
                                && (distanCor12 < distanCor11) && (distanCor12 < distanCor4) && (distanCor12 < distanCor13)
                                && (distanCor12 < distanCor14) && (distanCor12 < distanCor15) && (distanCor12 < distanCor16)) {
                            img.setRGB(x, y, minhacor11.getRGB());
                        } else if ((distanCor13 < distanCor1) && (distanCor13 < distanCor2) && (distanCor13 < distanCor3)
                                && (distanCor13 < distanCor5) && (distanCor13 < distanCor6) && (distanCor13 < distanCor7)
                                && (distanCor13 < distanCor8) && (distanCor13 < distanCor9) && (distanCor13 < distanCor10)
                                && (distanCor13 < distanCor11) && (distanCor13 < distanCor12) && (distanCor13 < distanCor4)
                                && (distanCor13 < distanCor14) && (distanCor13 < distanCor15) && (distanCor13 < distanCor16)) {
                            img.setRGB(x, y, minhacor12.getRGB());
                        } else if ((distanCor14 < distanCor1) && (distanCor14 < distanCor2) && (distanCor14 < distanCor3)
                                && (distanCor14 < distanCor5) && (distanCor14 < distanCor6) && (distanCor14 < distanCor7)
                                && (distanCor14 < distanCor8) && (distanCor14 < distanCor9) && (distanCor14 < distanCor10)
                                && (distanCor14 < distanCor11) && (distanCor14 < distanCor12) && (distanCor14 < distanCor13)
                                && (distanCor14 < distanCor4) && (distanCor14 < distanCor15) && (distanCor14 < distanCor16)) {
                            img.setRGB(x, y, minhacor13.getRGB());
                        } else if ((distanCor15 < distanCor1) && (distanCor15 < distanCor2) && (distanCor15 < distanCor3)
                                && (distanCor15 < distanCor5) && (distanCor15 < distanCor6) && (distanCor15 < distanCor7)
                                && (distanCor15 < distanCor8) && (distanCor15 < distanCor9) && (distanCor15 < distanCor10)
                                && (distanCor15 < distanCor11) && (distanCor15 < distanCor12) && (distanCor15 < distanCor13)
                                && (distanCor15 < distanCor14) && (distanCor15 < distanCor4) && (distanCor15 < distanCor16)) {
                            img.setRGB(x, y, minhacor3.getRGB());
                        } else if ((distanCor16 < distanCor1) && (distanCor16 < distanCor2) && (distanCor16 < distanCor3)
                                && (distanCor16 < distanCor5) && (distanCor16 < distanCor6) && (distanCor16 < distanCor7)
                                && (distanCor16 < distanCor8) && (distanCor16 < distanCor9) && (distanCor16 < distanCor10)
                                && (distanCor16 < distanCor11) && (distanCor16 < distanCor12) && (distanCor16 < distanCor13)
                                && (distanCor16 < distanCor14) && (distanCor16 < distanCor15) && (distanCor16 < distanCor16)) {
                            img.setRGB(x, y, minhacor15.getRGB());
                        }
                    }
                }
                break;
            default:
                break;

        }

        return img;

    }

    public BufferedImage doTonCinza(BufferedImage img) {

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {

                Color minhacor = new Color(img.getRGB(x, y));
                int numCinza = (minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen()) / 3;
                Color cinza = new Color(numCinza, numCinza, numCinza);
                img.setRGB(x, y, cinza.getRGB());
            }
        }
        return img;

    }

    public BufferedImage doColorizar(BufferedImage img, int cores) {
        int[] vetCor = new int[15];
        Color minhacor;
        switch (cores) {
            case 0:
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {

                        minhacor = new Color(img.getRGB(x, y));
                        int tonCor = (minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen()) / 3;

                        // System.err.println( minhacor.getBlue()+ "  "+  minhacor.getRed()+ "  "+ minhacor.getGreen()+ "   " );
                        if (tonCor < 64) {
                            minhacor = new Color(0, 0, 253);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if (tonCor < 128) {
                            minhacor = new Color(25, 90, 254);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 184) {
                            minhacor = new Color(30, 150, 2);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else {
                            minhacor = new Color(248, 216, 0);
                            img.setRGB(x, y, minhacor.getRGB());

                        }
                    }
                }

                break;

            case 1:
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {

                        minhacor = new Color(img.getRGB(x, y));
                        int tonCor = (minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen()) / 3;

                        // System.err.println( minhacor.getBlue()+ "  "+  minhacor.getRed()+ "  "+ minhacor.getGreen()+ "   " );
                        if (tonCor < 32) {
                            minhacor = new Color(0, 0, 253);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if (tonCor < 64) {
                            minhacor = new Color(25, 90, 254);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 96) {
                            minhacor = new Color(30, 150, 2);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 128) {
                            minhacor = new Color(248, 216, 0);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 160) {
                            minhacor = new Color(25, 90, 1);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 192) {
                            minhacor = new Color(25, 247, 54);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 224) {
                            minhacor = new Color(241, 40, 0);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else {

                            minhacor = new Color(231, 17, 158);
                            img.setRGB(x, y, minhacor.getRGB());
                        }
                    }
                }
                break;
            case 2:
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {

                        minhacor = new Color(img.getRGB(x, y));
                        int tonCor = (minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen()) / 3;

                        // System.err.println( minhacor.getBlue()+ "  "+  minhacor.getRed()+ "  "+ minhacor.getGreen()+ "   " );
                        if (tonCor < 16) {
                            minhacor = new Color(0, 0, 253);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if (tonCor < 32) {
                            minhacor = new Color(0, 90, 254);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 48) {
                            minhacor = new Color(25, 0, 254);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 64) {
                            minhacor = new Color(25, 90, 0);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 80) {
                            minhacor = new Color(25, 90, 15);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 96) {
                            minhacor = new Color(25, 190, 54);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 112) {
                            minhacor = new Color(90, 159, 12);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if (tonCor < 128) {
                            minhacor = new Color(8, 78, 253);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else if (tonCor < 144) {
                            minhacor = new Color(215, 90, 44);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 160) {
                            minhacor = new Color(250, 190, 54);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 192) {
                            minhacor = new Color(250, 160, 4);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 208) {
                            minhacor = new Color(5, 90, 4);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 224) {
                            minhacor = new Color(5, 10, 54);
                            img.setRGB(x, y, minhacor.getRGB());

                        } else if (tonCor < 240) {
                            minhacor = new Color(111, 150, 211);
                            img.setRGB(x, y, minhacor.getRGB());
                        } else {

                            minhacor = new Color(200, 208, 0);
                            img.setRGB(x, y, minhacor.getRGB());
                        }
                    }
                }
                break;
            default:
                break;

        }

        return img;

    }

    public BufferedImage doTonsCinza(BufferedImage img, int valor) {

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                Color minhacor = new Color(img.getRGB(x, y));
                int numCinza = (minhacor.getBlue() + minhacor.getRed() + minhacor.getGreen() + valor) / 4;

                Color cinza = new Color(numCinza, numCinza, numCinza);
                img.setRGB(x, y, cinza.getRGB());
            }
        }
        return img;

    }

    public BufferedImage doRodar(BufferedImage bufferedImage, double angulo) {

        BufferedImage bufferedImageBKP = bufferedImage;

        double radiano = Math.toRadians(angulo);
        double cosseno = Math.cos(radiano);
        double seno = Math.sin(radiano);

        double ponto0x = 0;
        double ponto0y = 0;
        double ponto1x = (-bufferedImageBKP.getHeight() * seno);
        double ponto1y = (bufferedImageBKP.getHeight() * cosseno);
        double ponto2x = (bufferedImageBKP.getWidth() * cosseno - bufferedImageBKP.getHeight() * seno);
        double ponto2y = (bufferedImageBKP.getHeight() * cosseno + bufferedImageBKP.getWidth() * seno);
        double ponto3x = (bufferedImageBKP.getWidth() * cosseno);
        double ponto3y = (bufferedImageBKP.getWidth() * seno);

        double minX = Math.min(ponto0x, Math.min(ponto1x, Math.min(ponto2x, ponto3x)));
        double minY = Math.min(ponto0y, Math.min(ponto1y, Math.min(ponto2y, ponto3y)));
        double maxX = Math.max(ponto0x, Math.max(ponto1x, Math.max(ponto2x, ponto3x)));
        double maxY = Math.max(ponto0y, Math.max(ponto1y, Math.max(ponto2y, ponto3y)));

        int bufferedImageWidth = (int) (maxX - minX);
        int bufferedImageHeight = (int) (maxY - minY);
        bufferedImage = new BufferedImage((int) (maxX - minX), (int) (maxY - minY), bufferedImageBKP.getType());

        for (int y = 0; y < bufferedImageHeight; y++) {
            for (int x = 0; x < bufferedImageWidth; x++) {
                int xAnt = (int) ((x + minX) * cosseno + (y + minY) * seno);
                int yAnt = (int) ((y + minY) * cosseno - (x + minX) * seno);
                if (xAnt >= 0 && xAnt < bufferedImageBKP.getWidth() && yAnt >= 0 && yAnt < bufferedImageBKP.getHeight()) {
                    bufferedImage.setRGB(x, y, bufferedImageBKP.getRGB(xAnt, yAnt));
                }
            }
        }
        return bufferedImage;

    }

    public BufferedImage doReflexao(BufferedImage img, int posicao) {

        BufferedImage aux = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());

        if (posicao == 0) {
            int ultimo = img.getWidth() - 1;

            for (int x = 0; x < img.getWidth(); x++) {
                for (int y = 0; y < img.getHeight(); y++) {
                    aux.setRGB(x, y, img.getRGB(ultimo - x, y));
                }
            }

        } else {
            int ultimo = img.getHeight() - 1;

            for (int x = 0; x < img.getWidth(); x++) {
                for (int y = 0; y < img.getHeight(); y++) {
                    aux.setRGB(x, y, img.getRGB(x, ultimo - y));
                }
            }

        }

        return aux;

    }

    public BufferedImage doTransladar(BufferedImage img, int largNova, int altNova, int Mudax, int Muday) {

        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                aux.setRGB(x + Mudax, y + Muday, img.getRGB(x, y));
            }
        }
        return aux;

    }

    public BufferedImage doEscala(BufferedImage bufferedImage, int largNova, int altNova) {
        BufferedImage bufferedImageBKP = bufferedImage;
        int largAnt = bufferedImageBKP.getWidth();
        int altAnt = bufferedImageBKP.getHeight();

        bufferedImage = new BufferedImage(largNova, altNova, bufferedImageBKP.getType());
        // criação do fator escalar em X 
        double fatorEscalarX = (double) (largAnt) / (double) (largNova);
        // criação do fator escalar em Y 
        double fatorEscalarY = (double) (altAnt) / (double) (altNova);
        double px, py;
        for (int y = 0; y < altNova; y++) {
            for (int x = 0; x < largNova; x++) {
                px = Math.floor(x * fatorEscalarX);
                py = Math.floor(y * fatorEscalarY);
                bufferedImage.setRGB(x, y, bufferedImageBKP.getRGB((int) px, (int) py));
            }
        }
        return bufferedImage;

    }

    public BufferedImage doCisalhamento(BufferedImage img, int largNova, int altNova, int Mudax, int Muday) {

        BufferedImage aux = new BufferedImage(largNova, altNova, img.getType());

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                aux.setRGB(x + (Mudax*y), y+ (Muday*x), img.getRGB(x, y));
            }
        }
        return aux;

    }
}
