package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemMachine.
  * @param machine The machine that teaches a move from an item.
  * @param versionGroup The version group of this specific machine.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemMachine(
  machine: MachineSummary,
  versionGroup: VersionGroupSummary
)

object ItemMachine {
  implicit lazy val itemMachineJsonFormat: Format[ItemMachine] = Json.format[ItemMachine]
}

