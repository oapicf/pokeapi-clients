namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GenderApiHandlerParams
open GenderApiServiceInterface
open GenderApiServiceImplementation

module GenderApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GenderList
    /// <summary>
    /// 
    /// </summary>

    let GenderList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenderListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GenderListArgs
          let result = GenderApiService.GenderList ctx serviceArgs
          return! (match result with
                      | GenderListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenderRead
    /// <summary>
    /// 
    /// </summary>

    let GenderRead (pathParams:GenderReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GenderReadArgs
          let result = GenderApiService.GenderRead ctx serviceArgs
          return! (match result with
                      | GenderReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

