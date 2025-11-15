package com.kavi.droid.kln.demo.parent

import javax.inject.Inject
import javax.inject.Singleton

/**
 * This is a common module registry
 */
@Singleton
class UIModuleRegistry @Inject constructor() {

    private val moduleRegistry = mutableMapOf<String, UIModuleContract>()

    fun registerUIModule(name: String, module: UIModuleContract) {
        moduleRegistry[name] = module
    }

    fun getUIModule(name: String): UIModuleContract? {
        return moduleRegistry[name]
    }
}