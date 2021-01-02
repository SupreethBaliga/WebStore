package services

import models.Product
import javax.inject._

trait IProductService extends BaseService[Product] {
  def insert (product: Product): Long
  def update (id: Long, product: Product): Boolean
  def remove (id: Long): Boolean
  def findById (id: Long): Option[Product]
  def findAll (): Option[List[Product]]
  def findAllProducts (): Seq[(String, String)]
}

@Singleton
class ProductService extends IProductService{

  def insert(product:Product):Long = {
    val id = idCounter.incrementAndGet()
    product.id = Some(id)
    inMemoryDB.put(id, product)
    id
  }

  def update(id:Long,product:Product):Boolean = {
    validateId(id)
    product.id = Some(id)
    inMemoryDB.put(id, product)
    true
  }

  def remove(id:Long):Boolean = {
    validateId(id)
    inMemoryDB.remove(id)
    true
  }

  def findById(id:Long):Option[Product] = {
    inMemoryDB.get(id)
  }

  def findAll():Option[List[Product]] = {
    if (inMemoryDB.values == Nil ||
      inMemoryDB.values.toList.size==0) return None
    Some(inMemoryDB.values.toList)
  }
}