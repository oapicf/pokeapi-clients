package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetail._

case class PokemonDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The base experience gained for defeating this Pokémon. */
  baseExperience: Option[Integer],
/* The height of this Pokémon in decimetres. */
  height: Option[Integer],
/* Set for exactly one Pokémon used as the default for each species. */
  isDefault: Option[Boolean],
/* Order for sorting. Almost national order, except families are grouped together. */
  order: Option[Integer],
/* The weight of this Pokémon in hectograms. */
  weight: Option[Integer],
/* A list of abilities this Pokémon could potentially have. */
  abilities: List[PokemonAbility],
/* A list of details showing abilities this pokémon had in previous generations */
  pastAbilities: List[PokemonPastAbility],
/* A list of forms this Pokémon can take on. */
  forms: List[PokemonFormSummary],
/* A list of game indices relevent to Pokémon item by generation. */
  gameIndices: List[PokemonGameIndex],
/* A list of items this Pokémon may be holding when encountered. */
  heldItems: List[PokemonHeldItemSummary],
/* A link to a list of location areas, as well as encounter details pertaining to specific versions. */
  locationAreaEncounters: String,
/* A list of moves along with learn methods and level details pertaining to specific version groups. */
  moves: List[PokemonMove],
/* The species this Pokémon belongs to. */
  species: PokemonSpeciesSummary,
/* A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> */
  sprites: PokemonSprites,
/* A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> */
  cries: PokemonCries,
/* A list of base stat values for this Pokémon. */
  stats: List[PokemonStat],
/* A list of details showing stats this pokémon had in previous generations */
  pastStats: List[PokemonPastStat],
/* A list of details showing types this Pokémon has. */
  types: List[PokemonType],
/* A list of details showing types this pokémon had in previous generations */
  pastTypes: List[PokemonPastType])

object PokemonDetail {
  import DateTimeCodecs._

  implicit val PokemonDetailCodecJson: CodecJson[PokemonDetail] = CodecJson.derive[PokemonDetail]
  implicit val PokemonDetailDecoder: EntityDecoder[PokemonDetail] = jsonOf[PokemonDetail]
  implicit val PokemonDetailEncoder: EntityEncoder[PokemonDetail] = jsonEncoderOf[PokemonDetail]
}
