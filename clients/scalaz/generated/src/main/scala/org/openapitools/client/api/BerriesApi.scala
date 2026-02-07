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

import org.openapitools.client.api.BerryDetail
import org.openapitools.client.api.BerryFirmnessDetail
import org.openapitools.client.api.BerryFlavorDetail
import org.openapitools.client.api.PaginatedBerryFirmnessSummaryList
import org.openapitools.client.api.PaginatedBerryFlavorSummaryList
import org.openapitools.client.api.PaginatedBerrySummaryList

object BerriesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def berryFirmnessList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerryFirmnessSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerryFirmnessSummaryList] = jsonOf[PaginatedBerryFirmnessSummaryList]

    val path = "/api/v2/berry-firmness/"

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
      resp          <- client.expect[PaginatedBerryFirmnessSummaryList](req)

    } yield resp
  }

  def berryFirmnessRetrieve(host: String, id: String): Task[BerryFirmnessDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryFirmnessDetail] = jsonOf[BerryFirmnessDetail]

    val path = "/api/v2/berry-firmness/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryFirmnessDetail](req)

    } yield resp
  }

  def berryFlavorList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerryFlavorSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerryFlavorSummaryList] = jsonOf[PaginatedBerryFlavorSummaryList]

    val path = "/api/v2/berry-flavor/"

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
      resp          <- client.expect[PaginatedBerryFlavorSummaryList](req)

    } yield resp
  }

  def berryFlavorRetrieve(host: String, id: String): Task[BerryFlavorDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryFlavorDetail] = jsonOf[BerryFlavorDetail]

    val path = "/api/v2/berry-flavor/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryFlavorDetail](req)

    } yield resp
  }

  def berryList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerrySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerrySummaryList] = jsonOf[PaginatedBerrySummaryList]

    val path = "/api/v2/berry/"

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
      resp          <- client.expect[PaginatedBerrySummaryList](req)

    } yield resp
  }

  def berryRetrieve(host: String, id: String): Task[BerryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryDetail] = jsonOf[BerryDetail]

    val path = "/api/v2/berry/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryDetail](req)

    } yield resp
  }

}

class HttpServiceBerriesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def berryFirmnessList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerryFirmnessSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerryFirmnessSummaryList] = jsonOf[PaginatedBerryFirmnessSummaryList]

    val path = "/api/v2/berry-firmness/"

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
      resp          <- client.expect[PaginatedBerryFirmnessSummaryList](req)

    } yield resp
  }

  def berryFirmnessRetrieve(id: String): Task[BerryFirmnessDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryFirmnessDetail] = jsonOf[BerryFirmnessDetail]

    val path = "/api/v2/berry-firmness/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryFirmnessDetail](req)

    } yield resp
  }

  def berryFlavorList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerryFlavorSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerryFlavorSummaryList] = jsonOf[PaginatedBerryFlavorSummaryList]

    val path = "/api/v2/berry-flavor/"

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
      resp          <- client.expect[PaginatedBerryFlavorSummaryList](req)

    } yield resp
  }

  def berryFlavorRetrieve(id: String): Task[BerryFlavorDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryFlavorDetail] = jsonOf[BerryFlavorDetail]

    val path = "/api/v2/berry-flavor/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryFlavorDetail](req)

    } yield resp
  }

  def berryList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedBerrySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedBerrySummaryList] = jsonOf[PaginatedBerrySummaryList]

    val path = "/api/v2/berry/"

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
      resp          <- client.expect[PaginatedBerrySummaryList](req)

    } yield resp
  }

  def berryRetrieve(id: String): Task[BerryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[BerryDetail] = jsonOf[BerryDetail]

    val path = "/api/v2/berry/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[BerryDetail](req)

    } yield resp
  }

}
