/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Polytech.rechargeBatterie;

import com.codename1.googlemaps.MapContainer;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;

/**
 *
 * @author kh
 */
public class Map extends Scene{
    private final Toolbar _toolBar;

    public Map(SceneManager sm) {
        super(sm);
        _sceneManager = sm;
        _form = new Form();
        _toolBar = new Toolbar();
        _form.setToolbar(_toolBar);
        _form.setTitle("Map");
        //add the different fields on the side menu
        _toolBar.addMaterialCommandToSideMenu("Home",
                FontImage.MATERIAL_HOME, (e)->{});
        _toolBar.addMaterialCommandToSideMenu("User Settings",
                FontImage.MATERIAL_SETTINGS, (e)->{});
    }
    
   public void setMap(){
       System.out.print(1);
        //map settings
        final MapContainer cnt = new MapContainer();
        _form.addComponent(cnt);
    }
}
