package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.LocationAreaDetail
import org.openapitools.server.model.LocationDetail
import org.openapitools.server.model.PaginatedLocationAreaSummaryList
import org.openapitools.server.model.PaginatedLocationSummaryList
import org.openapitools.server.model.PaginatedPalParkAreaSummaryList
import org.openapitools.server.model.PaginatedRegionSummaryList
import org.openapitools.server.model.PalParkAreaDetail
import org.openapitools.server.model.RegionDetail


class LocationApi(
    locationService: LocationApiService,
    locationMarshaller: LocationApiMarshaller
) {

  
  import locationMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "location-area") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            locationService.locationAreaList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "location-area" / IntNumber) { (id) => 
      get {  
            locationService.locationAreaRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "location") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            locationService.locationList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "location" / Segment) { (id) => 
      get {  
            locationService.locationRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pal-park-area") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            locationService.palParkAreaList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pal-park-area" / Segment) { (id) => 
      get {  
            locationService.palParkAreaRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "region") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            locationService.regionList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "region" / Segment) { (id) => 
      get {  
            locationService.regionRetrieve(id = id)
      }
    }
}


trait LocationApiService {

  def locationAreaList200(responsePaginatedLocationAreaSummaryList: PaginatedLocationAreaSummaryList)(implicit toEntityMarshallerPaginatedLocationAreaSummaryList: ToEntityMarshaller[PaginatedLocationAreaSummaryList]): Route =
    complete((200, responsePaginatedLocationAreaSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedLocationAreaSummaryList
   */
  def locationAreaList(limit: Option[Int], offset: Option[Int])
      (implicit toEntityMarshallerPaginatedLocationAreaSummaryList: ToEntityMarshaller[PaginatedLocationAreaSummaryList]): Route

  def locationAreaRetrieve200(responseLocationAreaDetail: LocationAreaDetail)(implicit toEntityMarshallerLocationAreaDetail: ToEntityMarshaller[LocationAreaDetail]): Route =
    complete((200, responseLocationAreaDetail))
  /**
   * Code: 200, Message: , DataType: LocationAreaDetail
   */
  def locationAreaRetrieve(id: Int)
      (implicit toEntityMarshallerLocationAreaDetail: ToEntityMarshaller[LocationAreaDetail]): Route

  def locationList200(responsePaginatedLocationSummaryList: PaginatedLocationSummaryList)(implicit toEntityMarshallerPaginatedLocationSummaryList: ToEntityMarshaller[PaginatedLocationSummaryList]): Route =
    complete((200, responsePaginatedLocationSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedLocationSummaryList
   */
  def locationList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedLocationSummaryList: ToEntityMarshaller[PaginatedLocationSummaryList]): Route

  def locationRetrieve200(responseLocationDetail: LocationDetail)(implicit toEntityMarshallerLocationDetail: ToEntityMarshaller[LocationDetail]): Route =
    complete((200, responseLocationDetail))
  /**
   * Code: 200, Message: , DataType: LocationDetail
   */
  def locationRetrieve(id: String)
      (implicit toEntityMarshallerLocationDetail: ToEntityMarshaller[LocationDetail]): Route

  def palParkAreaList200(responsePaginatedPalParkAreaSummaryList: PaginatedPalParkAreaSummaryList)(implicit toEntityMarshallerPaginatedPalParkAreaSummaryList: ToEntityMarshaller[PaginatedPalParkAreaSummaryList]): Route =
    complete((200, responsePaginatedPalParkAreaSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPalParkAreaSummaryList
   */
  def palParkAreaList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPalParkAreaSummaryList: ToEntityMarshaller[PaginatedPalParkAreaSummaryList]): Route

  def palParkAreaRetrieve200(responsePalParkAreaDetail: PalParkAreaDetail)(implicit toEntityMarshallerPalParkAreaDetail: ToEntityMarshaller[PalParkAreaDetail]): Route =
    complete((200, responsePalParkAreaDetail))
  /**
   * Code: 200, Message: , DataType: PalParkAreaDetail
   */
  def palParkAreaRetrieve(id: String)
      (implicit toEntityMarshallerPalParkAreaDetail: ToEntityMarshaller[PalParkAreaDetail]): Route

  def regionList200(responsePaginatedRegionSummaryList: PaginatedRegionSummaryList)(implicit toEntityMarshallerPaginatedRegionSummaryList: ToEntityMarshaller[PaginatedRegionSummaryList]): Route =
    complete((200, responsePaginatedRegionSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedRegionSummaryList
   */
  def regionList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedRegionSummaryList: ToEntityMarshaller[PaginatedRegionSummaryList]): Route

  def regionRetrieve200(responseRegionDetail: RegionDetail)(implicit toEntityMarshallerRegionDetail: ToEntityMarshaller[RegionDetail]): Route =
    complete((200, responseRegionDetail))
  /**
   * Code: 200, Message: , DataType: RegionDetail
   */
  def regionRetrieve(id: String)
      (implicit toEntityMarshallerRegionDetail: ToEntityMarshaller[RegionDetail]): Route

}

trait LocationApiMarshaller {


  implicit def toEntityMarshallerLocationDetail: ToEntityMarshaller[LocationDetail]

  implicit def toEntityMarshallerPaginatedPalParkAreaSummaryList: ToEntityMarshaller[PaginatedPalParkAreaSummaryList]

  implicit def toEntityMarshallerPaginatedLocationSummaryList: ToEntityMarshaller[PaginatedLocationSummaryList]

  implicit def toEntityMarshallerLocationAreaDetail: ToEntityMarshaller[LocationAreaDetail]

  implicit def toEntityMarshallerPalParkAreaDetail: ToEntityMarshaller[PalParkAreaDetail]

  implicit def toEntityMarshallerPaginatedLocationAreaSummaryList: ToEntityMarshaller[PaginatedLocationAreaSummaryList]

  implicit def toEntityMarshallerPaginatedRegionSummaryList: ToEntityMarshaller[PaginatedRegionSummaryList]

  implicit def toEntityMarshallerRegionDetail: ToEntityMarshaller[RegionDetail]

}

