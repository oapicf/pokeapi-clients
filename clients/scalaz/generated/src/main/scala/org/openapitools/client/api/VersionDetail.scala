package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionDetail._

case class VersionDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[VersionName],
/* The version group this version belongs to. */
  versionGroup: VersionGroupSummary)

object VersionDetail {
  import DateTimeCodecs._

  implicit val VersionDetailCodecJson: CodecJson[VersionDetail] = CodecJson.derive[VersionDetail]
  implicit val VersionDetailDecoder: EntityDecoder[VersionDetail] = jsonOf[VersionDetail]
  implicit val VersionDetailEncoder: EntityEncoder[VersionDetail] = jsonEncoderOf[VersionDetail]
}
