package com.github.preston;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder().setToken("NzI5MjA2OTA4NDY0MDA1MTUw.XwFl-Q.Ry4p4DaFCHHfCA0mvmca7ujGLSw").login().join();
        System.out.println("Logged in!");
    }

}