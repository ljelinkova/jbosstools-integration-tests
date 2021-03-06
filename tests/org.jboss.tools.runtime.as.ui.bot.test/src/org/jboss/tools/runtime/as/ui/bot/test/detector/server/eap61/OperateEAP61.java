package org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap61;

import org.jboss.reddeer.requirements.jre.JRERequirement.JRE;
import org.jboss.tools.runtime.as.ui.bot.test.template.OperateServerTemplate;


@JRE(value=1.7, cleanup=true)
public class OperateEAP61 extends OperateServerTemplate {

	@Override
	protected String getServerName() {
		return DetectEAP61.SERVER_NAME;
	}
}
