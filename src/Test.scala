import java.text.SimpleDateFormat


object Test {

  def main(args: Array[String]) {
    val date = "10.05.2016[10:50]";
    println(validateDate(date))
  }

  def validateDate(date: String) = try {
    val df = new SimpleDateFormat("dd/MM/yyyy")
    df.setLenient(false)
    df.parse(date)
    true
    print("true")
  } catch {
    case e: IllegalArgumentException => false
  }


}