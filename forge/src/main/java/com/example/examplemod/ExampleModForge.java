package com.example.examplemod;

import com.example.examplemod.core.registry.ExampleModBlocksForge;
import com.example.examplemod.core.registry.ExampleModCreativeModeTabForge;
import com.example.examplemod.core.registry.ExampleModItemsForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleModConstants.MOD_ID)
public class ExampleModForge {
    
    public ExampleModForge() {
        
        ExampleModCommon.init();
        
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ExampleModBlocksForge.register(bus);
        ExampleModItemsForge.register(bus);
        ExampleModCreativeModeTabForge.register(bus);
        
        bus.addListener(this::serverSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
    }
    
    public void serverSetup(FMLDedicatedServerSetupEvent event) {}
    public void commonSetup(FMLCommonSetupEvent event) {}
    public void clientSetup(FMLClientSetupEvent event) {}
}