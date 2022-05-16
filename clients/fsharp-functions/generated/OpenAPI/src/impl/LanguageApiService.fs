namespace OpenAPI
open LanguageApiHandlerParams
open LanguageApiServiceInterface
open System.Collections.Generic
open System

module LanguageApiServiceImplementation =

    //#region Service implementation
    type LanguageApiServiceImpl() =
      interface ILanguageApiService with

        member this.LanguageList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LanguageListDefaultStatusCode { content = content }

        member this.LanguageRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LanguageReadDefaultStatusCode { content = content }

      //#endregion

    let LanguageApiService = LanguageApiServiceImpl() :> ILanguageApiService