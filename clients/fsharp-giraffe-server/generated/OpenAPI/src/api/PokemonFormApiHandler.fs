namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonFormApiHandlerParams
open PokemonFormApiServiceInterface
open PokemonFormApiServiceImplementation

module PokemonFormApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonFormList
    /// <summary>
    /// 
    /// </summary>

    let PokemonFormList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonFormListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonFormListArgs
          let result = PokemonFormApiService.PokemonFormList ctx serviceArgs
          return! (match result with
                      | PokemonFormListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonFormRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonFormRead (pathParams:PokemonFormReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonFormReadArgs
          let result = PokemonFormApiService.PokemonFormRead ctx serviceArgs
          return! (match result with
                      | PokemonFormReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

