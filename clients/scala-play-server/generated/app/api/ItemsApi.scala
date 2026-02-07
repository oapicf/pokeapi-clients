package api

import play.api.libs.json._
import model.ItemAttributeDetail
import model.ItemCategoryDetail
import model.ItemDetail
import model.ItemFlingEffectDetail
import model.ItemPocketDetail
import model.PaginatedItemAttributeSummaryList
import model.PaginatedItemCategorySummaryList
import model.PaginatedItemFlingEffectSummaryList
import model.PaginatedItemPocketSummaryList
import model.PaginatedItemSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ItemsApi {
  /**
    * List item attributes
    * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def itemAttributeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemAttributeSummaryList

  /**
    * Get item attribute
    * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
    * @param id This parameter can be a string or an integer.
    */
  def itemAttributeRetrieve(id: String): ItemAttributeDetail

  /**
    * List item categories
    * Item categories determine where items will be placed in the players bag.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def itemCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemCategorySummaryList

  /**
    * Get item category
    * Item categories determine where items will be placed in the players bag.
    * @param id This parameter can be a string or an integer.
    */
  def itemCategoryRetrieve(id: String): ItemCategoryDetail

  /**
    * List item fling effects
    * The various effects of the move\&quot;Fling\&quot; when used with different items.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def itemFlingEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemFlingEffectSummaryList

  /**
    * Get item fling effect
    * The various effects of the move\&quot;Fling\&quot; when used with different items.
    * @param id This parameter can be a string or an integer.
    */
  def itemFlingEffectRetrieve(id: String): ItemFlingEffectDetail

  /**
    * List items
    * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def itemList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemSummaryList

  /**
    * List item pockets
    * Pockets within the players bag used for storing items by category.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def itemPocketList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemPocketSummaryList

  /**
    * Get item pocket
    * Pockets within the players bag used for storing items by category.
    * @param id This parameter can be a string or an integer.
    */
  def itemPocketRetrieve(id: String): ItemPocketDetail

  /**
    * Get item
    * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    * @param id This parameter can be a string or an integer.
    */
  def itemRetrieve(id: String): ItemDetail
}
