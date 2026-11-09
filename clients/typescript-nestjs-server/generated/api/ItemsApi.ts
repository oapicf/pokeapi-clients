import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CurrencyDetail, ItemAttributeDetail, ItemCategoryDetail, ItemDetail, ItemFlingEffectDetail, ItemPocketDetail, PaginatedCurrencySummaryList, PaginatedItemAttributeSummaryList, PaginatedItemCategorySummaryList, PaginatedItemFlingEffectSummaryList, PaginatedItemPocketSummaryList, PaginatedItemSummaryList,  } from '../models';


@Injectable()
export abstract class ItemsApi {

  abstract currencyList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedCurrencySummaryList | Promise<PaginatedCurrencySummaryList> | Observable<PaginatedCurrencySummaryList>;


  abstract currencyRetrieve(id: string,  request: Request): CurrencyDetail | Promise<CurrencyDetail> | Observable<CurrencyDetail>;


  abstract itemAttributeList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedItemAttributeSummaryList | Promise<PaginatedItemAttributeSummaryList> | Observable<PaginatedItemAttributeSummaryList>;


  abstract itemAttributeRetrieve(id: string,  request: Request): ItemAttributeDetail | Promise<ItemAttributeDetail> | Observable<ItemAttributeDetail>;


  abstract itemCategoryList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedItemCategorySummaryList | Promise<PaginatedItemCategorySummaryList> | Observable<PaginatedItemCategorySummaryList>;


  abstract itemCategoryRetrieve(id: string,  request: Request): ItemCategoryDetail | Promise<ItemCategoryDetail> | Observable<ItemCategoryDetail>;


  abstract itemFlingEffectList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedItemFlingEffectSummaryList | Promise<PaginatedItemFlingEffectSummaryList> | Observable<PaginatedItemFlingEffectSummaryList>;


  abstract itemFlingEffectRetrieve(id: string,  request: Request): ItemFlingEffectDetail | Promise<ItemFlingEffectDetail> | Observable<ItemFlingEffectDetail>;


  abstract itemList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedItemSummaryList | Promise<PaginatedItemSummaryList> | Observable<PaginatedItemSummaryList>;


  abstract itemPocketList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedItemPocketSummaryList | Promise<PaginatedItemPocketSummaryList> | Observable<PaginatedItemPocketSummaryList>;


  abstract itemPocketRetrieve(id: string,  request: Request): ItemPocketDetail | Promise<ItemPocketDetail> | Observable<ItemPocketDetail>;


  abstract itemRetrieve(id: string,  request: Request): ItemDetail | Promise<ItemDetail> | Observable<ItemDetail>;

} 