class Car(var weight: Double, var size: Int, var litrs: Int,
          val color: String,val marka: String, val model: String, val country: String ) {

    var newCar: Boolean = true
    get() {
        return weight > size
    }
    set(value) {
        if (value){
            print("Машина новая")
        }
        else {
            print("Машина не является новой")
        }
        field = value
    }
    var strana: Boolean = true
        get() {
            return country != "Россия"
        }
        set(value) {
            if (value){
                print("Это иномарка")
            }
            else {
                print("Это отечественная машина")
            }
            field = value
        }
    var benzin: Boolean = true
        get() {
            return litrs != 0
        }
        set(value) {
            if (value){
                print("В машине есть бензин")
            }
            else {
                print("Бензина нет")
            }
            field = value
        }
    var peregruzka: Boolean = true
        get() {
            return weight > size
        }
        set(value) {
            if (value){
                print("Машина перегружена, движение затруднено")
            }
            else {
                print("Машина готова начать движение")
            }
            field = value
        }
    var polnyi: Boolean = true
        get() {
            return litrs == 40
        }
        set(value) {
            if (value){
                print("Полный бак бензина")
            }
            else {
                print("Не полный бак бензина")
            }
            field = value
        }
}