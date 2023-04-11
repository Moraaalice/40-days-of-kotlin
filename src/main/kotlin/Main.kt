fun main(){
    //we come call the vowel
    vowels("alicia")
    //calling the function that prints all even numbers
    even(10)
    //
    numbArray()
   var add  =  numArray(arrayOf(12,34,56,67,89,90))
    println(add)
    //
    reverseArr()
    arr()
    //
    negNumb(arrayOf(-2,-3,7,8,59,-56,67))
    //
    val x = numLength(arrayOf("Nigeria","Kenya","Ghana","DRC","Zambia"))
    println(x.contentToString())
    //
    var even = even(arrayOf(12,67,89,60,36,17,3,1))
    println(even.contentToString())
    //
    var greats = greater(arrayOf(12,-4,-5,2,17,15,1,4,5))
    println(greats)
    //
    var human = Human("Alice Moraa",23,58.0)
    human.eat(3)
    human.speak("I love kotlin")
    human.birthday()
    human.weight
    //
    var phone = Phone(true)
    phone.switchOff()
    phone.switchOn()
    phone.checkScreenLight()
    //
    var fold = Foldable(true)
    fold.phoneFolded()
    fold.phoneNotFolded()
    //
    var person = Person("Alice",23,"0759547300","writing","Linda")
    person.showProfile()
}
//This questions are good for practising kotlin
//Day1
//1.Return the number of vowels in a string
fun vowels(name:String){
    var names = arrayOf('a','e','i','o','u')
    var names2 = names.filter { it in name}
    println(names2)
}
//2.Create a function that prints all even numbers from 0 – 10
fun even(evenNum:Int){
    for (num in 1..10)
        if (num %2==0){
            println(num)
    }
}
//3.Print a table containing multiplication tables from 1-10

//4.Calculate the sum of numbers within an array
//This can be done in the following two ways
fun numbArray(){
    var numAr = arrayOf(12,34,56,67,89,90)
    var numAr2 = numAr.sum()
    println(numAr2)
}
fun numArray(num2:Array<Int>){
    var add = 0
    for (n in num2){
        add+=n
    }
}
//5.Create a function that reverses an array
fun reverseArr (){
    var rever = arrayOf("Alice","Joy","Jemima","Jeff")
    var rever2 = rever.reverse()
    println(rever)
}
//6.Sort an array from lowest to highest
fun arr(){
    var numArr = arrayOf(121,44,96,67,89,930)
    var numArr2 = numArr.sortedArray().contentToString()
    //.content to string sorts the arrays from the lowest to the highest
    println(numArr2)
}
//7.Create a function that filters out negative numbers
fun negNumb(neg:Array<Int>){
    //filtering all numbers that are negative
    var negative = neg.filter { n -> n < 0}
    println(negative)
}
//8. Given an array of strings, return a new array that only includes
// those that are 5 characters or fewer in length

fun numLength(countries:Array<String>): Array<String> {
    var country = arrayOf<String>()
    for (p in countries) {
        if (p.length <= 5) {
            country += p
        }

    }
    return country
}
//DAY TWO

//9.Given an array of numbers, return a new array that only includes the even numbers.
fun even(evenOnly:Array<Int>): Array<Int> {
    var eveNum = arrayOf<Int>()
    for (e in evenOnly){
        if (e%2==0)
            eveNum += e
    }
    return eveNum
}
//10.Given an array of numbers, return a new array that has only the numbers that are 5 or greater.
fun greater(great:Array<Int>): Array<Int> {
    var gNumb = arrayOf<Int>()
    for (g in great){
        if (g>=5)
            gNumb += g
    }
    return gNumb
}
//11. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//speak(speech: String) :Prints the string passed to it
//birthday( ) :Increments the human’s age by 1
//Create an instance of this human class and invoke all its functions
class Human (var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        var statement = "I am eating $foodWeight kgs of food"
        weight+=foodWeight
        println(statement)
        println(weight)
    }
    fun speak (speech : String){
        var speaking = speech
        println(speaking)
    }
    fun birthday(){
        age ++
        println(age)
    }
}
//Typically, a phone screen turns on and off when the power button is pressed. In contrast, if a foldable phone is folded, the main inner screen on a foldable phone doesn't turn on when the power button is pressed.
//
//In the initial code provided in the following code snippet, write a FoldablePhone class that inherits from the Phone class. It should contain the following:
//
//A property that indicates whether the phone is folded.
//A different switchOn() function behavior than the Phone class so that it only turns the screen on when the phone isn't folded.
//Methods to change the folding state.

open class Phone(var screenIsOn:Boolean){
    open fun switchOn(){
          screenIsOn = true
    }
    fun switchOff(){
         screenIsOn = false
    }
     fun checkScreenLight(){
        if (screenIsOn == true)
            println("The phone screen is on")
        else
            println("The phone screen is off")
    }
}
class Foldable (screenIsOn: Boolean ):Phone(screenIsOn){
    override fun switchOn() {
        if (screenIsOn){
            println("phone is not folded")
        }
        else
            println("phone is folded")
    }
    fun phoneFolded(){
        println("phone is folded")
    }
    fun phoneNotFolded(){
        println("phone is not folded")
    }
}
//Oftentimes, you're required to complete profiles for online websites that contain mandatory and non-mandatory fields. For example, you can add your personal information and link to other people who referred you to sign up for the profile.
//
//In the initial code provided in the following code snippet, write a program which prints out a person's profile details.
class Person(var name:String,var age:Int,var phoneNumber:String,var hobby:String,var referee:String){
    fun showProfile(){
        var profile = "Name:$name\n Age:$age\n Likes to play tennis does not have a referre"
        println(profile)
    }
}