namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ContestsApiHandlerParams
open ContestsApiServiceInterface
open ContestsApiServiceImplementation
open OpenAPI.Model.ContestEffectDetail
open OpenAPI.Model.ContestTypeDetail
open OpenAPI.Model.PaginatedContestEffectSummaryList
open OpenAPI.Model.PaginatedContestTypeSummaryList
open OpenAPI.Model.PaginatedSuperContestEffectSummaryList
open OpenAPI.Model.SuperContestEffectDetail

module ContestsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestEffectList
    /// <summary>
    /// List contest effects
    /// </summary>

    let ContestEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ContestEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ContestEffectListArgs
          let result = ContestsApiService.ContestEffectList ctx serviceArgs
          return! (match result with
                      | ContestEffectListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ContestEffectRetrieve
    /// <summary>
    /// Get contest effect
    /// </summary>

    let ContestEffectRetrieve (pathParams:ContestEffectRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ContestEffectRetrieveArgs
          let result = ContestsApiService.ContestEffectRetrieve ctx serviceArgs
          return! (match result with
                      | ContestEffectRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ContestTypeList
    /// <summary>
    /// List contest types
    /// </summary>

    let ContestTypeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ContestTypeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ContestTypeListArgs
          let result = ContestsApiService.ContestTypeList ctx serviceArgs
          return! (match result with
                      | ContestTypeListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ContestTypeRetrieve
    /// <summary>
    /// Get contest type
    /// </summary>

    let ContestTypeRetrieve (pathParams:ContestTypeRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ContestTypeRetrieveArgs
          let result = ContestsApiService.ContestTypeRetrieve ctx serviceArgs
          return! (match result with
                      | ContestTypeRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SuperContestEffectList
    /// <summary>
    /// List super contest effects
    /// </summary>

    let SuperContestEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SuperContestEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SuperContestEffectListArgs
          let result = ContestsApiService.SuperContestEffectList ctx serviceArgs
          return! (match result with
                      | SuperContestEffectListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SuperContestEffectRetrieve
    /// <summary>
    /// Get super contest effect
    /// </summary>

    let SuperContestEffectRetrieve (pathParams:SuperContestEffectRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SuperContestEffectRetrieveArgs
          let result = ContestsApiService.SuperContestEffectRetrieve ctx serviceArgs
          return! (match result with
                      | SuperContestEffectRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

