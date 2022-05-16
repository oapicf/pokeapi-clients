namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CharacteristicApiHandlerParams
open CharacteristicApiServiceInterface
open CharacteristicApiServiceImplementation

module CharacteristicApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CharacteristicList
    /// <summary>
    /// 
    /// </summary>

    let CharacteristicList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CharacteristicListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CharacteristicListArgs
          let result = CharacteristicApiService.CharacteristicList ctx serviceArgs
          return! (match result with
                      | CharacteristicListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region CharacteristicRead
    /// <summary>
    /// 
    /// </summary>

    let CharacteristicRead (pathParams:CharacteristicReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CharacteristicReadArgs
          let result = CharacteristicApiService.CharacteristicRead ctx serviceArgs
          return! (match result with
                      | CharacteristicReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

