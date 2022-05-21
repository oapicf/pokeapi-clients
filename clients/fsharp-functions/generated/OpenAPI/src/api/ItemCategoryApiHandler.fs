namespace OpenAPI

open ItemCategoryApiHandlerParams
open ItemCategoryApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemCategoryApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemCategoryList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemCategoryList")>]
    let ItemCategoryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-category/")>]
        req:HttpRequest ) =

      let result = ItemCategoryApiService.ItemCategoryList ()
      match result with
      | ItemCategoryListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ItemCategoryRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemCategoryRead")>]
    let ItemCategoryRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-category/{id}/")>]
        req:HttpRequest ) =

      let result = ItemCategoryApiService.ItemCategoryRead ()
      match result with
      | ItemCategoryReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

