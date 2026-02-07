package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedGenerationSummaryList._

case class PaginatedGenerationSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[GenerationSummary]])

object PaginatedGenerationSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedGenerationSummaryListCodecJson: CodecJson[PaginatedGenerationSummaryList] = CodecJson.derive[PaginatedGenerationSummaryList]
  implicit val PaginatedGenerationSummaryListDecoder: EntityDecoder[PaginatedGenerationSummaryList] = jsonOf[PaginatedGenerationSummaryList]
  implicit val PaginatedGenerationSummaryListEncoder: EntityEncoder[PaginatedGenerationSummaryList] = jsonEncoderOf[PaginatedGenerationSummaryList]
}
