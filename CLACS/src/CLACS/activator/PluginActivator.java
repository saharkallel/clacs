package CLACS.activator;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * @generated
 */
public class PluginActivator extends Plugin {

	/**
	 * @generated
	 */
	public static final String ID = "CLACS"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static PluginActivator ourInstance;

	/**
	 * @generated
	 */
	public PluginActivator() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ourInstance = this;
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		ourInstance = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static PluginActivator getDefault() {
		return ourInstance;
	}
}
