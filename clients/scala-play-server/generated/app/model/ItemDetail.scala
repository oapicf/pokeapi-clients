package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

