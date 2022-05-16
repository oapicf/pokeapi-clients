namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MachineApiHandlerParams
open MachineApiServiceInterface
open MachineApiServiceImplementation

module MachineApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MachineList
    /// <summary>
    /// 
    /// </summary>

    let MachineList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MachineListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MachineListArgs
          let result = MachineApiService.MachineList ctx serviceArgs
          return! (match result with
                      | MachineListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MachineRead
    /// <summary>
    /// 
    /// </summary>

    let MachineRead (pathParams:MachineReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MachineReadArgs
          let result = MachineApiService.MachineRead ctx serviceArgs
          return! (match result with
                      | MachineReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

