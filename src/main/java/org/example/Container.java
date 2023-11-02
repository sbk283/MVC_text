package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Container {
    @Getter
    @Setter
    private static Scanner sc;

    public static void init() {
        sc = new Scanner(System.in);
    }

    public static void close() {
        sc.close();
    }
}
