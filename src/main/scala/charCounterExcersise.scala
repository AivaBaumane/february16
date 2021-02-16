import scala.io.StdIn.readLine

object charCounterExcersise extends App {
  //TODO ask user to enter a sentence
  //TODO calculate and save character frequency into a Map
  //you can use mutable and/or immutable Map
  //print out this map with character frequencies
  //so your Map most likely will be of type [Char,Int]
  //also i think getOrElseUpdate method will be helpful
  val sentence = readLine("Enter a sentence here: ")
  val map = collection.mutable.Map.empty[Char, Int]
  for (simb <- sentence) {
    if (map.contains(simb))
      map(simb) = map(simb) + 1
    else
      map.+=((simb, 1))
  }
  println(map)




}
