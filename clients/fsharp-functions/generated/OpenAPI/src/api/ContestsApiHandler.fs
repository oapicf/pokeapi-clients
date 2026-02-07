namespace OpenAPI

open ContestsApiHandlerParams
open ContestsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ContestsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestEffectList
    /// <summary>
    /// List contest effects
    /// </summary>
   [<FunctionName("ContestEffectList")>]
    let ContestEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.ContestEffectList ()
      match result with
      | ContestEffectListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ContestEffectRetrieve
    /// <summary>
    /// Get contest effect
    /// </summary>
   [<FunctionName("ContestEffectRetrieve")>]
    let ContestEffectRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/{id}/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.ContestEffectRetrieve ()
      match result with
      | ContestEffectRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ContestTypeList
    /// <summary>
    /// List contest types
    /// </summary>
   [<FunctionName("ContestTypeList")>]
    let ContestTypeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-type/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.ContestTypeList ()
      match result with
      | ContestTypeListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ContestTypeRetrieve
    /// <summary>
    /// Get contest type
    /// </summary>
   [<FunctionName("ContestTypeRetrieve")>]
    let ContestTypeRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-type/{id}/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.ContestTypeRetrieve ()
      match result with
      | ContestTypeRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region SuperContestEffectList
    /// <summary>
    /// List super contest effects
    /// </summary>
   [<FunctionName("SuperContestEffectList")>]
    let SuperContestEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/super-contest-effect/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.SuperContestEffectList ()
      match result with
      | SuperContestEffectListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region SuperContestEffectRetrieve
    /// <summary>
    /// Get super contest effect
    /// </summary>
   [<FunctionName("SuperContestEffectRetrieve")>]
    let SuperContestEffectRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/super-contest-effect/{id}/")>]
        req:HttpRequest ) =

      let result = ContestsApiService.SuperContestEffectRetrieve ()
      match result with
      | SuperContestEffectRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

