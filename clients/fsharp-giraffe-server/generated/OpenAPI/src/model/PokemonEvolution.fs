namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionConditionExpression
open OpenAPI.Model.EvolutionTriggerSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.NatureSummary
open OpenAPI.Model.PokemonEvolutionKnownMove
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonEvolution =

  //#region PokemonEvolution


  type PokemonEvolution = {
    VersionGroup : VersionGroupSummary;
    IsDefault : bool;
    Item : ItemSummary;
    Trigger : EvolutionTriggerSummary;
    Gender : int option;
    HeldItem : ItemSummary;
    KnownMove : PokemonEvolutionKnownMove;
    KnownMoveType : PokemonEvolutionKnownMove;
    Location : LocationSummary;
    MinLevel : int option;
    MinHappiness : int option;
    MinBeauty : int option;
    MinAffection : int option;
    NearSpecialRock : bool;
    NeedsMultiplayer : bool;
    NeedsOverworldRain : bool;
    PartySpecies : PokemonSpeciesSummary;
    PartyType : TypeSummary;
    RelativePhysicalStats : int option;
    TimeOfDay : string;
    TradeSpecies : PokemonSpeciesSummary;
    TurnUpsideDown : bool;
    Region : RegionSummary;
    RequiredPokemonForm : PokemonFormSummary;
    EvolvedPokemonForm : PokemonFormSummary;
    UsedMove : MoveSummary;
    MinMoveCount : int option;
    MinSteps : int option;
    MinDamageTaken : int option;
    AllowedNatures : NatureSummary[];
    ConditionExpression : EvolutionConditionExpression;
  }
  //#endregion
