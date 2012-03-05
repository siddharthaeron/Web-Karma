package edu.isi.karma.controller.command.alignment;

import edu.isi.karma.controller.command.Command;
import edu.isi.karma.controller.command.CommandException;
import edu.isi.karma.controller.update.OntologyClassHierarchyUpdate;
import edu.isi.karma.controller.update.UpdateContainer;
import edu.isi.karma.view.VWorkspace;

public class GetOntologyClassHierarchyCommand extends Command {

	protected GetOntologyClassHierarchyCommand(String id) {
		super(id);
	}

	@Override
	public String getCommandName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public String getTitle() {
		return "Get Ontology Class Hierarchy";
	}

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public CommandType getCommandType() {
		return CommandType.notInHistory;
	}

	@Override
	public UpdateContainer doIt(VWorkspace vWorkspace) throws CommandException {
		UpdateContainer c = new UpdateContainer();

		c.add(new OntologyClassHierarchyUpdate(vWorkspace.getWorkspace()
				.getOntologyManager().getOntModel()));
		return c;
	}

	@Override
	public UpdateContainer undoIt(VWorkspace vWorkspace) {
		// TODO Auto-generated method stub
		return null;
	}

}
