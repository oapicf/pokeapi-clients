package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetail._

case class TypeDetail (
  id: Integer,
name: String,
damageRelations: TypeDetailDamageRelations,
pastDamageRelations: List[TypeDetailPastDamageRelationsInner],
gameIndices: List[TypeGameIndex],
generation: GenerationSummary,
moveDamageClass: MoveDamageClassSummary,
names: List[AbilityName],
pokemon: List[TypeDetailPokemonInner],
moves: List[MoveSummary],
sprites: Map[String, Map[String, TypeDetailSpritesValueValue]])

object TypeDetail {
  import DateTimeCodecs._

  implicit val TypeDetailCodecJson: CodecJson[TypeDetail] = CodecJson.derive[TypeDetail]
  implicit val TypeDetailDecoder: EntityDecoder[TypeDetail] = jsonOf[TypeDetail]
  implicit val TypeDetailEncoder: EntityEncoder[TypeDetail] = jsonEncoderOf[TypeDetail]
}
