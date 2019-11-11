package app

import gui.MainWindow
import tornadofx.App
import tornadofx.launch

fun main() {
    launch<OrganikMedia>()
}

/**
 * Application to organize media files
 */
class OrganikMedia: App(MainWindow::class)