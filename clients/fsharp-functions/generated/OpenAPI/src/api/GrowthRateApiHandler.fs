namespace OpenAPI

open GrowthRateApiHandlerParams
open GrowthRateApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module GrowthRateApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GrowthRateList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GrowthRateList")>]
    let GrowthRateList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/growth-rate/")>]
        req:HttpRequest ) =

      let result = GrowthRateApiService.GrowthRateList ()
      match result with
      | GrowthRateListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GrowthRateRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GrowthRateRead")>]
    let GrowthRateRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/growth-rate/{id}/")>]
        req:HttpRequest ) =

      let result = GrowthRateApiService.GrowthRateRead ()
      match result with
      | GrowthRateReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

