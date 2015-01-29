package com.eemi.gwt.tour.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.resources.client.CssResource.NotStrict;

public interface GwtTourResources extends ClientBundle {

    @Source("hopscotch.gss")
    @NotStrict
    CssResource css();

    @Source("hopscotch.min.0.2.3.js")
    TextResource js();

}