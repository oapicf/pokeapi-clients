package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NatureDetail._

case class NatureDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The stat decreased by 10% in Pokémon with this nature. */
  decreasedStat: StatSummary,
/* The stat increased by 10% in Pokémon with this nature. */
  increasedStat: StatSummary,
/* The flavor liked by Pokémon with this nature. */
  likesFlavor: BerryFlavorSummary,
/* The flavor hated by Pokémon with this nature. */
  hatesFlavor: BerryFlavorSummary,
/* A list of Pokéathlon stats this nature effects and how much it effects them. */
  pokeathlonStatChanges: List[NaturePokeathlonStat],
/* A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. */
  moveBattleStylePreferences: List[NatureBattleStylePreference],
/* The name of this resource listed in different languages. */
  names: List[NatureName])

object NatureDetail {
  import DateTimeCodecs._

  implicit val NatureDetailCodecJson: CodecJson[NatureDetail] = CodecJson.derive[NatureDetail]
  implicit val NatureDetailDecoder: EntityDecoder[NatureDetail] = jsonOf[NatureDetail]
  implicit val NatureDetailEncoder: EntityEncoder[NatureDetail] = jsonEncoderOf[NatureDetail]
}
