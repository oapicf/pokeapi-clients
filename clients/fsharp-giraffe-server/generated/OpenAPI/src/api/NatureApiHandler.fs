namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open NatureApiHandlerParams
open NatureApiServiceInterface
open NatureApiServiceImplementation

module NatureApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region NatureList
    /// <summary>
    /// 
    /// </summary>

    let NatureList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<NatureListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : NatureListArgs
          let result = NatureApiService.NatureList ctx serviceArgs
          return! (match result with
                      | NatureListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region NatureRead
    /// <summary>
    /// 
    /// </summary>

    let NatureRead (pathParams:NatureReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : NatureReadArgs
          let result = NatureApiService.NatureRead ctx serviceArgs
          return! (match result with
                      | NatureReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

