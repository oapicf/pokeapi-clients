namespace OpenAPI

open OpenAPI.Model.ItemAttributeDetail
open OpenAPI.Model.ItemCategoryDetail
open OpenAPI.Model.ItemDetail
open OpenAPI.Model.ItemFlingEffectDetail
open OpenAPI.Model.ItemPocketDetail
open OpenAPI.Model.PaginatedItemAttributeSummaryList
open OpenAPI.Model.PaginatedItemCategorySummaryList
open OpenAPI.Model.PaginatedItemFlingEffectSummaryList
open OpenAPI.Model.PaginatedItemPocketSummaryList
open OpenAPI.Model.PaginatedItemSummaryList
open System.Collections.Generic
open System

module ItemsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemAttributeListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ItemAttributeListStatusCode200Response = {
      content:PaginatedItemAttributeSummaryList;
      
    }
    type ItemAttributeListResult = ItemAttributeListStatusCode200 of ItemAttributeListStatusCode200Response

    type ItemAttributeListArgs = {
      queryParams:Result<ItemAttributeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemAttributeRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ItemAttributeRetrieveStatusCode200Response = {
      content:ItemAttributeDetail;
      
    }
    type ItemAttributeRetrieveResult = ItemAttributeRetrieveStatusCode200 of ItemAttributeRetrieveStatusCode200Response

    type ItemAttributeRetrieveArgs = {
      pathParams:ItemAttributeRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemCategoryListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ItemCategoryListStatusCode200Response = {
      content:PaginatedItemCategorySummaryList;
      
    }
    type ItemCategoryListResult = ItemCategoryListStatusCode200 of ItemCategoryListStatusCode200Response

    type ItemCategoryListArgs = {
      queryParams:Result<ItemCategoryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemCategoryRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ItemCategoryRetrieveStatusCode200Response = {
      content:ItemCategoryDetail;
      
    }
    type ItemCategoryRetrieveResult = ItemCategoryRetrieveStatusCode200 of ItemCategoryRetrieveStatusCode200Response

    type ItemCategoryRetrieveArgs = {
      pathParams:ItemCategoryRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemFlingEffectListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ItemFlingEffectListStatusCode200Response = {
      content:PaginatedItemFlingEffectSummaryList;
      
    }
    type ItemFlingEffectListResult = ItemFlingEffectListStatusCode200 of ItemFlingEffectListStatusCode200Response

    type ItemFlingEffectListArgs = {
      queryParams:Result<ItemFlingEffectListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemFlingEffectRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ItemFlingEffectRetrieveStatusCode200Response = {
      content:ItemFlingEffectDetail;
      
    }
    type ItemFlingEffectRetrieveResult = ItemFlingEffectRetrieveStatusCode200 of ItemFlingEffectRetrieveStatusCode200Response

    type ItemFlingEffectRetrieveArgs = {
      pathParams:ItemFlingEffectRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ItemListStatusCode200Response = {
      content:PaginatedItemSummaryList;
      
    }
    type ItemListResult = ItemListStatusCode200 of ItemListStatusCode200Response

    type ItemListArgs = {
      queryParams:Result<ItemListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemPocketListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type ItemPocketListStatusCode200Response = {
      content:PaginatedItemPocketSummaryList;
      
    }
    type ItemPocketListResult = ItemPocketListStatusCode200 of ItemPocketListStatusCode200Response

    type ItemPocketListArgs = {
      queryParams:Result<ItemPocketListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemPocketRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ItemPocketRetrieveStatusCode200Response = {
      content:ItemPocketDetail;
      
    }
    type ItemPocketRetrieveResult = ItemPocketRetrieveStatusCode200 of ItemPocketRetrieveStatusCode200Response

    type ItemPocketRetrieveArgs = {
      pathParams:ItemPocketRetrievePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type ItemRetrieveStatusCode200Response = {
      content:ItemDetail;
      
    }
    type ItemRetrieveResult = ItemRetrieveStatusCode200 of ItemRetrieveStatusCode200Response

    type ItemRetrieveArgs = {
      pathParams:ItemRetrievePathParams;
    }
