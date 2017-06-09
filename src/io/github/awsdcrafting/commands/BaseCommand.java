package io.github.awsdcrafting.commands;
import main.Main;
/**
 * Created by Michael on 09.06.2017.
 */
public class BaseCommand
{
	protected String prefix;
	protected String name;

	public BaseCommand(String name){
		this.name = name;
		prefix = Main.prefix;
	}


	public String getPrefix()
	{
		return prefix;
	}

	public void setPrefix(String prefix)
	{
		this.prefix = prefix;
	}

}
