namespace OpenAPI
open ContestTypeApiHandlerParams
open ContestTypeApiServiceInterface
open System.Collections.Generic
open System

module ContestTypeApiServiceImplementation =

    //#region Service implementation
    type ContestTypeApiServiceImpl() =
      interface IContestTypeApiService with

        member this.ContestTypeList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestTypeListDefaultStatusCode { content = content }

        member this.ContestTypeRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestTypeReadDefaultStatusCode { content = content }

      //#endregion

    let ContestTypeApiService = ContestTypeApiServiceImpl() :> IContestTypeApiService