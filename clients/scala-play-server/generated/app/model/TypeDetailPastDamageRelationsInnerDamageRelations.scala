package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeDetail_past_damage_relations_inner_damage_relations.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TypeDetailPastDamageRelationsInnerDamageRelations(
  noDamageTo: List[AbilityDetailPokemonInnerPokemon],
  halfDamageTo: List[AbilityDetailPokemonInnerPokemon],
  doubleDamageTo: List[AbilityDetailPokemonInnerPokemon],
  noDamageFrom: List[AbilityDetailPokemonInnerPokemon],
  halfDamageFrom: List[AbilityDetailPokemonInnerPokemon],
  doubleDamageFrom: List[AbilityDetailPokemonInnerPokemon]
)

object TypeDetailPastDamageRelationsInnerDamageRelations {
  implicit lazy val typeDetailPastDamageRelationsInnerDamageRelationsJsonFormat: Format[TypeDetailPastDamageRelationsInnerDamageRelations] = Json.format[TypeDetailPastDamageRelationsInnerDamageRelations]
}

