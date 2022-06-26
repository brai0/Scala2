import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

object main {
	def main (args: Array[String] ):Unit = {
	var numArray =new ArrayBuffer[Int] ()
	 println("Enter number of elements")
	val n= scala.io.StdIn.readInt()
	println("Enter numbers")
	for (i <- 1 to n)
		numArray += scala.io.StdIn.readInt()
		println(numArray)
		
		val t= minmax(numArray)
		
		println("Maximum Number is ",t._1)
		
		println("Minimum Number is ",t._2)
	
}

	def minmax(numArray: ArrayBuffer[Int]): (Int,Int)={
		var max:Int= -999
		var min:Int=999
		for(i <- numArray){
		if(i<min) min=i
		if(i>max) max=i
		}
		(max,min)
	}
}
