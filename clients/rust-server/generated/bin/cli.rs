//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
    BerryFirmnessListResponse,
    BerryFlavorListResponse,
    BerryListResponse,
    BerryFirmnessRetrieveResponse,
    BerryFlavorRetrieveResponse,
    BerryRetrieveResponse,
    ContestEffectListResponse,
    ContestTypeListResponse,
    SuperContestEffectListResponse,
    ContestEffectRetrieveResponse,
    ContestTypeRetrieveResponse,
    SuperContestEffectRetrieveResponse,
    EncounterConditionListResponse,
    EncounterConditionValueListResponse,
    EncounterMethodListResponse,
    EncounterConditionRetrieveResponse,
    EncounterConditionValueRetrieveResponse,
    EncounterMethodRetrieveResponse,
    EvolutionChainListResponse,
    EvolutionTriggerListResponse,
    EvolutionChainRetrieveResponse,
    EvolutionTriggerRetrieveResponse,
    GenerationListResponse,
    PokedexListResponse,
    VersionGroupListResponse,
    VersionListResponse,
    GenerationRetrieveResponse,
    PokedexRetrieveResponse,
    VersionGroupRetrieveResponse,
    VersionRetrieveResponse,
    ItemAttributeListResponse,
    ItemCategoryListResponse,
    ItemFlingEffectListResponse,
    ItemListResponse,
    ItemPocketListResponse,
    ItemAttributeRetrieveResponse,
    ItemCategoryRetrieveResponse,
    ItemFlingEffectRetrieveResponse,
    ItemPocketRetrieveResponse,
    ItemRetrieveResponse,
    LocationAreaListResponse,
    LocationListResponse,
    PalParkAreaListResponse,
    RegionListResponse,
    LocationAreaRetrieveResponse,
    LocationRetrieveResponse,
    PalParkAreaRetrieveResponse,
    RegionRetrieveResponse,
    MachineListResponse,
    MachineRetrieveResponse,
    MoveAilmentListResponse,
    MoveBattleStyleListResponse,
    MoveCategoryListResponse,
    MoveLearnMethodListResponse,
    MoveListResponse,
    MoveTargetListResponse,
    MoveAilmentRetrieveResponse,
    MoveBattleStyleRetrieveResponse,
    MoveCategoryRetrieveResponse,
    MoveLearnMethodRetrieveResponse,
    MoveRetrieveResponse,
    MoveTargetRetrieveResponse,
    AbilityListResponse,
    CharacteristicListResponse,
    EggGroupListResponse,
    GenderListResponse,
    GrowthRateListResponse,
    MoveDamageClassListResponse,
    NatureListResponse,
    PokeathlonStatListResponse,
    PokemonColorListResponse,
    PokemonFormListResponse,
    PokemonHabitatListResponse,
    PokemonListResponse,
    PokemonShapeListResponse,
    PokemonSpeciesListResponse,
    StatListResponse,
    TypeListResponse,
    AbilityRetrieveResponse,
    CharacteristicRetrieveResponse,
    EggGroupRetrieveResponse,
    GenderRetrieveResponse,
    GrowthRateRetrieveResponse,
    MoveDamageClassRetrieveResponse,
    NatureRetrieveResponse,
    PokeathlonStatRetrieveResponse,
    PokemonColorRetrieveResponse,
    PokemonFormRetrieveResponse,
    PokemonHabitatRetrieveResponse,
    PokemonRetrieveResponse,
    PokemonShapeRetrieveResponse,
    PokemonSpeciesRetrieveResponse,
    StatRetrieveResponse,
    TypeRetrieveResponse,
    LanguageListResponse,
    LanguageRetrieveResponse,
};
use simple_logger::SimpleLogger;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(Parser, Debug)]
#[clap(
    name = "PokéAPI",
    version = "2.7.0",
    about = "CLI access to PokéAPI"
)]
struct Cli {
    #[clap(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[clap(short = 'a', long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_certificate", "server_certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_key", "server_certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[clap(short, long)]
    output_file: Option<String>,

    #[command(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,
}

