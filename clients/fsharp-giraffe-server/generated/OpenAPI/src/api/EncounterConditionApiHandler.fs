namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EncounterConditionApiHandlerParams
open EncounterConditionApiServiceInterface
open EncounterConditionApiServiceImplementation

module EncounterConditionApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionList
    /// <summary>
    /// 
    /// </summary>

    let EncounterConditionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterConditionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterConditionListArgs
          let result = EncounterConditionApiService.EncounterConditionList ctx serviceArgs
          return! (match result with
                      | EncounterConditionListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterConditionRead
    /// <summary>
    /// 
    /// </summary>

    let EncounterConditionRead (pathParams:EncounterConditionReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterConditionReadArgs
          let result = EncounterConditionApiService.EncounterConditionRead ctx serviceArgs
          return! (match result with
                      | EncounterConditionReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

