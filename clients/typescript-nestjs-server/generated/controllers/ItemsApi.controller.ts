import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ItemsApi } from '../api';
import { ItemAttributeDetail, ItemCategoryDetail, ItemDetail, ItemFlingEffectDetail, ItemPocketDetail, PaginatedItemAttributeSummaryList, PaginatedItemCategorySummaryList, PaginatedItemFlingEffectSummaryList, PaginatedItemPocketSummaryList, PaginatedItemSummaryList,  } from '../models';

@Controller()
export class ItemsApiController {
  constructor(private readonly itemsApi: ItemsApi) {}

  @Get('/api/v2/item-attribute/')
  itemAttributeList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedItemAttributeSummaryList | Promise<PaginatedItemAttributeSummaryList> | Observable<PaginatedItemAttributeSummaryList> {
    return this.itemsApi.itemAttributeList(limit, offset, q, request);
  }

  @Get('/api/v2/item-attribute/:id/')
  itemAttributeRetrieve(@Param('id') id: string, @Req() request: Request): ItemAttributeDetail | Promise<ItemAttributeDetail> | Observable<ItemAttributeDetail> {
    return this.itemsApi.itemAttributeRetrieve(id, request);
  }

  @Get('/api/v2/item-category/')
  itemCategoryList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedItemCategorySummaryList | Promise<PaginatedItemCategorySummaryList> | Observable<PaginatedItemCategorySummaryList> {
    return this.itemsApi.itemCategoryList(limit, offset, q, request);
  }

  @Get('/api/v2/item-category/:id/')
  itemCategoryRetrieve(@Param('id') id: string, @Req() request: Request): ItemCategoryDetail | Promise<ItemCategoryDetail> | Observable<ItemCategoryDetail> {
    return this.itemsApi.itemCategoryRetrieve(id, request);
  }

  @Get('/api/v2/item-fling-effect/')
  itemFlingEffectList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedItemFlingEffectSummaryList | Promise<PaginatedItemFlingEffectSummaryList> | Observable<PaginatedItemFlingEffectSummaryList> {
    return this.itemsApi.itemFlingEffectList(limit, offset, q, request);
  }

  @Get('/api/v2/item-fling-effect/:id/')
  itemFlingEffectRetrieve(@Param('id') id: string, @Req() request: Request): ItemFlingEffectDetail | Promise<ItemFlingEffectDetail> | Observable<ItemFlingEffectDetail> {
    return this.itemsApi.itemFlingEffectRetrieve(id, request);
  }

  @Get('/api/v2/item/')
  itemList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedItemSummaryList | Promise<PaginatedItemSummaryList> | Observable<PaginatedItemSummaryList> {
    return this.itemsApi.itemList(limit, offset, q, request);
  }

  @Get('/api/v2/item-pocket/')
  itemPocketList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedItemPocketSummaryList | Promise<PaginatedItemPocketSummaryList> | Observable<PaginatedItemPocketSummaryList> {
    return this.itemsApi.itemPocketList(limit, offset, q, request);
  }

  @Get('/api/v2/item-pocket/:id/')
  itemPocketRetrieve(@Param('id') id: string, @Req() request: Request): ItemPocketDetail | Promise<ItemPocketDetail> | Observable<ItemPocketDetail> {
    return this.itemsApi.itemPocketRetrieve(id, request);
  }

  @Get('/api/v2/item/:id/')
  itemRetrieve(@Param('id') id: string, @Req() request: Request): ItemDetail | Promise<ItemDetail> | Observable<ItemDetail> {
    return this.itemsApi.itemRetrieve(id, request);
  }

} 