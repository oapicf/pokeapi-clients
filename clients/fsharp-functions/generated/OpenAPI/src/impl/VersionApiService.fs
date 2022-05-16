namespace OpenAPI
open VersionApiHandlerParams
open VersionApiServiceInterface
open System.Collections.Generic
open System

module VersionApiServiceImplementation =

    //#region Service implementation
    type VersionApiServiceImpl() =
      interface IVersionApiService with

        member this.VersionList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionListDefaultStatusCode { content = content }

        member this.VersionRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionReadDefaultStatusCode { content = content }

      //#endregion

    let VersionApiService = VersionApiServiceImpl() :> IVersionApiService