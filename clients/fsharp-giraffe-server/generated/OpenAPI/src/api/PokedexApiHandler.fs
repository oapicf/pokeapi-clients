namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokedexApiHandlerParams
open PokedexApiServiceInterface
open PokedexApiServiceImplementation

module PokedexApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokedexList
    /// <summary>
    /// 
    /// </summary>

    let PokedexList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokedexListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokedexListArgs
          let result = PokedexApiService.PokedexList ctx serviceArgs
          return! (match result with
                      | PokedexListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokedexRead
    /// <summary>
    /// 
    /// </summary>

    let PokedexRead (pathParams:PokedexReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokedexReadArgs
          let result = PokedexApiService.PokedexRead ctx serviceArgs
          return! (match result with
                      | PokedexReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

