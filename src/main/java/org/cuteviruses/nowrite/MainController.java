package org.cuteviruses.nowrite;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

import java.awt.*;
import java.util.logging.Logger;

public class MainController {
    private static Robot robot;
    private static final Logger logger = Logger.getLogger(MainController.class.getName());

    // Initialize the robot
    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            logger.severe("Failed to initialize the robot");
        }
    }

    MainController() {
        try {
            addListener();
        } catch (NativeHookException e) {
            logger.severe("Failed to add the listener");
            System.exit(1);
        }
    }

    private void addListener() throws NativeHookException {
        // Activate the library
        GlobalScreen.registerNativeHook();
        //Add Listener to the board
        GlobalScreen.addNativeKeyListener(new KeyListener());
    }

    public static Robot getRobot() {
        return robot;
    }
}




