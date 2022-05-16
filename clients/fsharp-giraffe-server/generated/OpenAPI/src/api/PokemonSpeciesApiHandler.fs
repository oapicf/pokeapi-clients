namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonSpeciesApiHandlerParams
open PokemonSpeciesApiServiceInterface
open PokemonSpeciesApiServiceImplementation

module PokemonSpeciesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonSpeciesList
    /// <summary>
    /// 
    /// </summary>

    let PokemonSpeciesList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonSpeciesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonSpeciesListArgs
          let result = PokemonSpeciesApiService.PokemonSpeciesList ctx serviceArgs
          return! (match result with
                      | PokemonSpeciesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonSpeciesRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonSpeciesRead (pathParams:PokemonSpeciesReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonSpeciesReadArgs
          let result = PokemonSpeciesApiService.PokemonSpeciesRead ctx serviceArgs
          return! (match result with
                      | PokemonSpeciesReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

