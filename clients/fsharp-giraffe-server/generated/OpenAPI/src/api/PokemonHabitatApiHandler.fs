namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonHabitatApiHandlerParams
open PokemonHabitatApiServiceInterface
open PokemonHabitatApiServiceImplementation

module PokemonHabitatApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonHabitatList
    /// <summary>
    /// 
    /// </summary>

    let PokemonHabitatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonHabitatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonHabitatListArgs
          let result = PokemonHabitatApiService.PokemonHabitatList ctx serviceArgs
          return! (match result with
                      | PokemonHabitatListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonHabitatRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonHabitatRead (pathParams:PokemonHabitatReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonHabitatReadArgs
          let result = PokemonHabitatApiService.PokemonHabitatRead ctx serviceArgs
          return! (match result with
                      | PokemonHabitatReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

