package com.adaivskenan.springboot.learning.vaadin.ui;

import com.adaivskenan.springboot.learning.vaadin.service.MyService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by adaivskenan on 01/08/2017.
 */

@Theme("valo")
@SpringUI(path = "")
public class VaadinUI extends UI {

    @Autowired
    MyService myService;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label(myService.sayHi()));
    }
}
