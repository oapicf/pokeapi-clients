namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveTargetApiHandlerParams
open MoveTargetApiServiceInterface
open MoveTargetApiServiceImplementation

module MoveTargetApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveTargetList
    /// <summary>
    /// 
    /// </summary>

    let MoveTargetList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveTargetListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveTargetListArgs
          let result = MoveTargetApiService.MoveTargetList ctx serviceArgs
          return! (match result with
                      | MoveTargetListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveTargetRead
    /// <summary>
    /// 
    /// </summary>

    let MoveTargetRead (pathParams:MoveTargetReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveTargetReadArgs
          let result = MoveTargetApiService.MoveTargetRead ctx serviceArgs
          return! (match result with
                      | MoveTargetReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

