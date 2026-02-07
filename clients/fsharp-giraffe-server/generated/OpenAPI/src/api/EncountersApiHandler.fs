namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EncountersApiHandlerParams
open EncountersApiServiceInterface
open EncountersApiServiceImplementation
open OpenAPI.Model.EncounterConditionDetail
open OpenAPI.Model.EncounterConditionValueDetail
open OpenAPI.Model.EncounterMethodDetail
open OpenAPI.Model.PaginatedEncounterConditionSummaryList
open OpenAPI.Model.PaginatedEncounterConditionValueSummaryList
open OpenAPI.Model.PaginatedEncounterMethodSummaryList

module EncountersApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionList
    /// <summary>
    /// List encounter conditions
    /// </summary>

    let EncounterConditionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterConditionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterConditionListArgs
          let result = EncountersApiService.EncounterConditionList ctx serviceArgs
          return! (match result with
                      | EncounterConditionListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterConditionRetrieve
    /// <summary>
    /// Get encounter condition
    /// </summary>

    let EncounterConditionRetrieve (pathParams:EncounterConditionRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterConditionRetrieveArgs
          let result = EncountersApiService.EncounterConditionRetrieve ctx serviceArgs
          return! (match result with
                      | EncounterConditionRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterConditionValueList
    /// <summary>
    /// List encounter condition values
    /// </summary>

    let EncounterConditionValueList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterConditionValueListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterConditionValueListArgs
          let result = EncountersApiService.EncounterConditionValueList ctx serviceArgs
          return! (match result with
                      | EncounterConditionValueListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterConditionValueRetrieve
    /// <summary>
    /// Get encounter condition value
    /// </summary>

    let EncounterConditionValueRetrieve (pathParams:EncounterConditionValueRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterConditionValueRetrieveArgs
          let result = EncountersApiService.EncounterConditionValueRetrieve ctx serviceArgs
          return! (match result with
                      | EncounterConditionValueRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterMethodList
    /// <summary>
    /// List encounter methods
    /// </summary>

    let EncounterMethodList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterMethodListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterMethodListArgs
          let result = EncountersApiService.EncounterMethodList ctx serviceArgs
          return! (match result with
                      | EncounterMethodListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterMethodRetrieve
    /// <summary>
    /// Get encounter method
    /// </summary>

    let EncounterMethodRetrieve (pathParams:EncounterMethodRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterMethodRetrieveArgs
          let result = EncountersApiService.EncounterMethodRetrieve ctx serviceArgs
          return! (match result with
                      | EncounterMethodRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