#[derive(Parser, Debug)]
enum Operation {
    /// List berry firmness
    BerryFirmnessList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List berry flavors
    BerryFlavorList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List berries
    BerryList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get berry by firmness
    BerryFirmnessRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get berries by flavor
    BerryFlavorRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get a berry
    BerryRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List contest effects
    ContestEffectList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List contest types
    ContestTypeList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List super contest effects
    SuperContestEffectList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get contest effect
    ContestEffectRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get contest type
    ContestTypeRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get super contest effect
    SuperContestEffectRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List encounter conditions
    EncounterConditionList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List encounter condition values
    EncounterConditionValueList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List encounter methods
    EncounterMethodList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get encounter condition
    EncounterConditionRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get encounter condition value
    EncounterConditionValueRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get encounter method
    EncounterMethodRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List evolution chains
    EvolutionChainList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List evolution triggers
    EvolutionTriggerList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get evolution chain
    EvolutionChainRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get evolution trigger
    EvolutionTriggerRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List genrations
    GenerationList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokedex
    PokedexList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List version groups
    VersionGroupList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List versions
    VersionList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get genration
    GenerationRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokedex
    PokedexRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get version group
    VersionGroupRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get version
    VersionRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List item attributes
    ItemAttributeList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List item categories
    ItemCategoryList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List item fling effects
    ItemFlingEffectList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List items
    ItemList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List item pockets
    ItemPocketList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get item attribute
    ItemAttributeRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get item category
    ItemCategoryRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get item fling effect
    ItemFlingEffectRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get item pocket
    ItemPocketRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get item
    ItemRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List location areas
    LocationAreaList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
    },
    /// List locations
    LocationList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pal park areas
    PalParkAreaList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List regions
    RegionList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get location area
    LocationAreaRetrieve {
        /// A unique integer value identifying this location area.
        id: i32,
    },
    /// Get location
    LocationRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pal park area
    PalParkAreaRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get region
    RegionRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List machines
    MachineList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get machine
    MachineRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List move meta ailments
    MoveAilmentList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List move battle styles
    MoveBattleStyleList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List move meta categories
    MoveCategoryList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List move learn methods
    MoveLearnMethodList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List moves
    MoveList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List move targets
    MoveTargetList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get move meta ailment
    MoveAilmentRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move battle style
    MoveBattleStyleRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move meta category
    MoveCategoryRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move learn method
    MoveLearnMethodRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move
    MoveRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move target
    MoveTargetRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    AbilityList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List charecterictics
    CharacteristicList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List egg groups
    EggGroupList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List genders
    GenderList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List growth rates
    GrowthRateList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List move damage classes
    MoveDamageClassList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List natures
    NatureList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokeathlon stats
    PokeathlonStatList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemon colors
    PokemonColorList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemon forms
    PokemonFormList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemom habitas
    PokemonHabitatList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemon
    PokemonList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemon shapes
    PokemonShapeList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List pokemon species
    PokemonSpeciesList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List stats
    StatList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// List types
    TypeList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    AbilityRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get characteristic
    CharacteristicRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get egg group
    EggGroupRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get gender
    GenderRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get growth rate
    GrowthRateRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get move damage class
    MoveDamageClassRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get nature
    NatureRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokeathlon stat
    PokeathlonStatRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemon color
    PokemonColorRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemon form
    PokemonFormRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemom habita
    PokemonHabitatRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemon
    PokemonRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemon shape
    PokemonShapeRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get pokemon species
    PokemonSpeciesRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get stat
    StatRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// Get types
    TypeRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
    /// List languages
    LanguageList {
        /// Number of results to return per page.
        limit: Option<i32>,
        /// The initial index from which to return the results.
        offset: Option<i32>,
        /// > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
        q: Option<String>,
    },
    /// Get language
    LanguageRetrieve {
        /// This parameter can be a string or an integer.
        id: String,
    },
}

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::parse();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let auth_data: Option<AuthData> = None;

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::BerryFirmnessList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a BerryFirmnessList request");

            let result = client.berry_firmness_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFirmnessListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFlavorList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a BerryFlavorList request");

            let result = client.berry_flavor_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFlavorListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a BerryList request");

            let result = client.berry_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFirmnessRetrieve {
            id,
        } => {
            info!("Performing a BerryFirmnessRetrieve request on {:?}", (
                &id
            ));

            let result = client.berry_firmness_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFirmnessRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFlavorRetrieve {
            id,
        } => {
            info!("Performing a BerryFlavorRetrieve request on {:?}", (
                &id
            ));

            let result = client.berry_flavor_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFlavorRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryRetrieve {
            id,
        } => {
            info!("Performing a BerryRetrieve request on {:?}", (
                &id
            ));

            let result = client.berry_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestEffectList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ContestEffectList request");

            let result = client.contest_effect_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestEffectListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestTypeList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ContestTypeList request");

            let result = client.contest_type_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestTypeListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SuperContestEffectList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a SuperContestEffectList request");

            let result = client.super_contest_effect_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SuperContestEffectListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestEffectRetrieve {
            id,
        } => {
            info!("Performing a ContestEffectRetrieve request on {:?}", (
                &id
            ));

            let result = client.contest_effect_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestEffectRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestTypeRetrieve {
            id,
        } => {
            info!("Performing a ContestTypeRetrieve request on {:?}", (
                &id
            ));

            let result = client.contest_type_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestTypeRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SuperContestEffectRetrieve {
            id,
        } => {
            info!("Performing a SuperContestEffectRetrieve request on {:?}", (
                &id
            ));

            let result = client.super_contest_effect_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SuperContestEffectRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EncounterConditionList request");

            let result = client.encounter_condition_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionValueList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EncounterConditionValueList request");

            let result = client.encounter_condition_value_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionValueListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterMethodList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EncounterMethodList request");

            let result = client.encounter_method_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterMethodListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionRetrieve {
            id,
        } => {
            info!("Performing a EncounterConditionRetrieve request on {:?}", (
                &id
            ));

            let result = client.encounter_condition_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionValueRetrieve {
            id,
        } => {
            info!("Performing a EncounterConditionValueRetrieve request on {:?}", (
                &id
            ));

            let result = client.encounter_condition_value_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionValueRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterMethodRetrieve {
            id,
        } => {
            info!("Performing a EncounterMethodRetrieve request on {:?}", (
                &id
            ));

            let result = client.encounter_method_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterMethodRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionChainList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EvolutionChainList request");

            let result = client.evolution_chain_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionChainListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionTriggerList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EvolutionTriggerList request");

            let result = client.evolution_trigger_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionTriggerListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionChainRetrieve {
            id,
        } => {
            info!("Performing a EvolutionChainRetrieve request on {:?}", (
                &id
            ));

            let result = client.evolution_chain_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionChainRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionTriggerRetrieve {
            id,
        } => {
            info!("Performing a EvolutionTriggerRetrieve request on {:?}", (
                &id
            ));

            let result = client.evolution_trigger_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionTriggerRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenerationList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a GenerationList request");

            let result = client.generation_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenerationListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokedexList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokedexList request");

            let result = client.pokedex_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokedexListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionGroupList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a VersionGroupList request");

            let result = client.version_group_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionGroupListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a VersionList request");

            let result = client.version_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenerationRetrieve {
            id,
        } => {
            info!("Performing a GenerationRetrieve request on {:?}", (
                &id
            ));

            let result = client.generation_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenerationRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokedexRetrieve {
            id,
        } => {
            info!("Performing a PokedexRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokedex_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokedexRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionGroupRetrieve {
            id,
        } => {
            info!("Performing a VersionGroupRetrieve request on {:?}", (
                &id
            ));

            let result = client.version_group_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionGroupRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionRetrieve {
            id,
        } => {
            info!("Performing a VersionRetrieve request on {:?}", (
                &id
            ));

            let result = client.version_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemAttributeList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ItemAttributeList request");

            let result = client.item_attribute_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemAttributeListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemCategoryList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ItemCategoryList request");

            let result = client.item_category_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemCategoryListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemFlingEffectList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ItemFlingEffectList request");

            let result = client.item_fling_effect_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemFlingEffectListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ItemList request");

            let result = client.item_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemPocketList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a ItemPocketList request");

            let result = client.item_pocket_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemPocketListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemAttributeRetrieve {
            id,
        } => {
            info!("Performing a ItemAttributeRetrieve request on {:?}", (
                &id
            ));

            let result = client.item_attribute_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemAttributeRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemCategoryRetrieve {
            id,
        } => {
            info!("Performing a ItemCategoryRetrieve request on {:?}", (
                &id
            ));

            let result = client.item_category_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemCategoryRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemFlingEffectRetrieve {
            id,
        } => {
            info!("Performing a ItemFlingEffectRetrieve request on {:?}", (
                &id
            ));

            let result = client.item_fling_effect_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemFlingEffectRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemPocketRetrieve {
            id,
        } => {
            info!("Performing a ItemPocketRetrieve request on {:?}", (
                &id
            ));

            let result = client.item_pocket_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemPocketRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemRetrieve {
            id,
        } => {
            info!("Performing a ItemRetrieve request on {:?}", (
                &id
            ));

            let result = client.item_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationAreaList {
            limit,
            offset,
        } => {
            info!("Performing a LocationAreaList request");

            let result = client.location_area_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationAreaListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a LocationList request");

            let result = client.location_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PalParkAreaList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PalParkAreaList request");

            let result = client.pal_park_area_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PalParkAreaListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RegionList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a RegionList request");

            let result = client.region_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RegionListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationAreaRetrieve {
            id,
        } => {
            info!("Performing a LocationAreaRetrieve request on {:?}", (
                &id
            ));

            let result = client.location_area_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationAreaRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationRetrieve {
            id,
        } => {
            info!("Performing a LocationRetrieve request on {:?}", (
                &id
            ));

            let result = client.location_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PalParkAreaRetrieve {
            id,
        } => {
            info!("Performing a PalParkAreaRetrieve request on {:?}", (
                &id
            ));

            let result = client.pal_park_area_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PalParkAreaRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RegionRetrieve {
            id,
        } => {
            info!("Performing a RegionRetrieve request on {:?}", (
                &id
            ));

            let result = client.region_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RegionRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MachineList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MachineList request");

            let result = client.machine_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MachineListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MachineRetrieve {
            id,
        } => {
            info!("Performing a MachineRetrieve request on {:?}", (
                &id
            ));

            let result = client.machine_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MachineRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveAilmentList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveAilmentList request");

            let result = client.move_ailment_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveAilmentListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveBattleStyleList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveBattleStyleList request");

            let result = client.move_battle_style_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveBattleStyleListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveCategoryList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveCategoryList request");

            let result = client.move_category_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveCategoryListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveLearnMethodList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveLearnMethodList request");

            let result = client.move_learn_method_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveLearnMethodListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveList request");

            let result = client.move_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveTargetList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveTargetList request");

            let result = client.move_target_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveTargetListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveAilmentRetrieve {
            id,
        } => {
            info!("Performing a MoveAilmentRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_ailment_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveAilmentRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveBattleStyleRetrieve {
            id,
        } => {
            info!("Performing a MoveBattleStyleRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_battle_style_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveBattleStyleRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveCategoryRetrieve {
            id,
        } => {
            info!("Performing a MoveCategoryRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_category_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveCategoryRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveLearnMethodRetrieve {
            id,
        } => {
            info!("Performing a MoveLearnMethodRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_learn_method_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveLearnMethodRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveRetrieve {
            id,
        } => {
            info!("Performing a MoveRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveTargetRetrieve {
            id,
        } => {
            info!("Performing a MoveTargetRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_target_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveTargetRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AbilityList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a AbilityList request");

            let result = client.ability_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AbilityListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CharacteristicList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a CharacteristicList request");

            let result = client.characteristic_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CharacteristicListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EggGroupList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a EggGroupList request");

            let result = client.egg_group_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EggGroupListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenderList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a GenderList request");

            let result = client.gender_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenderListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GrowthRateList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a GrowthRateList request");

            let result = client.growth_rate_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GrowthRateListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveDamageClassList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a MoveDamageClassList request");

            let result = client.move_damage_class_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveDamageClassListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::NatureList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a NatureList request");

            let result = client.nature_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                NatureListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokeathlonStatList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokeathlonStatList request");

            let result = client.pokeathlon_stat_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokeathlonStatListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonColorList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonColorList request");

            let result = client.pokemon_color_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonColorListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonFormList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonFormList request");

            let result = client.pokemon_form_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonFormListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonHabitatList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonHabitatList request");

            let result = client.pokemon_habitat_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonHabitatListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonList request");

            let result = client.pokemon_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonShapeList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonShapeList request");

            let result = client.pokemon_shape_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonShapeListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonSpeciesList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a PokemonSpeciesList request");

            let result = client.pokemon_species_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonSpeciesListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::StatList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a StatList request");

            let result = client.stat_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                StatListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TypeList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a TypeList request");

            let result = client.type_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TypeListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AbilityRetrieve {
            id,
        } => {
            info!("Performing a AbilityRetrieve request on {:?}", (
                &id
            ));

            let result = client.ability_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AbilityRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CharacteristicRetrieve {
            id,
        } => {
            info!("Performing a CharacteristicRetrieve request on {:?}", (
                &id
            ));

            let result = client.characteristic_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CharacteristicRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EggGroupRetrieve {
            id,
        } => {
            info!("Performing a EggGroupRetrieve request on {:?}", (
                &id
            ));

            let result = client.egg_group_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EggGroupRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenderRetrieve {
            id,
        } => {
            info!("Performing a GenderRetrieve request on {:?}", (
                &id
            ));

            let result = client.gender_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenderRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GrowthRateRetrieve {
            id,
        } => {
            info!("Performing a GrowthRateRetrieve request on {:?}", (
                &id
            ));

            let result = client.growth_rate_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GrowthRateRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveDamageClassRetrieve {
            id,
        } => {
            info!("Performing a MoveDamageClassRetrieve request on {:?}", (
                &id
            ));

            let result = client.move_damage_class_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveDamageClassRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::NatureRetrieve {
            id,
        } => {
            info!("Performing a NatureRetrieve request on {:?}", (
                &id
            ));

            let result = client.nature_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                NatureRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokeathlonStatRetrieve {
            id,
        } => {
            info!("Performing a PokeathlonStatRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokeathlon_stat_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokeathlonStatRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonColorRetrieve {
            id,
        } => {
            info!("Performing a PokemonColorRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_color_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonColorRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonFormRetrieve {
            id,
        } => {
            info!("Performing a PokemonFormRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_form_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonFormRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonHabitatRetrieve {
            id,
        } => {
            info!("Performing a PokemonHabitatRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_habitat_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonHabitatRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonRetrieve {
            id,
        } => {
            info!("Performing a PokemonRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonShapeRetrieve {
            id,
        } => {
            info!("Performing a PokemonShapeRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_shape_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonShapeRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonSpeciesRetrieve {
            id,
        } => {
            info!("Performing a PokemonSpeciesRetrieve request on {:?}", (
                &id
            ));

            let result = client.pokemon_species_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonSpeciesRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::StatRetrieve {
            id,
        } => {
            info!("Performing a StatRetrieve request on {:?}", (
                &id
            ));

            let result = client.stat_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                StatRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TypeRetrieve {
            id,
        } => {
            info!("Performing a TypeRetrieve request on {:?}", (
                &id
            ));

            let result = client.type_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TypeRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LanguageList {
            limit,
            offset,
            q,
        } => {
            info!("Performing a LanguageList request");

            let result = client.language_list(
                limit,
                offset,
                q,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LanguageListResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LanguageRetrieve {
            id,
        } => {
            info!("Performing a LanguageRetrieve request on {:?}", (
                &id
            ));

            let result = client.language_retrieve(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LanguageRetrieveResponse::Status200
                (body)
                => "Status200\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<T: serde::de::DeserializeOwned>(json_string: &str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
