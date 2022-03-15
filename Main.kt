fun main(){

    val car1 = Car(755.5, 800, 40, "Black", "Lada", "ВАЗ 2112", "Россия" )
    val car2 = Car(760.7, 900, 40, "White", "Toyota", "Camry", "Япония" )
    val car3 = Car(800.5, 950, 40, "Blue", "Mercedes", "Maybach", "Германия" )
    print("Вес: ")
    println(car1.weight)
    print("Размер: ")
    println(car1.size)
    print("Объем в литрах: ")
    println(car1.litrs)
    print("Цвет: ")
    println(car1.color)
    print("Марка: ")
    println(car1.marka)
    print("Модель: ")
    println(car1.model)
    print("Страна изготовитель: ")
    println(car1.country)

    car1.newCar = true
    println()
    car1.strana = false
    println()
    car1.benzin = true
    println()
    car1.peregruzka = false
    println()
    car1.polnyi = false
    println("\n")


    print("Вес: ")
    println(car2.weight)
    print("Размер: ")
    println(car2.size)
    print("Объем в литрах: ")
    println(car2.litrs)
    print("Цвет: ")
    println(car2.color)
    print("Марка: ")
    println(car2.marka)
    print("Модель: ")
    println(car2.model)
    print("Страна изготовитель: ")
    println(car2.country)

    car2.newCar = true
    println()
    car2.strana = true
    println()
    car2.benzin = true
    println()
    car2.peregruzka = false
    println()
    car2.polnyi = false
    println("\n")


    print("Вес: ")
    println(car3.weight)
    print("Размер: ")
    println(car3.size)
    print("Объем в литрах: ")
    println(car3.litrs)
    print("Цвет: ")
    println(car3.color)
    print("Марка: ")
    println(car3.marka)
    print("Модель: ")
    println(car3.model)
    print("Страна изготовитель: ")
    println(car3.country)

    car3.newCar = true
    println()
    car3.strana = true
    println()
    car3.benzin = true
    println()
    car3.peregruzka = false
    println()
    car3.polnyi = false
}