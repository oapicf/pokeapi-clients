package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokemonHabitatSummaryList._

case class PaginatedPokemonHabitatSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokemonHabitatSummary]])

object PaginatedPokemonHabitatSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonHabitatSummaryListCodecJson: CodecJson[PaginatedPokemonHabitatSummaryList] = CodecJson.derive[PaginatedPokemonHabitatSummaryList]
  implicit val PaginatedPokemonHabitatSummaryListDecoder: EntityDecoder[PaginatedPokemonHabitatSummaryList] = jsonOf[PaginatedPokemonHabitatSummaryList]
  implicit val PaginatedPokemonHabitatSummaryListEncoder: EntityEncoder[PaginatedPokemonHabitatSummaryList] = jsonEncoderOf[PaginatedPokemonHabitatSummaryList]
}
