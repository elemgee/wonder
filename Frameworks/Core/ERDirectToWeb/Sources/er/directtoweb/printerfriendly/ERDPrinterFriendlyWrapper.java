/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb.printerfriendly;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSTimestamp;

// FIXME: Needs to move to look framework.
/**
 * Printer friendly page wrapper.
 */
public class ERDPrinterFriendlyWrapper extends WOComponent {
	/**
	 * Do I need to update serialVersionUID?
	 * See section 5.6 <cite>Type Changes Affecting Serialization</cite> on page 51 of the 
	 * <a href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object Serialization Spec</a>
	 */
	private static final long serialVersionUID = 1L;

    public ERDPrinterFriendlyWrapper(WOContext context) { super(context); }

    @Override
    public boolean isStateless() { return true; }

    public NSTimestamp now() { return new NSTimestamp(); } 
}
