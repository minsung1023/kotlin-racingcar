package step3.test

import step3.CarName

internal fun String.toCarName(): CarName {
    return CarName(this)
}
