package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetailPastDamageRelationsInner._

case class TypeDetailPastDamageRelationsInner (
  generation: AbilityDetailPokemonInnerPokemon,
damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations)

object TypeDetailPastDamageRelationsInner {
  import DateTimeCodecs._

  implicit val TypeDetailPastDamageRelationsInnerCodecJson: CodecJson[TypeDetailPastDamageRelationsInner] = CodecJson.derive[TypeDetailPastDamageRelationsInner]
  implicit val TypeDetailPastDamageRelationsInnerDecoder: EntityDecoder[TypeDetailPastDamageRelationsInner] = jsonOf[TypeDetailPastDamageRelationsInner]
  implicit val TypeDetailPastDamageRelationsInnerEncoder: EntityEncoder[TypeDetailPastDamageRelationsInner] = jsonEncoderOf[TypeDetailPastDamageRelationsInner]
}
