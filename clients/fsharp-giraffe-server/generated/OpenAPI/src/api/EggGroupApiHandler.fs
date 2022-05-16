namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EggGroupApiHandlerParams
open EggGroupApiServiceInterface
open EggGroupApiServiceImplementation

module EggGroupApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EggGroupList
    /// <summary>
    /// 
    /// </summary>

    let EggGroupList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EggGroupListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EggGroupListArgs
          let result = EggGroupApiService.EggGroupList ctx serviceArgs
          return! (match result with
                      | EggGroupListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EggGroupRead
    /// <summary>
    /// 
    /// </summary>

    let EggGroupRead (pathParams:EggGroupReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EggGroupReadArgs
          let result = EggGroupApiService.EggGroupRead ctx serviceArgs
          return! (match result with
                      | EggGroupReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

