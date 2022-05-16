namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonShapeApiHandlerParams
open PokemonShapeApiServiceInterface
open PokemonShapeApiServiceImplementation

module PokemonShapeApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonShapeList
    /// <summary>
    /// 
    /// </summary>

    let PokemonShapeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonShapeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonShapeListArgs
          let result = PokemonShapeApiService.PokemonShapeList ctx serviceArgs
          return! (match result with
                      | PokemonShapeListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonShapeRead
    /// <summary>
    /// 
    /// </summary>

    let PokemonShapeRead (pathParams:PokemonShapeReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonShapeReadArgs
          let result = PokemonShapeApiService.PokemonShapeRead ctx serviceArgs
          return! (match result with
                      | PokemonShapeReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

