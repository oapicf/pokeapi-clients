namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open SuperContestEffectApiHandlerParams
open SuperContestEffectApiServiceInterface
open SuperContestEffectApiServiceImplementation

module SuperContestEffectApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region SuperContestEffectList
    /// <summary>
    /// 
    /// </summary>

    let SuperContestEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SuperContestEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SuperContestEffectListArgs
          let result = SuperContestEffectApiService.SuperContestEffectList ctx serviceArgs
          return! (match result with
                      | SuperContestEffectListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region SuperContestEffectRead
    /// <summary>
    /// 
    /// </summary>

    let SuperContestEffectRead (pathParams:SuperContestEffectReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SuperContestEffectReadArgs
          let result = SuperContestEffectApiService.SuperContestEffectRead ctx serviceArgs
          return! (match result with
                      | SuperContestEffectReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

