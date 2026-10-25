package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for ItemDetail_machines_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemDetailMachinesInner(
  machine: URI,
  versionGroup: AbilityDetailPokemonInnerPokemon
)

object ItemDetailMachinesInner {
  implicit lazy val itemDetailMachinesInnerJsonFormat: Format[ItemDetailMachinesInner] = Json.format[ItemDetailMachinesInner]
}

