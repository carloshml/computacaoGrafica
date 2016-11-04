package compgraficacompleto;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

/**
 * Universidade Federal do Tocantins Computação Gráfica Professor: Tanilson Dias
 * Aluno: Carlos Casca
 *
 * @author carloscasca
 */
public class interfacePrograma extends javax.swing.JFrame {

    private int x1 = 0, y1 = 0, x2 = 0, y2 = 0, InicioX = 0, InicioY = 0;
    private Point pontoInicial;
    private desenhaReta object1 = new desenhaReta();
    private desenhaCircunferencia object2 = new desenhaCircunferencia();
    private BufferedImage img;
    private BufferedImage copy;

    public interfacePrograma() {
        initComponents();
        preparaNovaImagem();
        exibeImagem();
    }

    private void exibeImagem() {
        jLabelAreaPintura.setIcon(new ImageIcon(img));
    }

    private void preparaNovaImagem() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        img = new BufferedImage(600, 600, 5);
        Color corFundo = new Color(255, 255, 255);
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                img.setRGB(x, y, corFundo.getRGB());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        corSelecionada = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelAreaPintura = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        corSelecionada1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" ");

        corSelecionada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 cores ", "8 cores ", "16 cores " }));

        jLabelAreaPintura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelAreaPintura.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelAreaPinturaMouseMoved(evt);
            }
        });
        jLabelAreaPintura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAreaPinturaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jLabelAreaPintura);

        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jSlider1MouseMoved(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider1MousePressed(evt);
            }
        });

        jLabel2.setText("Escolha seu tom de cinza");

        corSelecionada1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horizontal", "vertical" }));

        jLabel3.setText("refletir");

        jButton1.setText("fechar polilinha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem9.setText("carregar imagem");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("limpar tela");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("salvar imagem");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem13.setText("Recarregar Imagem");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Desenhar");

        jMenuItem1.setText("Reta");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Retângulo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Polilinha Aberta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("()");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Circunferência ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem19.setText("Polilinha Fechada");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pintar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Imagem");

        jMenuItem6.setText("PretoeBranco");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Diminuir cores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("TonsdeCinza");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem12.setText("Cor Artística");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem14.setText("refletir");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("rotacionar imagem");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("transaladar Imagem");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Escala");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Cisalhamento");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem20.setText("passa baixo");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("passa alto Sobel");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("passa alto Aula");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem22);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(corSelecionada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(corSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corSelecionada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jLabel1.setText("Desenhar um Retângulo");
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jLabel1.setText("Desenhar um Polilinha Aberta");
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jLabelAreaPinturaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAreaPinturaMouseMoved
    }//GEN-LAST:event_jLabelAreaPinturaMouseMoved

    private void jLabelAreaPinturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAreaPinturaMousePressed
        String tipoDesenho = "";
        tipoDesenho = jLabel1.getText();
        switch (tipoDesenho) {
            case "Desenhar uma Reta":
                if (x1 == 0) {
                    x1 = evt.getPoint().x;
                    y1 = evt.getPoint().y;
                } else {
                    x2 = evt.getPoint().x;
                    y2 = evt.getPoint().y;
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x2, y2)));
                    x1 = 0;
                }
                break;
            case "Desenhar um Retângulo":
                if (x1 == 0) {
                    x1 = evt.getPoint().x;
                    y1 = evt.getPoint().y;
                } else {
                    x2 = evt.getPoint().x;
                    y2 = evt.getPoint().y;
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x2, y1)));
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x1, y2)));
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x2, y1, x2, y2)));
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y2, x2, y2)));
                    x1 = 0;
                    y1 = 0;
                    x2 = 0;
                    y2 = 0;
                }
                break;
            case "Desenhar uma Polilinha Aberta":
                x2 = x1;
                y2 = y1;
                x1 = evt.getPoint().x;
                y1 = evt.getPoint().y;
                jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x2, y2)));
                break;
            case "Desenhar polilinha fechada":
                if (x1 == 0) {
                    InicioX = evt.getPoint().x;
                    InicioY = evt.getPoint().y;
                    if (x1 == 0) {
                        x1 = evt.getPoint().x;
                        y1 = evt.getPoint().y;
                    } else {
                        x2 = evt.getPoint().x;
                        y2 = evt.getPoint().y;
                        jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x2, y2)));
                        x1 = 0;
                    }
                }
                if (x1 != 0) {
                    x2 = x1;
                    y2 = y1;
                    x1 = evt.getPoint().x;
                    y1 = evt.getPoint().y;
                    jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, x2, y2)));
                }

                break;

            case "Desenhar uma Circunferência":
                if (x1 == 0) {
                    x1 = evt.getPoint().x;
                    y1 = evt.getPoint().y;
                } else {
                    x2 = evt.getPoint().x;
                    y2 = evt.getPoint().y;
                    jLabelAreaPintura.setIcon(new ImageIcon(object2.drawCircle(img, x1, y1, Math.abs((int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))))));
                    x1 = 0;
                }
                break;
            case "pintar":
                Color randomColor = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
                pontoInicial = evt.getPoint();
                img = PintarCampo.pinta(img, pontoInicial, randomColor);
                jLabelAreaPintura.setIcon(new ImageIcon(img));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jLabelAreaPinturaMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        jLabel1.setText("Desenhar uma Reta");
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jLabel1.setText("Desenhar uma Polilinha Fechada");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jLabel1.setText("Desenhar uma Circunferência");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        jLabel1.setText("pintar");
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                img = ImageIO.read(file);
                jLabelAreaPintura.setIcon(new ImageIcon(img));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        imagem foto = new imagem();
        copy = img;
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doPretoBranco(img)));
        jLabelAreaPintura.setIcon(new ImageIcon(copy));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        imagem foto = new imagem();
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doTonCinza(img)));
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        imagem foto = new imagem();
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doMenosCor(img, corSelecionada.getSelectedIndex())));
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            ImageIO.write(copy, "PNG", new File("arteabstrata.png"));
        } catch (IOException ex) {
            Logger.getLogger(interfacePrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jSlider1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MousePressed
        JSlider source = (JSlider) evt.getSource();
        imagem foto = new imagem();
        jLabel2.setText("" + source.getValue());
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doTonsCinza(img,
                Integer.parseInt(jLabel2.getText()))));
    }//GEN-LAST:event_jSlider1MousePressed

    private void jSlider1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseMoved

    }//GEN-LAST:event_jSlider1MouseMoved

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        imagem foto = new imagem();
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doColorizar(img, corSelecionada.getSelectedIndex())));
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        preparaNovaImagem();
        exibeImagem();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        jLabelAreaPintura.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        imagem foto = new imagem();
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doReflexao(img, corSelecionada1.getSelectedIndex())));

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        imagem foto = new imagem();
        double grau = Double.parseDouble(JOptionPane.showInputDialog("Escreva um ângulo"));
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doRodar(img, grau)));

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        imagem foto = new imagem();
        int distX = Integer.parseInt(JOptionPane.showInputDialog("distancia em X"));
        int distY = Integer.parseInt(JOptionPane.showInputDialog("distancia em Y"));
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doTransladar(img, Math.abs(img.getWidth() + distX), Math.abs(img.getHeight() + distY), distX, distY)));

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        imagem foto = new imagem();
        int distX = Integer.parseInt(JOptionPane.showInputDialog("nova largura da imagem"));
        int distY = Integer.parseInt(JOptionPane.showInputDialog("nova altura da imagem "));
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doEscala(img, distX, distY)));


    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        imagem foto = new imagem();
        int distX = Integer.parseInt(JOptionPane.showInputDialog("Distancia em X "));
        int distY = Integer.parseInt(JOptionPane.showInputDialog("Distancia em Y "));
        int novax = (img.getWidth() + distX), novay = (img.getHeight() + distY);

        System.out.print(" " + novax + "  " + novay + "  " + distX + "  " + distY);
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doCisalhamento(img, img.getWidth() + (distX * img.getHeight()), img.getHeight() + (distY * img.getWidth()), distX, distY)));
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        jLabel1.setText("Desenhar polilinha fechada");
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelAreaPintura.setIcon(new ImageIcon(object1.drawing(img, x1, y1, InicioX, InicioY)));
        x1 = 0;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        passaBaixa foto = new passaBaixa();
        jLabelAreaPintura.setIcon(new ImageIcon(foto.doPassaBaixa(img, img.getWidth(), img.getHeight())));
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        passaAlto foto = new passaAlto();
        copy= foto.doPassaAlta(img, img.getWidth(), img.getHeight());
        jLabelAreaPintura.setIcon(new ImageIcon(copy));
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        passaAlto foto = new passaAlto();
        copy=foto.doPassaAltaAula(img, img.getWidth(),img.getHeight());
        jLabelAreaPintura.setIcon(new ImageIcon(copy));
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfacePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfacePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfacePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfacePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfacePrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> corSelecionada;
    private javax.swing.JComboBox<String> corSelecionada1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAreaPintura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
