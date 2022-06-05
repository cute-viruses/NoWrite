package org.cuteviruses.nowrite;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.awt.event.KeyEvent;

public class KeyListener implements NativeKeyListener {
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        MainController.getRobot().keyPress(KeyEvent.VK_BACK_SPACE);
        MainController.getRobot().delay(100);
        MainController.getRobot().keyRelease(KeyEvent.VK_BACK_SPACE);
    }
}