namespace OpenAPI

open ItemPocketApiHandlerParams
open ItemPocketApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemPocketApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemPocketList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemPocketList")>]
    let ItemPocketList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/")>]
        req:HttpRequest ) =

      let result = ItemPocketApiService.ItemPocketList ()
      match result with
      | ItemPocketListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ItemPocketRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemPocketRead")>]
    let ItemPocketRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/{id}/")>]
        req:HttpRequest ) =

      let result = ItemPocketApiService.ItemPocketRead ()
      match result with
      | ItemPocketReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

