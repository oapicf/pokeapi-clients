package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ItemFlingEffectApi(
    itemFlingEffectService: ItemFlingEffectApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "item-fling-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            itemFlingEffectService.itemFlingEffectList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "item-fling-effect" / IntNumber) { (id) => 
      get {  
            itemFlingEffectService.itemFlingEffectRead(id = id)
      }
    }
}


trait ItemFlingEffectApiService {

  def itemFlingEffectListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemFlingEffectList(limit: Option[Int], offset: Option[Int]): Route

  def itemFlingEffectReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemFlingEffectRead(id: Int): Route

}


