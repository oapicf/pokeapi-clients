namespace OpenAPI

open MoveCategoryApiHandlerParams
open MoveCategoryApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveCategoryApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveCategoryList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveCategoryList")>]
    let MoveCategoryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/")>]
        req:HttpRequest ) =

      let result = MoveCategoryApiService.MoveCategoryList ()
      match result with
      | MoveCategoryListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveCategoryRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveCategoryRead")>]
    let MoveCategoryRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/{id}/")>]
        req:HttpRequest ) =

      let result = MoveCategoryApiService.MoveCategoryRead ()
      match result with
      | MoveCategoryReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

