package com.ikkerens.flatworld;

import com.mbserver.api.MBServerPlugin;
import com.mbserver.api.Manifest;

@Manifest( name = "FlatWorld" )
public class Plugin extends MBServerPlugin {
    @Override
    public void onEnable() {
        this.getPluginManager().registerCommand( "flatworld", new String[] { "fw" }, new FlatCommand( this.getServer() ) );
    }
}
