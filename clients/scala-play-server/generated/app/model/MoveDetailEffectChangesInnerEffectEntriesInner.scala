package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_effect_changes_inner_effect_entries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveDetailEffectChangesInnerEffectEntriesInner(
  effect: String,
  language: AbilityDetailPokemonInnerPokemon
)

object MoveDetailEffectChangesInnerEffectEntriesInner {
  implicit lazy val moveDetailEffectChangesInnerEffectEntriesInnerJsonFormat: Format[MoveDetailEffectChangesInnerEffectEntriesInner] = Json.format[MoveDetailEffectChangesInnerEffectEntriesInner]
}

