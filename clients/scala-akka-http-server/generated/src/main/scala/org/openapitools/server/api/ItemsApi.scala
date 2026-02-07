package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ItemAttributeDetail
import org.openapitools.server.model.ItemCategoryDetail
import org.openapitools.server.model.ItemDetail
import org.openapitools.server.model.ItemFlingEffectDetail
import org.openapitools.server.model.ItemPocketDetail
import org.openapitools.server.model.PaginatedItemAttributeSummaryList
import org.openapitools.server.model.PaginatedItemCategorySummaryList
import org.openapitools.server.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.server.model.PaginatedItemPocketSummaryList
import org.openapitools.server.model.PaginatedItemSummaryList


class ItemsApi(
    itemsService: ItemsApiService,
    itemsMarshaller: ItemsApiMarshaller
) {

  
  import itemsMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "item-attribute") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            itemsService.itemAttributeList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "item-attribute" / Segment) { (id) => 
      get {  
            itemsService.itemAttributeRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "item-category") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            itemsService.itemCategoryList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "item-category" / Segment) { (id) => 
      get {  
            itemsService.itemCategoryRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "item-fling-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            itemsService.itemFlingEffectList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "item-fling-effect" / Segment) { (id) => 
      get {  
            itemsService.itemFlingEffectRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "item") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            itemsService.itemList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "item-pocket") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            itemsService.itemPocketList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "item-pocket" / Segment) { (id) => 
      get {  
            itemsService.itemPocketRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "item" / Segment) { (id) => 
      get {  
            itemsService.itemRetrieve(id = id)
      }
    }
}


trait ItemsApiService {

