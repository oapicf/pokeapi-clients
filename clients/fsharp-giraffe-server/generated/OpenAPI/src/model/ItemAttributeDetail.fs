namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemAttributeDescription
open OpenAPI.Model.ItemAttributeName

module ItemAttributeDetail =

  //#region ItemAttributeDetail


  type ItemAttributeDetail = {
    Id : int;
    Name : string;
    Descriptions : ItemAttributeDescription[];
    Items : AbilityDetailPokemonInnerPokemon[];
    Names : ItemAttributeName[];
  }
  //#endregion
