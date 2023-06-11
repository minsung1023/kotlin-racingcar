package step3

import step3.domain.RacingManager
import step3.view.ConsoleInputView
import step3.view.ConsoleOutputView

fun main() {
    RacingManager(
        inputView = ConsoleInputView(),
        outputView = ConsoleOutputView()
    ).startRacing()
}
