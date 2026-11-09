package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderPokemonSpecies._

case class GenderPokemonSpecies (
  /* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
  rate: Integer,
/* A Pokémon species that can be the referenced gender. */
  pokemonSpecies: PokemonSpeciesSummary)

object GenderPokemonSpecies {
  import DateTimeCodecs._

  implicit val GenderPokemonSpeciesCodecJson: CodecJson[GenderPokemonSpecies] = CodecJson.derive[GenderPokemonSpecies]
  implicit val GenderPokemonSpeciesDecoder: EntityDecoder[GenderPokemonSpecies] = jsonOf[GenderPokemonSpecies]
  implicit val GenderPokemonSpeciesEncoder: EntityEncoder[GenderPokemonSpecies] = jsonEncoderOf[GenderPokemonSpecies]
}
