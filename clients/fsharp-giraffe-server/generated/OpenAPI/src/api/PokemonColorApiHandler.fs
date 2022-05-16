namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonColorApiHandlerParams
open PokemonColorApiServiceInterface
open PokemonColorApiServiceImplementation

module PokemonColorApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonColorList
    /// <summary>
    /// 
    /// </summary>

    let PokemonColorList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonColorListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonColorListArgs
          let result = PokemonColorApiService.PokemonColorList ctx serviceArgs
          return! (match result with
                      | PokemonColorListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonColorRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonColorRead (pathParams:PokemonColorReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonColorReadArgs
          let result = PokemonColorApiService.PokemonColorRead ctx serviceArgs
          return! (match result with
                      | PokemonColorReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

