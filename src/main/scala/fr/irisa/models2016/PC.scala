package fr.irisa.models2016

import com.github.tototoshi.csv.CSVReader

/**
  * Created by gbecan on 09/12/15.
  */
object PC extends App {

  val csvReader = CSVReader.open("/home/gbecan/Documents/dev/MODELS16/MODELS_Foundation_PC.csv")

  for (line <- csvReader) {
    val firstName = line(0)
    val lastName = line(1)
    val keywords = line(2)
    val email = line(3)
    val website = line(4)
    val affiliation = line(5)
    val country = line(6)

    val code = <li><a href={website}>{firstName} {lastName}</a>, {affiliation} ({country})</li>

    println(code)
  }

  csvReader.close()

}
