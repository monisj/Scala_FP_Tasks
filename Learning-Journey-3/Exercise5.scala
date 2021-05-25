object TypicalFSM {

  sealed trait State
  final class State1 extends State
  final class State2 extends State

  sealed trait Message
  case class Message1(s: String) extends Message
  case class Message2(s: String) extends Message

  sealed trait ResultMessage
  object ResultMessage1 extends ResultMessage
  object ResultMessage2 extends ResultMessage
}

import TypicalFSM._

case class Transformation[M <: Message, From <: State, To <: State](
    f:M => Seq[ResultMessage]) {

  def apply(m:M) = f(m)
}

object Transformation {

  implicit def `message1 in state1` =
    Transformation[Message1, State1, State2] { m =>
      Seq(ResultMessage1, ResultMessage2)
    }

  implicit def `message1 in state2` =
    Transformation[Message1, State2, State2] { m =>
      Seq(ResultMessage1)
    }

  implicit def `message2 in state2` =
    Transformation[Message2, State2, State1] { m =>
      Seq(ResultMessage2)
    }
}

class TypicalFSM[CurrentState <: State] {

  def apply[M <: Message, NewState <: State](message: M)(
    implicit transformWith: Transformation[M, CurrentState, NewState]) = {

    this.asInstanceOf[TypicalFSM[NewState]] -> transformWith(message)
  }
}

object Exercise5{
    
    def main(args: Array[String]):Unit =  {
        val s1 = new TypicalFSM[State1]
        val (s2, r1) = s1(Message1("m1"))
        val (s3, r2) = s2(Message1("m1"))
        val (s4, r3) = s2(Message2("m2"))
        println(s"${r1}")
        println(s"${r2}")
        println(s"${r3}")
}
}