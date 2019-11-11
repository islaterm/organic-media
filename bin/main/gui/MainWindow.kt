package gui

import tornadofx.*

/**
 * Main window of the application
 *
 * @author [Ignacio Slater Muñoz](islaterm@gmail.com)
 */
class MainWindow : View() {
    override val root = form {
        hbox(20) {
            fieldset("Movie") {
                field("Directory") { textfield() }
                field("Title") { textfield() }
                field("Year") { textfield() }
                    field("Language") { textfield() }
                    field("Field l2b") { textfield() }

            }
            fieldset("Right FieldSet") {
                hbox(20) {
                    vbox {
                        field("Field r1a") { textfield() }
                        field("Field r2a") { textfield() }
                    }
                    vbox {
                        field("Field r1b") { textfield() }
                        field("Field r2b") { textfield() }
                    }
                }
            }
        }
    }
}