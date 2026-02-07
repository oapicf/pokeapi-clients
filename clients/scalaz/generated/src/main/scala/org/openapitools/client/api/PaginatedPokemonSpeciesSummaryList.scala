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
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokemonSpeciesSummary]])

object PaginatedPokemonSpeciesSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonSpeciesSummaryListCodecJson: CodecJson[PaginatedPokemonSpeciesSummaryList] = CodecJson.derive[PaginatedPokemonSpeciesSummaryList]
  implicit val PaginatedPokemonSpeciesSummaryListDecoder: EntityDecoder[PaginatedPokemonSpeciesSummaryList] = jsonOf[PaginatedPokemonSpeciesSummaryList]
  implicit val PaginatedPokemonSpeciesSummaryListEncoder: EntityEncoder[PaginatedPokemonSpeciesSummaryList] = jsonEncoderOf[PaginatedPokemonSpeciesSummaryList]
}
