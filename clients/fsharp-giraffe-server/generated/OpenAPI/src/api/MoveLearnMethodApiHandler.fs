namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveLearnMethodApiHandlerParams
open MoveLearnMethodApiServiceInterface
open MoveLearnMethodApiServiceImplementation

module MoveLearnMethodApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveLearnMethodList
    /// <summary>
    /// 
    /// </summary>

    let MoveLearnMethodList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveLearnMethodListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveLearnMethodListArgs
          let result = MoveLearnMethodApiService.MoveLearnMethodList ctx serviceArgs
          return! (match result with
                      | MoveLearnMethodListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveLearnMethodRead
    /// <summary>
    /// 
    /// </summary>

    let MoveLearnMethodRead (pathParams:MoveLearnMethodReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveLearnMethodReadArgs
          let result = MoveLearnMethodApiService.MoveLearnMethodRead ctx serviceArgs
          return! (match result with
                      | MoveLearnMethodReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

