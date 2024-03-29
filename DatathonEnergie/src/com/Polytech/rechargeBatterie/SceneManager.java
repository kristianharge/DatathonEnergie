/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Polytech.rechargeBatterie;

/**
 *
 * @author kh
 */
public class SceneManager {
    private final int _numberOfScenes = 3;
    private final Scene[] _scenes;
    private int _activeScene;
    
    public SceneManager(){
        _activeScene = 0;
        _scenes = new Scene[_numberOfScenes];
        _scenes[0] = new LogIn(this);
        _scenes[1] = new Map(this);
        _scenes[2] = new SignIn(this);
        //show the first scene
        _scenes[0].render();
    }
    
    public void changeScene(int sc) throws Exception{
        //it changes to the sc scene
        if(sc < _numberOfScenes && sc >= 0){
            _activeScene = sc;
            _scenes[_activeScene].render();
        }
        else
            throw new Exception ("Scene number out of bounds");
    }
    
    public void setMap(int sceneNumber){
        ((Map)_scenes[sceneNumber]).setMap();
    }
}
