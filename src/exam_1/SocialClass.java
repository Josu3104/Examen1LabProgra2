/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_1;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public abstract class SocialClass {
   public ArrayList<String> friends; 
   public ArrayList<String> posts;
    public String username;
    public String TipoCuenta;

    public SocialClass( String username) {
       friends = new ArrayList<>();
       posts = new ArrayList<>();
        this.username = username;
    }
    
    public boolean addFriend(String User){
        for(int i=0;i<friends.size();i++){
            if(User.equals(friends.get(i))||User.equals(username))
            return false;
            
        }friends.add(User);
        return true;
    }
    
    public void addPost(String msg){
        posts.add(msg);
    }
    
    public abstract void timeline();
    
    public void myProfile(){
        
        timeline();
        for(int i=0;i<friends.size();i++){
            if(i>10){
                break;
            }
            System.out.println("\n"+friends.get(i));
        }
        
    }
    public String TipoCuenta(String tipo){
        return TipoCuenta=tipo;
    }
    
}
