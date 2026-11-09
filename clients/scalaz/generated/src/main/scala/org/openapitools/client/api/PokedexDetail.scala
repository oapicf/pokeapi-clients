package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexDetail._

case class PokedexDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* Whether or not this Pokédex originated in the main series of the video games. */
  isMainSeries: Option[Boolean],
/* The description of this resource listed in different languages. */
  descriptions: List[PokedexDescription],
/* The name of this resource listed in different languages. */
  names: List[PokedexName],
/* A list of Pokémon catalogued in this Pokédex and their indexes. */
  pokemonEntries: List[PokemonDexNumber],
/* The region this Pokédex catalogues Pokémon for. */
  region: RegionSummary,
/* A list of version groups this Pokédex is relevant to. */
  versionGroups: List[VersionGroupSummary])

object PokedexDetail {
  import DateTimeCodecs._

  implicit val PokedexDetailCodecJson: CodecJson[PokedexDetail] = CodecJson.derive[PokedexDetail]
  implicit val PokedexDetailDecoder: EntityDecoder[PokedexDetail] = jsonOf[PokedexDetail]
  implicit val PokedexDetailEncoder: EntityEncoder[PokedexDetail] = jsonEncoderOf[PokedexDetail]
}
