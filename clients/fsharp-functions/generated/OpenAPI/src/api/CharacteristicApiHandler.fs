namespace OpenAPI

open CharacteristicApiHandlerParams
open CharacteristicApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CharacteristicApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CharacteristicList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("CharacteristicList")>]
    let CharacteristicList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/characteristic/")>]
        req:HttpRequest ) =

      let result = CharacteristicApiService.CharacteristicList ()
      match result with
      | CharacteristicListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CharacteristicRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("CharacteristicRead")>]
    let CharacteristicRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/characteristic/{id}/")>]
        req:HttpRequest ) =

      let result = CharacteristicApiService.CharacteristicRead ()
      match result with
      | CharacteristicReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

