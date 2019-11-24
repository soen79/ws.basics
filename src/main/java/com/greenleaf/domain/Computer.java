package com.greenleaf.domain;

import java.util.Optional;

/**
 * Created by User on 4/18/2019.
 */
public class Computer {

    private Optional<Soundcard> soundcard;

    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }

    public void setSoundcard(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }
}
