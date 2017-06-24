/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatconfigurator;

/**
 *
 * @author Alberto
 */
public class IEGService {
    
    int id;
    String status;
    String name;
    String displayname;
    
    //public IEGService(){
    
        //id=startId;
        //status=startStatus;
        //name=startName;
        //displayname=startDisplayName;
    
   // }
    
    //+++ Methods ++++
    
    public void setStatus(String newValue){
        status=newValue;
    }
    
    public void setName(String newValue){
        name=newValue;
    }
    
    public void setDisplayName(String newValue){
        displayname=newValue;
    }
    
    
}
