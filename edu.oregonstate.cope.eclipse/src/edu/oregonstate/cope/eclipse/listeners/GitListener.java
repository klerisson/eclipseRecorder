package edu.oregonstate.cope.eclipse.listeners;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.jgit.events.RefsChangedEvent;
import org.eclipse.jgit.events.RefsChangedListener;

public class GitListener implements RefsChangedListener {
	
	private String currentBranch;
	
	public GitListener(IProject[] projects) {
		
	}

	@Override
	public void onRefsChanged(RefsChangedEvent event) {
		try {
			currentBranch = event.getRepository().getBranch();
		} catch (IOException e) {
		}
	}

	public String getCurrentBranch() {
		return currentBranch;
	}
}
