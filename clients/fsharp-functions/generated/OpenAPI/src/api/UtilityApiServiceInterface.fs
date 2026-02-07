namespace OpenAPI
open UtilityApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UtilityApiServiceInterface =

    //#region Service interface
    type IUtilityApiService =
      abstract member LanguageList : unit -> LanguageListResult
      abstract member LanguageRetrieve : unit -> LanguageRetrieveResult
    //#endregion