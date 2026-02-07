namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemsApiHandlerParams
open ItemsApiServiceInterface
open ItemsApiServiceImplementation
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

module ItemsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemAttributeList
    /// <summary>
    /// List item attributes
    /// </summary>

    let ItemAttributeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemAttributeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemAttributeListArgs
          let result = ItemsApiService.ItemAttributeList ctx serviceArgs
          return! (match result with
                      | ItemAttributeListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemAttributeRetrieve
    /// <summary>
    /// Get item attribute
    /// </summary>

    let ItemAttributeRetrieve (pathParams:ItemAttributeRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemAttributeRetrieveArgs
          let result = ItemsApiService.ItemAttributeRetrieve ctx serviceArgs
          return! (match result with
                      | ItemAttributeRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemCategoryList
    /// <summary>
    /// List item categories
    /// </summary>

    let ItemCategoryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemCategoryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemCategoryListArgs
          let result = ItemsApiService.ItemCategoryList ctx serviceArgs
          return! (match result with
                      | ItemCategoryListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemCategoryRetrieve
    /// <summary>
    /// Get item category
    /// </summary>

    let ItemCategoryRetrieve (pathParams:ItemCategoryRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemCategoryRetrieveArgs
          let result = ItemsApiService.ItemCategoryRetrieve ctx serviceArgs
          return! (match result with
                      | ItemCategoryRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemFlingEffectList
    /// <summary>
    /// List item fling effects
    /// </summary>

    let ItemFlingEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemFlingEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemFlingEffectListArgs
          let result = ItemsApiService.ItemFlingEffectList ctx serviceArgs
          return! (match result with
                      | ItemFlingEffectListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemFlingEffectRetrieve
    /// <summary>
    /// Get item fling effect
    /// </summary>

    let ItemFlingEffectRetrieve (pathParams:ItemFlingEffectRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemFlingEffectRetrieveArgs
          let result = ItemsApiService.ItemFlingEffectRetrieve ctx serviceArgs
          return! (match result with
                      | ItemFlingEffectRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemList
    /// <summary>
    /// List items
    /// </summary>

    let ItemList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemListArgs
          let result = ItemsApiService.ItemList ctx serviceArgs
          return! (match result with
                      | ItemListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemPocketList
    /// <summary>
    /// List item pockets
    /// </summary>

    let ItemPocketList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemPocketListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemPocketListArgs
          let result = ItemsApiService.ItemPocketList ctx serviceArgs
          return! (match result with
                      | ItemPocketListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemPocketRetrieve
    /// <summary>
    /// Get item pocket
    /// </summary>

    let ItemPocketRetrieve (pathParams:ItemPocketRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemPocketRetrieveArgs
          let result = ItemsApiService.ItemPocketRetrieve ctx serviceArgs
          return! (match result with
                      | ItemPocketRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemRetrieve
    /// <summary>
    /// Get item
    /// </summary>

    let ItemRetrieve (pathParams:ItemRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemRetrieveArgs
          let result = ItemsApiService.ItemRetrieve ctx serviceArgs
          return! (match result with
                      | ItemRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

