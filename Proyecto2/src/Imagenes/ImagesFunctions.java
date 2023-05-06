/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imagenes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.stream.ImageInputStream;
public class ImagesFunctions {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    ImagesController controladores = new ImagesController();
     byte[] bytesInge;
    public int[][] R;
    public int[][] G;
    public int[][] B;
    public int[][] gris;
    InputStream input;
    ImageInputStream inputimagen;
    public BufferedImage imageL;
    private BufferedImage imagensecundaria;
    Color c;
    private int alto;
    private int largo;
    
    public byte[] openIMG(File archivo){
        byte[] bytesImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
            
        }
        return bytesImg;
    }
    
    public String saveIMG(File archivo, byte[] bytesImg, String usuario, String categoria){
        String respuesta=null;
        try {
            salida = new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta = "La imagen se guardo con exito";
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    public byte[] convertIMG(File archivo, byte[] bytesImg){
        String respuesta= null;
        String nametemp = archivo.getName();
        nametemp = nametemp.replace(".jp", "");
        try {
            salida = new FileOutputStream(new File(nametemp));
            salida.write(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }
    
    public String convertJPG(File archivo, byte [] bytesImg){
        String respuesta ="";
        String nombre ="Converted-"+ archivo.getName();
                nombre = nombre.replace(".bmp", "")+".jpg";
        try {
            salida = new FileOutputStream(new File(nombre));
            salida.write(bytesImg);
            respuesta="La imagen se ha convertido con exito";
        } catch (Exception e) {
        }
        return respuesta;
    }
    public String convertBMP(File archivo, byte [] bytesImg){
        String respuesta ="";
        String nombre = "Converted-"+archivo.getName();
        nombre = nombre.replace(".jpg", "")+".bmp";
        try {
            salida = new FileOutputStream(new File(nombre));
            salida.write(bytesImg);
            respuesta="La imagen se ha convertido con exito";
        } catch (Exception e) {
        }
        return respuesta;
    }
}
