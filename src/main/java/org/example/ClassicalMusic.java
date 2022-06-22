package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Init method");
    }
    public void doMyDestroy(){
        System.out.println("Destroy method");
    }
    public String getSong(){
        return "Bah";
    }
}
