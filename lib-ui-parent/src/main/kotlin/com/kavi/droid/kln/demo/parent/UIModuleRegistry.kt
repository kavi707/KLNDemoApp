package com.kavi.droid.kln.demo.parent

class UIModuleRegistry {

    private val moduleRegistry = mutableMapOf<String, UIModuleContract>()

    companion object {
        private var uiModuleRegistry: UIModuleRegistry? = null

        fun getModuleRegistry(): UIModuleRegistry {
            uiModuleRegistry?.let {
                return it
            } ?: run {
                uiModuleRegistry = UIModuleRegistry()
                return uiModuleRegistry!!
            }
        }
    }

    fun registerUIModule(name: String, module: UIModuleContract) {
        moduleRegistry[name] = module
    }

    fun getUIModule(name: String): UIModuleContract? {
        return moduleRegistry[name]
    }
}