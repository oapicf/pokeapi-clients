namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonApiHandlerParams
open PokemonApiServiceInterface
open PokemonApiServiceImplementation

module PokemonApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonList
    /// <summary>
    /// 
    /// </summary>

    let PokemonList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonListArgs
          let result = PokemonApiService.PokemonList ctx serviceArgs
          return! (match result with
                      | PokemonListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonRead (pathParams:PokemonReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonReadArgs
          let result = PokemonApiService.PokemonRead ctx serviceArgs
          return! (match result with
                      | PokemonReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

