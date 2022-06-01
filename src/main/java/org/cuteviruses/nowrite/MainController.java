package org.cuteviruses.nowrite;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import java.awt.*;
public class MainController {
    public static Robot robot;
    MainController() {
        try {
       robot = new Robot();
       addListener();
        } catch (AWTException | NativeHookException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    private void addListener() throws NativeHookException {
        // Activate the library
        GlobalScreen.registerNativeHook();
        //Add Listener to the board
        GlobalScreen.addNativeKeyListener(new KeyListener());
    }
}




