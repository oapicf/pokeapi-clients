package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexDescription._

case class PokedexDescription (
  description: Option[String],
language: LanguageSummary)

object PokedexDescription {
  import DateTimeCodecs._

  implicit val PokedexDescriptionCodecJson: CodecJson[PokedexDescription] = CodecJson.derive[PokedexDescription]
  implicit val PokedexDescriptionDecoder: EntityDecoder[PokedexDescription] = jsonOf[PokedexDescription]
  implicit val PokedexDescriptionEncoder: EntityEncoder[PokedexDescription] = jsonEncoderOf[PokedexDescription]
}
