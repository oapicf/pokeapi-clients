package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ContestEffectApi(
    contestEffectService: ContestEffectApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "contest-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            contestEffectService.contestEffectList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "contest-effect" / IntNumber) { (id) => 
      get {  
            contestEffectService.contestEffectRead(id = id)
      }
    }
}


trait ContestEffectApiService {

  def contestEffectListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def contestEffectList(limit: Option[Int], offset: Option[Int]): Route

  def contestEffectReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def contestEffectRead(id: Int): Route

}


