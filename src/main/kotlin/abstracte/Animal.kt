package abstracte

abstract class Animal {
     var sn:String?=null
          set(value) {
               field = if(value!!.startsWith("SN-"))
                    value
               else
                    "SN-$value"
          }
     var name:String?=null
     abstract var averageAge:Int

     abstract fun animalSound()
}