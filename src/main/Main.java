package main;

import io.github.awsdcrafting.commands.impl.*;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin
{
	public static final String prefix = "[§4AdminTools§r]";

	@Override
	public void onEnable()
	{

		//registering all commands by alphabet
		this.getCommand("test").setExecutor(new Test());
	}

	@Override
	public void onDisable()
	{
	}
}
