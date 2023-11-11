/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class UberSocial {
    public ArrayList<SocialClass> accounts=new ArrayList();
    public SocialClass cuenta;
    public int i;
    public SocialClass buscar(String username,int n){
        if(n<accounts.size()){
            if(username.equals(accounts.get(n).username))
                return accounts.get(n);i=n;
            return buscar(username,n+1);
        }
        return null;
    }
    public void agregarCuenta(String username, String tipo){
        if(buscar(username,0)==null){
            if(tipo.equalsIgnoreCase("facebook")){
                cuenta = new Facebook(username);
                cuenta.TipoCuenta("facebook");
              accounts.add(cuenta);}
            else if(tipo.equalsIgnoreCase("twitter")){
               cuenta = new Twitter(username);
               cuenta.TipoCuenta("twitter");
            accounts.add(cuenta);}
            }}
    
    public void agregarPost(String user, String post){
        if(buscar(user,0)!=null){
            buscar(user,0).addPost(post);
        }
    }
     public void agregarAmigo(String user1, String user2){
         if(buscar(user1,0)!=null&&buscar(user2,0)!=null){
            if(buscar(user1,0).TipoCuenta.equalsIgnoreCase("facebook")&&buscar(user2,0).TipoCuenta.equalsIgnoreCase("facebook")){
             buscar(user1,0).addFriend(user2);}
             
            else if(buscar(user1,0).TipoCuenta.equalsIgnoreCase("twitter")&&buscar(user2,0).TipoCuenta.equalsIgnoreCase("twitter")){
                buscar(user1,0).addFriend(user2);}
            else JOptionPane.showMessageDialog(null, "Ambos usuarios deben pertenecer a la misma red social");
         }
         else JOptionPane.showMessageDialog(null, "Este usuario no existe");
     }
     public void agregarCommment(String user, int postID,String autor,String comment){
         if(buscar(user,0)!=null&&buscar(user,0).TipoCuenta.equalsIgnoreCase("facebook")){
           for(SocialClass account: accounts){
               if(account instanceof Facebook&&account.equals(buscar(user,0))){
                   Facebook facebookAcc= (Facebook) account;
                   if(postID+1==facebookAcc.posts.size()){
                   facebookAcc.addComment(new Comment(postID,autor,comment));
                   accounts.set(i, account);}
                   else JOptionPane.showMessageDialog(null, "Post ID incorrecto");
               }
           }
         }
             
             
     }
     
    public void profileForm(String user){
    if(buscar(user,0)!=null){
        buscar(user,0).myProfile();
        buscar(user,0).timeline();
    }}
}
