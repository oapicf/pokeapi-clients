namespace OpenAPI
open EggGroupApiHandlerParams
open EggGroupApiServiceInterface
open System.Collections.Generic
open System

module EggGroupApiServiceImplementation =

    //#region Service implementation
    type EggGroupApiServiceImpl() =
      interface IEggGroupApiService with

        member this.EggGroupList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EggGroupListDefaultStatusCode { content = content }

        member this.EggGroupRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EggGroupReadDefaultStatusCode { content = content }

      //#endregion

    let EggGroupApiService = EggGroupApiServiceImpl() :> IEggGroupApiService