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

import org.openapitools.client.api.AbilityDetail
import org.openapitools.client.api.CharacteristicDetail
import org.openapitools.client.api.EggGroupDetail
import org.openapitools.client.api.GenderDetail
import org.openapitools.client.api.GrowthRateDetail
import org.openapitools.client.api.MoveDamageClassDetail
import org.openapitools.client.api.NatureDetail
import org.openapitools.client.api.PaginatedAbilitySummaryList
import org.openapitools.client.api.PaginatedCharacteristicSummaryList
import org.openapitools.client.api.PaginatedEggGroupSummaryList
import org.openapitools.client.api.PaginatedGenderSummaryList
import org.openapitools.client.api.PaginatedGrowthRateSummaryList
import org.openapitools.client.api.PaginatedMoveDamageClassSummaryList
import org.openapitools.client.api.PaginatedNatureSummaryList
import org.openapitools.client.api.PaginatedPokeathlonStatSummaryList
import org.openapitools.client.api.PaginatedPokemonColorSummaryList
import org.openapitools.client.api.PaginatedPokemonFormSummaryList
import org.openapitools.client.api.PaginatedPokemonHabitatSummaryList
import org.openapitools.client.api.PaginatedPokemonShapeSummaryList
import org.openapitools.client.api.PaginatedPokemonSpeciesSummaryList
import org.openapitools.client.api.PaginatedPokemonSummaryList
import org.openapitools.client.api.PaginatedStatSummaryList
import org.openapitools.client.api.PaginatedTypeSummaryList
import org.openapitools.client.api.PokeathlonStatDetail
import org.openapitools.client.api.PokemonColorDetail
import org.openapitools.client.api.PokemonDetail
import org.openapitools.client.api.PokemonFormDetail
import org.openapitools.client.api.PokemonHabitatDetail
import org.openapitools.client.api.PokemonShapeDetail
import org.openapitools.client.api.PokemonSpeciesDetail
import org.openapitools.client.api.StatDetail
import org.openapitools.client.api.TypeDetail

object PokemonApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def abilityList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedAbilitySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedAbilitySummaryList] = jsonOf[PaginatedAbilitySummaryList]

    val path = "/api/v2/ability/"

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
      resp          <- client.expect[PaginatedAbilitySummaryList](req)

    } yield resp
  }

  def abilityRetrieve(host: String, id: String): Task[AbilityDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[AbilityDetail] = jsonOf[AbilityDetail]

    val path = "/api/v2/ability/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[AbilityDetail](req)

    } yield resp
  }

  def characteristicList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedCharacteristicSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedCharacteristicSummaryList] = jsonOf[PaginatedCharacteristicSummaryList]

    val path = "/api/v2/characteristic/"

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
      resp          <- client.expect[PaginatedCharacteristicSummaryList](req)

    } yield resp
  }

  def characteristicRetrieve(host: String, id: String): Task[CharacteristicDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[CharacteristicDetail] = jsonOf[CharacteristicDetail]

    val path = "/api/v2/characteristic/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[CharacteristicDetail](req)

    } yield resp
  }

  def eggGroupList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEggGroupSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEggGroupSummaryList] = jsonOf[PaginatedEggGroupSummaryList]

    val path = "/api/v2/egg-group/"

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
      resp          <- client.expect[PaginatedEggGroupSummaryList](req)

    } yield resp
  }

  def eggGroupRetrieve(host: String, id: String): Task[EggGroupDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EggGroupDetail] = jsonOf[EggGroupDetail]

    val path = "/api/v2/egg-group/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EggGroupDetail](req)

    } yield resp
  }

  def genderList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGenderSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGenderSummaryList] = jsonOf[PaginatedGenderSummaryList]

    val path = "/api/v2/gender/"

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
      resp          <- client.expect[PaginatedGenderSummaryList](req)

    } yield resp
  }

  def genderRetrieve(host: String, id: String): Task[GenderDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GenderDetail] = jsonOf[GenderDetail]

    val path = "/api/v2/gender/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GenderDetail](req)

    } yield resp
  }

  def growthRateList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGrowthRateSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGrowthRateSummaryList] = jsonOf[PaginatedGrowthRateSummaryList]

    val path = "/api/v2/growth-rate/"

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
      resp          <- client.expect[PaginatedGrowthRateSummaryList](req)

    } yield resp
  }

  def growthRateRetrieve(host: String, id: String): Task[GrowthRateDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GrowthRateDetail] = jsonOf[GrowthRateDetail]

    val path = "/api/v2/growth-rate/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GrowthRateDetail](req)

    } yield resp
  }

  def moveDamageClassList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveDamageClassSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveDamageClassSummaryList] = jsonOf[PaginatedMoveDamageClassSummaryList]

    val path = "/api/v2/move-damage-class/"

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
      resp          <- client.expect[PaginatedMoveDamageClassSummaryList](req)

    } yield resp
  }

  def moveDamageClassRetrieve(host: String, id: String): Task[MoveDamageClassDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveDamageClassDetail] = jsonOf[MoveDamageClassDetail]

    val path = "/api/v2/move-damage-class/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[MoveDamageClassDetail](req)

    } yield resp
  }

  def natureList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedNatureSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedNatureSummaryList] = jsonOf[PaginatedNatureSummaryList]

    val path = "/api/v2/nature/"

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
      resp          <- client.expect[PaginatedNatureSummaryList](req)

    } yield resp
  }

  def natureRetrieve(host: String, id: String): Task[NatureDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[NatureDetail] = jsonOf[NatureDetail]

    val path = "/api/v2/nature/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[NatureDetail](req)

    } yield resp
  }

  def pokeathlonStatList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokeathlonStatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokeathlonStatSummaryList] = jsonOf[PaginatedPokeathlonStatSummaryList]

    val path = "/api/v2/pokeathlon-stat/"

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
      resp          <- client.expect[PaginatedPokeathlonStatSummaryList](req)

    } yield resp
  }

  def pokeathlonStatRetrieve(host: String, id: String): Task[PokeathlonStatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokeathlonStatDetail] = jsonOf[PokeathlonStatDetail]

    val path = "/api/v2/pokeathlon-stat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokeathlonStatDetail](req)

    } yield resp
  }

  def pokemonColorList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonColorSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonColorSummaryList] = jsonOf[PaginatedPokemonColorSummaryList]

    val path = "/api/v2/pokemon-color/"

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
      resp          <- client.expect[PaginatedPokemonColorSummaryList](req)

    } yield resp
  }

  def pokemonColorRetrieve(host: String, id: String): Task[PokemonColorDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonColorDetail] = jsonOf[PokemonColorDetail]

    val path = "/api/v2/pokemon-color/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonColorDetail](req)

    } yield resp
  }

  def pokemonFormList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonFormSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonFormSummaryList] = jsonOf[PaginatedPokemonFormSummaryList]

    val path = "/api/v2/pokemon-form/"

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
      resp          <- client.expect[PaginatedPokemonFormSummaryList](req)

    } yield resp
  }

  def pokemonFormRetrieve(host: String, id: String): Task[PokemonFormDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonFormDetail] = jsonOf[PokemonFormDetail]

    val path = "/api/v2/pokemon-form/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonFormDetail](req)

    } yield resp
  }

  def pokemonHabitatList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonHabitatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonHabitatSummaryList] = jsonOf[PaginatedPokemonHabitatSummaryList]

    val path = "/api/v2/pokemon-habitat/"

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
      resp          <- client.expect[PaginatedPokemonHabitatSummaryList](req)

    } yield resp
  }

  def pokemonHabitatRetrieve(host: String, id: String): Task[PokemonHabitatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonHabitatDetail] = jsonOf[PokemonHabitatDetail]

    val path = "/api/v2/pokemon-habitat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonHabitatDetail](req)

    } yield resp
  }

  def pokemonList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonSummaryList] = jsonOf[PaginatedPokemonSummaryList]

    val path = "/api/v2/pokemon/"

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
      resp          <- client.expect[PaginatedPokemonSummaryList](req)

    } yield resp
  }

  def pokemonRetrieve(host: String, id: String): Task[PokemonDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonDetail] = jsonOf[PokemonDetail]

    val path = "/api/v2/pokemon/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonDetail](req)

    } yield resp
  }

  def pokemonShapeList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonShapeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonShapeSummaryList] = jsonOf[PaginatedPokemonShapeSummaryList]

    val path = "/api/v2/pokemon-shape/"

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
      resp          <- client.expect[PaginatedPokemonShapeSummaryList](req)

    } yield resp
  }

  def pokemonShapeRetrieve(host: String, id: String): Task[PokemonShapeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonShapeDetail] = jsonOf[PokemonShapeDetail]

    val path = "/api/v2/pokemon-shape/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonShapeDetail](req)

    } yield resp
  }

  def pokemonSpeciesList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonSpeciesSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonSpeciesSummaryList] = jsonOf[PaginatedPokemonSpeciesSummaryList]

    val path = "/api/v2/pokemon-species/"

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
      resp          <- client.expect[PaginatedPokemonSpeciesSummaryList](req)

    } yield resp
  }

  def pokemonSpeciesRetrieve(host: String, id: String): Task[PokemonSpeciesDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonSpeciesDetail] = jsonOf[PokemonSpeciesDetail]

    val path = "/api/v2/pokemon-species/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonSpeciesDetail](req)

    } yield resp
  }

  def statList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedStatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedStatSummaryList] = jsonOf[PaginatedStatSummaryList]

    val path = "/api/v2/stat/"

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
      resp          <- client.expect[PaginatedStatSummaryList](req)

    } yield resp
  }

  def statRetrieve(host: String, id: String): Task[StatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[StatDetail] = jsonOf[StatDetail]

    val path = "/api/v2/stat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[StatDetail](req)

    } yield resp
  }

  def typeList(host: String, limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedTypeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedTypeSummaryList] = jsonOf[PaginatedTypeSummaryList]

    val path = "/api/v2/type/"

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
      resp          <- client.expect[PaginatedTypeSummaryList](req)

    } yield resp
  }

  def typeRetrieve(host: String, id: String): Task[TypeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[TypeDetail] = jsonOf[TypeDetail]

    val path = "/api/v2/type/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[TypeDetail](req)

    } yield resp
  }

}

class HttpServicePokemonApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def abilityList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedAbilitySummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedAbilitySummaryList] = jsonOf[PaginatedAbilitySummaryList]

    val path = "/api/v2/ability/"

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
      resp          <- client.expect[PaginatedAbilitySummaryList](req)

    } yield resp
  }

  def abilityRetrieve(id: String): Task[AbilityDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[AbilityDetail] = jsonOf[AbilityDetail]

    val path = "/api/v2/ability/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[AbilityDetail](req)

    } yield resp
  }

  def characteristicList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedCharacteristicSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedCharacteristicSummaryList] = jsonOf[PaginatedCharacteristicSummaryList]

    val path = "/api/v2/characteristic/"

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
      resp          <- client.expect[PaginatedCharacteristicSummaryList](req)

    } yield resp
  }

  def characteristicRetrieve(id: String): Task[CharacteristicDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[CharacteristicDetail] = jsonOf[CharacteristicDetail]

    val path = "/api/v2/characteristic/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[CharacteristicDetail](req)

    } yield resp
  }

  def eggGroupList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedEggGroupSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedEggGroupSummaryList] = jsonOf[PaginatedEggGroupSummaryList]

    val path = "/api/v2/egg-group/"

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
      resp          <- client.expect[PaginatedEggGroupSummaryList](req)

    } yield resp
  }

  def eggGroupRetrieve(id: String): Task[EggGroupDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[EggGroupDetail] = jsonOf[EggGroupDetail]

    val path = "/api/v2/egg-group/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[EggGroupDetail](req)

    } yield resp
  }

  def genderList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGenderSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGenderSummaryList] = jsonOf[PaginatedGenderSummaryList]

    val path = "/api/v2/gender/"

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
      resp          <- client.expect[PaginatedGenderSummaryList](req)

    } yield resp
  }

  def genderRetrieve(id: String): Task[GenderDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GenderDetail] = jsonOf[GenderDetail]

    val path = "/api/v2/gender/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GenderDetail](req)

    } yield resp
  }

  def growthRateList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedGrowthRateSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedGrowthRateSummaryList] = jsonOf[PaginatedGrowthRateSummaryList]

    val path = "/api/v2/growth-rate/"

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
      resp          <- client.expect[PaginatedGrowthRateSummaryList](req)

    } yield resp
  }

  def growthRateRetrieve(id: String): Task[GrowthRateDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[GrowthRateDetail] = jsonOf[GrowthRateDetail]

    val path = "/api/v2/growth-rate/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[GrowthRateDetail](req)

    } yield resp
  }

  def moveDamageClassList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedMoveDamageClassSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedMoveDamageClassSummaryList] = jsonOf[PaginatedMoveDamageClassSummaryList]

    val path = "/api/v2/move-damage-class/"

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
      resp          <- client.expect[PaginatedMoveDamageClassSummaryList](req)

    } yield resp
  }

  def moveDamageClassRetrieve(id: String): Task[MoveDamageClassDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[MoveDamageClassDetail] = jsonOf[MoveDamageClassDetail]

    val path = "/api/v2/move-damage-class/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[MoveDamageClassDetail](req)

    } yield resp
  }

  def natureList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedNatureSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedNatureSummaryList] = jsonOf[PaginatedNatureSummaryList]

    val path = "/api/v2/nature/"

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
      resp          <- client.expect[PaginatedNatureSummaryList](req)

    } yield resp
  }

  def natureRetrieve(id: String): Task[NatureDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[NatureDetail] = jsonOf[NatureDetail]

    val path = "/api/v2/nature/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[NatureDetail](req)

    } yield resp
  }

  def pokeathlonStatList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokeathlonStatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokeathlonStatSummaryList] = jsonOf[PaginatedPokeathlonStatSummaryList]

    val path = "/api/v2/pokeathlon-stat/"

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
      resp          <- client.expect[PaginatedPokeathlonStatSummaryList](req)

    } yield resp
  }

  def pokeathlonStatRetrieve(id: String): Task[PokeathlonStatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokeathlonStatDetail] = jsonOf[PokeathlonStatDetail]

    val path = "/api/v2/pokeathlon-stat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokeathlonStatDetail](req)

    } yield resp
  }

  def pokemonColorList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonColorSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonColorSummaryList] = jsonOf[PaginatedPokemonColorSummaryList]

    val path = "/api/v2/pokemon-color/"

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
      resp          <- client.expect[PaginatedPokemonColorSummaryList](req)

    } yield resp
  }

  def pokemonColorRetrieve(id: String): Task[PokemonColorDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonColorDetail] = jsonOf[PokemonColorDetail]

    val path = "/api/v2/pokemon-color/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonColorDetail](req)

    } yield resp
  }

  def pokemonFormList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonFormSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonFormSummaryList] = jsonOf[PaginatedPokemonFormSummaryList]

    val path = "/api/v2/pokemon-form/"

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
      resp          <- client.expect[PaginatedPokemonFormSummaryList](req)

    } yield resp
  }

  def pokemonFormRetrieve(id: String): Task[PokemonFormDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonFormDetail] = jsonOf[PokemonFormDetail]

    val path = "/api/v2/pokemon-form/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonFormDetail](req)

    } yield resp
  }

  def pokemonHabitatList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonHabitatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonHabitatSummaryList] = jsonOf[PaginatedPokemonHabitatSummaryList]

    val path = "/api/v2/pokemon-habitat/"

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
      resp          <- client.expect[PaginatedPokemonHabitatSummaryList](req)

    } yield resp
  }

  def pokemonHabitatRetrieve(id: String): Task[PokemonHabitatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonHabitatDetail] = jsonOf[PokemonHabitatDetail]

    val path = "/api/v2/pokemon-habitat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonHabitatDetail](req)

    } yield resp
  }

  def pokemonList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonSummaryList] = jsonOf[PaginatedPokemonSummaryList]

    val path = "/api/v2/pokemon/"

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
      resp          <- client.expect[PaginatedPokemonSummaryList](req)

    } yield resp
  }

  def pokemonRetrieve(id: String): Task[PokemonDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonDetail] = jsonOf[PokemonDetail]

    val path = "/api/v2/pokemon/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonDetail](req)

    } yield resp
  }

  def pokemonShapeList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonShapeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonShapeSummaryList] = jsonOf[PaginatedPokemonShapeSummaryList]

    val path = "/api/v2/pokemon-shape/"

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
      resp          <- client.expect[PaginatedPokemonShapeSummaryList](req)

    } yield resp
  }

  def pokemonShapeRetrieve(id: String): Task[PokemonShapeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonShapeDetail] = jsonOf[PokemonShapeDetail]

    val path = "/api/v2/pokemon-shape/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonShapeDetail](req)

    } yield resp
  }

  def pokemonSpeciesList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedPokemonSpeciesSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedPokemonSpeciesSummaryList] = jsonOf[PaginatedPokemonSpeciesSummaryList]

    val path = "/api/v2/pokemon-species/"

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
      resp          <- client.expect[PaginatedPokemonSpeciesSummaryList](req)

    } yield resp
  }

  def pokemonSpeciesRetrieve(id: String): Task[PokemonSpeciesDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[PokemonSpeciesDetail] = jsonOf[PokemonSpeciesDetail]

    val path = "/api/v2/pokemon-species/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[PokemonSpeciesDetail](req)

    } yield resp
  }

  def statList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedStatSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedStatSummaryList] = jsonOf[PaginatedStatSummaryList]

    val path = "/api/v2/stat/"

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
      resp          <- client.expect[PaginatedStatSummaryList](req)

    } yield resp
  }

  def statRetrieve(id: String): Task[StatDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[StatDetail] = jsonOf[StatDetail]

    val path = "/api/v2/stat/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[StatDetail](req)

    } yield resp
  }

  def typeList(limit: Integer, offset: Integer, q: String)(implicit limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], qQuery: QueryParam[String]): Task[PaginatedTypeSummaryList] = {
    implicit val returnTypeDecoder: EntityDecoder[PaginatedTypeSummaryList] = jsonOf[PaginatedTypeSummaryList]

    val path = "/api/v2/type/"

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
      resp          <- client.expect[PaginatedTypeSummaryList](req)

    } yield resp
  }

  def typeRetrieve(id: String): Task[TypeDetail] = {
    implicit val returnTypeDecoder: EntityDecoder[TypeDetail] = jsonOf[TypeDetail]

    val path = "/api/v2/type/{id}/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[TypeDetail](req)

    } yield resp
  }

}
