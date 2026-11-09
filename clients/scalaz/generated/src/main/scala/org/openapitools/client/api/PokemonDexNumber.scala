package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDexNumber._

case class PokemonDexNumber (
  /* The index of this Pokémon species entry within the Pokédex. */
  entryNumber: Integer,
/* The Pokémon species being encountered. */
  pokemonSpecies: PokemonSpeciesSummary)

object PokemonDexNumber {
  import DateTimeCodecs._

  implicit val PokemonDexNumberCodecJson: CodecJson[PokemonDexNumber] = CodecJson.derive[PokemonDexNumber]
  implicit val PokemonDexNumberDecoder: EntityDecoder[PokemonDexNumber] = jsonOf[PokemonDexNumber]
  implicit val PokemonDexNumberEncoder: EntityEncoder[PokemonDexNumber] = jsonEncoderOf[PokemonDexNumber]
}
