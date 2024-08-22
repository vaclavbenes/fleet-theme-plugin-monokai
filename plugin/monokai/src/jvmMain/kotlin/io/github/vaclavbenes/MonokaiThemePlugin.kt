package io.github.vaclavbenes

import fleet.dock.api.ThemeId
import fleet.frontend.theme.registerTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class MonokaiThemePlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = MonokaiThemePlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        registerTheme(ThemeId(id = "monokai.basic.theme"))
    }
}
