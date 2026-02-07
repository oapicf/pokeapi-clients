package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDescription._

case class PokemonSpeciesDescription (
  description: Option[String],
language: LanguageSummary)

object PokemonSpeciesDescription {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDescriptionCodecJson: CodecJson[PokemonSpeciesDescription] = CodecJson.derive[PokemonSpeciesDescription]
  implicit val PokemonSpeciesDescriptionDecoder: EntityDecoder[PokemonSpeciesDescription] = jsonOf[PokemonSpeciesDescription]
  implicit val PokemonSpeciesDescriptionEncoder: EntityEncoder[PokemonSpeciesDescription] = jsonEncoderOf[PokemonSpeciesDescription]
}
