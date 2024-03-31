package com.example.examplemod;


import com.example.examplemod.core.registry.ExampleModBlocksNeoForge;
import com.example.examplemod.core.registry.ExampleModCreativeModeTabNeoForge;
import com.example.examplemod.core.registry.ExampleModItemsNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

@Mod(ExampleModConstants.MOD_ID)
public class ExampleModNeoForge {

    public ExampleModNeoForge(IEventBus bus) {
        
        ExampleModCommon.init();
        
        ExampleModBlocksNeoForge.register(bus);
        ExampleModItemsNeoForge.register(bus);
        ExampleModCreativeModeTabNeoForge.register(bus);
        
        bus.addListener(this::serverSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
    }
    
    public void serverSetup(FMLDedicatedServerSetupEvent event) {}
    public void commonSetup(FMLCommonSetupEvent event) {}
    public void clientSetup(FMLClientSetupEvent event) {}
}