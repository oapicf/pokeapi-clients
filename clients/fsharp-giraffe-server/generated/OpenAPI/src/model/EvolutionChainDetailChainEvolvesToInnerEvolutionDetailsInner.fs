namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender

module EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner =

  //#region EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner


  type EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner = {
    Gender : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    HeldItem : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    Item : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    KnownMove : obj;
    KnownMoveType : obj;
    Location : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    MinAffection : int;
    MinBeauty : int;
    MinHappiness : int;
    MinLevel : int;
    NeedsOverworldRain : bool;
    PartySpecies : string;
    PartyType : string;
    RelativePhysicalStats : string;
    TimeOfDay : string;
    TradeSpecies : string;
    Trigger : AbilityDetailPokemonInnerPokemon;
    TurnUpsideDown : bool;
  }
  //#endregion
