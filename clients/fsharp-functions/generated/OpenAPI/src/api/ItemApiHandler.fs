namespace OpenAPI

open ItemApiHandlerParams
open ItemApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemList")>]
    let ItemList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item/")>]
        req:HttpRequest ) =

      let result = ItemApiService.ItemList ()
      match result with
      | ItemListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ItemRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemRead")>]
    let ItemRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item/{id}/")>]
        req:HttpRequest ) =

      let result = ItemApiService.ItemRead ()
      match result with
      | ItemReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

