package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeDetail_past_damage_relations_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TypeDetailPastDamageRelationsInner(
  generation: AbilityDetailPokemonInnerPokemon,
  damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations
)

object TypeDetailPastDamageRelationsInner {
  implicit lazy val typeDetailPastDamageRelationsInnerJsonFormat: Format[TypeDetailPastDamageRelationsInner] = Json.format[TypeDetailPastDamageRelationsInner]
}

