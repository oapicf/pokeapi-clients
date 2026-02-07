package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetailDamageRelations._

case class TypeDetailDamageRelations (
  noDamageTo: List[AbilityDetailPokemonInnerPokemon],
halfDamageTo: List[AbilityDetailPokemonInnerPokemon],
doubleDamageTo: List[AbilityDetailPokemonInnerPokemon],
noDamageFrom: List[AbilityDetailPokemonInnerPokemon],
halfDamageFrom: List[AbilityDetailPokemonInnerPokemon],
doubleDamageFrom: List[AbilityDetailPokemonInnerPokemon])

object TypeDetailDamageRelations {
  import DateTimeCodecs._

  implicit val TypeDetailDamageRelationsCodecJson: CodecJson[TypeDetailDamageRelations] = CodecJson.derive[TypeDetailDamageRelations]
  implicit val TypeDetailDamageRelationsDecoder: EntityDecoder[TypeDetailDamageRelations] = jsonOf[TypeDetailDamageRelations]
  implicit val TypeDetailDamageRelationsEncoder: EntityEncoder[TypeDetailDamageRelations] = jsonEncoderOf[TypeDetailDamageRelations]
}
