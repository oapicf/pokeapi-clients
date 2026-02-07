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

import org.openapitools.client.api.LocationAreaDetail
import org.openapitools.client.api.LocationDetail
import org.openapitools.client.api.PaginatedLocationAreaSummaryList
import org.openapitools.client.api.PaginatedLocationSummaryList
import org.openapitools.client.api.PaginatedPalParkAreaSummaryList
import org.openapitools.client.api.PaginatedRegionSummaryList
import org.openapitools.client.api.PalParkAreaDetail
import org.openapitools.client.api.RegionDetail

object LocationApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def locationAreaList(host: String, limit: Integer, offset: Integer)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer]): Task[PaginatedLocationAreaSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedLocationAreaSummaryList] = jsonOf[PaginatedLocationAreaSummaryList]

    val path = "/api/v2/location-area/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedLocationAreaSummaryList](req)

    } yield resp
  }

  def locationAreaRetrieve(host: String, id: Integer): Task[LocationAreaDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[LocationAreaDetail] = jsonOf[LocationAreaDetail]

    val path = "/api/v2/location-area/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[LocationAreaDetail](req)

    } yield resp
  }

  def locationList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedLocationSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedLocationSummaryList] = jsonOf[PaginatedLocationSummaryList]

    val path = "/api/v2/location/"

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
      resp          <- client.expect[PaginatedLocationSummaryList](req)

    } yield resp
  }

  def locationRetrieve(host: String, id: String): Task[LocationDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[LocationDetail] = jsonOf[LocationDetail]

    val path = "/api/v2/location/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[LocationDetail](req)

    } yield resp
  }

  def palParkAreaList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPalParkAreaSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPalParkAreaSummaryList] = jsonOf[PaginatedPalParkAreaSummaryList]

    val path = "/api/v2/pal-park-area/"

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
      resp          <- client.expect[PaginatedPalParkAreaSummaryList](req)

    } yield resp
  }

  def palParkAreaRetrieve(host: String, id: String): Task[PalParkAreaDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PalParkAreaDetail] = jsonOf[PalParkAreaDetail]

    val path = "/api/v2/pal-park-area/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PalParkAreaDetail](req)

    } yield resp
  }

  def regionList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedRegionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedRegionSummaryList] = jsonOf[PaginatedRegionSummaryList]

    val path = "/api/v2/region/"

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
      resp          <- client.expect[PaginatedRegionSummaryList](req)

    } yield resp
  }

  def regionRetrieve(host: String, id: String): Task[RegionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[RegionDetail] = jsonOf[RegionDetail]

    val path = "/api/v2/region/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[RegionDetail](req)

    } yield resp
  }

}

class HttpServiceLocationApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def locationAreaList(limit: Integer, offset: Integer)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer]): Task[PaginatedLocationAreaSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedLocationAreaSummaryList] = jsonOf[PaginatedLocationAreaSummaryList]

    val path = "/api/v2/location-area/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PaginatedLocationAreaSummaryList](req)

    } yield resp
  }

  def locationAreaRetrieve(id: Integer): Task[LocationAreaDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[LocationAreaDetail] = jsonOf[LocationAreaDetail]

    val path = "/api/v2/location-area/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[LocationAreaDetail](req)

    } yield resp
  }

  def locationList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedLocationSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedLocationSummaryList] = jsonOf[PaginatedLocationSummaryList]

    val path = "/api/v2/location/"

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
      resp          <- client.expect[PaginatedLocationSummaryList](req)

    } yield resp
  }

  def locationRetrieve(id: String): Task[LocationDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[LocationDetail] = jsonOf[LocationDetail]

    val path = "/api/v2/location/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[LocationDetail](req)

    } yield resp
  }

  def palParkAreaList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPalParkAreaSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPalParkAreaSummaryList] = jsonOf[PaginatedPalParkAreaSummaryList]

    val path = "/api/v2/pal-park-area/"

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
      resp          <- client.expect[PaginatedPalParkAreaSummaryList](req)

    } yield resp
  }

  def palParkAreaRetrieve(id: String): Task[PalParkAreaDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PalParkAreaDetail] = jsonOf[PalParkAreaDetail]

    val path = "/api/v2/pal-park-area/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PalParkAreaDetail](req)

    } yield resp
  }

  def regionList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedRegionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedRegionSummaryList] = jsonOf[PaginatedRegionSummaryList]

    val path = "/api/v2/region/"

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
      resp          <- client.expect[PaginatedRegionSummaryList](req)

    } yield resp
  }

  def regionRetrieve(id: String): Task[RegionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[RegionDetail] = jsonOf[RegionDetail]

    val path = "/api/v2/region/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[RegionDetail](req)

    } yield resp
  }

}
