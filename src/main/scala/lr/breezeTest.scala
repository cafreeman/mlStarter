package lr

import breeze.linalg._

object stuff {
  def zeros(dimension: Int) : DenseVector[Double] = {
    DenseVector.zeros[Double](dimension)
  }
}
