//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
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
    name = "",
    version = "20220523",
    about = "CLI access to "
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
    AbilityList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    AbilityRead {
        id: i32,
    },
    BerryList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    BerryRead {
        id: i32,
    },
    BerryFirmnessList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    BerryFirmnessRead {
        id: i32,
    },
    BerryFlavorList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    BerryFlavorRead {
        id: i32,
    },
    CharacteristicList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    CharacteristicRead {
        id: i32,
    },
    ContestEffectList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ContestEffectRead {
        id: i32,
    },
    ContestTypeList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ContestTypeRead {
        id: i32,
    },
    EggGroupList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EggGroupRead {
        id: i32,
    },
    EncounterConditionList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EncounterConditionRead {
        id: i32,
    },
    EncounterConditionValueList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EncounterConditionValueRead {
        id: i32,
    },
    EncounterMethodList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EncounterMethodRead {
        id: i32,
    },
    EvolutionChainList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EvolutionChainRead {
        id: i32,
    },
    EvolutionTriggerList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    EvolutionTriggerRead {
        id: i32,
    },
    GenderList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    GenderRead {
        id: i32,
    },
    GenerationList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    GenerationRead {
        id: i32,
    },
    GrowthRateList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    GrowthRateRead {
        id: i32,
    },
    ItemList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ItemRead {
        id: i32,
    },
    ItemAttributeList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ItemAttributeRead {
        id: i32,
    },
    ItemCategoryList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ItemCategoryRead {
        id: i32,
    },
    ItemFlingEffectList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ItemFlingEffectRead {
        id: i32,
    },
    ItemPocketList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    ItemPocketRead {
        id: i32,
    },
    LanguageList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    LanguageRead {
        id: i32,
    },
    LocationList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    LocationRead {
        id: i32,
    },
    LocationAreaList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    LocationAreaRead {
        id: i32,
    },
    MachineList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MachineRead {
        id: i32,
    },
    MoveList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveRead {
        id: i32,
    },
    MoveAilmentList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveAilmentRead {
        id: i32,
    },
    MoveBattleStyleList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveBattleStyleRead {
        id: i32,
    },
    MoveCategoryList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveCategoryRead {
        id: i32,
    },
    MoveDamageClassList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveDamageClassRead {
        id: i32,
    },
    MoveLearnMethodList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveLearnMethodRead {
        id: i32,
    },
    MoveTargetList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    MoveTargetRead {
        id: i32,
    },
    NatureList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    NatureRead {
        id: i32,
    },
    PalParkAreaList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PalParkAreaRead {
        id: i32,
    },
    PokeathlonStatList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokeathlonStatRead {
        id: i32,
    },
    PokedexList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokedexRead {
        id: i32,
    },
    PokemonList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonRead {
        id: i32,
    },
    PokemonColorList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonColorRead {
        id: i32,
    },
    PokemonFormList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonFormRead {
        id: i32,
    },
    PokemonHabitatList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonHabitatRead {
        id: i32,
    },
    PokemonShapeList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonShapeRead {
        id: i32,
    },
    PokemonSpeciesList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    PokemonSpeciesRead {
        id: i32,
    },
    RegionList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    RegionRead {
        id: i32,
    },
    StatList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    StatRead {
        id: i32,
    },
    SuperContestEffectList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    SuperContestEffectRead {
        id: i32,
    },
    TypeList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    TypeRead {
        id: i32,
    },
    VersionList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    VersionRead {
        id: i32,
    },
    VersionGroupList {
        limit: Option<i32>,
        offset: Option<i32>,
    },
    VersionGroupRead {
        id: i32,
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
        Operation::AbilityList {
            limit,
            offset,
        } => {
            info!("Performing a AbilityList request");

            let result = client.ability_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AbilityListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AbilityRead {
            id,
        } => {
            info!("Performing a AbilityRead request on {:?}", (
                &id
            ));

            let result = client.ability_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AbilityReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryList {
            limit,
            offset,
        } => {
            info!("Performing a BerryList request");

            let result = client.berry_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryRead {
            id,
        } => {
            info!("Performing a BerryRead request on {:?}", (
                &id
            ));

            let result = client.berry_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFirmnessList {
            limit,
            offset,
        } => {
            info!("Performing a BerryFirmnessList request");

            let result = client.berry_firmness_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFirmnessListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFirmnessRead {
            id,
        } => {
            info!("Performing a BerryFirmnessRead request on {:?}", (
                &id
            ));

            let result = client.berry_firmness_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFirmnessReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFlavorList {
            limit,
            offset,
        } => {
            info!("Performing a BerryFlavorList request");

            let result = client.berry_flavor_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFlavorListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BerryFlavorRead {
            id,
        } => {
            info!("Performing a BerryFlavorRead request on {:?}", (
                &id
            ));

            let result = client.berry_flavor_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BerryFlavorReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CharacteristicList {
            limit,
            offset,
        } => {
            info!("Performing a CharacteristicList request");

            let result = client.characteristic_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CharacteristicListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CharacteristicRead {
            id,
        } => {
            info!("Performing a CharacteristicRead request on {:?}", (
                &id
            ));

            let result = client.characteristic_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CharacteristicReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestEffectList {
            limit,
            offset,
        } => {
            info!("Performing a ContestEffectList request");

            let result = client.contest_effect_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestEffectListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestEffectRead {
            id,
        } => {
            info!("Performing a ContestEffectRead request on {:?}", (
                &id
            ));

            let result = client.contest_effect_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestEffectReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestTypeList {
            limit,
            offset,
        } => {
            info!("Performing a ContestTypeList request");

            let result = client.contest_type_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestTypeListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ContestTypeRead {
            id,
        } => {
            info!("Performing a ContestTypeRead request on {:?}", (
                &id
            ));

            let result = client.contest_type_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ContestTypeReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EggGroupList {
            limit,
            offset,
        } => {
            info!("Performing a EggGroupList request");

            let result = client.egg_group_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EggGroupListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EggGroupRead {
            id,
        } => {
            info!("Performing a EggGroupRead request on {:?}", (
                &id
            ));

            let result = client.egg_group_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EggGroupReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionList {
            limit,
            offset,
        } => {
            info!("Performing a EncounterConditionList request");

            let result = client.encounter_condition_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionRead {
            id,
        } => {
            info!("Performing a EncounterConditionRead request on {:?}", (
                &id
            ));

            let result = client.encounter_condition_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionValueList {
            limit,
            offset,
        } => {
            info!("Performing a EncounterConditionValueList request");

            let result = client.encounter_condition_value_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionValueListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterConditionValueRead {
            id,
        } => {
            info!("Performing a EncounterConditionValueRead request on {:?}", (
                &id
            ));

            let result = client.encounter_condition_value_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterConditionValueReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterMethodList {
            limit,
            offset,
        } => {
            info!("Performing a EncounterMethodList request");

            let result = client.encounter_method_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterMethodListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EncounterMethodRead {
            id,
        } => {
            info!("Performing a EncounterMethodRead request on {:?}", (
                &id
            ));

            let result = client.encounter_method_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EncounterMethodReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionChainList {
            limit,
            offset,
        } => {
            info!("Performing a EvolutionChainList request");

            let result = client.evolution_chain_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionChainListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionChainRead {
            id,
        } => {
            info!("Performing a EvolutionChainRead request on {:?}", (
                &id
            ));

            let result = client.evolution_chain_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionChainReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionTriggerList {
            limit,
            offset,
        } => {
            info!("Performing a EvolutionTriggerList request");

            let result = client.evolution_trigger_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionTriggerListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EvolutionTriggerRead {
            id,
        } => {
            info!("Performing a EvolutionTriggerRead request on {:?}", (
                &id
            ));

            let result = client.evolution_trigger_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EvolutionTriggerReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenderList {
            limit,
            offset,
        } => {
            info!("Performing a GenderList request");

            let result = client.gender_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenderListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenderRead {
            id,
        } => {
            info!("Performing a GenderRead request on {:?}", (
                &id
            ));

            let result = client.gender_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenderReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenerationList {
            limit,
            offset,
        } => {
            info!("Performing a GenerationList request");

            let result = client.generation_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenerationListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GenerationRead {
            id,
        } => {
            info!("Performing a GenerationRead request on {:?}", (
                &id
            ));

            let result = client.generation_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GenerationReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GrowthRateList {
            limit,
            offset,
        } => {
            info!("Performing a GrowthRateList request");

            let result = client.growth_rate_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GrowthRateListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GrowthRateRead {
            id,
        } => {
            info!("Performing a GrowthRateRead request on {:?}", (
                &id
            ));

            let result = client.growth_rate_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GrowthRateReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemList {
            limit,
            offset,
        } => {
            info!("Performing a ItemList request");

            let result = client.item_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemRead {
            id,
        } => {
            info!("Performing a ItemRead request on {:?}", (
                &id
            ));

            let result = client.item_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemAttributeList {
            limit,
            offset,
        } => {
            info!("Performing a ItemAttributeList request");

            let result = client.item_attribute_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemAttributeListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemAttributeRead {
            id,
        } => {
            info!("Performing a ItemAttributeRead request on {:?}", (
                &id
            ));

            let result = client.item_attribute_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemAttributeReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemCategoryList {
            limit,
            offset,
        } => {
            info!("Performing a ItemCategoryList request");

            let result = client.item_category_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemCategoryListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemCategoryRead {
            id,
        } => {
            info!("Performing a ItemCategoryRead request on {:?}", (
                &id
            ));

            let result = client.item_category_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemCategoryReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemFlingEffectList {
            limit,
            offset,
        } => {
            info!("Performing a ItemFlingEffectList request");

            let result = client.item_fling_effect_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemFlingEffectListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemFlingEffectRead {
            id,
        } => {
            info!("Performing a ItemFlingEffectRead request on {:?}", (
                &id
            ));

            let result = client.item_fling_effect_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemFlingEffectReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemPocketList {
            limit,
            offset,
        } => {
            info!("Performing a ItemPocketList request");

            let result = client.item_pocket_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemPocketListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemPocketRead {
            id,
        } => {
            info!("Performing a ItemPocketRead request on {:?}", (
                &id
            ));

            let result = client.item_pocket_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemPocketReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LanguageList {
            limit,
            offset,
        } => {
            info!("Performing a LanguageList request");

            let result = client.language_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LanguageListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LanguageRead {
            id,
        } => {
            info!("Performing a LanguageRead request on {:?}", (
                &id
            ));

            let result = client.language_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LanguageReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationList {
            limit,
            offset,
        } => {
            info!("Performing a LocationList request");

            let result = client.location_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationRead {
            id,
        } => {
            info!("Performing a LocationRead request on {:?}", (
                &id
            ));

            let result = client.location_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
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
                LocationAreaListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LocationAreaRead {
            id,
        } => {
            info!("Performing a LocationAreaRead request on {:?}", (
                &id
            ));

            let result = client.location_area_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LocationAreaReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MachineList {
            limit,
            offset,
        } => {
            info!("Performing a MachineList request");

            let result = client.machine_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MachineListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MachineRead {
            id,
        } => {
            info!("Performing a MachineRead request on {:?}", (
                &id
            ));

            let result = client.machine_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MachineReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveList {
            limit,
            offset,
        } => {
            info!("Performing a MoveList request");

            let result = client.move_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveRead {
            id,
        } => {
            info!("Performing a MoveRead request on {:?}", (
                &id
            ));

            let result = client.move_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveAilmentList {
            limit,
            offset,
        } => {
            info!("Performing a MoveAilmentList request");

            let result = client.move_ailment_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveAilmentListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveAilmentRead {
            id,
        } => {
            info!("Performing a MoveAilmentRead request on {:?}", (
                &id
            ));

            let result = client.move_ailment_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveAilmentReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveBattleStyleList {
            limit,
            offset,
        } => {
            info!("Performing a MoveBattleStyleList request");

            let result = client.move_battle_style_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveBattleStyleListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveBattleStyleRead {
            id,
        } => {
            info!("Performing a MoveBattleStyleRead request on {:?}", (
                &id
            ));

            let result = client.move_battle_style_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveBattleStyleReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveCategoryList {
            limit,
            offset,
        } => {
            info!("Performing a MoveCategoryList request");

            let result = client.move_category_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveCategoryListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveCategoryRead {
            id,
        } => {
            info!("Performing a MoveCategoryRead request on {:?}", (
                &id
            ));

            let result = client.move_category_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveCategoryReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveDamageClassList {
            limit,
            offset,
        } => {
            info!("Performing a MoveDamageClassList request");

            let result = client.move_damage_class_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveDamageClassListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveDamageClassRead {
            id,
        } => {
            info!("Performing a MoveDamageClassRead request on {:?}", (
                &id
            ));

            let result = client.move_damage_class_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveDamageClassReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveLearnMethodList {
            limit,
            offset,
        } => {
            info!("Performing a MoveLearnMethodList request");

            let result = client.move_learn_method_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveLearnMethodListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveLearnMethodRead {
            id,
        } => {
            info!("Performing a MoveLearnMethodRead request on {:?}", (
                &id
            ));

            let result = client.move_learn_method_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveLearnMethodReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveTargetList {
            limit,
            offset,
        } => {
            info!("Performing a MoveTargetList request");

            let result = client.move_target_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveTargetListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MoveTargetRead {
            id,
        } => {
            info!("Performing a MoveTargetRead request on {:?}", (
                &id
            ));

            let result = client.move_target_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MoveTargetReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::NatureList {
            limit,
            offset,
        } => {
            info!("Performing a NatureList request");

            let result = client.nature_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                NatureListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::NatureRead {
            id,
        } => {
            info!("Performing a NatureRead request on {:?}", (
                &id
            ));

            let result = client.nature_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                NatureReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PalParkAreaList {
            limit,
            offset,
        } => {
            info!("Performing a PalParkAreaList request");

            let result = client.pal_park_area_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PalParkAreaListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PalParkAreaRead {
            id,
        } => {
            info!("Performing a PalParkAreaRead request on {:?}", (
                &id
            ));

            let result = client.pal_park_area_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PalParkAreaReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokeathlonStatList {
            limit,
            offset,
        } => {
            info!("Performing a PokeathlonStatList request");

            let result = client.pokeathlon_stat_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokeathlonStatListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokeathlonStatRead {
            id,
        } => {
            info!("Performing a PokeathlonStatRead request on {:?}", (
                &id
            ));

            let result = client.pokeathlon_stat_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokeathlonStatReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokedexList {
            limit,
            offset,
        } => {
            info!("Performing a PokedexList request");

            let result = client.pokedex_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokedexListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokedexRead {
            id,
        } => {
            info!("Performing a PokedexRead request on {:?}", (
                &id
            ));

            let result = client.pokedex_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokedexReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonList request");

            let result = client.pokemon_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonRead {
            id,
        } => {
            info!("Performing a PokemonRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonColorList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonColorList request");

            let result = client.pokemon_color_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonColorListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonColorRead {
            id,
        } => {
            info!("Performing a PokemonColorRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_color_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonColorReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonFormList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonFormList request");

            let result = client.pokemon_form_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonFormListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonFormRead {
            id,
        } => {
            info!("Performing a PokemonFormRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_form_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonFormReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonHabitatList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonHabitatList request");

            let result = client.pokemon_habitat_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonHabitatListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonHabitatRead {
            id,
        } => {
            info!("Performing a PokemonHabitatRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_habitat_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonHabitatReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonShapeList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonShapeList request");

            let result = client.pokemon_shape_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonShapeListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonShapeRead {
            id,
        } => {
            info!("Performing a PokemonShapeRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_shape_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonShapeReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonSpeciesList {
            limit,
            offset,
        } => {
            info!("Performing a PokemonSpeciesList request");

            let result = client.pokemon_species_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonSpeciesListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PokemonSpeciesRead {
            id,
        } => {
            info!("Performing a PokemonSpeciesRead request on {:?}", (
                &id
            ));

            let result = client.pokemon_species_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PokemonSpeciesReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RegionList {
            limit,
            offset,
        } => {
            info!("Performing a RegionList request");

            let result = client.region_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RegionListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RegionRead {
            id,
        } => {
            info!("Performing a RegionRead request on {:?}", (
                &id
            ));

            let result = client.region_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RegionReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::StatList {
            limit,
            offset,
        } => {
            info!("Performing a StatList request");

            let result = client.stat_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                StatListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::StatRead {
            id,
        } => {
            info!("Performing a StatRead request on {:?}", (
                &id
            ));

            let result = client.stat_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                StatReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SuperContestEffectList {
            limit,
            offset,
        } => {
            info!("Performing a SuperContestEffectList request");

            let result = client.super_contest_effect_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SuperContestEffectListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SuperContestEffectRead {
            id,
        } => {
            info!("Performing a SuperContestEffectRead request on {:?}", (
                &id
            ));

            let result = client.super_contest_effect_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SuperContestEffectReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TypeList {
            limit,
            offset,
        } => {
            info!("Performing a TypeList request");

            let result = client.type_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TypeListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TypeRead {
            id,
        } => {
            info!("Performing a TypeRead request on {:?}", (
                &id
            ));

            let result = client.type_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TypeReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionList {
            limit,
            offset,
        } => {
            info!("Performing a VersionList request");

            let result = client.version_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionRead {
            id,
        } => {
            info!("Performing a VersionRead request on {:?}", (
                &id
            ));

            let result = client.version_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionGroupList {
            limit,
            offset,
        } => {
            info!("Performing a VersionGroupList request");

            let result = client.version_group_list(
                limit,
                offset,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionGroupListResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VersionGroupRead {
            id,
        } => {
            info!("Performing a VersionGroupRead request on {:?}", (
                &id
            ));

            let result = client.version_group_read(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VersionGroupReadResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
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
