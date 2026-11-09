package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonShapeDetail._

case class PokemonShapeDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The \"scientific\" name of this Pokémon shape listed in different languages. */
  awesomeNames: List[PokemonShapeAwesomeName],
/* The name of this resource listed in different languages. */
  names: List[PokemonShapeName],
/* A list of the Pokémon species that have this shape. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object PokemonShapeDetail {
  import DateTimeCodecs._

  implicit val PokemonShapeDetailCodecJson: CodecJson[PokemonShapeDetail] = CodecJson.derive[PokemonShapeDetail]
  implicit val PokemonShapeDetailDecoder: EntityDecoder[PokemonShapeDetail] = jsonOf[PokemonShapeDetail]
  implicit val PokemonShapeDetailEncoder: EntityEncoder[PokemonShapeDetail] = jsonEncoderOf[PokemonShapeDetail]
}
