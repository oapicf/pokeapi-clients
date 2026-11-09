namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenderPokemonSpecies
open OpenAPI.Model.PokemonSpeciesSummary

module GenderDetail =

  //#region GenderDetail

  [<CLIMutable>]
  type GenderDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "pokemon_species_details")>]
    PokemonSpeciesDetails : GenderPokemonSpecies[];
    [<JsonProperty(PropertyName = "required_for_evolution")>]
    RequiredForEvolution : PokemonSpeciesSummary[];
  }

  //#endregion
