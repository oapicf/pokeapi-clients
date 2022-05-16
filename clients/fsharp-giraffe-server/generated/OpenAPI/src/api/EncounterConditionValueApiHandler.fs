namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EncounterConditionValueApiHandlerParams
open EncounterConditionValueApiServiceInterface
open EncounterConditionValueApiServiceImplementation

module EncounterConditionValueApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionValueList
    /// <summary>
    /// 
    /// </summary>

    let EncounterConditionValueList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EncounterConditionValueListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EncounterConditionValueListArgs
          let result = EncounterConditionValueApiService.EncounterConditionValueList ctx serviceArgs
          return! (match result with
                      | EncounterConditionValueListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EncounterConditionValueRead
    /// <summary>
    /// 
    /// </summary>

    let EncounterConditionValueRead (pathParams:EncounterConditionValueReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EncounterConditionValueReadArgs
          let result = EncounterConditionValueApiService.EncounterConditionValueRead ctx serviceArgs
          return! (match result with
                      | EncounterConditionValueReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

