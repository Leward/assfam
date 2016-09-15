package vdo.safir

import com.vaadin.navigator.Navigator
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.ComponentContainer
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Panel
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import grails.plugins.vaadin.navigator.GrailsAwareViewProvider

class AssfamAppUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);
        root.setSpacing(true);
        setContent(root);

        HorizontalLayout topBar = new HorizontalLayout();
        topBar.setSpacing(true);
        createNavigationButton("Assfam", "#!assfam", topBar)
        root.addComponent(topBar);

        final Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        root.addComponent(viewContainer);
        root.setExpandRatio(viewContainer, 1.0f);

        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addProvider(new GrailsAwareViewProvider());
    }

    private Button createNavigationButton(String label, String viewName, ComponentContainer container = null) {
        def button = new Button(label)
        if(container != null) {
            container.addComponent(button)
        }
        button.addClickListener { event -> navigator.navigateTo(viewName) }
        return button
    }
}
