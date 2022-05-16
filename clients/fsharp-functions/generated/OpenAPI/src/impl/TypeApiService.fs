namespace OpenAPI
open TypeApiHandlerParams
open TypeApiServiceInterface
open System.Collections.Generic
open System

module TypeApiServiceImplementation =

    //#region Service implementation
    type TypeApiServiceImpl() =
      interface ITypeApiService with

        member this.TypeList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TypeListDefaultStatusCode { content = content }

        member this.TypeRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TypeReadDefaultStatusCode { content = content }

      //#endregion

    let TypeApiService = TypeApiServiceImpl() :> ITypeApiService