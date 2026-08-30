#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
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
use clap::{Command, Arg};

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

    let matches = Command::new("client")
        .arg(Arg::new("operation")
            .help("Sets the operation to run")
            .value_parser(Vec::<&str>::from([
                "BerryFirmnessList",
                "BerryFlavorList",
                "BerryList",
                "ContestEffectList",
                "ContestTypeList",
                "SuperContestEffectList",
                "EncounterConditionList",
                "EncounterConditionValueList",
                "EncounterMethodList",
                "EvolutionChainList",
                "EvolutionTriggerList",
                "GenerationList",
                "PokedexList",
                "VersionGroupList",
                "VersionList",
                "ItemAttributeList",
                "ItemCategoryList",
                "ItemFlingEffectList",
                "ItemList",
                "ItemPocketList",
                "LocationAreaList",
                "LocationList",
                "PalParkAreaList",
                "RegionList",
                "LocationAreaRetrieve",
                "MachineList",
                "MoveAilmentList",
                "MoveBattleStyleList",
                "MoveCategoryList",
                "MoveLearnMethodList",
                "MoveList",
                "MoveTargetList",
                "AbilityList",
                "CharacteristicList",
                "EggGroupList",
                "GenderList",
                "GrowthRateList",
                "MoveDamageClassList",
                "NatureList",
                "PokeathlonStatList",
                "PokemonColorList",
                "PokemonFormList",
                "PokemonHabitatList",
                "PokemonList",
                "PokemonShapeList",
                "PokemonSpeciesList",
                "StatList",
                "TypeList",
                "LanguageList",
            ]))
            .required(true)
            .index(1))
        .arg(Arg::new("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::new("host")
            .long("host")
            .default_value("pokeapi.co")
            .help("Hostname to contact"))
        .arg(Arg::new("port")
            .long("port")
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
        Some(AuthData::Bearer(auth_token))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.contains_id("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.get_one::<String>("host").unwrap(),
        matches.get_one::<u16>("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = {
        #[cfg(feature = "client-tls")]
        {
            if is_https {
                // Using HTTPS with native-tls
                let client = Box::new(Client::try_new_https(&base_url)
                    .expect("Failed to create HTTPS client"));
                Box::new(client.with_context(context))
            } else {
                // Using HTTP
                let client = Box::new(Client::try_new_http(&base_url)
                    .expect("Failed to create HTTP client"));
                Box::new(client.with_context(context))
            }
        }

        #[cfg(not(feature = "client-tls"))]
        {
            if is_https {
                panic!("HTTPS requested but TLS support not enabled. \
                        Enable the 'client-tls' feature to use HTTPS.");
            }
            // Using HTTP only
            let client = Box::new(Client::try_new_http(&base_url)
                .expect("Failed to create HTTP client"));
            Box::new(client.with_context(context))
        }
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.get_one::<String>("operation").map(String::as_str) {
        Some("BerryFirmnessList") => {
            let result = rt.block_on(client.berry_firmness_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryFlavorList") => {
            let result = rt.block_on(client.berry_flavor_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BerryList") => {
            let result = rt.block_on(client.berry_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BerryFirmnessRetrieve") => {
            let result = rt.block_on(client.berry_firmness_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BerryFlavorRetrieve") => {
            let result = rt.block_on(client.berry_flavor_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BerryRetrieve") => {
            let result = rt.block_on(client.berry_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ContestEffectList") => {
            let result = rt.block_on(client.contest_effect_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ContestTypeList") => {
            let result = rt.block_on(client.contest_type_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SuperContestEffectList") => {
            let result = rt.block_on(client.super_contest_effect_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ContestEffectRetrieve") => {
            let result = rt.block_on(client.contest_effect_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ContestTypeRetrieve") => {
            let result = rt.block_on(client.contest_type_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SuperContestEffectRetrieve") => {
            let result = rt.block_on(client.super_contest_effect_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("EncounterConditionList") => {
            let result = rt.block_on(client.encounter_condition_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterConditionValueList") => {
            let result = rt.block_on(client.encounter_condition_value_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EncounterMethodList") => {
            let result = rt.block_on(client.encounter_method_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("EncounterConditionRetrieve") => {
            let result = rt.block_on(client.encounter_condition_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("EncounterConditionValueRetrieve") => {
            let result = rt.block_on(client.encounter_condition_value_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("EncounterMethodRetrieve") => {
            let result = rt.block_on(client.encounter_method_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("EvolutionChainList") => {
            let result = rt.block_on(client.evolution_chain_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EvolutionTriggerList") => {
            let result = rt.block_on(client.evolution_trigger_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("EvolutionChainRetrieve") => {
            let result = rt.block_on(client.evolution_chain_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("EvolutionTriggerRetrieve") => {
            let result = rt.block_on(client.evolution_trigger_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GenerationList") => {
            let result = rt.block_on(client.generation_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokedexList") => {
            let result = rt.block_on(client.pokedex_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionGroupList") => {
            let result = rt.block_on(client.version_group_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VersionList") => {
            let result = rt.block_on(client.version_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GenerationRetrieve") => {
            let result = rt.block_on(client.generation_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokedexRetrieve") => {
            let result = rt.block_on(client.pokedex_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("VersionGroupRetrieve") => {
            let result = rt.block_on(client.version_group_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("VersionRetrieve") => {
            let result = rt.block_on(client.version_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ItemAttributeList") => {
            let result = rt.block_on(client.item_attribute_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemCategoryList") => {
            let result = rt.block_on(client.item_category_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemFlingEffectList") => {
            let result = rt.block_on(client.item_fling_effect_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemList") => {
            let result = rt.block_on(client.item_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemPocketList") => {
            let result = rt.block_on(client.item_pocket_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ItemAttributeRetrieve") => {
            let result = rt.block_on(client.item_attribute_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ItemCategoryRetrieve") => {
            let result = rt.block_on(client.item_category_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ItemFlingEffectRetrieve") => {
            let result = rt.block_on(client.item_fling_effect_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ItemPocketRetrieve") => {
            let result = rt.block_on(client.item_pocket_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ItemRetrieve") => {
            let result = rt.block_on(client.item_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LocationAreaList") => {
            let result = rt.block_on(client.location_area_list(
                  Some(0),
                  Some(0)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationList") => {
            let result = rt.block_on(client.location_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PalParkAreaList") => {
            let result = rt.block_on(client.pal_park_area_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegionList") => {
            let result = rt.block_on(client.region_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LocationAreaRetrieve") => {
            let result = rt.block_on(client.location_area_retrieve(
                  0
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LocationRetrieve") => {
            let result = rt.block_on(client.location_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PalParkAreaRetrieve") => {
            let result = rt.block_on(client.pal_park_area_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("RegionRetrieve") => {
            let result = rt.block_on(client.region_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("MachineList") => {
            let result = rt.block_on(client.machine_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("MachineRetrieve") => {
            let result = rt.block_on(client.machine_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("MoveAilmentList") => {
            let result = rt.block_on(client.move_ailment_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveBattleStyleList") => {
            let result = rt.block_on(client.move_battle_style_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveCategoryList") => {
            let result = rt.block_on(client.move_category_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveLearnMethodList") => {
            let result = rt.block_on(client.move_learn_method_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveList") => {
            let result = rt.block_on(client.move_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveTargetList") => {
            let result = rt.block_on(client.move_target_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("MoveAilmentRetrieve") => {
            let result = rt.block_on(client.move_ailment_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveBattleStyleRetrieve") => {
            let result = rt.block_on(client.move_battle_style_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveCategoryRetrieve") => {
            let result = rt.block_on(client.move_category_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveLearnMethodRetrieve") => {
            let result = rt.block_on(client.move_learn_method_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveRetrieve") => {
            let result = rt.block_on(client.move_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveTargetRetrieve") => {
            let result = rt.block_on(client.move_target_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AbilityList") => {
            let result = rt.block_on(client.ability_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CharacteristicList") => {
            let result = rt.block_on(client.characteristic_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EggGroupList") => {
            let result = rt.block_on(client.egg_group_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenderList") => {
            let result = rt.block_on(client.gender_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GrowthRateList") => {
            let result = rt.block_on(client.growth_rate_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MoveDamageClassList") => {
            let result = rt.block_on(client.move_damage_class_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("NatureList") => {
            let result = rt.block_on(client.nature_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokeathlonStatList") => {
            let result = rt.block_on(client.pokeathlon_stat_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonColorList") => {
            let result = rt.block_on(client.pokemon_color_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonFormList") => {
            let result = rt.block_on(client.pokemon_form_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonHabitatList") => {
            let result = rt.block_on(client.pokemon_habitat_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonList") => {
            let result = rt.block_on(client.pokemon_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonShapeList") => {
            let result = rt.block_on(client.pokemon_shape_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PokemonSpeciesList") => {
            let result = rt.block_on(client.pokemon_species_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("StatList") => {
            let result = rt.block_on(client.stat_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TypeList") => {
            let result = rt.block_on(client.type_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AbilityRetrieve") => {
            let result = rt.block_on(client.ability_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CharacteristicRetrieve") => {
            let result = rt.block_on(client.characteristic_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("EggGroupRetrieve") => {
            let result = rt.block_on(client.egg_group_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenderRetrieve") => {
            let result = rt.block_on(client.gender_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GrowthRateRetrieve") => {
            let result = rt.block_on(client.growth_rate_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("MoveDamageClassRetrieve") => {
            let result = rt.block_on(client.move_damage_class_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("NatureRetrieve") => {
            let result = rt.block_on(client.nature_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokeathlonStatRetrieve") => {
            let result = rt.block_on(client.pokeathlon_stat_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonColorRetrieve") => {
            let result = rt.block_on(client.pokemon_color_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonFormRetrieve") => {
            let result = rt.block_on(client.pokemon_form_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonHabitatRetrieve") => {
            let result = rt.block_on(client.pokemon_habitat_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonRetrieve") => {
            let result = rt.block_on(client.pokemon_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonShapeRetrieve") => {
            let result = rt.block_on(client.pokemon_shape_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PokemonSpeciesRetrieve") => {
            let result = rt.block_on(client.pokemon_species_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("StatRetrieve") => {
            let result = rt.block_on(client.stat_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("TypeRetrieve") => {
            let result = rt.block_on(client.type_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LanguageList") => {
            let result = rt.block_on(client.language_list(
                  Some(0),
                  Some(0),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LanguageRetrieve") => {
            let result = rt.block_on(client.language_retrieve(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
