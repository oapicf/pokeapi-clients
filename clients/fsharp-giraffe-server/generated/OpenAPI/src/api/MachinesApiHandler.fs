namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MachinesApiHandlerParams
open MachinesApiServiceInterface
open MachinesApiServiceImplementation
open OpenAPI.Model.MachineDetail
open OpenAPI.Model.PaginatedMachineSummaryList

module MachinesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MachineList
    /// <summary>
    /// List machines
    /// </summary>

    let MachineList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MachineListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MachineListArgs
          let result = MachinesApiService.MachineList ctx serviceArgs
          return! (match result with
                      | MachineListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MachineRetrieve
    /// <summary>
    /// Get machine
    /// </summary>

    let MachineRetrieve (pathParams:MachineRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MachineRetrieveArgs
          let result = MachinesApiService.MachineRetrieve ctx serviceArgs
          return! (match result with
                      | MachineRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

