package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MyClass {
    ClassType type;

    public enum ClassType{
        CLASS_A, CLASS_B
    }
}
