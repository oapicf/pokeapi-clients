package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityDetail._

case class AbilityDetail (
  id: Integer,
name: String,
isMainSeries: Option[Boolean],
generation: GenerationSummary,
names: List[AbilityName],
effectEntries: List[AbilityEffectText],
effectChanges: List[AbilityChange],
flavorTextEntries: List[AbilityFlavorText],
pokemon: List[AbilityDetailPokemonInner])

object AbilityDetail {
  import DateTimeCodecs._

  implicit val AbilityDetailCodecJson: CodecJson[AbilityDetail] = CodecJson.derive[AbilityDetail]
  implicit val AbilityDetailDecoder: EntityDecoder[AbilityDetail] = jsonOf[AbilityDetail]
  implicit val AbilityDetailEncoder: EntityEncoder[AbilityDetail] = jsonEncoderOf[AbilityDetail]
}
