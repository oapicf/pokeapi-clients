package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EggGroupDetail._

case class EggGroupDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[EggGroupName],
/* A list of all Pokémon species that are members of this egg group. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object EggGroupDetail {
  import DateTimeCodecs._

  implicit val EggGroupDetailCodecJson: CodecJson[EggGroupDetail] = CodecJson.derive[EggGroupDetail]
  implicit val EggGroupDetailDecoder: EntityDecoder[EggGroupDetail] = jsonOf[EggGroupDetail]
  implicit val EggGroupDetailEncoder: EntityEncoder[EggGroupDetail] = jsonEncoderOf[EggGroupDetail]
}
