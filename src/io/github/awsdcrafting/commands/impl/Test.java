package io.github.awsdcrafting.commands.impl;
import io.github.awsdcrafting.commands.BaseCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/**
 * Created by Michael on 09.06.2017.
 */
public class Test extends BaseCommand implements CommandExecutor
{
	public Test()
	{
		super("Test");
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			Player player = (Player) sender;
			player.sendMessage(prefix + " This is a test command");
			player.sendMessage(prefix + " Your name is: " + player.getName() + " and you are shown as: " + player.getDisplayName());
		}

		return false;
	}
}