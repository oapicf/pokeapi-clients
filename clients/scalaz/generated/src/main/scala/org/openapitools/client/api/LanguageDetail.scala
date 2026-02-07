package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LanguageDetail._

case class LanguageDetail (
  id: Integer,
name: String,
official: Option[Boolean],
iso639: String,
iso3166: String,
names: List[LanguageName])

object LanguageDetail {
  import DateTimeCodecs._

  implicit val LanguageDetailCodecJson: CodecJson[LanguageDetail] = CodecJson.derive[LanguageDetail]
  implicit val LanguageDetailDecoder: EntityDecoder[LanguageDetail] = jsonOf[LanguageDetail]
  implicit val LanguageDetailEncoder: EntityEncoder[LanguageDetail] = jsonEncoderOf[LanguageDetail]
}
