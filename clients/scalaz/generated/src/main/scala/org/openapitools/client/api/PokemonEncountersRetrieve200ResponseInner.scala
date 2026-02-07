package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonEncountersRetrieve200ResponseInner._

case class PokemonEncountersRetrieve200ResponseInner (
  locationArea: PokemonEncountersRetrieve200ResponseInnerLocationArea,
versionDetails: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner])

object PokemonEncountersRetrieve200ResponseInner {
  import DateTimeCodecs._

  implicit val PokemonEncountersRetrieve200ResponseInnerCodecJson: CodecJson[PokemonEncountersRetrieve200ResponseInner] = CodecJson.derive[PokemonEncountersRetrieve200ResponseInner]
  implicit val PokemonEncountersRetrieve200ResponseInnerDecoder: EntityDecoder[PokemonEncountersRetrieve200ResponseInner] = jsonOf[PokemonEncountersRetrieve200ResponseInner]
  implicit val PokemonEncountersRetrieve200ResponseInnerEncoder: EntityEncoder[PokemonEncountersRetrieve200ResponseInner] = jsonEncoderOf[PokemonEncountersRetrieve200ResponseInner]
}
