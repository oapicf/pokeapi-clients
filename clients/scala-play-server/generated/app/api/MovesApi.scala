package api

import play.api.libs.json._
import model.MoveBattleStyleDetail
import model.MoveDetail
import model.MoveLearnMethodDetail
import model.MoveMetaAilmentDetail
import model.MoveMetaCategoryDetail
import model.MoveTargetDetail
import model.PaginatedMoveBattleStyleSummaryList
import model.PaginatedMoveLearnMethodSummaryList
import model.PaginatedMoveMetaAilmentSummaryList
import model.PaginatedMoveMetaCategorySummaryList
import model.PaginatedMoveSummaryList
import model.PaginatedMoveTargetSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait MovesApi {
  /**
    * List move meta ailments
    * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveAilmentList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveMetaAilmentSummaryList

  /**
    * Get move meta ailment
    * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def moveAilmentRetrieve(id: String): MoveMetaAilmentDetail

  /**
    * List move battle styles
    * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveBattleStyleList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveBattleStyleSummaryList

  /**
    * Get move battle style
    * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def moveBattleStyleRetrieve(id: String): MoveBattleStyleDetail

  /**
    * List move meta categories
    * Very general categories that loosely group move effects.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveMetaCategorySummaryList

  /**
    * Get move meta category
    * Very general categories that loosely group move effects.
    * @param id This parameter can be a string or an integer.
    */
  def moveCategoryRetrieve(id: String): MoveMetaCategoryDetail

  /**
    * List move learn methods
    * Methods by which Pokémon can learn moves.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveLearnMethodList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveLearnMethodSummaryList

  /**
    * Get move learn method
    * Methods by which Pokémon can learn moves.
    * @param id This parameter can be a string or an integer.
    */
  def moveLearnMethodRetrieve(id: String): MoveLearnMethodDetail

  /**
    * List moves
    * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveSummaryList

  /**
    * Get move
    * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    * @param id This parameter can be a string or an integer.
    */
  def moveRetrieve(id: String): MoveDetail

  /**
    * List move targets
    * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveTargetList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveTargetSummaryList

  /**
    * Get move target
    * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    * @param id This parameter can be a string or an integer.
    */
  def moveTargetRetrieve(id: String): MoveTargetDetail
}
