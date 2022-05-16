package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MachineApi(
    machineService: MachineApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "machine") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            machineService.machineList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "machine" / IntNumber) { (id) => 
      get {  
            machineService.machineRead(id = id)
      }
    }
}


trait MachineApiService {

  def machineListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def machineList(limit: Option[Int], offset: Option[Int]): Route

  def machineReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def machineRead(id: Int): Route

}


