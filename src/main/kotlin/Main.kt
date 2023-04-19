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
    var person = Person("Alice",23,"0759547300","write","Linda")
    var person2 = Person("Joy",28,"0708455032","playing fottball","Iregi")
    person.showProfile()
    println("Name:${person.name}")
    println("Age:${person.age}")
    println("Likes to ${person.hobby}")
    //
    println("Name:${person2.name}")
    println("Age:${person2.age}")
    println("Likes ${person2.hobby}")
    //
    oddNumber()
    //
    var people = names(arrayOf("Alice Moraa","Joy","Jemimah","Jeff Chege","Maryann"))
    println(people)
    //
    newLine()
    //
    robot(4)
    robot(13)
    robot(20)
    //
    var take = takeIn(arrayOf(12,23,10,24,14,10))
    println(take)
    //
    takeStrings(arrayOf("10","20","23","34","19","13"))
    //
    var movie = movieTickets(11,"Wednesaday")
    println(movie)
    //
   takeString("Alice","Moraa","Ongongo","Dante")
    //
    city()
    //
    digit()
    //
    var names = names3("Alice","Mary","Dante",).contentToString()
    println(names)
    //
    year(2005)
    //
    var str = inString("Akirachix")
    println(str.reversed())
    //
    var reverse = reverseArr(arrayOf("Alice","Mary","Dante"))
    println(reverse.reverse())
    //
    intArray(arrayOf(2,4,3,1,0,5,10,11))
    //
    var naming = name("alice")
    println(naming)
    //
    var check = checkVowel("Alice moraa")
    println(check)
    //
    var count = countVowels("dante")
    println(count)
    //
}
//This questions are good for practising kotlin
//Day1
//Return the number of vowels in a string
fun vowels(name:String){
    var names = arrayOf('a','e','i','o','u')
    var names2 = names.filter { it in name}
    println(names2)
}
//Create a function that prints all even numbers from 0 – 10
fun even(evenNum:Int){
    for (num in 1..10)
        if (num %2==0){
            println(num)
    }
}
//Print a table containing multiplication tables from 1-10

//Calculate the sum of numbers within an array
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
//Day2
//Create a function that reverses an array
fun reverseArr(arr:Array<String>):Array<String>{
    if (arr.isEmpty()){
    }
    return arr
}
//Sort an array from lowest to highest
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
//Day3
//Given an array of strings, return a new array that only includes
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
//Given an array of numbers, return a new array that has only the numbers that are 5 or greater.
fun greater(great:Array<Int>): Array<Int> {
    var gNumb = arrayOf<Int>()
    for (g in great){
        if (g>=5)
            gNumb += g
    }
    return gNumb
}
//DAY4
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
//12.Typically, a phone screen turns on and off when the power button is pressed. In contrast, if a foldable phone is folded, the main inner screen on a foldable phone doesn't turn on when the power button is pressed.
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
//DAY5
//13.Oftentimes, you're required to complete profiles for online websites that contain mandatory and non-mandatory fields. For example, you can add your personal information and link to other people who referred you to sign up for the profile.
//
//In the initial code provided in the following code snippet, write a program which prints out a person's profile details.
class Person(var name:String,var age:Int,var phoneNumber:String,var hobby:String,var referee:String){
    fun showProfile(){
    }
}
//
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumber(){
    for (n in 1..100)
        if (n%2 !=0){
            println(n)
        }
}
//15.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun names(naming:Array<String>):Int{
    var add = 0
    for (a in naming){
        if (a.length>5){
            add++
        }
    }
    return add
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun newLine(){
    for (l in 1..100)
        if (l%3==0&&l%5==0){
            println("FizzBuzz")
        }
    else if (l%3==0){
        println("Fizz")
        }
    else if (l%5==0){
        println("Buzz")
        }
}
//
fun robot(age: Int){
        if (age in 1..5){
            println("milk")
    }
    else if (age in 6..14){
        println("fanta orange")
    }
    else
        println("cocacola")
    }
//DAY6
//Write a function that takes in an array of numbers and returns an array that has all
//elements multiplied by 4.
fun takeIn(nums:Array<Int>):Array<Int>{
    var numing = arrayOf<Int>()
    var product = 1
    for (n in nums){
        product+=n*4
    }
    return nums
}
//Write a function that takes in an array of strings and returns an array with every element
//turned into a number
fun takeStrings(tstrings:Array<String>){
    for (t in tstrings){
        t.toInt()
        println(t)
    }
}
//Movie tickets are typically priced differently based on the age of moviegoers.
//A children's ticket price of $15 for people 12 years old or younger.
//A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
//A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
//A  -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
//Write a Kotlin program to calculate the age-based ticket prices.
fun movieTickets(age: Int,day:String):Int{
  return when(age){
      in 0..11 -> (15)
      in 12..60-> if (day=="Monday") 25 else 30
      in 61..100 -> (20)
      else -> (-1)
  }  }
//Given years between 2000 and 2023, console all the leap years in the following
//sentence, i.e “2020 is a leap year” if not console log i.e “2001 is not a leap year”
fun year(leap:Int){
    for (l in 2000..2023){
        if (l%4==0){
            println("This is a leap year")
        }
        else if(l%4!=0){
            println("This is not a leap year")
        }
    }

}

//DAY7
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun takeString(str1:String,str2:String,str3:String,str4:String){
    var convert = arrayOf(str1,str2,str3,str4).contentToString()
    println(convert)
}
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun city(){
    var cities = arrayOf("harare","mumbai", "dodoma", "jakarta")
    var cities2 = cities.sortedArray().contentToString()
    println(cities2)
}
fun digit(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[5]+numbers[2]
    println(sum)
    var number2 = numbers.indexOf(158)
    println(number2)
    var number3 = numbers.sortedArray().contentToString()
    println(number3)
}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names3(nam:String,nam2:String,nam3:String):Array<String>{
    return arrayOf(nam,nam2,nam3)

}
//DAY 8
//Write a function that takes a string as input and returns the string in reverse order.
fun inString(school:String):String{
    if (school.isEmpty()){
    }
    return school
}
//Write a function that takes an array of integers as input and returns the second largest number.
fun arrInt(intArr:Array<Int>){

}
//Write a function that takes an array of integers as input and returns the sum of all even numbers.
fun intArray(arrInt:Array<Int>){
    var x = 0
    for (a in arrInt){
        if (a%2==0){
            x+=a
            println(x)
        }
    }
}
//
//Write a Kotlin function that accepts a string as a parameter, counts and returns the number of vowels within the string.
fun name(word:String):List<Char>{
    var vowels = arrayOf('a','e','i','o','u')
    var vowel = vowels.filter{ it in word}
    vowel.count()
    return vowel
}
fun checkVowel(str:String):Int{
    var count = 0
    for (c in str){
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            count++
        }
    }
    return count
}
fun countVowels(count:String):Int{
    var vowel = arrayOf('a','e','i','o','u')
    return count.count { it in vowel }
}

