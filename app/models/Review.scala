package models

case class Review(var id: Option[Long], var productId: Option[Long], var comment: String, var author: String) {
  override def toString: String = ("Review { id: " + id + " ,productId: " + productId.getOrElse(0) + ",author: "
    + author + ",comment:" + comment + " }")
}