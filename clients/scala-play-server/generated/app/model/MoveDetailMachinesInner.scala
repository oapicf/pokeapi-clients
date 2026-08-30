package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_machines_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDetailMachinesInner(
  machine: MoveDetailMachinesInnerMachine,
  versionGroup: AbilityDetailPokemonInnerPokemon
)

object MoveDetailMachinesInner {
  implicit lazy val moveDetailMachinesInnerJsonFormat: Format[MoveDetailMachinesInner] = Json.format[MoveDetailMachinesInner]
}

