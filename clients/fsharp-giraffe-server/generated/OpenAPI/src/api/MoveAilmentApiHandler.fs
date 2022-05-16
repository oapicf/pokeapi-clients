namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveAilmentApiHandlerParams
open MoveAilmentApiServiceInterface
open MoveAilmentApiServiceImplementation

module MoveAilmentApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveAilmentList
    /// <summary>
    /// 
    /// </summary>

    let MoveAilmentList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveAilmentListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveAilmentListArgs
          let result = MoveAilmentApiService.MoveAilmentList ctx serviceArgs
          return! (match result with
                      | MoveAilmentListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveAilmentRead
    /// <summary>
    /// 
    /// </summary>

    let MoveAilmentRead (pathParams:MoveAilmentReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveAilmentReadArgs
          let result = MoveAilmentApiService.MoveAilmentRead ctx serviceArgs
          return! (match result with
                      | MoveAilmentReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

