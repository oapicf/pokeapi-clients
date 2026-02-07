namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenderDetailPokemonSpeciesDetailsInner

module GenderDetail =

  //#region GenderDetail

  [<CLIMutable>]
  type GenderDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "pokemon_species_details")>]
    PokemonSpeciesDetails : GenderDetailPokemonSpeciesDetailsInner[];
    [<JsonProperty(PropertyName = "required_for_evolution")>]
    RequiredForEvolution : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
