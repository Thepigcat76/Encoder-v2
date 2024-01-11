package com.pigcat;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@Saved
public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    @interface Test {
    }
}
