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

import org.openapitools.client.api.EvolutionChainDetail
import org.openapitools.client.api.EvolutionTriggerDetail
import org.openapitools.client.api.PaginatedEvolutionChainSummaryList
import org.openapitools.client.api.PaginatedEvolutionTriggerSummaryList

object EvolutionApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def evolutionChainList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEvolutionChainSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEvolutionChainSummaryList] = jsonOf[PaginatedEvolutionChainSummaryList]

    val path = "/api/v2/evolution-chain/"

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
      resp          <- client.expect[PaginatedEvolutionChainSummaryList](req)

    } yield resp
  }

  def evolutionChainRetrieve(host: String, id: String): Task[EvolutionChainDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EvolutionChainDetail] = jsonOf[EvolutionChainDetail]

    val path = "/api/v2/evolution-chain/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EvolutionChainDetail](req)

    } yield resp
  }

  def evolutionTriggerList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEvolutionTriggerSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEvolutionTriggerSummaryList] = jsonOf[PaginatedEvolutionTriggerSummaryList]

    val path = "/api/v2/evolution-trigger/"

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
      resp          <- client.expect[PaginatedEvolutionTriggerSummaryList](req)

    } yield resp
  }

  def evolutionTriggerRetrieve(host: String, id: String): Task[EvolutionTriggerDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EvolutionTriggerDetail] = jsonOf[EvolutionTriggerDetail]

    val path = "/api/v2/evolution-trigger/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EvolutionTriggerDetail](req)

    } yield resp
  }

}

class HttpServiceEvolutionApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def evolutionChainList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEvolutionChainSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEvolutionChainSummaryList] = jsonOf[PaginatedEvolutionChainSummaryList]

    val path = "/api/v2/evolution-chain/"

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
      resp          <- client.expect[PaginatedEvolutionChainSummaryList](req)

    } yield resp
  }

  def evolutionChainRetrieve(id: String): Task[EvolutionChainDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EvolutionChainDetail] = jsonOf[EvolutionChainDetail]

    val path = "/api/v2/evolution-chain/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EvolutionChainDetail](req)

    } yield resp
  }

  def evolutionTriggerList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEvolutionTriggerSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEvolutionTriggerSummaryList] = jsonOf[PaginatedEvolutionTriggerSummaryList]

    val path = "/api/v2/evolution-trigger/"

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
      resp          <- client.expect[PaginatedEvolutionTriggerSummaryList](req)

    } yield resp
  }

  def evolutionTriggerRetrieve(id: String): Task[EvolutionTriggerDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EvolutionTriggerDetail] = jsonOf[EvolutionTriggerDetail]

    val path = "/api/v2/evolution-trigger/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EvolutionTriggerDetail](req)

    } yield resp
  }

}
