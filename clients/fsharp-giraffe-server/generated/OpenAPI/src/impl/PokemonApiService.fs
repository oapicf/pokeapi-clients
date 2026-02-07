namespace OpenAPI
open OpenAPI.Model.AbilityDetail
open OpenAPI.Model.CharacteristicDetail
open OpenAPI.Model.EggGroupDetail
open OpenAPI.Model.GenderDetail
open OpenAPI.Model.GrowthRateDetail
open OpenAPI.Model.MoveDamageClassDetail
open OpenAPI.Model.NatureDetail
open OpenAPI.Model.PaginatedAbilitySummaryList
open OpenAPI.Model.PaginatedCharacteristicSummaryList
open OpenAPI.Model.PaginatedEggGroupSummaryList
open OpenAPI.Model.PaginatedGenderSummaryList
open OpenAPI.Model.PaginatedGrowthRateSummaryList
open OpenAPI.Model.PaginatedMoveDamageClassSummaryList
open OpenAPI.Model.PaginatedNatureSummaryList
open OpenAPI.Model.PaginatedPokeathlonStatSummaryList
open OpenAPI.Model.PaginatedPokemonColorSummaryList
open OpenAPI.Model.PaginatedPokemonFormSummaryList
open OpenAPI.Model.PaginatedPokemonHabitatSummaryList
open OpenAPI.Model.PaginatedPokemonShapeSummaryList
open OpenAPI.Model.PaginatedPokemonSpeciesSummaryList
open OpenAPI.Model.PaginatedPokemonSummaryList
open OpenAPI.Model.PaginatedStatSummaryList
open OpenAPI.Model.PaginatedTypeSummaryList
open OpenAPI.Model.PokeathlonStatDetail
open OpenAPI.Model.PokemonColorDetail
open OpenAPI.Model.PokemonDetail
open OpenAPI.Model.PokemonFormDetail
open OpenAPI.Model.PokemonHabitatDetail
open OpenAPI.Model.PokemonShapeDetail
open OpenAPI.Model.PokemonSpeciesDetail
open OpenAPI.Model.StatDetail
open OpenAPI.Model.TypeDetail
open PokemonApiHandlerParams
open PokemonApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonApiServiceImplementation =

    //#region Service implementation
    type PokemonApiServiceImpl() =
      interface IPokemonApiService with

        member this.AbilityList ctx args =
            let content = "" :> obj :?> PaginatedAbilitySummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AbilityListStatusCode200 { content = content }

        member this.AbilityRetrieve ctx args =
            let content = "" :> obj :?> AbilityDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AbilityRetrieveStatusCode200 { content = content }

        member this.CharacteristicList ctx args =
            let content = "" :> obj :?> PaginatedCharacteristicSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CharacteristicListStatusCode200 { content = content }

        member this.CharacteristicRetrieve ctx args =
            let content = "" :> obj :?> CharacteristicDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CharacteristicRetrieveStatusCode200 { content = content }

        member this.EggGroupList ctx args =
            let content = "" :> obj :?> PaginatedEggGroupSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EggGroupListStatusCode200 { content = content }

        member this.EggGroupRetrieve ctx args =
            let content = "" :> obj :?> EggGroupDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EggGroupRetrieveStatusCode200 { content = content }

        member this.GenderList ctx args =
            let content = "" :> obj :?> PaginatedGenderSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenderListStatusCode200 { content = content }

        member this.GenderRetrieve ctx args =
            let content = "" :> obj :?> GenderDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenderRetrieveStatusCode200 { content = content }

        member this.GrowthRateList ctx args =
            let content = "" :> obj :?> PaginatedGrowthRateSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateListStatusCode200 { content = content }

        member this.GrowthRateRetrieve ctx args =
            let content = "" :> obj :?> GrowthRateDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateRetrieveStatusCode200 { content = content }

        member this.MoveDamageClassList ctx args =
            let content = "" :> obj :?> PaginatedMoveDamageClassSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassListStatusCode200 { content = content }

        member this.MoveDamageClassRetrieve ctx args =
            let content = "" :> obj :?> MoveDamageClassDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassRetrieveStatusCode200 { content = content }

        member this.NatureList ctx args =
            let content = "" :> obj :?> PaginatedNatureSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureListStatusCode200 { content = content }

        member this.NatureRetrieve ctx args =
            let content = "" :> obj :?> NatureDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureRetrieveStatusCode200 { content = content }

        member this.PokeathlonStatList ctx args =
            let content = "" :> obj :?> PaginatedPokeathlonStatSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokeathlonStatListStatusCode200 { content = content }

        member this.PokeathlonStatRetrieve ctx args =
            let content = "" :> obj :?> PokeathlonStatDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokeathlonStatRetrieveStatusCode200 { content = content }

        member this.PokemonColorList ctx args =
            let content = "" :> obj :?> PaginatedPokemonColorSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonColorListStatusCode200 { content = content }

        member this.PokemonColorRetrieve ctx args =
            let content = "" :> obj :?> PokemonColorDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonColorRetrieveStatusCode200 { content = content }

        member this.PokemonFormList ctx args =
            let content = "" :> obj :?> PaginatedPokemonFormSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonFormListStatusCode200 { content = content }

        member this.PokemonFormRetrieve ctx args =
            let content = "" :> obj :?> PokemonFormDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonFormRetrieveStatusCode200 { content = content }

        member this.PokemonHabitatList ctx args =
            let content = "" :> obj :?> PaginatedPokemonHabitatSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonHabitatListStatusCode200 { content = content }

        member this.PokemonHabitatRetrieve ctx args =
            let content = "" :> obj :?> PokemonHabitatDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonHabitatRetrieveStatusCode200 { content = content }

        member this.PokemonList ctx args =
            let content = "" :> obj :?> PaginatedPokemonSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonListStatusCode200 { content = content }

        member this.PokemonRetrieve ctx args =
            let content = "" :> obj :?> PokemonDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonRetrieveStatusCode200 { content = content }

        member this.PokemonShapeList ctx args =
            let content = "" :> obj :?> PaginatedPokemonShapeSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeListStatusCode200 { content = content }

        member this.PokemonShapeRetrieve ctx args =
            let content = "" :> obj :?> PokemonShapeDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeRetrieveStatusCode200 { content = content }

        member this.PokemonSpeciesList ctx args =
            let content = "" :> obj :?> PaginatedPokemonSpeciesSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesListStatusCode200 { content = content }

        member this.PokemonSpeciesRetrieve ctx args =
            let content = "" :> obj :?> PokemonSpeciesDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonSpeciesRetrieveStatusCode200 { content = content }

        member this.StatList ctx args =
            let content = "" :> obj :?> PaginatedStatSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            StatListStatusCode200 { content = content }

        member this.StatRetrieve ctx args =
            let content = "" :> obj :?> StatDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            StatRetrieveStatusCode200 { content = content }

        member this.TypeList ctx args =
            let content = "" :> obj :?> PaginatedTypeSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TypeListStatusCode200 { content = content }

        member this.TypeRetrieve ctx args =
            let content = "" :> obj :?> TypeDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TypeRetrieveStatusCode200 { content = content }

      //#endregion

    let PokemonApiService = PokemonApiServiceImpl() :> IPokemonApiService