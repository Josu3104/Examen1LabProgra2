/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_1;

/**
 *
 * @author ferna
 */
import java.io.PrintStream;
import java.util.ArrayList;

public class Facebook extends SocialClass implements Commentable {
    public ArrayList<Comment> comentarios;
    
    
    public Facebook(String username){
        super(username);
        comentarios=new ArrayList<>();
    }
    
    public boolean addComment(Comment comment){
       
        comentarios.add(comment);
        return true;
        
    }
    @Override
    public void timeline(){
        
         for(int i=0;i<posts.size();i++){
             System.out.println(posts.get(i));
             for(int j=0;j<comentarios.size();j++){
                 
            if(comentarios.get(j).postId==i){
               
                System.out.println(comentarios.get(j).print());
                
            }
            }
             
         }
     }
    }
