package step3.domain

import step3.domain.port.InputView
import step3.domain.port.OutputView

class RacingManager(
    private val inputView: InputView,
    private val outputView: OutputView,
) {

    fun startRacing() {
        val requirement = inputView.askRequirement()

        val cars = arrangeCars(requirement)

        val racing = Racing(cars = cars)

        outputView.showResultTitle()
        repeat(requirement.numberOfTrials) {
            racing.race()
            outputView.showStatus(racing.currentStatus)
        }

        outputView.showWinner(racing.findCurrentWinnerNames())
    }

    private fun arrangeCars(requirement: RacingRequirement): List<Car> {
        return requirement.carNames.map { Car(ConditionalOperatingCarEngine.RANDOM, it) }
    }
}
