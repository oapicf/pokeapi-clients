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

import org.openapitools.client.api.EncounterConditionDetail
import org.openapitools.client.api.EncounterConditionValueDetail
import org.openapitools.client.api.EncounterMethodDetail
import org.openapitools.client.api.PaginatedEncounterConditionSummaryList
import org.openapitools.client.api.PaginatedEncounterConditionValueSummaryList
import org.openapitools.client.api.PaginatedEncounterMethodSummaryList
import org.openapitools.client.api.PokemonEncountersRetrieve200ResponseInner

object EncountersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def encounterConditionList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterConditionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterConditionSummaryList] = jsonOf[PaginatedEncounterConditionSummaryList]

    val path = "/api/v2/encounter-condition/"

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
      resp          <- client.expect[PaginatedEncounterConditionSummaryList](req)

    } yield resp
  }

  def encounterConditionRetrieve(host: String, id: String): Task[EncounterConditionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterConditionDetail] = jsonOf[EncounterConditionDetail]

    val path = "/api/v2/encounter-condition/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterConditionDetail](req)

    } yield resp
  }

  def encounterConditionValueList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterConditionValueSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterConditionValueSummaryList] = jsonOf[PaginatedEncounterConditionValueSummaryList]

    val path = "/api/v2/encounter-condition-value/"

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
      resp          <- client.expect[PaginatedEncounterConditionValueSummaryList](req)

    } yield resp
  }

  def encounterConditionValueRetrieve(host: String, id: String): Task[EncounterConditionValueDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterConditionValueDetail] = jsonOf[EncounterConditionValueDetail]

    val path = "/api/v2/encounter-condition-value/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterConditionValueDetail](req)

    } yield resp
  }

  def encounterMethodList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterMethodSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterMethodSummaryList] = jsonOf[PaginatedEncounterMethodSummaryList]

    val path = "/api/v2/encounter-method/"

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
      resp          <- client.expect[PaginatedEncounterMethodSummaryList](req)

    } yield resp
  }

  def encounterMethodRetrieve(host: String, id: String): Task[EncounterMethodDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterMethodDetail] = jsonOf[EncounterMethodDetail]

    val path = "/api/v2/encounter-method/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterMethodDetail](req)

    } yield resp
  }

  def pokemonEncountersRetrieve(host: String, pokemonId: String): Task[List[PokemonEncountersRetrieve200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[PokemonEncountersRetrieve200ResponseInner]] = jsonOf[List[PokemonEncountersRetrieve200ResponseInner]]

    val path = "/api/v2/pokemon/{pokemon_id}/encounters".replaceAll("\\{" + "pokemon_id" + "\\}",escape(pokemonId.toString))

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
      resp          <- client.expect[List[PokemonEncountersRetrieve200ResponseInner]](req)

    } yield resp
  }

}

class HttpServiceEncountersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def encounterConditionList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterConditionSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterConditionSummaryList] = jsonOf[PaginatedEncounterConditionSummaryList]

    val path = "/api/v2/encounter-condition/"

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
      resp          <- client.expect[PaginatedEncounterConditionSummaryList](req)

    } yield resp
  }

  def encounterConditionRetrieve(id: String): Task[EncounterConditionDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterConditionDetail] = jsonOf[EncounterConditionDetail]

    val path = "/api/v2/encounter-condition/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterConditionDetail](req)

    } yield resp
  }

  def encounterConditionValueList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterConditionValueSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterConditionValueSummaryList] = jsonOf[PaginatedEncounterConditionValueSummaryList]

    val path = "/api/v2/encounter-condition-value/"

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
      resp          <- client.expect[PaginatedEncounterConditionValueSummaryList](req)

    } yield resp
  }

  def encounterConditionValueRetrieve(id: String): Task[EncounterConditionValueDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterConditionValueDetail] = jsonOf[EncounterConditionValueDetail]

    val path = "/api/v2/encounter-condition-value/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterConditionValueDetail](req)

    } yield resp
  }

  def encounterMethodList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEncounterMethodSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEncounterMethodSummaryList] = jsonOf[PaginatedEncounterMethodSummaryList]

    val path = "/api/v2/encounter-method/"

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
      resp          <- client.expect[PaginatedEncounterMethodSummaryList](req)

    } yield resp
  }

  def encounterMethodRetrieve(id: String): Task[EncounterMethodDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EncounterMethodDetail] = jsonOf[EncounterMethodDetail]

    val path = "/api/v2/encounter-method/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EncounterMethodDetail](req)

    } yield resp
  }

  def pokemonEncountersRetrieve(pokemonId: String): Task[List[PokemonEncountersRetrieve200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[PokemonEncountersRetrieve200ResponseInner]] = jsonOf[List[PokemonEncountersRetrieve200ResponseInner]]

    val path = "/api/v2/pokemon/{pokemon_id}/encounters".replaceAll("\\{" + "pokemon_id" + "\\}",escape(pokemonId.toString))

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
      resp          <- client.expect[List[PokemonEncountersRetrieve200ResponseInner]](req)

    } yield resp
  }

}
