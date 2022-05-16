namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EncounterMethodApiHandlerParams
open EncounterMethodApiServiceInterface
open EncounterMethodApiServiceImplementation

module EncounterMethodApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterMethodList
    /// <summary>
    /// 
    /// </summary>

    let EncounterMethodList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterMethodListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterMethodListArgs
          let result = EncounterMethodApiService.EncounterMethodList ctx serviceArgs
          return! (match result with
                      | EncounterMethodListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterMethodRead
    /// <summary>
    /// 
    /// </summary>

    let EncounterMethodRead (pathParams:EncounterMethodReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterMethodReadArgs
          let result = EncounterMethodApiService.EncounterMethodRead ctx serviceArgs
          return! (match result with
                      | EncounterMethodReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

