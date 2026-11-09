package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexDescription._

case class PokedexDescription (
  /* The localized description for an API resource in a specific language. */
  description: Option[String],
/* The language this name is in. */
  language: LanguageSummary)

object PokedexDescription {
  import DateTimeCodecs._

  implicit val PokedexDescriptionCodecJson: CodecJson[PokedexDescription] = CodecJson.derive[PokedexDescription]
  implicit val PokedexDescriptionDecoder: EntityDecoder[PokedexDescription] = jsonOf[PokedexDescription]
  implicit val PokedexDescriptionEncoder: EntityEncoder[PokedexDescription] = jsonEncoderOf[PokedexDescription]
}
