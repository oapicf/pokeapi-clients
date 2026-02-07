namespace OpenAPI
open OpenAPI.Model.LanguageDetail
open OpenAPI.Model.PaginatedLanguageSummaryList
open UtilityApiHandlerParams
open UtilityApiServiceInterface
open System.Collections.Generic
open System

module UtilityApiServiceImplementation =

    //#region Service implementation
    type UtilityApiServiceImpl() =
      interface IUtilityApiService with

        member this.LanguageList () =
            let content = "" :> obj :?> PaginatedLanguageSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LanguageListStatusCode200 { content = content }

        member this.LanguageRetrieve () =
            let content = "" :> obj :?> LanguageDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LanguageRetrieveStatusCode200 { content = content }

      //#endregion

    let UtilityApiService = UtilityApiServiceImpl() :> IUtilityApiService