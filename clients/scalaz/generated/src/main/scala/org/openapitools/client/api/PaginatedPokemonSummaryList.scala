package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokemonSummaryList._

case class PaginatedPokemonSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokemonSummary]])

object PaginatedPokemonSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonSummaryListCodecJson: CodecJson[PaginatedPokemonSummaryList] = CodecJson.derive[PaginatedPokemonSummaryList]
  implicit val PaginatedPokemonSummaryListDecoder: EntityDecoder[PaginatedPokemonSummaryList] = jsonOf[PaginatedPokemonSummaryList]
  implicit val PaginatedPokemonSummaryListEncoder: EntityEncoder[PaginatedPokemonSummaryList] = jsonEncoderOf[PaginatedPokemonSummaryList]
}
