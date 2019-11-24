package com.greenleaf.domain;

import java.util.Optional;

/**
 * Created by User on 4/18/2019.
 */
public class Soundcard {

    private Optional<USB> usb;

    public Optional<USB> getUsb() {
        return usb;
    }

    public void setUsb(Optional<USB> usb) {
        this.usb = usb;
    }
}
