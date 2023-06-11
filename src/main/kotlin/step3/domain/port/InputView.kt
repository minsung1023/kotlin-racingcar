package step3.domain.port

import step3.domain.RacingRequirement

interface InputView {
    fun askRequirement(): RacingRequirement
}
