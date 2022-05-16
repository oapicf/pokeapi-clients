namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveApiHandlerParams
open MoveApiServiceInterface
open MoveApiServiceImplementation

module MoveApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveList
    /// <summary>
    /// 
    /// </summary>

    let MoveList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveListArgs
          let result = MoveApiService.MoveList ctx serviceArgs
          return! (match result with
                      | MoveListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveRead
    /// <summary>
    /// 
    /// </summary>

    let MoveRead (pathParams:MoveReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveReadArgs
          let result = MoveApiService.MoveRead ctx serviceArgs
          return! (match result with
                      | MoveReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

