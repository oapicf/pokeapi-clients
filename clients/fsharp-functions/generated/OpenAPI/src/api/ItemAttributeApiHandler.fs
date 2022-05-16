namespace OpenAPI

open ItemAttributeApiHandlerParams
open ItemAttributeApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemAttributeApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemAttributeList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemAttributeList")>]
    let ItemAttributeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/item-attribute/")>]
        req:HttpRequest ) =

      let result = ItemAttributeApiService.ItemAttributeList ()
      match result with
      | ItemAttributeListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ItemAttributeRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemAttributeRead")>]
    let ItemAttributeRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/item-attribute/{id}/")>]
        req:HttpRequest ) =

      let result = ItemAttributeApiService.ItemAttributeRead ()
      match result with
      | ItemAttributeReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

