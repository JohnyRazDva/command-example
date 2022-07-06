package by.htp.ex.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.ex.controller.impl.GoToLoginationPageCommand;
import by.htp.ex.controller.impl.GoToRegistrationPageCommand;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_LOGINATION_PAGE, new GoToLoginationPageCommand());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPageCommand());
	}
	
	public Command getCommand(String commandName) {
	
		Command command = commands.get(CommandName.valueOf(commandName.toUpperCase()));
		return command;
	}

}
