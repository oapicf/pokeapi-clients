package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_effect_changes_inner_effect_entries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDetailEffectChangesInnerEffectEntriesInner(
  effect: String,
  language: AbilityDetailPokemonInnerPokemon
)

object MoveDetailEffectChangesInnerEffectEntriesInner {
  implicit lazy val moveDetailEffectChangesInnerEffectEntriesInnerJsonFormat: Format[MoveDetailEffectChangesInnerEffectEntriesInner] = Json.format[MoveDetailEffectChangesInnerEffectEntriesInner]
}

