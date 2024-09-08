package il.ac.hit.scala

//Assignment 1
/*
You should define the Rectangle class.
Every Rectangle object should have width and height variables.
In addition, the Rectangle class should include the definition for area and perimeter functions.
In addition, when trying to calculate the total of two Rectangle objects using the + operator
we should get a new Rectangle object that its width and height are the sums of the width and height of
the two Rectangle objects.
 */


class Rectangle (h: Double, w: Double):

  private val height: Double = if (h > 0) h else 0
  private val width: Double = if (w > 0) w else 0

  def area () : Double = height * width

  def perimeter () : Double = (height * 2) + (width * 2)

  def + (that: Rectangle) : Rectangle = new Rectangle(this.height + that.height, this.width + that.width)
