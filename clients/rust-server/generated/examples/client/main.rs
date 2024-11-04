#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
                      AbilityListResponse,
                      AbilityReadResponse,
                      BerryListResponse,
                      BerryReadResponse,
                      BerryFirmnessListResponse,
                      BerryFirmnessReadResponse,
                      BerryFlavorListResponse,
                      BerryFlavorReadResponse,
                      CharacteristicListResponse,
                      CharacteristicReadResponse,
                      ContestEffectListResponse,
                      ContestEffectReadResponse,
                      ContestTypeListResponse,
                      ContestTypeReadResponse,
                      EggGroupListResponse,
                      EggGroupReadResponse,
                      EncounterConditionListResponse,
                      EncounterConditionReadResponse,
                      EncounterConditionValueListResponse,
                      EncounterConditionValueReadResponse,
                      EncounterMethodListResponse,
                      EncounterMethodReadResponse,
                      EvolutionChainListResponse,
                      EvolutionChainReadResponse,
                      EvolutionTriggerListResponse,
                      EvolutionTriggerReadResponse,
                      GenderListResponse,
                      GenderReadResponse,
                      GenerationListResponse,
                      GenerationReadResponse,
                      GrowthRateListResponse,
                      GrowthRateReadResponse,
                      ItemListResponse,
                      ItemReadResponse,
                      ItemAttributeListResponse,
                      ItemAttributeReadResponse,
                      ItemCategoryListResponse,
                      ItemCategoryReadResponse,
                      ItemFlingEffectListResponse,
                      ItemFlingEffectReadResponse,
                      ItemPocketListResponse,
                      ItemPocketReadResponse,
                      LanguageListResponse,
                      LanguageReadResponse,
                      LocationListResponse,
                      LocationReadResponse,
                      LocationAreaListResponse,
                      LocationAreaReadResponse,
                      MachineListResponse,
                      MachineReadResponse,
                      MoveListResponse,
                      MoveReadResponse,
                      MoveAilmentListResponse,
                      MoveAilmentReadResponse,
                      MoveBattleStyleListResponse,
                      MoveBattleStyleReadResponse,
                      MoveCategoryListResponse,
                      MoveCategoryReadResponse,
                      MoveDamageClassListResponse,
                      MoveDamageClassReadResponse,
                      MoveLearnMethodListResponse,
                      MoveLearnMethodReadResponse,
                      MoveTargetListResponse,
                      MoveTargetReadResponse,
                      NatureListResponse,
                      NatureReadResponse,
                      PalParkAreaListResponse,
                      PalParkAreaReadResponse,
                      PokeathlonStatListResponse,
                      PokeathlonStatReadResponse,
                      PokedexListResponse,
                      PokedexReadResponse,
                      PokemonListResponse,
                      PokemonReadResponse,
                      PokemonColorListResponse,
                      PokemonColorReadResponse,
                      PokemonFormListResponse,
                      PokemonFormReadResponse,
                      PokemonHabitatListResponse,
                      PokemonHabitatReadResponse,
                      PokemonShapeListResponse,
                      PokemonShapeReadResponse,
                      PokemonSpeciesListResponse,
                      PokemonSpeciesReadResponse,
                      RegionListResponse,
                      RegionReadResponse,
                      StatListResponse,
                      StatReadResponse,
                      SuperContestEffectListResponse,
                      SuperContestEffectReadResponse,
                      TypeListResponse,
                      TypeReadResponse,
                      VersionListResponse,
                      VersionReadResponse,
                      VersionGroupListResponse,
                      VersionGroupReadResponse,
                     };
