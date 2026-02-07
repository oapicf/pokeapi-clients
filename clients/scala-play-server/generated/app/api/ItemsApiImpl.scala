package api

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

/**
  * Provides a default implementation for [[ItemsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ItemsApiImpl extends ItemsApi {
  /**
    * @inheritdoc
    */
  override def itemAttributeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemAttributeSummaryList = {
    // TODO: Implement better logic

    PaginatedItemAttributeSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemAttributeRetrieve(id: String): ItemAttributeDetail = {
    // TODO: Implement better logic

    ItemAttributeDetail(0, "", List.empty[ItemAttributeDescription], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[ItemAttributeName])
  }

  /**
    * @inheritdoc
    */
  override def itemCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemCategorySummaryList = {
    // TODO: Implement better logic

    PaginatedItemCategorySummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemCategoryRetrieve(id: String): ItemCategoryDetail = {
    // TODO: Implement better logic

    ItemCategoryDetail(0, "", List.empty[ItemSummary], List.empty[ItemCategoryName], ItemPocketSummary("", ""))
  }

  /**
    * @inheritdoc
    */
  override def itemFlingEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemFlingEffectSummaryList = {
    // TODO: Implement better logic

    PaginatedItemFlingEffectSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemFlingEffectRetrieve(id: String): ItemFlingEffectDetail = {
    // TODO: Implement better logic

    ItemFlingEffectDetail(0, "", List.empty[ItemFlingEffectEffectText], List.empty[ItemSummary])
  }

  /**
    * @inheritdoc
    */
  override def itemList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemSummaryList = {
    // TODO: Implement better logic

    PaginatedItemSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemPocketList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemPocketSummaryList = {
    // TODO: Implement better logic

    PaginatedItemPocketSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemPocketRetrieve(id: String): ItemPocketDetail = {
    // TODO: Implement better logic

    ItemPocketDetail(0, "", List.empty[ItemCategorySummary], List.empty[ItemPocketName])
  }

  /**
    * @inheritdoc
    */
  override def itemRetrieve(id: String): ItemDetail = {
    // TODO: Implement better logic

    ItemDetail(0, "", None, None, ItemFlingEffectSummary("", ""), List.empty[AbilityDetailPokemonInnerPokemon], ItemCategorySummary("", ""), List.empty[ItemEffectText], List.empty[ItemFlavorText], List.empty[ItemGameIndex], List.empty[ItemName], List.empty[ItemDetailHeldByPokemonInner], ItemDetailSprites(""), ItemDetailBabyTriggerFor(""), List.empty[ItemDetailMachinesInner])
  }
}
