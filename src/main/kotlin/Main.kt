fun main(args: Array<String>) {
    //******First Question******
    var number1 = 4.0
    var number2 = 2.0
    var op = '/'

    if (op == '*') {
        println("$number1 * $number2 + =${number1 * number2}")
    } else if (op == '+') {
        println("$number1 + $number2 = ${number1 + number2}")
    } else if (op == '-') {
        println("$number1 - $number2 = ${number1 - number2}")
    } else if (op == '%') {
        println("$number1 % $number2 = ${number1 % number2}")
    } else if (op == '/') {
        if (number2 != 0.0) {
            println("$number1 / $number2 = ${number1 / number2}")
        } else {
            println("Error.. you can not divide by 0")
        }
    }
    println("***************")
    println("***************")
    println("***************")

//*****Second Question*****
    var salary=10000.0
    var raise=0.0
    var rating=0
    var newSalary=0.0

    if(rating==1){
        raise=0.06
        newSalary= salary+(salary*raise)
        println("you will receive 6% and the new salary is:" + newSalary)}

    else if(rating==2){
        raise=0.04
        newSalary= salary+(salary*raise)
        println("you will receive 4% and the new salary is:" + newSalary)}

    else if(rating==3){
        raise=0.02
        newSalary= salary+(salary*raise)
        println("you will receive 2% and the new salary is:" + newSalary)}

    else{
        println("your rating is low")
    }
}

