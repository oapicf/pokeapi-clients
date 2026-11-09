package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormType._

case class PokemonFormType (
  /* The order the Pokémon's types are listed in. */
  slot: Integer,
/* The type the referenced Form has. */
  `type`: TypeSummary)

object PokemonFormType {
  import DateTimeCodecs._

  implicit val PokemonFormTypeCodecJson: CodecJson[PokemonFormType] = CodecJson.derive[PokemonFormType]
  implicit val PokemonFormTypeDecoder: EntityDecoder[PokemonFormType] = jsonOf[PokemonFormType]
  implicit val PokemonFormTypeEncoder: EntityEncoder[PokemonFormType] = jsonEncoderOf[PokemonFormType]
}
