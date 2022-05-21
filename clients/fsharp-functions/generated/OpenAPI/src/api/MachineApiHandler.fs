namespace OpenAPI

open MachineApiHandlerParams
open MachineApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MachineApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MachineList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MachineList")>]
    let MachineList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/machine/")>]
        req:HttpRequest ) =

      let result = MachineApiService.MachineList ()
      match result with
      | MachineListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MachineRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MachineRead")>]
    let MachineRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/machine/{id}/")>]
        req:HttpRequest ) =

      let result = MachineApiService.MachineRead ()
      match result with
      | MachineReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

