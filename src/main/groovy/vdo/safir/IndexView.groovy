package vdo.safir

import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.CustomComponent
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout

class IndexView extends VerticalLayout implements View {

    IndexView() {
        setMargin(true)
    }

    @Override
    void enter(ViewChangeListener.ViewChangeEvent event) {
        addComponent(new Label("Index View"));
    }
}
