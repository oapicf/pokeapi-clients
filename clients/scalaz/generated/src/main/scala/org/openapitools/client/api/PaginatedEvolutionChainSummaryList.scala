package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEvolutionChainSummaryList._

case class PaginatedEvolutionChainSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EvolutionChainSummary]])

object PaginatedEvolutionChainSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEvolutionChainSummaryListCodecJson: CodecJson[PaginatedEvolutionChainSummaryList] = CodecJson.derive[PaginatedEvolutionChainSummaryList]
  implicit val PaginatedEvolutionChainSummaryListDecoder: EntityDecoder[PaginatedEvolutionChainSummaryList] = jsonOf[PaginatedEvolutionChainSummaryList]
  implicit val PaginatedEvolutionChainSummaryListEncoder: EntityEncoder[PaginatedEvolutionChainSummaryList] = jsonEncoderOf[PaginatedEvolutionChainSummaryList]
}
