import java.security.Key;
import java.io.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/**
 * encriptado y desencriptado con algoritmo AES.
 */
public class prac0{

   public static void main(String[] args) throws Exception {
      String text="";
      String aux="";
      // Generamos una clave de 128 bits adecuada para AES
      KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
      keyGenerator.init(128);
      Key key = keyGenerator.generateKey();
      
      /* Este algoritmo te pide una clave que tenga al menos 16 bytes
       la generamos de manera alterna
      */
       
      key = new SecretKeySpec("una clave de 16 bytes".getBytes(),  0, 16, "AES");
      
      

      // Texto a encriptar
      try{
            File archivo = new File ("archivo.txt");
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
               

            while( (aux=br.readLine()) !=null){
               //System.out.println(aux);
                  
                  text += aux + '\n';

            }

            br.close();
            

            // Se obtiene un cifrador AES
            Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");

            // Se inicializa para encriptacion y se encripta el texto,
            // que debemos pasar como bytes.
            aes.init(Cipher.ENCRYPT_MODE, key); //inicialización
            /*convertimos lo nuestra cadena a bytes con el metodo getBytes, 
            al mismo timpo que se van obteniendo los bytes, se van encriptando con el método doFinal
            y lo guardamos en el arreglo de bytes llamado encriptado
            
            */
            byte[] encriptado = aes.doFinal(text.getBytes()); 

            // Se escribe byte a byte en hexadecimal el texto
            // encriptado para ver el cifrado de forma legible.
            //descomenta el sig for si quieres que se impriman, si no, no es necesario es un plus
            /*for (byte b : encriptado) {
               System.out.print(Integer.toHexString(0xFF & b));
            }
            System.out.println();*/

            
             
            /*
            ahora vamos a inicializar el cifrado aes pero en el modo descifrar y pasamos la misma llave
            */
            aes.init(Cipher.DECRYPT_MODE, key);
            /*
            de la misma forma, con el metodo doFinal obtenemos el desencriptado y lo pasamos a un arreglo de bytes
            */
            byte[] bytesDesencriptados = aes.doFinal(encriptado);
            //ahora convertimos ese arreglo en una cadena para que sea legible 
            String textoDesencripado = new String(bytesDesencriptados);

            /*
            aquí vamos a crear un archivo de salida para escribir nuestra cadena descifrada ;)
            */
            File fn = new File("prueba.txt");
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(fn));
      
            bw.write(textoDesencripado);
      
          
            bw.close();
            //System.out.println(new String(desencriptado));

            //LISTO BYE <3
   }catch(Exception e){
         e.printStackTrace();
 
      }
   }

}



