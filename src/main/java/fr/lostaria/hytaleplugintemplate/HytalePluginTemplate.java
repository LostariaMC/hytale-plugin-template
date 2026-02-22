package fr.lostaria.hytaleplugintemplate;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import lombok.Getter;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class HytalePluginTemplate extends JavaPlugin {

    @Getter
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public HytalePluginTemplate(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        LOGGER.atInfo().log("Setting up plugin " + this.getName());
    }
}
