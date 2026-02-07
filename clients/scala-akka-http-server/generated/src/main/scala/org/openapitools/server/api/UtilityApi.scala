package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.LanguageDetail
import org.openapitools.server.model.PaginatedLanguageSummaryList


class UtilityApi(
    utilityService: UtilityApiService,
    utilityMarshaller: UtilityApiMarshaller
) {

  
  import utilityMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "language") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            utilityService.languageList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "language" / Segment) { (id) => 
      get {  
            utilityService.languageRetrieve(id = id)
      }
    }
}


trait UtilityApiService {

  def languageList200(responsePaginatedLanguageSummaryList: PaginatedLanguageSummaryList)(implicit toEntityMarshallerPaginatedLanguageSummaryList: ToEntityMarshaller[PaginatedLanguageSummaryList]): Route =
    complete((200, responsePaginatedLanguageSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedLanguageSummaryList
   */
  def languageList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedLanguageSummaryList: ToEntityMarshaller[PaginatedLanguageSummaryList]): Route

  def languageRetrieve200(responseLanguageDetail: LanguageDetail)(implicit toEntityMarshallerLanguageDetail: ToEntityMarshaller[LanguageDetail]): Route =
    complete((200, responseLanguageDetail))
  /**
   * Code: 200, Message: , DataType: LanguageDetail
   */
  def languageRetrieve(id: String)
      (implicit toEntityMarshallerLanguageDetail: ToEntityMarshaller[LanguageDetail]): Route

}

trait UtilityApiMarshaller {


  implicit def toEntityMarshallerLanguageDetail: ToEntityMarshaller[LanguageDetail]

  implicit def toEntityMarshallerPaginatedLanguageSummaryList: ToEntityMarshaller[PaginatedLanguageSummaryList]

}

