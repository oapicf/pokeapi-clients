package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDexEntry._

case class PokemonDexEntry (
  entryNumber: Integer,
pokedex: PokedexSummary)

object PokemonDexEntry {
  import DateTimeCodecs._

  implicit val PokemonDexEntryCodecJson: CodecJson[PokemonDexEntry] = CodecJson.derive[PokemonDexEntry]
  implicit val PokemonDexEntryDecoder: EntityDecoder[PokemonDexEntry] = jsonOf[PokemonDexEntry]
  implicit val PokemonDexEntryEncoder: EntityEncoder[PokemonDexEntry] = jsonEncoderOf[PokemonDexEntry]
}
