/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_1;

/**
 *
 * @author ferna
 */
public  class Twitter extends SocialClass{

    public Twitter(String username) {
        super(username);
    }
    
    @Override
     public String timeline(){
         String info="";
         for(int i=0;i<posts.size();i++){
             info+=posts.get(i);
             
   }return info;
}
     

}
