package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemAttributeDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemAttributeDetail(
  id: Int,
  name: String,
  descriptions: List[ItemAttributeDescription],
  items: List[AbilityDetailPokemonInnerPokemon],
  names: List[ItemAttributeName]
)

object ItemAttributeDetail {
  implicit lazy val itemAttributeDetailJsonFormat: Format[ItemAttributeDetail] = Json.format[ItemAttributeDetail]
}

