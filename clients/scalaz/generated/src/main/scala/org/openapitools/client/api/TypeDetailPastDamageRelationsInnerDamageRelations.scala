package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetailPastDamageRelationsInnerDamageRelations._

case class TypeDetailPastDamageRelationsInnerDamageRelations (
  noDamageTo: List[AbilityDetailPokemonInnerPokemon],
halfDamageTo: List[AbilityDetailPokemonInnerPokemon],
doubleDamageTo: List[AbilityDetailPokemonInnerPokemon],
noDamageFrom: List[AbilityDetailPokemonInnerPokemon],
halfDamageFrom: List[AbilityDetailPokemonInnerPokemon],
doubleDamageFrom: List[AbilityDetailPokemonInnerPokemon])

object TypeDetailPastDamageRelationsInnerDamageRelations {
  import DateTimeCodecs._

  implicit val TypeDetailPastDamageRelationsInnerDamageRelationsCodecJson: CodecJson[TypeDetailPastDamageRelationsInnerDamageRelations] = CodecJson.derive[TypeDetailPastDamageRelationsInnerDamageRelations]
  implicit val TypeDetailPastDamageRelationsInnerDamageRelationsDecoder: EntityDecoder[TypeDetailPastDamageRelationsInnerDamageRelations] = jsonOf[TypeDetailPastDamageRelationsInnerDamageRelations]
  implicit val TypeDetailPastDamageRelationsInnerDamageRelationsEncoder: EntityEncoder[TypeDetailPastDamageRelationsInnerDamageRelations] = jsonEncoderOf[TypeDetailPastDamageRelationsInnerDamageRelations]
}
