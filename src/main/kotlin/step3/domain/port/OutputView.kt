package step3.domain.port

import step3.domain.CarName
import step3.domain.CurrentCarStatus

interface OutputView {
    fun showResultTitle()
    fun showStatus(carStatuses: List<CurrentCarStatus>)
    fun showWinner(winnerNames: List<CarName>)
}
