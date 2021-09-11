package com.peterbucko.easy.dependencies

import org.gradle.api.Plugin
import org.gradle.api.Project

class EasyDependenciesPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        println("EasyDependenciesPlugin plugin apply() called")
        val easyDependencies: EasyDependencies = project.extensions.create(
                "EasyDependencies", EasyDependencies::class.java
        )
        easyDependencies.setProject(project)
    }
}