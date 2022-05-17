package org.cuteviruses.deletewriteKeybord;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener implements NativeKeyListener {
    public void nativeKeyTyped(NativeKeyEvent e) {
        MainController.robot.keyPress(KeyEvent.VK_BACK_SPACE);
    }


}