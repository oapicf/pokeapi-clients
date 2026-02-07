package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedLanguageSummaryList._

case class PaginatedLanguageSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[LanguageSummary]])

object PaginatedLanguageSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedLanguageSummaryListCodecJson: CodecJson[PaginatedLanguageSummaryList] = CodecJson.derive[PaginatedLanguageSummaryList]
  implicit val PaginatedLanguageSummaryListDecoder: EntityDecoder[PaginatedLanguageSummaryList] = jsonOf[PaginatedLanguageSummaryList]
  implicit val PaginatedLanguageSummaryListEncoder: EntityEncoder[PaginatedLanguageSummaryList] = jsonEncoderOf[PaginatedLanguageSummaryList]
}
