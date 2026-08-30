package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemDetail(
  id: Int,
  name: String,
  cost: Option[Int],
  flingPower: Option[Int],
  flingEffect: ItemFlingEffectSummary,
  attributes: List[AbilityDetailPokemonInnerPokemon],
  category: ItemCategorySummary,
  effectEntries: List[ItemEffectText],
  flavorTextEntries: List[ItemFlavorText],
  gameIndices: List[ItemGameIndex],
  names: List[ItemName],
  heldByPokemon: List[ItemDetailHeldByPokemonInner],
  sprites: ItemDetailSprites,
  babyTriggerFor: ItemDetailBabyTriggerFor,
  machines: List[ItemDetailMachinesInner]
)

object ItemDetail {
  implicit lazy val itemDetailJsonFormat: Format[ItemDetail] = Json.format[ItemDetail]
}

