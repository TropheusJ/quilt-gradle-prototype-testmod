package org.quiltmc.quilt_gradle_testmod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.main.Main;

public class Test {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>(List.of(args));
            list.add("--accessToken");
            list.add("invalid");
            list.add("--version");
            list.add("1.20.4");
            Main.main(list.toArray(String[]::new));
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
