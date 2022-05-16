namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveDamageClassApiHandlerParams
open MoveDamageClassApiServiceInterface
open MoveDamageClassApiServiceImplementation

module MoveDamageClassApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveDamageClassList
    /// <summary>
    /// 
    /// </summary>

    let MoveDamageClassList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveDamageClassListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveDamageClassListArgs
          let result = MoveDamageClassApiService.MoveDamageClassList ctx serviceArgs
          return! (match result with
                      | MoveDamageClassListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveDamageClassRead
    /// <summary>
    /// 
    /// </summary>

    let MoveDamageClassRead (pathParams:MoveDamageClassReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveDamageClassReadArgs
          let result = MoveDamageClassApiService.MoveDamageClassRead ctx serviceArgs
          return! (match result with
                      | MoveDamageClassReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

