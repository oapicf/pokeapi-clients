namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MovesApiHandlerParams
open MovesApiServiceInterface
open MovesApiServiceImplementation
open OpenAPI.Model.MoveBattleStyleDetail
open OpenAPI.Model.MoveDetail
open OpenAPI.Model.MoveLearnMethodDetail
open OpenAPI.Model.MoveMetaAilmentDetail
open OpenAPI.Model.MoveMetaCategoryDetail
open OpenAPI.Model.MoveTargetDetail
open OpenAPI.Model.PaginatedMoveBattleStyleSummaryList
open OpenAPI.Model.PaginatedMoveLearnMethodSummaryList
open OpenAPI.Model.PaginatedMoveMetaAilmentSummaryList
open OpenAPI.Model.PaginatedMoveMetaCategorySummaryList
open OpenAPI.Model.PaginatedMoveSummaryList
open OpenAPI.Model.PaginatedMoveTargetSummaryList

module MovesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveAilmentList
    /// <summary>
    /// List move meta ailments
    /// </summary>

    let MoveAilmentList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveAilmentListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveAilmentListArgs
          let result = MovesApiService.MoveAilmentList ctx serviceArgs
          return! (match result with
                      | MoveAilmentListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveAilmentRetrieve
    /// <summary>
    /// Get move meta ailment
    /// </summary>

    let MoveAilmentRetrieve (pathParams:MoveAilmentRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveAilmentRetrieveArgs
          let result = MovesApiService.MoveAilmentRetrieve ctx serviceArgs
          return! (match result with
                      | MoveAilmentRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveBattleStyleList
    /// <summary>
    /// List move battle styles
    /// </summary>

    let MoveBattleStyleList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveBattleStyleListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveBattleStyleListArgs
          let result = MovesApiService.MoveBattleStyleList ctx serviceArgs
          return! (match result with
                      | MoveBattleStyleListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveBattleStyleRetrieve
    /// <summary>
    /// Get move battle style
    /// </summary>

    let MoveBattleStyleRetrieve (pathParams:MoveBattleStyleRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveBattleStyleRetrieveArgs
          let result = MovesApiService.MoveBattleStyleRetrieve ctx serviceArgs
          return! (match result with
                      | MoveBattleStyleRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveCategoryList
    /// <summary>
    /// List move meta categories
    /// </summary>

    let MoveCategoryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveCategoryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveCategoryListArgs
          let result = MovesApiService.MoveCategoryList ctx serviceArgs
          return! (match result with
                      | MoveCategoryListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveCategoryRetrieve
    /// <summary>
    /// Get move meta category
    /// </summary>

    let MoveCategoryRetrieve (pathParams:MoveCategoryRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveCategoryRetrieveArgs
          let result = MovesApiService.MoveCategoryRetrieve ctx serviceArgs
          return! (match result with
                      | MoveCategoryRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveLearnMethodList
    /// <summary>
    /// List move learn methods
    /// </summary>

    let MoveLearnMethodList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveLearnMethodListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveLearnMethodListArgs
          let result = MovesApiService.MoveLearnMethodList ctx serviceArgs
          return! (match result with
                      | MoveLearnMethodListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveLearnMethodRetrieve
    /// <summary>
    /// Get move learn method
    /// </summary>

    let MoveLearnMethodRetrieve (pathParams:MoveLearnMethodRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveLearnMethodRetrieveArgs
          let result = MovesApiService.MoveLearnMethodRetrieve ctx serviceArgs
          return! (match result with
                      | MoveLearnMethodRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveList
    /// <summary>
    /// List moves
    /// </summary>

    let MoveList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveListArgs
          let result = MovesApiService.MoveList ctx serviceArgs
          return! (match result with
                      | MoveListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveRetrieve
    /// <summary>
    /// Get move
    /// </summary>

    let MoveRetrieve (pathParams:MoveRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveRetrieveArgs
          let result = MovesApiService.MoveRetrieve ctx serviceArgs
          return! (match result with
                      | MoveRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveTargetList
    /// <summary>
    /// List move targets
    /// </summary>

    let MoveTargetList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveTargetListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveTargetListArgs
          let result = MovesApiService.MoveTargetList ctx serviceArgs
          return! (match result with
                      | MoveTargetListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveTargetRetrieve
    /// <summary>
    /// Get move target
    /// </summary>

    let MoveTargetRetrieve (pathParams:MoveTargetRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveTargetRetrieveArgs
          let result = MovesApiService.MoveTargetRetrieve ctx serviceArgs
          return! (match result with
                      | MoveTargetRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

