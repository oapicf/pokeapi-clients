package api

import model.CurrencyDetail
import model.ItemAttributeDetail
import model.ItemCategoryDetail
import model.ItemDetail
import model.ItemFlingEffectDetail
import model.ItemPocketDetail
import model.PaginatedCurrencySummaryList
import model.PaginatedItemAttributeSummaryList
import model.PaginatedItemCategorySummaryList
import model.PaginatedItemFlingEffectSummaryList
import model.PaginatedItemPocketSummaryList
import model.PaginatedItemSummaryList

/**
  * Provides a default implementation for [[ItemsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class ItemsApiImpl extends ItemsApi {
  /**
    * @inheritdoc
    */
  override def currencyList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedCurrencySummaryList = {
    // TODO: Implement better logic

    PaginatedCurrencySummaryList(0, None, None, List.empty[CurrencySummary])
  }

  /**
    * @inheritdoc
    */
  override def currencyRetrieve(id: String): CurrencyDetail = {
    // TODO: Implement better logic

    CurrencyDetail(0, "", List.empty[CurrencyName])
  }

  /**
    * @inheritdoc
    */
  override def itemAttributeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemAttributeSummaryList = {
    // TODO: Implement better logic

    PaginatedItemAttributeSummaryList(0, None, None, List.empty[ItemAttributeSummary])
  }

  /**
    * @inheritdoc
    */
  override def itemAttributeRetrieve(id: String): ItemAttributeDetail = {
    // TODO: Implement better logic

    ItemAttributeDetail(0, "", List.empty[ItemAttributeDescription], List.empty[ItemSummary], List.empty[ItemAttributeName])
  }

  /**
    * @inheritdoc
    */
  override def itemCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemCategorySummaryList = {
    // TODO: Implement better logic

    PaginatedItemCategorySummaryList(0, None, None, List.empty[ItemCategorySummary])
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

    PaginatedItemFlingEffectSummaryList(0, None, None, List.empty[ItemFlingEffectSummary])
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

    PaginatedItemSummaryList(0, None, None, List.empty[ItemSummary])
  }

  /**
    * @inheritdoc
    */
  override def itemPocketList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedItemPocketSummaryList = {
    // TODO: Implement better logic

    PaginatedItemPocketSummaryList(0, None, None, List.empty[ItemPocketSummary])
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

    ItemDetail(0, "", None, ItemFlingEffectSummary("", ""), List.empty[ItemAttributeSummary], ItemCategorySummary("", ""), List.empty[ItemEffectText], List.empty[ItemFlavorText], List.empty[ItemGameIndex], List.empty[ItemPrice], List.empty[ItemName], List.empty[PokemonHeldItem], ItemSprites(""), EvolutionChainSummary(""), List.empty[ItemMachine])
  }
}
