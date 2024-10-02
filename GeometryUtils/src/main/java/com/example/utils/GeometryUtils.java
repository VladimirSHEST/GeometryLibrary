package com.example.utils;

public class GeometryUtils {
    public static double convertToMeters(double value, String unit) {
        switch (unit) {
            case "cm":
                return value / 100;
            case "mm":
                return value / 1000;
            default:
                return value;
        }
    }
}
// добавил что-то