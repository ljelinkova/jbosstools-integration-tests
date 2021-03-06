package org.jboss.tools.openshift.reddeer.view;

import org.jboss.reddeer.common.wait.TimePeriod;
import org.jboss.reddeer.common.wait.WaitWhile;
import org.jboss.reddeer.core.condition.JobIsRunning;
import org.jboss.reddeer.core.condition.ShellWithTextIsAvailable;
import org.jboss.reddeer.swt.api.TreeItem;
import org.jboss.reddeer.swt.impl.button.OkButton;
import org.jboss.reddeer.swt.impl.menu.ContextMenu;
import org.jboss.reddeer.swt.impl.shell.DefaultShell;
import org.jboss.tools.openshift.reddeer.utils.OpenShiftLabel;

/**
 * OpenShift resource. This class represents build config, build, deployment config, image stream,
 * pod, replication controller, route, service or pod.
 * 
 * @author mlabuda@redhat.com
 *
 */
public class OpenShiftResource extends AbstractOpenShiftExplorerItem {

	public OpenShiftResource(TreeItem resourceItem) {
		super(resourceItem);
	}
	
	/**
	 * Gets text of OpenShift resource.
	 * @return text label of tree item representing OpenShift resource.
	 */
	public String getText() {
		return item.getText();
	}
	
	/**
	 * Gets name (id) of a resource.
	 * 
	 * @return name of a resource
	 */
	public String getName() {
		return treeViewerHandler.getNonStyledText(item);
	}
	
	/**
	 * Gets state of a resource. Could be Pending, Running, Complete, Failed and others.
	 * 
	 * @return state of a resource
	 */
	public String getState() {
		return treeViewerHandler.getNonStyledText(item).trim();
	}
	
	public void delete() {
		refresh();
		item.select();
		new ContextMenu(OpenShiftLabel.ContextMenu.DELETE_RESOURCE).select();
		
		new DefaultShell(OpenShiftLabel.Shell.DELETE_RESOURCE);
		new OkButton().click();
		
		new WaitWhile(new ShellWithTextIsAvailable(OpenShiftLabel.Shell.DELETE_RESOURCE), TimePeriod.LONG);
		new WaitWhile(new JobIsRunning(), TimePeriod.LONG);
	}
	
}
