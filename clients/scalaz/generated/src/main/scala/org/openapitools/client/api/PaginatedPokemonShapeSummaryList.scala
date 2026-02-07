package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokemonShapeSummaryList._

case class PaginatedPokemonShapeSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokemonShapeSummary]])

object PaginatedPokemonShapeSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonShapeSummaryListCodecJson: CodecJson[PaginatedPokemonShapeSummaryList] = CodecJson.derive[PaginatedPokemonShapeSummaryList]
  implicit val PaginatedPokemonShapeSummaryListDecoder: EntityDecoder[PaginatedPokemonShapeSummaryList] = jsonOf[PaginatedPokemonShapeSummaryList]
  implicit val PaginatedPokemonShapeSummaryListEncoder: EntityEncoder[PaginatedPokemonShapeSummaryList] = jsonEncoderOf[PaginatedPokemonShapeSummaryList]
}
