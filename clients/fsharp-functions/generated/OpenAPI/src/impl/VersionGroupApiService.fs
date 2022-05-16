namespace OpenAPI
open VersionGroupApiHandlerParams
open VersionGroupApiServiceInterface
open System.Collections.Generic
open System

module VersionGroupApiServiceImplementation =

    //#region Service implementation
    type VersionGroupApiServiceImpl() =
      interface IVersionGroupApiService with

        member this.VersionGroupList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupListDefaultStatusCode { content = content }

        member this.VersionGroupRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupReadDefaultStatusCode { content = content }

      //#endregion

    let VersionGroupApiService = VersionGroupApiServiceImpl() :> IVersionGroupApiService