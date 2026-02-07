package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaDetailPokemonEncountersInner._

case class LocationAreaDetailPokemonEncountersInner (
  pokemon: AbilityDetailPokemonInnerPokemon,
versionDetails: List[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner])

object LocationAreaDetailPokemonEncountersInner {
  import DateTimeCodecs._

  implicit val LocationAreaDetailPokemonEncountersInnerCodecJson: CodecJson[LocationAreaDetailPokemonEncountersInner] = CodecJson.derive[LocationAreaDetailPokemonEncountersInner]
  implicit val LocationAreaDetailPokemonEncountersInnerDecoder: EntityDecoder[LocationAreaDetailPokemonEncountersInner] = jsonOf[LocationAreaDetailPokemonEncountersInner]
  implicit val LocationAreaDetailPokemonEncountersInnerEncoder: EntityEncoder[LocationAreaDetailPokemonEncountersInner] = jsonEncoderOf[LocationAreaDetailPokemonEncountersInner]
}
