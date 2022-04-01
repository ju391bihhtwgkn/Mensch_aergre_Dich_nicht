class Player(name: String) {
  def this () {
    this("none")
  }
  override def toString:String = name
}

case class Cell(x:Int, y:Int, player:Player)

case class Field(cells: Array[Cell])

val cell0 = Cell(4,0,new Player())
val cell1 = Cell(4,1, new Player("green"))
val cell2 = Cell(4,2, new Player("red"))
val cell3 = Cell(4,3,new Player())
val cell4 = Cell(4,4,new Player())
val cell5 = Cell(3,4,new Player())
val cell6 = Cell(2,4,new Player())

val field1 = Field(Array.ofDim[Cell](40))
field1.cells(0)=cell0
field1.cells(1)=cell1
field1.cells(2)=cell2
field1.cells(3)=cell3
field1.cells(4)=cell4
field1.cells(5)=cell5
field1.cells(6)=cell6


field1.cells(2).x
field1.cells(2).y
field1.cells(2).player