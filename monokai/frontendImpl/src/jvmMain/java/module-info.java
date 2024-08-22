module io.github.vaclavbenes {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports io.github.vaclavbenes;
    provides fleet.kernel.plugins.Plugin with io.github.vaclavbenes.MonokaiThemePlugin;
}