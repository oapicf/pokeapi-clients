namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AbilityApiHandlerParams
open AbilityApiServiceInterface
open AbilityApiServiceImplementation

module AbilityApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AbilityList
    /// <summary>
    /// 
    /// </summary>

    let AbilityList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AbilityListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AbilityListArgs
          let result = AbilityApiService.AbilityList ctx serviceArgs
          return! (match result with
                      | AbilityListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region AbilityRead
    /// <summary>
    /// 
    /// </summary>

    let AbilityRead (pathParams:AbilityReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AbilityReadArgs
          let result = AbilityApiService.AbilityRead ctx serviceArgs
          return! (match result with
                      | AbilityReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

