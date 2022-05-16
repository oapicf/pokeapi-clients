namespace OpenAPI
open LanguageApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LanguageApiServiceInterface =

    //#region Service interface
    type ILanguageApiService =
      abstract member LanguageList : unit -> LanguageListResult
      abstract member LanguageRead : unit -> LanguageReadResult
    //#endregion