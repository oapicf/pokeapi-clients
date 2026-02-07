namespace OpenAPI

open MachinesApiHandlerParams
open MachinesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MachinesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MachineList
    /// <summary>
    /// List machines
    /// </summary>
   [<FunctionName("MachineList")>]
    let MachineList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/machine/")>]
        req:HttpRequest ) =

      let result = MachinesApiService.MachineList ()
      match result with
      | MachineListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MachineRetrieve
    /// <summary>
    /// Get machine
    /// </summary>
   [<FunctionName("MachineRetrieve")>]
    let MachineRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/machine/{id}/")>]
        req:HttpRequest ) =

      let result = MachinesApiService.MachineRetrieve ()
      match result with
      | MachineRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

