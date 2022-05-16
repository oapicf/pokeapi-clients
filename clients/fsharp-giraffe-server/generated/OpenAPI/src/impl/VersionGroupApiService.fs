namespace OpenAPI
open VersionGroupApiHandlerParams
open VersionGroupApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module VersionGroupApiServiceImplementation =

    //#region Service implementation
    type VersionGroupApiServiceImpl() =
      interface IVersionGroupApiService with

        member this.VersionGroupList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupListDefaultStatusCode { content = content }

        member this.VersionGroupRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupReadDefaultStatusCode { content = content }

      //#endregion

    let VersionGroupApiService = VersionGroupApiServiceImpl() :> IVersionGroupApiService