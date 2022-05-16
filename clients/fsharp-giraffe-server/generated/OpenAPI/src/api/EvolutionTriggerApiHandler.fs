namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EvolutionTriggerApiHandlerParams
open EvolutionTriggerApiServiceInterface
open EvolutionTriggerApiServiceImplementation

module EvolutionTriggerApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionTriggerList
    /// <summary>
    /// 
    /// </summary>

    let EvolutionTriggerList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EvolutionTriggerListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EvolutionTriggerListArgs
          let result = EvolutionTriggerApiService.EvolutionTriggerList ctx serviceArgs
          return! (match result with
                      | EvolutionTriggerListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EvolutionTriggerRead
    /// <summary>
    /// 
    /// </summary>

    let EvolutionTriggerRead (pathParams:EvolutionTriggerReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EvolutionTriggerReadArgs
          let result = EvolutionTriggerApiService.EvolutionTriggerRead ctx serviceArgs
          return! (match result with
                      | EvolutionTriggerReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

