package org.jboss.tools.openshift.ui.bot.test.application.basic;

import static org.junit.Assert.fail;

import org.jboss.reddeer.swt.condition.ShellWithTextIsAvailable;
import org.jboss.reddeer.swt.exception.RedDeerException;
import org.jboss.reddeer.swt.impl.button.CancelButton;
import org.jboss.reddeer.swt.impl.menu.ContextMenu;
import org.jboss.reddeer.swt.impl.menu.ShellMenu;
import org.jboss.reddeer.swt.impl.shell.DefaultShell;
import org.jboss.reddeer.swt.impl.shell.WorkbenchShell;
import org.jboss.reddeer.swt.impl.toolbar.DefaultToolItem;
import org.jboss.reddeer.swt.wait.TimePeriod;
import org.jboss.reddeer.swt.wait.WaitUntil;
import org.jboss.reddeer.uiforms.impl.hyperlink.DefaultHyperlink;
import org.jboss.reddeer.uiforms.impl.section.DefaultSection;
import org.jboss.tools.openshift.ui.utils.Datastore;
import org.jboss.tools.openshift.ui.utils.OpenShiftLabel;
import org.jboss.tools.openshift.ui.view.openshift.OpenShiftExplorerView;
import org.junit.Test;

/**
 * Test opening a new application wizard via central, menu and OpenShift explorer.
 * 
 * @author mlabuda@redhat.com
 *
 */
public class ID301OpenNewApplicationWizardTest {
	
	@Test
	public void testOpenWizardViaExplorer() {
		OpenShiftExplorerView explorer = new OpenShiftExplorerView();
		explorer.getDomain(Datastore.USERNAME, Datastore.DOMAIN).select();
		
		new ContextMenu(OpenShiftLabel.ContextMenu.NEW_APPLICATION).select();
		
		try {
			new WaitUntil(new ShellWithTextIsAvailable(OpenShiftLabel.Shell.NEW_APP_WIZARD),
					TimePeriod.LONG);
			new DefaultShell(OpenShiftLabel.Shell.NEW_APP_WIZARD);
			new CancelButton().click();
		} catch (RedDeerException ex) {
			fail("New Application Wizard has not been opened.");
		}
	}

	@Test
	public void testOpenWizardViaMenu() {
		new ShellMenu(OpenShiftLabel.Others.NEW_APP_MENU).select();
		
		try {
			new WaitUntil(new ShellWithTextIsAvailable(OpenShiftLabel.Shell.NEW_APP_WIZARD),
					TimePeriod.LONG);
			new DefaultShell(OpenShiftLabel.Shell.NEW_APP_WIZARD);
			new CancelButton().click();
		} catch (RedDeerException ex) {
			fail("New Application Wizard has not been opened.");
		}
	}
	
	@Test
	public void testOpenWizardViaCentral() {
		new DefaultToolItem(new WorkbenchShell(), OpenShiftLabel.Others.JBOSS_CENTRAL).click();
	
		DefaultSection startSection = new DefaultSection("Start from scratch");
		new DefaultHyperlink(startSection, OpenShiftLabel.Others.OPENSHIFT_APP).activate();
		
		try {
			new WaitUntil(new ShellWithTextIsAvailable(OpenShiftLabel.Shell.NEW_APP_WIZARD),
					TimePeriod.LONG);
			new DefaultShell(OpenShiftLabel.Shell.NEW_APP_WIZARD);
			new CancelButton().click();
		} catch (RedDeerException ex) {
			fail("New Application Wizard has not been opened.");
		}
	}
	
}
