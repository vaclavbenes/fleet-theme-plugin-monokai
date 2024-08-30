plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.3.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
     id = "monokai.basic.theme"

    // STEP 2: set up the sensible metadata for your plugin
     metadata {
         readableName = "Monokai Basic"
         description = "Classic monokai theme from vscode"
     }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
