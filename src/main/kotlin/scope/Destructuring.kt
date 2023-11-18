package scope

import java.awt.Color

class Destructuring {
    // Bad case
    fun updateWeather(degrees: Int) {
        val description: String
        val color: Int
        if (degrees < 5) {
            description = "cold"
            color = Color.BLUE.rgb
        } else if ( degrees < 23) {
            description = "mild"
            color = Color.YELLOW.rgb
        } else {
            description = "hot"
            color = Color.RED.rgb
        }
        // ...
    }

    // Good case
    fun updateWeatherGood(degrees: Int) {
        val (description, color) = when {
            degrees < 5 -> "cold" to Color.BLUE.rgb
            degrees < 23 -> "mild" to Color.YELLOW
            else -> "hot" to Color.RED
        }

        println("$description , $color")
        // ...
    }
}

fun main() {
    Destructuring().updateWeatherGood(23)
}