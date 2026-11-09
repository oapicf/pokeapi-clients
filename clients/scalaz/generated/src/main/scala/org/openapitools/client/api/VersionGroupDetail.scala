package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionGroupDetail._

case class VersionGroupDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* Order for sorting. Almost by date of release, except similar versions are grouped together. */
  order: Option[Integer],
/* The generation this version was introduced in. */
  generation: GenerationSummary,
/* A list of methods in which Pokémon can learn moves in this version group. */
  moveLearnMethods: List[MoveLearnMethodSummary],
/* A list of Pokédexes introduces in this version group. */
  pokedexes: List[PokedexSummary],
/* A list of regions that can be visited in this version group. */
  regions: List[RegionSummary],
/* The versions this version group owns. */
  versions: List[VersionSummary])

object VersionGroupDetail {
  import DateTimeCodecs._

  implicit val VersionGroupDetailCodecJson: CodecJson[VersionGroupDetail] = CodecJson.derive[VersionGroupDetail]
  implicit val VersionGroupDetailDecoder: EntityDecoder[VersionGroupDetail] = jsonOf[VersionGroupDetail]
  implicit val VersionGroupDetailEncoder: EntityEncoder[VersionGroupDetail] = jsonEncoderOf[VersionGroupDetail]
}
