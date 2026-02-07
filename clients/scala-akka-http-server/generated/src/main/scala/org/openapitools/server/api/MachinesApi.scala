package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.MachineDetail
import org.openapitools.server.model.PaginatedMachineSummaryList


class MachinesApi(
    machinesService: MachinesApiService,
    machinesMarshaller: MachinesApiMarshaller
) {

  
  import machinesMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "machine") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            machinesService.machineList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "machine" / Segment) { (id) => 
      get {  
            machinesService.machineRetrieve(id = id)
      }
    }
}


trait MachinesApiService {

  def machineList200(responsePaginatedMachineSummaryList: PaginatedMachineSummaryList)(implicit toEntityMarshallerPaginatedMachineSummaryList: ToEntityMarshaller[PaginatedMachineSummaryList]): Route =
    complete((200, responsePaginatedMachineSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMachineSummaryList
   */
  def machineList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMachineSummaryList: ToEntityMarshaller[PaginatedMachineSummaryList]): Route

  def machineRetrieve200(responseMachineDetail: MachineDetail)(implicit toEntityMarshallerMachineDetail: ToEntityMarshaller[MachineDetail]): Route =
    complete((200, responseMachineDetail))
  /**
   * Code: 200, Message: , DataType: MachineDetail
   */
  def machineRetrieve(id: String)
      (implicit toEntityMarshallerMachineDetail: ToEntityMarshaller[MachineDetail]): Route

}

trait MachinesApiMarshaller {


  implicit def toEntityMarshallerPaginatedMachineSummaryList: ToEntityMarshaller[PaginatedMachineSummaryList]

  implicit def toEntityMarshallerMachineDetail: ToEntityMarshaller[MachineDetail]

}

