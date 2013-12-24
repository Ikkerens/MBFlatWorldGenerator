package com.ikkerens.flatworld;

import com.mbserver.api.CommandExecutor;
import com.mbserver.api.CommandSender;
import com.mbserver.api.Server;

public class FlatCommand implements CommandExecutor {
    private final Server server;

    public FlatCommand( final Server server ) {
        this.server = server;
    }

    @Override
    public void execute( final String command, final CommandSender sender, final String[] args, final String label ) {
        if ( !sender.hasPermission( "flatworld.create" ) ) {
            sender.sendMessage( "You do not have permission to use /" + label );
            return;
        }

        if ( args.length != 1 ) {
            sender.sendMessage( "Usage: /" + label + " <worldname>" );
            return;
        }

        sender.sendMessage( "Creating new flat world..." );
        new Thread() {
            @Override
            public void run() {
                FlatCommand.this.server.createWorld( args[ 0 ], 0L, new FlatGenerator() );
                sender.sendMessage( "Finished creating flat world." );
            }
        }.start();
    }
}
