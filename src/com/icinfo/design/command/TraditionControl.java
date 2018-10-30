package com.icinfo.design.command;

import com.icinfo.design.command.device.Light;
import com.icinfo.design.command.device.Stereo;

public class TraditionControl implements Control {
    Light light;
    Stereo stereo;

    public TraditionControl(Light light, Stereo stereo) {
        this.light = light;
        this.stereo = stereo;
    }

    @Override
    public void onButton(int slot) {
        switch (slot) {
            case 0:
                light.On();
                break;
            case 1:
                stereo.On();
                break;
            case 2:
                int vol = stereo.getVolume();
                if (vol < 11) {
                    stereo.setVol(++vol);
                }
                break;
        }
    }

    @Override
    public void offButton(int slot) {

        switch (slot) {
            case 0:
                light.Off();
                break;
            case 1:
                stereo.Off();
                break;
            case 2:
                int val = stereo.getVolume();
                if (val > 0) {
                    stereo.setVol(--val);
                }
                break;
        }
    }

    @Override
    public void undoButton() {

    }
}
