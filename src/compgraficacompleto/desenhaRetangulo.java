package compgraficacompleto;

import java.awt.image.BufferedImage;

/**
 * Universidade Federal do Tocantins Computação Gráfica 
 * Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class desenhaRetangulo {
    
    BufferedImage img1 = new BufferedImage(600,600, BufferedImage.TYPE_INT_RGB);
    public static int x1,y1,x2,y2;
    public BufferedImage drawing (int xx, int yy,int xxx, int yyy){
    x1 = xx;
    y1 = yy;
    x2=xxx;
    y2=yyy;

    // Color randomColor = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
    // g.setColor(randomColor);    
    int catetoAdjacente = x2 - x1 ;
    int catetoOposto = y2 - y1 ;
    int dx1 = 0, dy1 = 0, dx2 = 0, dy2 = 0 ;
    //setando os angulos da reta seguindo a equação  {y = mx + b}
    // ponto cima da linha
    //Para simplificar a posição do ponto em função da proxima posição relativa da reta em relação ao ponto médio. 
    if (catetoAdjacente<0) dx1 = -1 ; else if (catetoAdjacente>0) dx1 = 1 ; 
    if (catetoOposto<0) dy1 = -1 ; else if (catetoOposto>0) dy1 = 1 ;
    if (catetoAdjacente<0) dx2 = -1 ; else if (catetoAdjacente>0) dx2 = 1 ;
    //3. Coloca-se nas variáveis de trabalho o ponto inicial:
    int maior = Math.abs(catetoAdjacente) ;
    int menor = Math.abs(catetoOposto) ;
    //Invertendo as coordenadas de X e Y, pois o coeficiente angular >=1
    if (!(maior>menor)) {
        //math nesse caso é usado por precisamos desse valor em módulo
        maior = Math.abs(catetoOposto) ;
        menor = Math.abs(catetoAdjacente) ;
        //desenhando apenas um ponto
        if (catetoOposto<0) 
            dy2 = -1 ; 
        else if (catetoOposto>0) 
            dy2 = 1 ;
        dx2 = 0 ;            
    }
    //4. Plota-se o ponto (x,y).
    //Pensando a reta como um dos lados do angulo formado com um eixo
    //a operação aumenta o numerador cateto oposto, e mantendo o denominador cateto adjacente constante sempre que m é 
    //adicionado a j.  Quando o numerador h (cateto oposto) torna-se igual ou maior do que o denominador (cateto adjacente),    
    //o numerador é subtraído com o denominador e j é  incrementado em um.
    int numerator = maior >> 1 ;
    // o desenho da reta levando em consideração o 
    for (int i=0;i<=maior;i++) {
       //pinta o pixel  
       img1.setRGB(x1,y1, 225 ) ;
        numerator += menor ;
        //para refletir a reta. 
        if (!(numerator<maior)) {
            numerator -= maior ;
            x1 += dx1 ;
            y1 += dy1 ;
        } else {
            x1 += dx2 ;
            y1 += dy2 ;
        }
    }
    // apos a figura pronto alocar a mesma no JFrame
    return img1;
    
}
 
    
}
