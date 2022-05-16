package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EggGroupApi(
    eggGroupService: EggGroupApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "egg-group") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            eggGroupService.eggGroupList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "egg-group" / IntNumber) { (id) => 
      get {  
            eggGroupService.eggGroupRead(id = id)
      }
    }
}


trait EggGroupApiService {

  def eggGroupListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def eggGroupList(limit: Option[Int], offset: Option[Int]): Route

  def eggGroupReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def eggGroupRead(id: Int): Route

}


