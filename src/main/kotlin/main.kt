//Представим, что за переводы с любых карт комиссия составляет 0.75 %, минимум 35 рублей
val commission = 0.75
val minCommission = 35

//в переменной amount хранится сумма перевода в рублях
var amount = 10500

//Ваше приложение должно высчитывать комиссию,
// которую заплатит пользователь при переводе. Комиссия должна быть в рублях

fun main() {
    var resultCommission = if (amount * commission / 100 < 35) 35 else amount * commission / 100

    println(resultCommission)
}