package com.peterbucko.easy.dependencies

data class LibDependency(val configurationName: String, val dependency: String)

open class Lib(
    val name: String,
    val classPath: String = "",
    val plugins: List<String> = emptyList(),
    val dependencies: MutableList<LibDependency> = mutableListOf<LibDependency>(),
    val dependsOn: List<Lib> = emptyList()
)
