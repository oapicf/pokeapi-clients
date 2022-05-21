namespace OpenAPI

open PalParkAreaApiHandlerParams
open PalParkAreaApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PalParkAreaApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PalParkAreaList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PalParkAreaList")>]
    let PalParkAreaList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pal-park-area/")>]
        req:HttpRequest ) =

      let result = PalParkAreaApiService.PalParkAreaList ()
      match result with
      | PalParkAreaListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PalParkAreaRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PalParkAreaRead")>]
    let PalParkAreaRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pal-park-area/{id}/")>]
        req:HttpRequest ) =

      let result = PalParkAreaApiService.PalParkAreaRead ()
      match result with
      | PalParkAreaReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

