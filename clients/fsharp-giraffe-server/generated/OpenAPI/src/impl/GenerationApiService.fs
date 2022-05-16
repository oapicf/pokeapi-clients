namespace OpenAPI
open GenerationApiHandlerParams
open GenerationApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module GenerationApiServiceImplementation =

    //#region Service implementation
    type GenerationApiServiceImpl() =
      interface IGenerationApiService with

        member this.GenerationList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerationListDefaultStatusCode { content = content }

        member this.GenerationRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerationReadDefaultStatusCode { content = content }

      //#endregion

    let GenerationApiService = GenerationApiServiceImpl() :> IGenerationApiService