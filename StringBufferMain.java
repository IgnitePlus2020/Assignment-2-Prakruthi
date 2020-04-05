package com.tgt.igniteplus;
//Basic string functions
public class StringBufferMain {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("The world is in a pandemic!");
        System.out.println(buffer.toString());
        buffer.delete(5, 11);
        System.out.println(buffer.toString());
        buffer.deleteCharAt(5);
        System.out.println(buffer.toString());
        buffer.insert(0, "Now, ");
        System.out.println(buffer.toString());
        StringBuffer newBuffer = new StringBuffer("The world is in a pandemic. Oh no!");
        System.out.println("Index of 'world': " + newBuffer.indexOf("world"));
        newBuffer.replace(0, 4, "In 2020, ");
        System.out.println(newBuffer.toString());
        newBuffer.setCharAt(newBuffer.length() - 1, '?');
        System.out.println(newBuffer.toString());
        newBuffer.reverse();
        System.out.println(newBuffer.toString());
    }

}