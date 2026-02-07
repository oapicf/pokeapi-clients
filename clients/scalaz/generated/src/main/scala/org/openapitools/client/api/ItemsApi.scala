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

import org.openapitools.client.api.ItemAttributeDetail
import org.openapitools.client.api.ItemCategoryDetail
import org.openapitools.client.api.ItemDetail
import org.openapitools.client.api.ItemFlingEffectDetail
import org.openapitools.client.api.ItemPocketDetail
import org.openapitools.client.api.PaginatedItemAttributeSummaryList
import org.openapitools.client.api.PaginatedItemCategorySummaryList
import org.openapitools.client.api.PaginatedItemFlingEffectSummaryList
import org.openapitools.client.api.PaginatedItemPocketSummaryList
import org.openapitools.client.api.PaginatedItemSummaryList

object ItemsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def itemAttributeList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemAttributeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemAttributeSummaryList] = jsonOf[PaginatedItemAttributeSummaryList]

    val path = "/api/v2/item-attribute/"

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
      resp          <- client.expect[PaginatedItemAttributeSummaryList](req)

    } yield resp
  }

  def itemAttributeRetrieve(host: String, id: String): Task[ItemAttributeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemAttributeDetail] = jsonOf[ItemAttributeDetail]

    val path = "/api/v2/item-attribute/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemAttributeDetail](req)

    } yield resp
  }

  def itemCategoryList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemCategorySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemCategorySummaryList] = jsonOf[PaginatedItemCategorySummaryList]

    val path = "/api/v2/item-category/"

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
      resp          <- client.expect[PaginatedItemCategorySummaryList](req)

    } yield resp
  }

  def itemCategoryRetrieve(host: String, id: String): Task[ItemCategoryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemCategoryDetail] = jsonOf[ItemCategoryDetail]

    val path = "/api/v2/item-category/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemCategoryDetail](req)

    } yield resp
  }

  def itemFlingEffectList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemFlingEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemFlingEffectSummaryList] = jsonOf[PaginatedItemFlingEffectSummaryList]

    val path = "/api/v2/item-fling-effect/"

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
      resp          <- client.expect[PaginatedItemFlingEffectSummaryList](req)

    } yield resp
  }

  def itemFlingEffectRetrieve(host: String, id: String): Task[ItemFlingEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemFlingEffectDetail] = jsonOf[ItemFlingEffectDetail]

    val path = "/api/v2/item-fling-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemFlingEffectDetail](req)

    } yield resp
  }

  def itemList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemSummaryList] = jsonOf[PaginatedItemSummaryList]

    val path = "/api/v2/item/"

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
      resp          <- client.expect[PaginatedItemSummaryList](req)

    } yield resp
  }

  def itemPocketList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemPocketSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemPocketSummaryList] = jsonOf[PaginatedItemPocketSummaryList]

    val path = "/api/v2/item-pocket/"

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
      resp          <- client.expect[PaginatedItemPocketSummaryList](req)

    } yield resp
  }

  def itemPocketRetrieve(host: String, id: String): Task[ItemPocketDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemPocketDetail] = jsonOf[ItemPocketDetail]

    val path = "/api/v2/item-pocket/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemPocketDetail](req)

    } yield resp
  }

  def itemRetrieve(host: String, id: String): Task[ItemDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemDetail] = jsonOf[ItemDetail]

    val path = "/api/v2/item/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemDetail](req)

    } yield resp
  }

}

class HttpServiceItemsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def itemAttributeList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemAttributeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemAttributeSummaryList] = jsonOf[PaginatedItemAttributeSummaryList]

    val path = "/api/v2/item-attribute/"

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
      resp          <- client.expect[PaginatedItemAttributeSummaryList](req)

    } yield resp
  }

  def itemAttributeRetrieve(id: String): Task[ItemAttributeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemAttributeDetail] = jsonOf[ItemAttributeDetail]

    val path = "/api/v2/item-attribute/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemAttributeDetail](req)

    } yield resp
  }

  def itemCategoryList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemCategorySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemCategorySummaryList] = jsonOf[PaginatedItemCategorySummaryList]

    val path = "/api/v2/item-category/"

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
      resp          <- client.expect[PaginatedItemCategorySummaryList](req)

    } yield resp
  }

  def itemCategoryRetrieve(id: String): Task[ItemCategoryDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemCategoryDetail] = jsonOf[ItemCategoryDetail]

    val path = "/api/v2/item-category/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemCategoryDetail](req)

    } yield resp
  }

  def itemFlingEffectList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemFlingEffectSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemFlingEffectSummaryList] = jsonOf[PaginatedItemFlingEffectSummaryList]

    val path = "/api/v2/item-fling-effect/"

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
      resp          <- client.expect[PaginatedItemFlingEffectSummaryList](req)

    } yield resp
  }

  def itemFlingEffectRetrieve(id: String): Task[ItemFlingEffectDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemFlingEffectDetail] = jsonOf[ItemFlingEffectDetail]

    val path = "/api/v2/item-fling-effect/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemFlingEffectDetail](req)

    } yield resp
  }

  def itemList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemSummaryList] = jsonOf[PaginatedItemSummaryList]

    val path = "/api/v2/item/"

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
      resp          <- client.expect[PaginatedItemSummaryList](req)

    } yield resp
  }

  def itemPocketList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedItemPocketSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedItemPocketSummaryList] = jsonOf[PaginatedItemPocketSummaryList]

    val path = "/api/v2/item-pocket/"

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
      resp          <- client.expect[PaginatedItemPocketSummaryList](req)

    } yield resp
  }

  def itemPocketRetrieve(id: String): Task[ItemPocketDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemPocketDetail] = jsonOf[ItemPocketDetail]

    val path = "/api/v2/item-pocket/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemPocketDetail](req)

    } yield resp
  }

  def itemRetrieve(id: String): Task[ItemDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemDetail] = jsonOf[ItemDetail]

    val path = "/api/v2/item/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[ItemDetail](req)

    } yield resp
  }

}
