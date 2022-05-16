namespace OpenAPI
open LanguageApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LanguageApiServiceInterface =

    //#region Service interface
    type ILanguageApiService =
      abstract member LanguageList:HttpContext -> LanguageListArgs->LanguageListResult
      abstract member LanguageRead:HttpContext -> LanguageReadArgs->LanguageReadResult
    //#endregion