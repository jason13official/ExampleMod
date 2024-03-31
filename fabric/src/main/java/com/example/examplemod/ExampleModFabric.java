package com.example.examplemod;

import com.example.examplemod.core.registry.ExampleModBlocksFabric;
import com.example.examplemod.core.registry.ExampleModCreativeModeTabFabric;
import com.example.examplemod.core.registry.ExampleModItemsFabric;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        ExampleModCommon.init();
        
        ExampleModBlocksFabric.register();
        ExampleModItemsFabric.register();
        ExampleModCreativeModeTabFabric.register();
    }
}
