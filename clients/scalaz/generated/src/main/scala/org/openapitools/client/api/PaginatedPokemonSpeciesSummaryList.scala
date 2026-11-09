package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokemonSpeciesSummaryList._

case class PaginatedPokemonSpeciesSummaryList (
  /* The total number of resources available from this API. */
  count: Integer,
/* The URL for the next page in the list, or null if there is no next page. */
  next: Option[URI],
/* The URL for the previous page in the list, or null if there is no previous page. */
  previous: Option[URI],
/* A list of API resources on this page. */
  results: List[PokemonSpeciesSummary])

object PaginatedPokemonSpeciesSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonSpeciesSummaryListCodecJson: CodecJson[PaginatedPokemonSpeciesSummaryList] = CodecJson.derive[PaginatedPokemonSpeciesSummaryList]
  implicit val PaginatedPokemonSpeciesSummaryListDecoder: EntityDecoder[PaginatedPokemonSpeciesSummaryList] = jsonOf[PaginatedPokemonSpeciesSummaryList]
  implicit val PaginatedPokemonSpeciesSummaryListEncoder: EntityEncoder[PaginatedPokemonSpeciesSummaryList] = jsonEncoderOf[PaginatedPokemonSpeciesSummaryList]
}
