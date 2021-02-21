package com.github.ohadshiffer.plugintemplate.services

import com.github.ohadshiffer.plugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
