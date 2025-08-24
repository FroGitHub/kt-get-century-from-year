package mate.academy

const val YEARS_IN_CENTURY = 100
const val NO_EXTRA_CENTURY = 0
const val NEXT_CENTURY = 1

fun getCentury(year: Int) : Int {
    return year / YEARS_IN_CENTURY +
            if (year % YEARS_IN_CENTURY == 0) NO_EXTRA_CENTURY else NEXT_CENTURY
}
