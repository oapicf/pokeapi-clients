package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BerryDetail
import org.openapitools.server.model.BerryFirmnessDetail
import org.openapitools.server.model.BerryFlavorDetail
import org.openapitools.server.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.server.model.PaginatedBerryFlavorSummaryList
import org.openapitools.server.model.PaginatedBerrySummaryList


class BerriesApi(
    berriesService: BerriesApiService,
    berriesMarshaller: BerriesApiMarshaller
) {

  
  import berriesMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "berry-firmness") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            berriesService.berryFirmnessList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "berry-firmness" / Segment) { (id) => 
      get {  
            berriesService.berryFirmnessRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "berry-flavor") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            berriesService.berryFlavorList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "berry-flavor" / Segment) { (id) => 
      get {  
            berriesService.berryFlavorRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "berry") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            berriesService.berryList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "berry" / Segment) { (id) => 
      get {  
            berriesService.berryRetrieve(id = id)
      }
    }
}


trait BerriesApiService {

  def berryFirmnessList200(responsePaginatedBerryFirmnessSummaryList: PaginatedBerryFirmnessSummaryList)(implicit toEntityMarshallerPaginatedBerryFirmnessSummaryList: ToEntityMarshaller[PaginatedBerryFirmnessSummaryList]): Route =
    complete((200, responsePaginatedBerryFirmnessSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedBerryFirmnessSummaryList
   */
  def berryFirmnessList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedBerryFirmnessSummaryList: ToEntityMarshaller[PaginatedBerryFirmnessSummaryList]): Route

  def berryFirmnessRetrieve200(responseBerryFirmnessDetail: BerryFirmnessDetail)(implicit toEntityMarshallerBerryFirmnessDetail: ToEntityMarshaller[BerryFirmnessDetail]): Route =
    complete((200, responseBerryFirmnessDetail))
  /**
   * Code: 200, Message: , DataType: BerryFirmnessDetail
   */
  def berryFirmnessRetrieve(id: String)
      (implicit toEntityMarshallerBerryFirmnessDetail: ToEntityMarshaller[BerryFirmnessDetail]): Route

  def berryFlavorList200(responsePaginatedBerryFlavorSummaryList: PaginatedBerryFlavorSummaryList)(implicit toEntityMarshallerPaginatedBerryFlavorSummaryList: ToEntityMarshaller[PaginatedBerryFlavorSummaryList]): Route =
    complete((200, responsePaginatedBerryFlavorSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedBerryFlavorSummaryList
   */
  def berryFlavorList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedBerryFlavorSummaryList: ToEntityMarshaller[PaginatedBerryFlavorSummaryList]): Route

  def berryFlavorRetrieve200(responseBerryFlavorDetail: BerryFlavorDetail)(implicit toEntityMarshallerBerryFlavorDetail: ToEntityMarshaller[BerryFlavorDetail]): Route =
    complete((200, responseBerryFlavorDetail))
  /**
   * Code: 200, Message: , DataType: BerryFlavorDetail
   */
  def berryFlavorRetrieve(id: String)
      (implicit toEntityMarshallerBerryFlavorDetail: ToEntityMarshaller[BerryFlavorDetail]): Route

  def berryList200(responsePaginatedBerrySummaryList: PaginatedBerrySummaryList)(implicit toEntityMarshallerPaginatedBerrySummaryList: ToEntityMarshaller[PaginatedBerrySummaryList]): Route =
    complete((200, responsePaginatedBerrySummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedBerrySummaryList
   */
  def berryList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedBerrySummaryList: ToEntityMarshaller[PaginatedBerrySummaryList]): Route

  def berryRetrieve200(responseBerryDetail: BerryDetail)(implicit toEntityMarshallerBerryDetail: ToEntityMarshaller[BerryDetail]): Route =
    complete((200, responseBerryDetail))
  /**
   * Code: 200, Message: , DataType: BerryDetail
   */
  def berryRetrieve(id: String)
      (implicit toEntityMarshallerBerryDetail: ToEntityMarshaller[BerryDetail]): Route

}

trait BerriesApiMarshaller {


  implicit def toEntityMarshallerBerryFirmnessDetail: ToEntityMarshaller[BerryFirmnessDetail]

  implicit def toEntityMarshallerPaginatedBerrySummaryList: ToEntityMarshaller[PaginatedBerrySummaryList]

  implicit def toEntityMarshallerBerryDetail: ToEntityMarshaller[BerryDetail]

  implicit def toEntityMarshallerPaginatedBerryFirmnessSummaryList: ToEntityMarshaller[PaginatedBerryFirmnessSummaryList]

  implicit def toEntityMarshallerPaginatedBerryFlavorSummaryList: ToEntityMarshaller[PaginatedBerryFlavorSummaryList]

  implicit def toEntityMarshallerBerryFlavorDetail: ToEntityMarshaller[BerryFlavorDetail]

}

