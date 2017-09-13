package app.impl.patterns.behavioral

object ChainofResponsibility extends App{
  case class Event(source:String)
  type EventHandler = PartialFunction[Event,Unit]
  val defaultHandler:EventHandler=PartialFunction(_=> println("no events found"))
  val kayboardHandler:EventHandler={
    case Event("keyboard") =>println("this is a key event")
  }
  def mouseHandler(delay:Int):EventHandler={
    case Event("mouse") => println("this is a mouse event with delay")
  }
  private val function= keyboardHandler.orElse(mouseHandler(100)).orElse(defaultHandler)
  function.apply(Event("mouse"))
  function.apply(Event("keyboard"))
  function.apply(Event(""))
}
