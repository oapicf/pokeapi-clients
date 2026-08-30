package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveChange_effect_entries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveChangeEffectEntriesInner(
  effect: String,
  shortEffect: String,
  language: AbilityDetailPokemonInnerPokemon
)

object MoveChangeEffectEntriesInner {
  implicit lazy val moveChangeEffectEntriesInnerJsonFormat: Format[MoveChangeEffectEntriesInner] = Json.format[MoveChangeEffectEntriesInner]
}

