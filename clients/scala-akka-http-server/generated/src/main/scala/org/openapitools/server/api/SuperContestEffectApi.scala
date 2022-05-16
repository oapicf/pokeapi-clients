package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class SuperContestEffectApi(
    superContestEffectService: SuperContestEffectApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "super-contest-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            superContestEffectService.superContestEffectList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "super-contest-effect" / IntNumber) { (id) => 
      get {  
            superContestEffectService.superContestEffectRead(id = id)
      }
    }
}


trait SuperContestEffectApiService {

  def superContestEffectListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def superContestEffectList(limit: Option[Int], offset: Option[Int]): Route

  def superContestEffectReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def superContestEffectRead(id: Int): Route

}


