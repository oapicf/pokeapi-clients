package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NatureDetail._

case class NatureDetail (
  id: Integer,
name: String,
decreasedStat: StatSummary,
increasedStat: StatSummary,
likesFlavor: BerryFlavorSummary,
hatesFlavor: BerryFlavorSummary,
berries: List[BerrySummary],
pokeathlonStatChanges: List[NatureDetailPokeathlonStatChangesInner],
moveBattleStylePreferences: List[NatureBattleStylePreference],
names: List[NatureName])

object NatureDetail {
  import DateTimeCodecs._

  implicit val NatureDetailCodecJson: CodecJson[NatureDetail] = CodecJson.derive[NatureDetail]
  implicit val NatureDetailDecoder: EntityDecoder[NatureDetail] = jsonOf[NatureDetail]
  implicit val NatureDetailEncoder: EntityEncoder[NatureDetail] = jsonEncoderOf[NatureDetail]
}
