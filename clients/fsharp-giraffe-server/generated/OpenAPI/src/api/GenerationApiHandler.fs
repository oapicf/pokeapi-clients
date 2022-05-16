namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GenerationApiHandlerParams
open GenerationApiServiceInterface
open GenerationApiServiceImplementation

module GenerationApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerationList
    /// <summary>
    /// 
    /// </summary>

    let GenerationList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerationListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GenerationListArgs
          let result = GenerationApiService.GenerationList ctx serviceArgs
          return! (match result with
                      | GenerationListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerationRead
    /// <summary>
    /// 
    /// </summary>

    let GenerationRead (pathParams:GenerationReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GenerationReadArgs
          let result = GenerationApiService.GenerationRead ctx serviceArgs
          return! (match result with
                      | GenerationReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

