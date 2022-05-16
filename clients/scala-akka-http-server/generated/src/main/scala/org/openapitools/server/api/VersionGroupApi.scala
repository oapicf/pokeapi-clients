package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class VersionGroupApi(
    versionGroupService: VersionGroupApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "version-group") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            versionGroupService.versionGroupList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "version-group" / IntNumber) { (id) => 
      get {  
            versionGroupService.versionGroupRead(id = id)
      }
    }
}


trait VersionGroupApiService {

  def versionGroupListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def versionGroupList(limit: Option[Int], offset: Option[Int]): Route

  def versionGroupReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def versionGroupRead(id: Int): Route

}


