package enumClass

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar


fun main() {
//    println(Days.SATUERDAY.name)
//    println(Days.SATUERDAY.ordinal)
//
//    for(days in Days.values()){
//        println("${days.ordinal} : ${days.name} is WeekEnd -> ${days.isWeekEnd}")
//    }
//   for(color in Color.values()){
//       println("color $color : ${color.code}")
//   }
//
//
//    val col = List<Color>(4)

    val cal = GregorianCalendar()
    cal.time = Date()
    val xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal)
    //val date = xCal.toGregorianCalendar().add(Calendar.DAY_OF_YEAR, 30)
    val date = xCal.toGregorianCalendar().time

    println(date)
    val df: DateFormat = SimpleDateFormat("dd MMM yyyy")
    val formattedString = df.format(date)
    println(formattedString)

    var date2  = Date()
    val df2 : DateFormat = SimpleDateFormat("dd MMM yyyy")
    var c1 = Calendar.getInstance()
    val currentDate = df2.format(date2)
    println(currentDate)

    c1.add(Calendar.DAY_OF_YEAR, 90)
    var resultDate = c1.time
    val dueDate = df2.format(resultDate)
    println(dueDate)

    println(Locale.getDefault().displayLanguage)

    val localDate = LocalDate.of(2019 , 10 , 2)
    val xml = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
    val dater = xml.toGregorianCalendar().time
    val dfr = SimpleDateFormat("dd MMM yyyy")
    val sdf = SimpleDateFormat("yyyy-MM-dd");
    val formattedStringr = sdf.format(dater)
    val calo: Calendar = Calendar.getInstance();
    calo.time = sdf.parse(formattedStringr)
    calo.add(Calendar.DAY_OF_MONTH, 90)
println("///////////////////////////////////////////")
    val due = dfr.format(calo.time)
    println(due)

}