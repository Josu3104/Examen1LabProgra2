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
     public void timeline(){
        
         for(int i=0;i<posts.size();i++){
             System.out.println(posts.get(i));
             
   }
}
     

}
