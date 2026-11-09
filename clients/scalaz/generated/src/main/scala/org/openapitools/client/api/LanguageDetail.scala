package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LanguageDetail._

case class LanguageDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* Whether or not the games are published in this language. */
  official: Option[Boolean],
/* The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. */
  iso639: String,
/* The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. */
  iso3166: String,
/* The name of this resource listed in different languages. */
  names: List[LanguageName])

object LanguageDetail {
  import DateTimeCodecs._

  implicit val LanguageDetailCodecJson: CodecJson[LanguageDetail] = CodecJson.derive[LanguageDetail]
  implicit val LanguageDetailDecoder: EntityDecoder[LanguageDetail] = jsonOf[LanguageDetail]
  implicit val LanguageDetailEncoder: EntityEncoder[LanguageDetail] = jsonEncoderOf[LanguageDetail]
}
