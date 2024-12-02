plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.4.0"

fleetPlugin {
     id = "monokai.basic.theme"
     metadata {
         readableName = "Monokai Basic"
         description = "Classic monokai theme from vscode"
     }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
