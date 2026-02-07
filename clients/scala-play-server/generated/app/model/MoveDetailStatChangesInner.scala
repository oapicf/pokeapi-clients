package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_stat_changes_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveDetailStatChangesInner(
  change: Int,
  stat: AbilityDetailPokemonInnerPokemon
)

object MoveDetailStatChangesInner {
  implicit lazy val moveDetailStatChangesInnerJsonFormat: Format[MoveDetailStatChangesInner] = Json.format[MoveDetailStatChangesInner]
}

