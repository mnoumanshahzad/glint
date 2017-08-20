package glint.models.client

/**
  * This class represents a weight vector with an intercept
  * @param weights The vector of weights
  * @param intercept The intercept (bias) weight
  */
case class GlintWeightVector(weights: BigVector[Double], intercept: Double) extends Serializable {}
