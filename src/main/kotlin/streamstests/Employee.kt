package streamstests

class Employee {

    var name : String?=null
    var nationalId : String?=null
    var id: Int?=null
     var sex: Boolean = false

    override fun toString(): String {
        return name+" / "+id.toString()
    }
}
class Empmap{
    var studentName: String?=null
    var id: Int?=null
}
fun main() {

    var emp = Employee()

    emp.let {
        it.name="ahmed"
        it.id=1
        it.nationalId="125452"
    }

    var emp2 = Employee()

    emp2.let {
        it.name="ali"
        it.id=2
        it.nationalId="125452"
    }
   println("${emp.id} / ${emp2.id}")

    var employees : List<Employee> = listOf(emp , emp2)

    var areFound :Boolean = employees.any{it.id==4}
    employees.forEach{
        println(it.name)
    }
   var empFilter : List<Employee> =  employees.filter { s -> s.name?.startsWith("a")!! }
    empFilter.forEach{
       println(it.name)
    }
println("fooooooooooooooooooooooooooor")
    employees.filter { s -> s.id == 1 }.forEach {
        println(it.toString())
    }




    var month: List<String> = arrayListOf("January", "February", "March")
// to get the result as list
    var monthList: List<String> = month.filter { s -> s == "January" }

    println(monthList)
// to get a string
    //var selectedMonth: String = month.filter { s -> s == "January" }.single()

    fun Employee.mapperEmp() : Empmap = Empmap().apply {
        name = this@mapperEmp.name
        nationalId = this@mapperEmp.nationalId
    }
 fun  List<Employee>.mapToEmpmap() : List<Empmap> = this.map { it.mapperEmp() }.toList()

    employees.mapToEmpmap().forEach {
        println("${it.id} ${it.studentName}")
    }

    println( employees.any{it.sex== true})
}