package activity_03_a

//Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah",
// "Anthony", "Henry".
//1. Create an ArrayList of names with 20 entries.
//2. Create a function "isStudentInRecord" that will accept a name and return true if the
//  name is found, otherwise false.
//3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
//4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
//5. Create a function "countStudent" that will return the size of the ArrayList.
//6. Create a function "searchStudentWildSearch" that will accept a String and search if
// that string is found with in the ArrayList, it will return an ArrayList of names that matched
// if there are.
//7. Create a function  "searchStudentName" that will accept a String and search if there is an
// exact match of the String input, it will return an ArrayList of names that matched if there are.
//8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch"
// if the String input is less than or equal to three, and it will call "searchStudentName" if the
// String input is greater than three.
//9.  Create a function "showStudents" that will print all the entries in the ArrayList.

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger{}

fun main() {
    var names = arrayOf("James","Nikko","Pam","Lorie","Delight","Sancho","Norway","Willy",
    "Ruthchel","Rachel","Jacob","Reuben","Simeon","Levi","Judah","Gad","Asher","Dan","Naphtali",
        "Joseph")

    //accept a name and return true if the name is found, otherwise false.
    var name: String? = null
    logger.info{"Enter a Name: "}
    name = readLine().toString().lowercase()
    var newname = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    logger.info{ isStudentInRecord(names,newname) }

    //accept a name and add it to the ArrayList.
    var addName:String? = null
    logger.info { "Input a Name to be Added: " }
    addName = readLine().toString().lowercase()
    var newaddName = addName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    names = addStudent(names,newaddName)
    logger.info { names.contentToString() }

    //accept a name and remove it from the ArrayList.
    var removeName:String? = null
    logger.info { "Input a Name to be Remove: " }
    removeName = readLine().toString().lowercase()
    var newremoveName = removeName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    names = removeStudent(names, newremoveName)
    logger.info { names.contentToString() }

    //return the size of the ArrayList.
    countStudent(names)

    //accept a String and search if
    //that string is found with in the ArrayList, it will return an ArrayList of names that matched
    //if there are.
    var studentWildSearch: String? = null
    logger.info{"Input String to be Search: "}
    studentWildSearch = readLine().toString()
    searchStudentWildSearch(names,studentWildSearch)

    //accept a String and search if there is an
    //exact match of the String input, it will return an ArrayList of names that matched if there are.
    var studentSearchName: String? = null
    logger.info{"Input String to be Search: "}
    studentSearchName = readLine().toString()
    searchStudentName(names,studentSearchName)

    //function "searchStudent" that will accept a String and call "searchStudentWildSearch"
    //if the String input is less than or equal to three, and it will call "searchStudentName" if the
    //String input is greater than three.
    var searchStudentString: String? = null
    logger.info{"Input String to be Search: "}
    searchStudentString = readLine().toString()
    searchStudent(names,searchStudentString)

    //Create a function "showStudents" that will print all the entries in the ArrayList.
    showStudent(names)
}

fun isStudentInRecord(names:Array<String>, target: String):Boolean{
    return names.contains(target)
}

fun addStudent(add:Array<String>, element:String): Array<String> {
    val list: MutableList<String> = add.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun removeStudent(remove:Array<String>, element:String): Array<String> {
    val list: MutableList<String> = remove.toMutableList()
    list.remove(element)
    return list.toTypedArray()
}

fun countStudent(arr:Array<String>){
    val list: MutableList<String> = arr.toMutableList()
    logger.info {"Number of Names in List: ${arr.count()}"}
}

fun searchStudentWildSearch(mylist:Array<String>, target:String): Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target.lowercase() in mylist[index].lowercase()){
            hashList.add(mylist[index])
        }
        index++
    }
    logger.info{hashList}
    return hashList.toTypedArray()
}

fun searchStudentName(mylist:Array<String>, target: String):Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target == mylist[index]){
            hashList.add(mylist[index])
        }
        index++
    }
    logger.info{hashList}
    return hashList.toTypedArray()
}

fun searchStudent(mylist: Array<String>, target:String){
    if (target.length == 3 || target.length < 3 ){
        searchStudentWildSearch(mylist,target)
    }
    else if (target.length > 3){
        searchStudentName(mylist,target)
    }
}

fun showStudent(arr:Array<String>){
    logger.info { arr.joinToString(
        prefix = "[",
        separator = ",",
        postfix = "]",
        truncated = "...",
    ) }
}






