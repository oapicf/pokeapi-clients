namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LanguageApiHandlerParams
open LanguageApiServiceInterface
open LanguageApiServiceImplementation

module LanguageApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LanguageList
    /// <summary>
    /// 
    /// </summary>

    let LanguageList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LanguageListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LanguageListArgs
          let result = LanguageApiService.LanguageList ctx serviceArgs
          return! (match result with
                      | LanguageListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region LanguageRead
    /// <summary>
    /// 
    /// </summary>

    let LanguageRead (pathParams:LanguageReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LanguageReadArgs
          let result = LanguageApiService.LanguageRead ctx serviceArgs
          return! (match result with
                      | LanguageReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

