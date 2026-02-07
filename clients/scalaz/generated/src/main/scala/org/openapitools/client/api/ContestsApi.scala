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

import org.openapitools.client.api.ContestEffectDetail
import org.openapitools.client.api.ContestTypeDetail
import org.openapitools.client.api.PaginatedContestEffectSummaryList
import org.openapitools.client.api.PaginatedContestTypeSummaryList
import org.openapitools.client.api.PaginatedSuperContestEffectSummaryList
import org.openapitools.client.api.SuperContestEffectDetail

object ContestsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def contestEffectList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedContestEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedContestEffectSummaryList] = jsonOf[PaginatedContestEffectSummaryList]

    val path = "/api/v2/contest-effect/"

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
      resp          <- client.expect[PaginatedContestEffectSummaryList](req)

    } yield resp
  }

  def contestEffectRetrieve(host: String, id: String): Task[ContestEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ContestEffectDetail] = jsonOf[ContestEffectDetail]

    val path = "/api/v2/contest-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ContestEffectDetail](req)

    } yield resp
  }

  def contestTypeList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedContestTypeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedContestTypeSummaryList] = jsonOf[PaginatedContestTypeSummaryList]

    val path = "/api/v2/contest-type/"

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
      resp          <- client.expect[PaginatedContestTypeSummaryList](req)

    } yield resp
  }

  def contestTypeRetrieve(host: String, id: String): Task[ContestTypeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ContestTypeDetail] = jsonOf[ContestTypeDetail]

    val path = "/api/v2/contest-type/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ContestTypeDetail](req)

    } yield resp
  }

  def superContestEffectList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedSuperContestEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedSuperContestEffectSummaryList] = jsonOf[PaginatedSuperContestEffectSummaryList]

    val path = "/api/v2/super-contest-effect/"

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
      resp          <- client.expect[PaginatedSuperContestEffectSummaryList](req)

    } yield resp
  }

  def superContestEffectRetrieve(host: String, id: String): Task[SuperContestEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[SuperContestEffectDetail] = jsonOf[SuperContestEffectDetail]

    val path = "/api/v2/super-contest-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[SuperContestEffectDetail](req)

    } yield resp
  }

}

class HttpServiceContestsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def contestEffectList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedContestEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedContestEffectSummaryList] = jsonOf[PaginatedContestEffectSummaryList]

    val path = "/api/v2/contest-effect/"

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
      resp          <- client.expect[PaginatedContestEffectSummaryList](req)

    } yield resp
  }

  def contestEffectRetrieve(id: String): Task[ContestEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ContestEffectDetail] = jsonOf[ContestEffectDetail]

    val path = "/api/v2/contest-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ContestEffectDetail](req)

    } yield resp
  }

  def contestTypeList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedContestTypeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedContestTypeSummaryList] = jsonOf[PaginatedContestTypeSummaryList]

    val path = "/api/v2/contest-type/"

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
      resp          <- client.expect[PaginatedContestTypeSummaryList](req)

    } yield resp
  }

  def contestTypeRetrieve(id: String): Task[ContestTypeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ContestTypeDetail] = jsonOf[ContestTypeDetail]

    val path = "/api/v2/contest-type/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ContestTypeDetail](req)

    } yield resp
  }

  def superContestEffectList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedSuperContestEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedSuperContestEffectSummaryList] = jsonOf[PaginatedSuperContestEffectSummaryList]

    val path = "/api/v2/super-contest-effect/"

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
      resp          <- client.expect[PaginatedSuperContestEffectSummaryList](req)

    } yield resp
  }

  def superContestEffectRetrieve(id: String): Task[SuperContestEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[SuperContestEffectDetail] = jsonOf[SuperContestEffectDetail]

    val path = "/api/v2/super-contest-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[SuperContestEffectDetail](req)

    } yield resp
  }

}
