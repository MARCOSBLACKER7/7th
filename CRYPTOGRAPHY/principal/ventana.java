
package principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ventana extends javax.swing.JFrame {

    private FileNameExtensionFilter filter= new FileNameExtensionFilter("ArchivoFoto","bmp");
    File rutaimagen=null;
    public ventana() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        original = new javax.swing.JLabel();
        nueva = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        cifrar = new javax.swing.JButton();
        descifrar = new javax.swing.JButton();
        PR = new javax.swing.JTextField();
        PG = new javax.swing.JTextField();
        PB = new javax.swing.JTextField();
        PixelR = new javax.swing.JLabel();
        PixelG = new javax.swing.JLabel();
        PixelB = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        buscar.setBackground(new java.awt.Color(153, 153, 153));
        buscar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        buscar.setText("SEARCH");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cifrar.setText("encrypt");
        cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarActionPerformed(evt);
            }
        });

        descifrar.setText("decrypt");
        descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarActionPerformed(evt);
            }
        });

        PixelR.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        PixelR.setText("Key R:");

        PixelG.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        PixelG.setText("Key G:");

        PixelB.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        PixelB.setText("Key B:");

        limpiar.setText("clean");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(original, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nueva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ruta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cifrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(descifrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PixelR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PixelG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PixelB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(limpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PixelG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PixelB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PixelR, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PR, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(PG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PB, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(136, 136, 136)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cifrar)
                    .addComponent(descifrar))
                .addGap(41, 41, 41)
                .addComponent(limpiar)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(original, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cifrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descifrar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(limpiar)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PixelR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PixelG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PixelB))
                        .addGap(29, 29, 29)
                        .addComponent(original, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //EncryptDES.setVisible(true);
        //DecryptDES.setVisible(true);
        
        //creamos un objeto tipo filechooser
        JFileChooser dlg=new JFileChooser();
        //del objeto creado llamamos al metodo filefilter
        
        dlg.setFileFilter(filter);
        //abrimos ventana de dialogo para escoger img
        int opcion= dlg.showOpenDialog(this);
        //VALIDACION DE TIPO DE IMAGEN
        
        if(opcion==JFileChooser.APPROVE_OPTION){
         
           //obtenemos la ruta del archivo seleccionado
           rutaimagen= dlg.getSelectedFile();
           try{
               Image image;
               image = ImageIO.read(rutaimagen.getAbsoluteFile());
               ImageIcon icon = new ImageIcon(image);                                    
               Icon icono = new ImageIcon(icon.getImage().getScaledInstance(original.getWidth(), original.getHeight(), Image.SCALE_DEFAULT));
               original.setIcon(icono);
 
           
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo abrir la imagen chavo\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
         
           }
           original.setVisible(true);
           ruta.setText(rutaimagen.getAbsolutePath());
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarActionPerformed
        int R;
        int G;
        int B;
        int i,j;
        
        R=Integer.parseInt(PR.getText());
        G=Integer.parseInt(PG.getText());
        B=Integer.parseInt(PB.getText());
        
        if(R>255){
            R=R%256;
        
        }
        if(G>255){
            G=G%256;
        }
        
        if(B>255){
            B=B%256;
        }
        
        
        try{
            InputStream input = new FileInputStream(rutaimagen.getAbsoluteFile());
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage foto = ImageIO.read(imageInput); //tipo de dato para manejar imagenes

            foto = ImageIO.read(rutaimagen.getAbsoluteFile());
            BufferedImage cifrada = new BufferedImage(foto.getWidth(), foto.getHeight(), BufferedImage.TYPE_INT_RGB);
            
            for (i = 0; i < foto.getWidth(); i++) {
                for (j = 0; j < foto.getHeight(); j++) {
                    int pix = foto.getRGB(i, j); //creamos un entero donde guardaremos el pixel en la posicion i,j de la foto original 
                    Color c = new Color(pix); //creamos una variable de tipo color a la que le asignamos el valor de pixel
                    int ValorRojo = c.getRed();//obtenemos el valor del pixel rojo
                    int ValorVerde = c.getGreen();//obtenemos el valor del pixel verde
                    int ValorAzul = c.getBlue();//obtenemos el valor del pixel azul
                    // creamos una nueva nueva variable tipo color
                    //a la que le suemaremos la clave para cambiar cada los bits de los valores RGB 
                    Color cifrado = new Color((ValorRojo + R) % 256, (ValorVerde + G) % 256, (ValorAzul + B) % 256);
                    cifrada.setRGB(i, j, cifrado.getRGB());//aquí pasamos el valor nuevo del pixel(i,j) a la imagen nueva

                }

            }
            
            File salida= new File("cifrada.bmp");
            ImageIO.write(cifrada,"png",salida);
            Icon icono = new ImageIcon(cifrada.getScaledInstance(nueva.getWidth(), nueva.getHeight(), Image.SCALE_DEFAULT));
            //nueva.setIcon(new ImageIcon("cifrada.bmp"));
            //nueva.setVisible(true);
            nueva.setIcon(icono);
        }catch(IOException e) {
                JOptionPane.showMessageDialog(null, "IOException");

        }
       
                
       
        
        
        
    }//GEN-LAST:event_cifrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        PR.setText("");
        PG.setText("");
        PB.setText("");
        original.setIcon(null);
        nueva.setIcon(null);
        ruta.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void descifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarActionPerformed
        // original.setIcon(new ImageIcon("cifrada.bmp"));
        //OriginalC.setVisible(true);
        
        int R;
        int G;
        int B;
        int i,j;
        
        
        R=Integer.parseInt(PR.getText());
        G=Integer.parseInt(PG.getText());
        B=Integer.parseInt(PB.getText());
        
        /*System.out.println(R);
        System.out.println(G);
        System.out.println(B);*/
        
        if(R>255){
            R=R%256;
        
        }
        if(G>255){
            G=G%256;
        }
        
        if(B>255){
            B=B%256;
        }
        
        
        try{
            InputStream input = new FileInputStream(rutaimagen.getAbsoluteFile());
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage foto1 = ImageIO.read(imageInput); //tipo de dato para manejar imagenes

            foto1 = ImageIO.read(rutaimagen.getAbsoluteFile());
            BufferedImage descifrada = new BufferedImage(foto1.getWidth(), foto1.getHeight(), BufferedImage.TYPE_INT_RGB);

            //archivo1=new File("cifrada.bmp");
            //foto1=ImageIO.read(archivo1);
            for (i = 0; i < foto1.getWidth(); i++) {
                for (j = 0; j < foto1.getHeight(); j++) {
                    int pix = foto1.getRGB(i, j); //creamos un entero donde guardaremos el pixel en la posicion i,j de la foto original 
                    Color d = new Color(pix); //creamos una variable de tipo color a la que le asignamos el valor de pixel
                    int ValorRojo = d.getRed();//obtenemos el valor del pixel rojo
                    int ValorVerde = d.getGreen();//obtenemos el valor del pixel verde
                    int ValorAzul = d.getBlue();//obtenemos el valor del pixel azul
                    /*System.out.println(ValorRojo);
                System.out.println(ValorVerde);
                System.out.println(ValorAzul);*/
                    // creamos una nueva nueva variable tipo color
                    //a la que le suemaremos la clave para cambiar cada los bits de los valores RGB
                    ValorRojo = ValorRojo - R;
                    ValorVerde = ValorVerde - G;
                    ValorAzul = ValorAzul - B;
                    if ((ValorRojo) < 0) {
                        ValorRojo = ValorRojo + 256;
                    }
                    if ((ValorVerde) < 0) {
                        ValorVerde = ValorVerde + 256;
                    }
                    if ((ValorAzul) < 0) {
                        ValorAzul = ValorAzul + 256;
                    }
                    Color descifrado = new Color((ValorRojo) % 256, (ValorVerde) % 256, (ValorAzul) % 256);
                    descifrada.setRGB(i, j, descifrado.getRGB());//aquí pasamos el valor nuevo del pixel(i,j) a la imagen nueva

                }

            }
            File salida= new File("descifrada.bmp");
            ImageIO.write(descifrada,"jpg",salida);
            Icon icono = new ImageIcon(descifrada.getScaledInstance(nueva.getWidth(), nueva.getHeight(), Image.SCALE_DEFAULT));
             
            nueva.setIcon(icono);
        
        }catch(IOException e) {
                JOptionPane.showMessageDialog(null, "IOException");

        }
        
        
        
       
        
    }//GEN-LAST:event_descifrarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PB;
    private javax.swing.JTextField PG;
    private javax.swing.JTextField PR;
    private javax.swing.JLabel PixelB;
    private javax.swing.JLabel PixelG;
    private javax.swing.JLabel PixelR;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cifrar;
    private javax.swing.JButton descifrar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel nueva;
    private javax.swing.JLabel original;
    private javax.swing.JTextField ruta;
    // End of variables declaration//GEN-END:variables
}
