namespace OpenAPI
open UtilityApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UtilityApiServiceInterface =

    //#region Service interface
    type IUtilityApiService =
      abstract member LanguageList:HttpContext -> LanguageListArgs->LanguageListResult
      abstract member LanguageRetrieve:HttpContext -> LanguageRetrieveArgs->LanguageRetrieveResult
    //#endregion