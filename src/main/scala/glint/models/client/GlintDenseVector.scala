package glint.models.client

import breeze.math.Semiring

import scala.concurrent.{ExecutionContext, Future}
import scala.reflect.ClassTag

/**
  * Created by nouman on 8/9/17.
  */
case class GlintDenseVector[@specialized V : Semiring : ClassTag ](data: Array[V]) extends BigVector[V] with Serializable {

  override val size: Long = data.length;

  /**
    * Pulls a set of elements
    *
    * @param keys The indices of the elements
    * @param ec   The implicit execution context in which to execute the request
    * @return A future containing the values of the elements at given rows, columns
    */
  override def pull(keys: Array[Long])(implicit ec: ExecutionContext): Future[Array[V]] = ???

  /**
    * Pushes a set of values
    *
    * @param keys   The indices of the rows
    * @param values The values to update
    * @param ec     The implicit execution context in which to execute the request
    * @return A future containing either the success or failure of the operation
    */
  override def push(keys: Array[Long], values: Array[V])(implicit ec: ExecutionContext): Future[Boolean] = ???

  /**
    * Destroys the big vector and its resources on the parameter server
    *
    * @param ec The implicit execution context in which to execute the request
    * @return A future whether the vector was successfully destroyed
    */
  override def destroy()(implicit ec: ExecutionContext): Future[Boolean] = ???
}
