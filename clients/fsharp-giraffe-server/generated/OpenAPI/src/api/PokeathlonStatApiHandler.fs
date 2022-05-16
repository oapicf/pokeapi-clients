namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokeathlonStatApiHandlerParams
open PokeathlonStatApiServiceInterface
open PokeathlonStatApiServiceImplementation

module PokeathlonStatApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokeathlonStatList
    /// <summary>
    /// 
    /// </summary>

    let PokeathlonStatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokeathlonStatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokeathlonStatListArgs
          let result = PokeathlonStatApiService.PokeathlonStatList ctx serviceArgs
          return! (match result with
                      | PokeathlonStatListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokeathlonStatRead
    /// <summary>
    /// 
    /// </summary>

    let PokeathlonStatRead (pathParams:PokeathlonStatReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokeathlonStatReadArgs
          let result = PokeathlonStatApiService.PokeathlonStatRead ctx serviceArgs
          return! (match result with
                      | PokeathlonStatReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

