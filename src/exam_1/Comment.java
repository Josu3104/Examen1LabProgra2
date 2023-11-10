/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_1;

import java.util.Calendar;

/**
 *
 * @author ferna
 */
public final class Comment {
    Calendar date = Calendar.getInstance();
    public int postId, fecha;
    public String autor, contenido;
    
    public Comment(int postId, String autor, String contenido) {
        this.postId = postId;
        this.autor = autor;
        this.contenido = contenido;
        fecha = date.get(Calendar.DATE);
    }
    
    public void print(){
        System.out.println("Autor: "+autor+"    -    Fecha: "+fecha+"/n"+contenido);
    }
    
    
    
    
    
    
    
    
}
