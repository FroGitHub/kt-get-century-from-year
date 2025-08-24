package mate.academy

fun getCentury(year: Int) : Int {
    return year / 100 + if (year % 100 == 0) 0 else 1
}