  def itemAttributeList200(responsePaginatedItemAttributeSummaryList: PaginatedItemAttributeSummaryList)(implicit toEntityMarshallerPaginatedItemAttributeSummaryList: ToEntityMarshaller[PaginatedItemAttributeSummaryList]): Route =
    complete((200, responsePaginatedItemAttributeSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedItemAttributeSummaryList
   */
  def itemAttributeList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedItemAttributeSummaryList: ToEntityMarshaller[PaginatedItemAttributeSummaryList]): Route

  def itemAttributeRetrieve200(responseItemAttributeDetail: ItemAttributeDetail)(implicit toEntityMarshallerItemAttributeDetail: ToEntityMarshaller[ItemAttributeDetail]): Route =
    complete((200, responseItemAttributeDetail))
  /**
   * Code: 200, Message: , DataType: ItemAttributeDetail
   */
  def itemAttributeRetrieve(id: String)
      (implicit toEntityMarshallerItemAttributeDetail: ToEntityMarshaller[ItemAttributeDetail]): Route

  def itemCategoryList200(responsePaginatedItemCategorySummaryList: PaginatedItemCategorySummaryList)(implicit toEntityMarshallerPaginatedItemCategorySummaryList: ToEntityMarshaller[PaginatedItemCategorySummaryList]): Route =
    complete((200, responsePaginatedItemCategorySummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedItemCategorySummaryList
   */
  def itemCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedItemCategorySummaryList: ToEntityMarshaller[PaginatedItemCategorySummaryList]): Route

  def itemCategoryRetrieve200(responseItemCategoryDetail: ItemCategoryDetail)(implicit toEntityMarshallerItemCategoryDetail: ToEntityMarshaller[ItemCategoryDetail]): Route =
    complete((200, responseItemCategoryDetail))
  /**
   * Code: 200, Message: , DataType: ItemCategoryDetail
   */
  def itemCategoryRetrieve(id: String)
      (implicit toEntityMarshallerItemCategoryDetail: ToEntityMarshaller[ItemCategoryDetail]): Route

  def itemFlingEffectList200(responsePaginatedItemFlingEffectSummaryList: PaginatedItemFlingEffectSummaryList)(implicit toEntityMarshallerPaginatedItemFlingEffectSummaryList: ToEntityMarshaller[PaginatedItemFlingEffectSummaryList]): Route =
    complete((200, responsePaginatedItemFlingEffectSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedItemFlingEffectSummaryList
   */
  def itemFlingEffectList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedItemFlingEffectSummaryList: ToEntityMarshaller[PaginatedItemFlingEffectSummaryList]): Route

  def itemFlingEffectRetrieve200(responseItemFlingEffectDetail: ItemFlingEffectDetail)(implicit toEntityMarshallerItemFlingEffectDetail: ToEntityMarshaller[ItemFlingEffectDetail]): Route =
    complete((200, responseItemFlingEffectDetail))
  /**
   * Code: 200, Message: , DataType: ItemFlingEffectDetail
   */
  def itemFlingEffectRetrieve(id: String)
      (implicit toEntityMarshallerItemFlingEffectDetail: ToEntityMarshaller[ItemFlingEffectDetail]): Route

  def itemList200(responsePaginatedItemSummaryList: PaginatedItemSummaryList)(implicit toEntityMarshallerPaginatedItemSummaryList: ToEntityMarshaller[PaginatedItemSummaryList]): Route =
    complete((200, responsePaginatedItemSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedItemSummaryList
   */
  def itemList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedItemSummaryList: ToEntityMarshaller[PaginatedItemSummaryList]): Route

  def itemPocketList200(responsePaginatedItemPocketSummaryList: PaginatedItemPocketSummaryList)(implicit toEntityMarshallerPaginatedItemPocketSummaryList: ToEntityMarshaller[PaginatedItemPocketSummaryList]): Route =
    complete((200, responsePaginatedItemPocketSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedItemPocketSummaryList
   */
  def itemPocketList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedItemPocketSummaryList: ToEntityMarshaller[PaginatedItemPocketSummaryList]): Route

  def itemPocketRetrieve200(responseItemPocketDetail: ItemPocketDetail)(implicit toEntityMarshallerItemPocketDetail: ToEntityMarshaller[ItemPocketDetail]): Route =
    complete((200, responseItemPocketDetail))
  /**
   * Code: 200, Message: , DataType: ItemPocketDetail
   */
  def itemPocketRetrieve(id: String)
      (implicit toEntityMarshallerItemPocketDetail: ToEntityMarshaller[ItemPocketDetail]): Route

  def itemRetrieve200(responseItemDetail: ItemDetail)(implicit toEntityMarshallerItemDetail: ToEntityMarshaller[ItemDetail]): Route =
    complete((200, responseItemDetail))
  /**
   * Code: 200, Message: , DataType: ItemDetail
   */
  def itemRetrieve(id: String)
      (implicit toEntityMarshallerItemDetail: ToEntityMarshaller[ItemDetail]): Route

}

trait ItemsApiMarshaller {


  implicit def toEntityMarshallerItemFlingEffectDetail: ToEntityMarshaller[ItemFlingEffectDetail]

  implicit def toEntityMarshallerItemDetail: ToEntityMarshaller[ItemDetail]

  implicit def toEntityMarshallerPaginatedItemPocketSummaryList: ToEntityMarshaller[PaginatedItemPocketSummaryList]

  implicit def toEntityMarshallerPaginatedItemFlingEffectSummaryList: ToEntityMarshaller[PaginatedItemFlingEffectSummaryList]

  implicit def toEntityMarshallerItemPocketDetail: ToEntityMarshaller[ItemPocketDetail]

  implicit def toEntityMarshallerPaginatedItemCategorySummaryList: ToEntityMarshaller[PaginatedItemCategorySummaryList]

  implicit def toEntityMarshallerItemCategoryDetail: ToEntityMarshaller[ItemCategoryDetail]

  implicit def toEntityMarshallerPaginatedItemSummaryList: ToEntityMarshaller[PaginatedItemSummaryList]

  implicit def toEntityMarshallerItemAttributeDetail: ToEntityMarshaller[ItemAttributeDetail]

  implicit def toEntityMarshallerPaginatedItemAttributeSummaryList: ToEntityMarshaller[PaginatedItemAttributeSummaryList]

}

