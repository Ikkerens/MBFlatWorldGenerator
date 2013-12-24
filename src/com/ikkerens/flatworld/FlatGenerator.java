package com.ikkerens.flatworld;

import com.mbserver.api.dynamic.WorldGenerator;
import com.mbserver.api.game.Chunk;
import com.mbserver.api.game.Material;

public class FlatGenerator extends WorldGenerator {
    private final short bedrock;
    private final short dirt;
    private final short grass;

    public FlatGenerator() {
        this.bedrock = Material.BEDROCK.getID();
        this.dirt = Material.DIRT.getID();
        this.grass = Material.GRASS.getID();
    }

    @Override
    public void setSeed( final long seed ) {
    }

    @Override
    public void fillChunk( final Chunk chunk ) {
        if ( chunk.getLocation().getBlockY() != 0 )
            return;
        for ( int x = 0; x < 16; x++ )
            for ( int z = 0; z < 16; z++ ) {
                chunk.set( x, 0, z, this.bedrock );
                for ( int y = 1; y <= 3; y++ )
                    chunk.set( x, y, z, this.dirt );
                chunk.set( x, 4, z, this.grass );
            }
    }
}
