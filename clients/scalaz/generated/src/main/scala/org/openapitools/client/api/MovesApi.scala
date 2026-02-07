package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.MoveBattleStyleDetail
import org.openapitools.client.api.MoveDetail
import org.openapitools.client.api.MoveLearnMethodDetail
import org.openapitools.client.api.MoveMetaAilmentDetail
import org.openapitools.client.api.MoveMetaCategoryDetail
import org.openapitools.client.api.MoveTargetDetail
import org.openapitools.client.api.PaginatedMoveBattleStyleSummaryList
import org.openapitools.client.api.PaginatedMoveLearnMethodSummaryList
import org.openapitools.client.api.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.client.api.PaginatedMoveMetaCategorySummaryList
import org.openapitools.client.api.PaginatedMoveSummaryList
import org.openapitools.client.api.PaginatedMoveTargetSummaryList

object MovesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def moveAilmentList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveMetaAilmentSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveMetaAilmentSummaryList] = jsonOf[PaginatedMoveMetaAilmentSummaryList]

    val path = "/api/v2/move-ailment/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveMetaAilmentSummaryList](req)

    } yield resp
  }

  def moveAilmentRetrieve(host: String, id: String): Task[MoveMetaAilmentDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveMetaAilmentDetail] = jsonOf[MoveMetaAilmentDetail]

    val path = "/api/v2/move-ailment/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveMetaAilmentDetail](req)

    } yield resp
  }

  def moveBattleStyleList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveBattleStyleSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveBattleStyleSummaryList] = jsonOf[PaginatedMoveBattleStyleSummaryList]

    val path = "/api/v2/move-battle-style/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveBattleStyleSummaryList](req)

    } yield resp
  }

  def moveBattleStyleRetrieve(host: String, id: String): Task[MoveBattleStyleDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveBattleStyleDetail] = jsonOf[MoveBattleStyleDetail]

    val path = "/api/v2/move-battle-style/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveBattleStyleDetail](req)

    } yield resp
  }

  def moveCategoryList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveMetaCategorySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveMetaCategorySummaryList] = jsonOf[PaginatedMoveMetaCategorySummaryList]

    val path = "/api/v2/move-category/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveMetaCategorySummaryList](req)

    } yield resp
  }

  def moveCategoryRetrieve(host: String, id: String): Task[MoveMetaCategoryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveMetaCategoryDetail] = jsonOf[MoveMetaCategoryDetail]

    val path = "/api/v2/move-category/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveMetaCategoryDetail](req)

    } yield resp
  }

  def moveLearnMethodList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveLearnMethodSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveLearnMethodSummaryList] = jsonOf[PaginatedMoveLearnMethodSummaryList]

    val path = "/api/v2/move-learn-method/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveLearnMethodSummaryList](req)

    } yield resp
  }

  def moveLearnMethodRetrieve(host: String, id: String): Task[MoveLearnMethodDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveLearnMethodDetail] = jsonOf[MoveLearnMethodDetail]

    val path = "/api/v2/move-learn-method/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveLearnMethodDetail](req)

    } yield resp
  }

  def moveList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveSummaryList] = jsonOf[PaginatedMoveSummaryList]

    val path = "/api/v2/move/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveSummaryList](req)

    } yield resp
  }

  def moveRetrieve(host: String, id: String): Task[MoveDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveDetail] = jsonOf[MoveDetail]

    val path = "/api/v2/move/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveDetail](req)

    } yield resp
  }

  def moveTargetList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveTargetSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveTargetSummaryList] = jsonOf[PaginatedMoveTargetSummaryList]

    val path = "/api/v2/move-target/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveTargetSummaryList](req)

    } yield resp
  }

  def moveTargetRetrieve(host: String, id: String): Task[MoveTargetDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveTargetDetail] = jsonOf[MoveTargetDetail]

    val path = "/api/v2/move-target/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveTargetDetail](req)

    } yield resp
  }

}

class HttpServiceMovesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def moveAilmentList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveMetaAilmentSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveMetaAilmentSummaryList] = jsonOf[PaginatedMoveMetaAilmentSummaryList]

    val path = "/api/v2/move-ailment/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveMetaAilmentSummaryList](req)

    } yield resp
  }

  def moveAilmentRetrieve(id: String): Task[MoveMetaAilmentDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveMetaAilmentDetail] = jsonOf[MoveMetaAilmentDetail]

    val path = "/api/v2/move-ailment/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveMetaAilmentDetail](req)

    } yield resp
  }

  def moveBattleStyleList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveBattleStyleSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveBattleStyleSummaryList] = jsonOf[PaginatedMoveBattleStyleSummaryList]

    val path = "/api/v2/move-battle-style/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveBattleStyleSummaryList](req)

    } yield resp
  }

  def moveBattleStyleRetrieve(id: String): Task[MoveBattleStyleDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveBattleStyleDetail] = jsonOf[MoveBattleStyleDetail]

    val path = "/api/v2/move-battle-style/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveBattleStyleDetail](req)

    } yield resp
  }

  def moveCategoryList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveMetaCategorySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveMetaCategorySummaryList] = jsonOf[PaginatedMoveMetaCategorySummaryList]

    val path = "/api/v2/move-category/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveMetaCategorySummaryList](req)

    } yield resp
  }

  def moveCategoryRetrieve(id: String): Task[MoveMetaCategoryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveMetaCategoryDetail] = jsonOf[MoveMetaCategoryDetail]

    val path = "/api/v2/move-category/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveMetaCategoryDetail](req)

    } yield resp
  }

  def moveLearnMethodList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveLearnMethodSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveLearnMethodSummaryList] = jsonOf[PaginatedMoveLearnMethodSummaryList]

    val path = "/api/v2/move-learn-method/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveLearnMethodSummaryList](req)

    } yield resp
  }

  def moveLearnMethodRetrieve(id: String): Task[MoveLearnMethodDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveLearnMethodDetail] = jsonOf[MoveLearnMethodDetail]

    val path = "/api/v2/move-learn-method/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveLearnMethodDetail](req)

    } yield resp
  }

  def moveList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveSummaryList] = jsonOf[PaginatedMoveSummaryList]

    val path = "/api/v2/move/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveSummaryList](req)

    } yield resp
  }

  def moveRetrieve(id: String): Task[MoveDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveDetail] = jsonOf[MoveDetail]

    val path = "/api/v2/move/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveDetail](req)

    } yield resp
  }

  def moveTargetList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveTargetSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveTargetSummaryList] = jsonOf[PaginatedMoveTargetSummaryList]

    val path = "/api/v2/move-target/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("q", Some(qQuery.toParamString(q))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedMoveTargetSummaryList](req)

    } yield resp
  }

  def moveTargetRetrieve(id: String): Task[MoveTargetDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveTargetDetail] = jsonOf[MoveTargetDetail]

    val path = "/api/v2/move-target/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MoveTargetDetail](req)

    } yield resp
  }

}