use clap::{App, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "AbilityList",
                "AbilityRead",
                "BerryList",
                "BerryRead",
                "BerryFirmnessList",
                "BerryFirmnessRead",
                "BerryFlavorList",
                "BerryFlavorRead",
                "CharacteristicList",
                "CharacteristicRead",
                "ContestEffectList",
                "ContestEffectRead",
                "ContestTypeList",
                "ContestTypeRead",
                "EggGroupList",
                "EggGroupRead",
                "EncounterConditionList",
                "EncounterConditionRead",
                "EncounterConditionValueList",
                "EncounterConditionValueRead",
                "EncounterMethodList",
                "EncounterMethodRead",
                "EvolutionChainList",
                "EvolutionChainRead",
                "EvolutionTriggerList",
                "EvolutionTriggerRead",
                "GenderList",
                "GenderRead",
                "GenerationList",
                "GenerationRead",
                "GrowthRateList",
                "GrowthRateRead",
                "ItemList",
                "ItemRead",
                "ItemAttributeList",
                "ItemAttributeRead",
                "ItemCategoryList",
                "ItemCategoryRead",
                "ItemFlingEffectList",
                "ItemFlingEffectRead",
                "ItemPocketList",
                "ItemPocketRead",
                "LanguageList",
                "LanguageRead",
                "LocationList",
                "LocationRead",
                "LocationAreaList",
                "LocationAreaRead",
                "MachineList",
                "MachineRead",
                "MoveList",
                "MoveRead",
                "MoveAilmentList",
                "MoveAilmentRead",
                "MoveBattleStyleList",
                "MoveBattleStyleRead",
                "MoveCategoryList",
                "MoveCategoryRead",
                "MoveDamageClassList",
                "MoveDamageClassRead",
                "MoveLearnMethodList",
                "MoveLearnMethodRead",
                "MoveTargetList",
                "MoveTargetRead",
                "NatureList",
                "NatureRead",
                "PalParkAreaList",
                "PalParkAreaRead",
                "PokeathlonStatList",
                "PokeathlonStatRead",
                "PokedexList",
                "PokedexRead",
                "PokemonList",
                "PokemonRead",
                "PokemonColorList",
                "PokemonColorRead",
                "PokemonFormList",
                "PokemonFormRead",
                "PokemonHabitatList",
                "PokemonHabitatRead",
                "PokemonShapeList",
                "PokemonShapeRead",
                "PokemonSpeciesList",
                "PokemonSpeciesRead",
                "RegionList",
                "RegionRead",
                "StatList",
                "StatRead",
                "SuperContestEffectList",
                "SuperContestEffectRead",
                "TypeList",
                "TypeRead",
                "VersionList",
                "VersionRead",
                "VersionGroupList",
                "VersionGroupRead",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("pokeapi.co")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  "".to_owned()
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(swagger::auth::Bearer { token: auth_token}))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.value_of("host").unwrap(),
        matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.value_of("operation") {
        Some("AbilityList") => {
            let result = rt.block_on(client.ability_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AbilityRead") => {
            let result = rt.block_on(client.ability_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryList") => {
            let result = rt.block_on(client.berry_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryRead") => {
            let result = rt.block_on(client.berry_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryFirmnessList") => {
            let result = rt.block_on(client.berry_firmness_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryFirmnessRead") => {
            let result = rt.block_on(client.berry_firmness_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryFlavorList") => {
            let result = rt.block_on(client.berry_flavor_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryFlavorRead") => {
            let result = rt.block_on(client.berry_flavor_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CharacteristicList") => {
            let result = rt.block_on(client.characteristic_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CharacteristicRead") => {
            let result = rt.block_on(client.characteristic_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ContestEffectList") => {
            let result = rt.block_on(client.contest_effect_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ContestEffectRead") => {
            let result = rt.block_on(client.contest_effect_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ContestTypeList") => {
            let result = rt.block_on(client.contest_type_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ContestTypeRead") => {
            let result = rt.block_on(client.contest_type_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EggGroupList") => {
            let result = rt.block_on(client.egg_group_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EggGroupRead") => {
            let result = rt.block_on(client.egg_group_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterConditionList") => {
            let result = rt.block_on(client.encounter_condition_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterConditionRead") => {
            let result = rt.block_on(client.encounter_condition_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterConditionValueList") => {
            let result = rt.block_on(client.encounter_condition_value_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterConditionValueRead") => {
            let result = rt.block_on(client.encounter_condition_value_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterMethodList") => {
            let result = rt.block_on(client.encounter_method_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterMethodRead") => {
            let result = rt.block_on(client.encounter_method_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EvolutionChainList") => {
            let result = rt.block_on(client.evolution_chain_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EvolutionChainRead") => {
            let result = rt.block_on(client.evolution_chain_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EvolutionTriggerList") => {
            let result = rt.block_on(client.evolution_trigger_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EvolutionTriggerRead") => {
            let result = rt.block_on(client.evolution_trigger_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenderList") => {
            let result = rt.block_on(client.gender_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenderRead") => {
            let result = rt.block_on(client.gender_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenerationList") => {
            let result = rt.block_on(client.generation_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenerationRead") => {
            let result = rt.block_on(client.generation_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GrowthRateList") => {
            let result = rt.block_on(client.growth_rate_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GrowthRateRead") => {
            let result = rt.block_on(client.growth_rate_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemList") => {
            let result = rt.block_on(client.item_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemRead") => {
            let result = rt.block_on(client.item_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemAttributeList") => {
            let result = rt.block_on(client.item_attribute_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemAttributeRead") => {
            let result = rt.block_on(client.item_attribute_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemCategoryList") => {
            let result = rt.block_on(client.item_category_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemCategoryRead") => {
            let result = rt.block_on(client.item_category_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemFlingEffectList") => {
            let result = rt.block_on(client.item_fling_effect_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemFlingEffectRead") => {
            let result = rt.block_on(client.item_fling_effect_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemPocketList") => {
            let result = rt.block_on(client.item_pocket_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemPocketRead") => {
            let result = rt.block_on(client.item_pocket_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LanguageList") => {
            let result = rt.block_on(client.language_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LanguageRead") => {
            let result = rt.block_on(client.language_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationList") => {
            let result = rt.block_on(client.location_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationRead") => {
            let result = rt.block_on(client.location_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationAreaList") => {
            let result = rt.block_on(client.location_area_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationAreaRead") => {
            let result = rt.block_on(client.location_area_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MachineList") => {
            let result = rt.block_on(client.machine_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MachineRead") => {
            let result = rt.block_on(client.machine_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveList") => {
            let result = rt.block_on(client.move_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveRead") => {
            let result = rt.block_on(client.move_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveAilmentList") => {
            let result = rt.block_on(client.move_ailment_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveAilmentRead") => {
            let result = rt.block_on(client.move_ailment_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveBattleStyleList") => {
            let result = rt.block_on(client.move_battle_style_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveBattleStyleRead") => {
            let result = rt.block_on(client.move_battle_style_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveCategoryList") => {
            let result = rt.block_on(client.move_category_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveCategoryRead") => {
            let result = rt.block_on(client.move_category_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveDamageClassList") => {
            let result = rt.block_on(client.move_damage_class_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveDamageClassRead") => {
            let result = rt.block_on(client.move_damage_class_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveLearnMethodList") => {
            let result = rt.block_on(client.move_learn_method_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveLearnMethodRead") => {
            let result = rt.block_on(client.move_learn_method_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveTargetList") => {
            let result = rt.block_on(client.move_target_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveTargetRead") => {
            let result = rt.block_on(client.move_target_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("NatureList") => {
            let result = rt.block_on(client.nature_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("NatureRead") => {
            let result = rt.block_on(client.nature_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PalParkAreaList") => {
            let result = rt.block_on(client.pal_park_area_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PalParkAreaRead") => {
            let result = rt.block_on(client.pal_park_area_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokeathlonStatList") => {
            let result = rt.block_on(client.pokeathlon_stat_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokeathlonStatRead") => {
            let result = rt.block_on(client.pokeathlon_stat_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokedexList") => {
            let result = rt.block_on(client.pokedex_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokedexRead") => {
            let result = rt.block_on(client.pokedex_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonList") => {
            let result = rt.block_on(client.pokemon_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonRead") => {
            let result = rt.block_on(client.pokemon_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonColorList") => {
            let result = rt.block_on(client.pokemon_color_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonColorRead") => {
            let result = rt.block_on(client.pokemon_color_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonFormList") => {
            let result = rt.block_on(client.pokemon_form_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonFormRead") => {
            let result = rt.block_on(client.pokemon_form_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonHabitatList") => {
            let result = rt.block_on(client.pokemon_habitat_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonHabitatRead") => {
            let result = rt.block_on(client.pokemon_habitat_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonShapeList") => {
            let result = rt.block_on(client.pokemon_shape_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonShapeRead") => {
            let result = rt.block_on(client.pokemon_shape_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonSpeciesList") => {
            let result = rt.block_on(client.pokemon_species_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonSpeciesRead") => {
            let result = rt.block_on(client.pokemon_species_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegionList") => {
            let result = rt.block_on(client.region_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegionRead") => {
            let result = rt.block_on(client.region_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("StatList") => {
            let result = rt.block_on(client.stat_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("StatRead") => {
            let result = rt.block_on(client.stat_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SuperContestEffectList") => {
            let result = rt.block_on(client.super_contest_effect_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SuperContestEffectRead") => {
            let result = rt.block_on(client.super_contest_effect_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TypeList") => {
            let result = rt.block_on(client.type_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TypeRead") => {
            let result = rt.block_on(client.type_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionList") => {
            let result = rt.block_on(client.version_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionRead") => {
            let result = rt.block_on(client.version_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionGroupList") => {
            let result = rt.block_on(client.version_group_list(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionGroupRead") => {
            let result = rt.block_on(client.version_group_read(
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
