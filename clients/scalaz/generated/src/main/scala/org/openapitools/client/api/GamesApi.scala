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

import org.openapitools.client.api.GenerationDetail
import org.openapitools.client.api.PaginatedGenerationSummaryList
import org.openapitools.client.api.PaginatedPokedexSummaryList
import org.openapitools.client.api.PaginatedVersionGroupSummaryList
import org.openapitools.client.api.PaginatedVersionSummaryList
import org.openapitools.client.api.PokedexDetail
import org.openapitools.client.api.VersionDetail
import org.openapitools.client.api.VersionGroupDetail

object GamesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def generationList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGenerationSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGenerationSummaryList] = jsonOf[PaginatedGenerationSummaryList]

    val path = "/api/v2/generation/"

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
      resp          <- client.expect[PaginatedGenerationSummaryList](req)

    } yield resp
  }

  def generationRetrieve(host: String, id: String): Task[GenerationDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerationDetail] = jsonOf[GenerationDetail]

    val path = "/api/v2/generation/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GenerationDetail](req)

    } yield resp
  }

  def pokedexList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokedexSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokedexSummaryList] = jsonOf[PaginatedPokedexSummaryList]

    val path = "/api/v2/pokedex/"

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
      resp          <- client.expect[PaginatedPokedexSummaryList](req)

    } yield resp
  }

  def pokedexRetrieve(host: String, id: String): Task[PokedexDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokedexDetail] = jsonOf[PokedexDetail]

    val path = "/api/v2/pokedex/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokedexDetail](req)

    } yield resp
  }

  def versionGroupList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedVersionGroupSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedVersionGroupSummaryList] = jsonOf[PaginatedVersionGroupSummaryList]

    val path = "/api/v2/version-group/"

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
      resp          <- client.expect[PaginatedVersionGroupSummaryList](req)

    } yield resp
  }

  def versionGroupRetrieve(host: String, id: String): Task[VersionGroupDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionGroupDetail] = jsonOf[VersionGroupDetail]

    val path = "/api/v2/version-group/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[VersionGroupDetail](req)

    } yield resp
  }

  def versionList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedVersionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedVersionSummaryList] = jsonOf[PaginatedVersionSummaryList]

    val path = "/api/v2/version/"

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
      resp          <- client.expect[PaginatedVersionSummaryList](req)

    } yield resp
  }

  def versionRetrieve(host: String, id: String): Task[VersionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionDetail] = jsonOf[VersionDetail]

    val path = "/api/v2/version/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[VersionDetail](req)

    } yield resp
  }

}

class HttpServiceGamesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def generationList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGenerationSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGenerationSummaryList] = jsonOf[PaginatedGenerationSummaryList]

    val path = "/api/v2/generation/"

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
      resp          <- client.expect[PaginatedGenerationSummaryList](req)

    } yield resp
  }

  def generationRetrieve(id: String): Task[GenerationDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerationDetail] = jsonOf[GenerationDetail]

    val path = "/api/v2/generation/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GenerationDetail](req)

    } yield resp
  }

  def pokedexList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokedexSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokedexSummaryList] = jsonOf[PaginatedPokedexSummaryList]

    val path = "/api/v2/pokedex/"

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
      resp          <- client.expect[PaginatedPokedexSummaryList](req)

    } yield resp
  }

  def pokedexRetrieve(id: String): Task[PokedexDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokedexDetail] = jsonOf[PokedexDetail]

    val path = "/api/v2/pokedex/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokedexDetail](req)

    } yield resp
  }

  def versionGroupList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedVersionGroupSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedVersionGroupSummaryList] = jsonOf[PaginatedVersionGroupSummaryList]

    val path = "/api/v2/version-group/"

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
      resp          <- client.expect[PaginatedVersionGroupSummaryList](req)

    } yield resp
  }

  def versionGroupRetrieve(id: String): Task[VersionGroupDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionGroupDetail] = jsonOf[VersionGroupDetail]

    val path = "/api/v2/version-group/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[VersionGroupDetail](req)

    } yield resp
  }

  def versionList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedVersionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedVersionSummaryList] = jsonOf[PaginatedVersionSummaryList]

    val path = "/api/v2/version/"

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
      resp          <- client.expect[PaginatedVersionSummaryList](req)

    } yield resp
  }

  def versionRetrieve(id: String): Task[VersionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionDetail] = jsonOf[VersionDetail]

    val path = "/api/v2/version/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[VersionDetail](req)

    } yield resp
  }

}
