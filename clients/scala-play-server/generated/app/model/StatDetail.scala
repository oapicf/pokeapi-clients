package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param gameIndex ID the games use for this stat.
  * @param isBattleOnly Whether this stat only exists within a battle.
  * @param affectingMoves A detail of moves which affect this stat positively or negatively.
  * @param affectingNatures A detail of natures which affect this stat positively or negatively.
  * @param affectingItems Items that affect this stat, such as vitamins and battle items.
  * @param characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
  * @param moveDamageClass The class of damage this stat is directly related to.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class StatDetail(
  id: Int,
  name: String,
  gameIndex: Int,
  isBattleOnly: Option[Boolean],
  affectingMoves: StatAffectingMoves,
  affectingNatures: StatAffectingNatures,
  affectingItems: List[ItemSummary],
  characteristics: List[CharacteristicSummary],
  moveDamageClass: MoveDamageClassSummary,
  names: List[StatName]
)

object StatDetail {
  implicit lazy val statDetailJsonFormat: Format[StatDetail] = Json.format[StatDetail]
}

