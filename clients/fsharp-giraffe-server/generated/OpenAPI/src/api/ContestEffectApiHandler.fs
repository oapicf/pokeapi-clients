namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ContestEffectApiHandlerParams
open ContestEffectApiServiceInterface
open ContestEffectApiServiceImplementation

module ContestEffectApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestEffectList
    /// <summary>
    /// 
    /// </summary>

    let ContestEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ContestEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ContestEffectListArgs
          let result = ContestEffectApiService.ContestEffectList ctx serviceArgs
          return! (match result with
                      | ContestEffectListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ContestEffectRead
    /// <summary>
    /// 
    /// </summary>

    let ContestEffectRead (pathParams:ContestEffectReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ContestEffectReadArgs
          let result = ContestEffectApiService.ContestEffectRead ctx serviceArgs
          return! (match result with
                      | ContestEffectReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

