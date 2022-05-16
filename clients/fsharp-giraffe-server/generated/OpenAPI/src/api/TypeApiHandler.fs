namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open TypeApiHandlerParams
open TypeApiServiceInterface
open TypeApiServiceImplementation

module TypeApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region TypeList
    /// <summary>
    /// 
    /// </summary>

    let TypeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TypeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TypeListArgs
          let result = TypeApiService.TypeList ctx serviceArgs
          return! (match result with
                      | TypeListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region TypeRead
    /// <summary>
    /// 
    /// </summary>

    let TypeRead (pathParams:TypeReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : TypeReadArgs
          let result = TypeApiService.TypeRead ctx serviceArgs
          return! (match result with
                      | TypeReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

