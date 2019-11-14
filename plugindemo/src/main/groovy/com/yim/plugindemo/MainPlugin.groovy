package com.yim.plugindemo
import org.gradle.api.Plugin
import org.gradle.api.Project

class MainPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        System.println("====")
        System.println("Hello World!")
        System.println("====")
    }
}