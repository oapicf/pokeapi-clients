package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionDetail._

case class RegionDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of locations that can be found in this region. */
  locations: List[LocationSummary],
/* The generation this region was introduced in. */
  mainGeneration: GenerationSummary,
/* The name of this resource listed in different languages. */
  names: List[RegionName],
/* A list of pokédexes that catalogue Pokémon in this region. */
  pokedexes: List[PokedexSummary],
/* A list of version groups where this region can be visited. */
  versionGroups: List[VersionGroupSummary])

object RegionDetail {
  import DateTimeCodecs._

  implicit val RegionDetailCodecJson: CodecJson[RegionDetail] = CodecJson.derive[RegionDetail]
  implicit val RegionDetailDecoder: EntityDecoder[RegionDetail] = jsonOf[RegionDetail]
  implicit val RegionDetailEncoder: EntityEncoder[RegionDetail] = jsonEncoderOf[RegionDetail]
}
