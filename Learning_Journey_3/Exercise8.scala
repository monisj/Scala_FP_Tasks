/*import chisel3._
import chisel3.util._
import chisel3.experimental.{BaseModule}

trait ModuleIO {
    def in1:UInt
    def in2:UInt
    def in3:UInt
    def in4:UInt
    def out1:UInt
    def out2:UInt
}

class Add extends RawModule with ModuleIO {
    val in1 =IO(Input(UInt(8.W)))
    val in2 =IO(Input(UInt(8.W)))
    val in3 =IO(Input(UInt(8.W)))
    val in4 =IO(Input(UInt(8.W)))
    val out1 =IO(Output(UInt(8.W)))
    val out2 =IO(Output(UInt(8.W)))

    out:=in1+in2
    out1:=in3+in4
}

class Sub extends RawModule with ModuleIO {
    val in1 =IO(Input(UInt(8.W)))
    val in2 =IO(Input(UInt(8.W)))
    val in3 =IO(Input(UInt(8.W)))
    val in4 =IO(Input(UInt(8.W)))
    val out1 =IO(Output(UInt(8.W)))
    val out2 =IO(Output(UInt(8.W)))

    out:=in1-in2
    out1:=in3-in4
}

class Top[T <: BaseModule with ModuleIO] (genT: =>T) extends Module{
    val io = IO(new Bundle{
        val in1=Input(UInt(8.W))
        val in2=Input(UInt(8.W))
        val in3=Input(UInt(8.W))
        val in4=Input(UInt(8.W))
        val out=Output(UInt(8.W))
        val out1=Output(UInt(8.W))
    })
    val sub_Module = Module(genT)
    io.out:=sub_Module.out
    io.out1:=sub_Module.out1

    sub_Module.in1:=io.in1
    sub_Module.in1:=io.in2
    sub_Module.in1:=io.in3
    sub_Module.in1:=io.in4
}*/ //Disabled As scala SBT will conflict for chisel sbt

