package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeDetail_damage_relations.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeDetailDamageRelations(
  noDamageTo: List[AbilityDetailPokemonInnerPokemon],
  halfDamageTo: List[AbilityDetailPokemonInnerPokemon],
  doubleDamageTo: List[AbilityDetailPokemonInnerPokemon],
  noDamageFrom: List[AbilityDetailPokemonInnerPokemon],
  halfDamageFrom: List[AbilityDetailPokemonInnerPokemon],
  doubleDamageFrom: List[AbilityDetailPokemonInnerPokemon]
)

object TypeDetailDamageRelations {
  implicit lazy val typeDetailDamageRelationsJsonFormat: Format[TypeDetailDamageRelations] = Json.format[TypeDetailDamageRelations]
}

