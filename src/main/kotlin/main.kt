fun main() {
    var sum: Int = 40000_00
    var accountType: String = "Master Card"
    var monthTransactions: Int = 76000_00
    print(commissionCount(sum, accountType, monthTransactions))

}

fun commissionCount(sum: Int, accountType: String = "vkPay", monthTransactions: Int = 0): Int {
    val commission = when (accountType) {
        "Master Card" -> if (monthTransactions < 75000_00) {
            0

        } else
            sum * 0.6 * 0.01 + 20_00
        "Maestro" -> if (monthTransactions < 75000_00) {
            0

        } else
            sum * 0.6 * 0.01 + 20_00
        "Visa" -> if ((sum * 0.75 * 0.01) > 35_00)
            (sum * 0.75 * 0.01)
        else 35_00
        "МИР" -> if ((sum * 0.75 * 0.01) > 35_00)
            (sum * 0.75 * 0.01)
        else 35_00
        else -> 0
    }

    return commission.toInt()
}