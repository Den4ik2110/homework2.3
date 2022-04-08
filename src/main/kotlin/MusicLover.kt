fun main() {
    val musicLover = true
    val totalAmount = 35400
    val amount = 3240

    println("Стоимость покупки - $amount ${endingRuble(amount)}")
    println("Общая сумма ваших покупок - $totalAmount ${endingRuble(totalAmount)}")

    if (totalAmount >= 10001) {
        val discount = 5
        val discountPrice = amount * (100 - discount) / 100
        println("Вам положена скидка 5% \n" +
                "После применения скидки - $discountPrice ${endingRuble(discountPrice)}")
        musicLoverCheck(musicLover, discountPrice)
    } else if (totalAmount >= 1001) {
        val discount = 100
        val discountPrice = amount - discount
        println("Вам положена скидка 100 рублей \n" +
                "После применения скидки - $discountPrice ${endingRuble(discountPrice)}")
        musicLoverCheck(musicLover, discountPrice)
    } else {
        println("Для получения накопительной скидки совершите покупки на общую сумму более 1000 рублей")
        musicLoverCheck(musicLover, amount)
    }

    print("Спасибо за покупку!")
}

fun musicLoverCheck(status: Boolean, amount: Int) {
    val percent = 99
    if (status == true) {
        val discountPrice = amount * percent / 100
        println("Вам положена скидка `Меломан 1%` \n" +
                "После применения скидки - $discountPrice ${endingRuble(discountPrice)}")
    } else {
        println("Чтобы получить скидку `Меломан 1%` совершайте покупки ежемесячно")
    }
}

fun endingRuble(value: Int): String {
    if (value % 10 >= 5 || value % 10 == 0) {
        return "рублей"
    } else if (value % 10 >= 2) {
        return "рубля"
    } else {
        return "рубль"
    }
}