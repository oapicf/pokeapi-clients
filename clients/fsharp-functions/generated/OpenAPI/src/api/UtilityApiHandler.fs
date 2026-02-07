namespace OpenAPI

open UtilityApiHandlerParams
open UtilityApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UtilityApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region LanguageList
    /// <summary>
    /// List languages
    /// </summary>
   [<FunctionName("LanguageList")>]
    let LanguageList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/language/")>]
        req:HttpRequest ) =

      let result = UtilityApiService.LanguageList ()
      match result with
      | LanguageListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region LanguageRetrieve
    /// <summary>
    /// Get language
    /// </summary>
   [<FunctionName("LanguageRetrieve")>]
    let LanguageRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/language/{id}/")>]
        req:HttpRequest ) =

      let result = UtilityApiService.LanguageRetrieve ()
      match result with
      | LanguageRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

