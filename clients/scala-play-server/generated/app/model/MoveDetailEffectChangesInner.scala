package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_effect_changes_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDetailEffectChangesInner(
  effectEntries: List[MoveDetailEffectChangesInnerEffectEntriesInner],
  versionGroup: AbilityDetailPokemonInnerPokemon
)

object MoveDetailEffectChangesInner {
  implicit lazy val moveDetailEffectChangesInnerJsonFormat: Format[MoveDetailEffectChangesInner] = Json.format[MoveDetailEffectChangesInner]
}

