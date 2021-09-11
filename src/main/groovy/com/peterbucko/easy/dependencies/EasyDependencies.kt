package com.peterbucko.easy.dependencies

import org.gradle.api.Project

class EasyDependencies {

    private lateinit var project: Project

    fun use(lib: Lib) {
        //project.configureClassPaths(lib.classPaths)
        project.configurePlugins(lib.plugins)
        project.configureDependencies(lib.dependencies)
    }

    internal fun setProject(project: Project) {
        this.project = project
    }

//    internal fun Project.configureClassPaths(classPaths: List<String>) {
//        println("UseThisLib plugin is adding ${classPaths.size} items to classPath")
//        project.buildscript.dependencies.apply {
//            classPaths.forEach {
//                this.add("classpath", it)
//            }
//        }
//    }

    private fun Project.configurePlugins(addPlugins: List<String>) {
        println("UseThisLib plugin is adding ${addPlugins.size} items to plugin")
        addPlugins.forEach{
            plugins.apply(it)
        }
    }

    private fun Project.configureDependencies(addDependencies: List<LibDependency>) {
        addDependencies.forEach{
            dependencies.add(it.configurationName, it.dependency)
        }
    }

}