package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMachineSummaryList._

case class PaginatedMachineSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MachineSummary]])

object PaginatedMachineSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMachineSummaryListCodecJson: CodecJson[PaginatedMachineSummaryList] = CodecJson.derive[PaginatedMachineSummaryList]
  implicit val PaginatedMachineSummaryListDecoder: EntityDecoder[PaginatedMachineSummaryList] = jsonOf[PaginatedMachineSummaryList]
  implicit val PaginatedMachineSummaryListEncoder: EntityEncoder[PaginatedMachineSummaryList] = jsonEncoderOf[PaginatedMachineSummaryList]
}
