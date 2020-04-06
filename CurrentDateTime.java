package com.tgt.igniteplus;
import java.time.LocalDateTime;
// Displays current date and time
public class CurrentDateTime
{

    public static void main(String[] args)
    {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }
}