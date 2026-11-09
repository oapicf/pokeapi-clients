package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesGenus._

case class PokemonSpeciesGenus (
  /* The localized genus for the referenced Pokémon species */
  genus: String,
/* The language this genus is in. */
  language: LanguageSummary)

object PokemonSpeciesGenus {
  import DateTimeCodecs._

  implicit val PokemonSpeciesGenusCodecJson: CodecJson[PokemonSpeciesGenus] = CodecJson.derive[PokemonSpeciesGenus]
  implicit val PokemonSpeciesGenusDecoder: EntityDecoder[PokemonSpeciesGenus] = jsonOf[PokemonSpeciesGenus]
  implicit val PokemonSpeciesGenusEncoder: EntityEncoder[PokemonSpeciesGenus] = jsonEncoderOf[PokemonSpeciesGenus]
}
