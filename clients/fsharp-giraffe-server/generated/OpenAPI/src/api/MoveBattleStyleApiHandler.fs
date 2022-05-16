namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveBattleStyleApiHandlerParams
open MoveBattleStyleApiServiceInterface
open MoveBattleStyleApiServiceImplementation

module MoveBattleStyleApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveBattleStyleList
    /// <summary>
    /// 
    /// </summary>

    let MoveBattleStyleList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveBattleStyleListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveBattleStyleListArgs
          let result = MoveBattleStyleApiService.MoveBattleStyleList ctx serviceArgs
          return! (match result with
                      | MoveBattleStyleListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveBattleStyleRead
    /// <summary>
    /// 
    /// </summary>

    let MoveBattleStyleRead (pathParams:MoveBattleStyleReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveBattleStyleReadArgs
          let result = MoveBattleStyleApiService.MoveBattleStyleRead ctx serviceArgs
          return! (match result with
                      | MoveBattleStyleReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

