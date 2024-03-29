/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Polytech.rechargeBatterie;

import com.codename1.ui.Form;

/**
 *
 * @author kh
 */
public class Scene {
    public Form _form;
    protected SceneManager _sceneManager;
    
    public Scene(SceneManager sm){
        _sceneManager = sm;
    }
    
    public void render(){
        _form.show();
    }
    
    protected void destroyScene(int nextScene){
        //called when we change of scene
        try{
            _sceneManager.changeScene(nextScene);//loading game scene
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
