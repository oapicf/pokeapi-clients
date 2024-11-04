//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();
            let tcp_listener = TcpListener::bind(&addr).await.unwrap();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, _)) = tcp_listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        Http::new()
                            .serve_connection(tls, service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
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
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<AbilityListResponse, ApiError>
    {
        info!("ability_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn ability_read(
        &self,
        id: i32,
        context: &C) -> Result<AbilityReadResponse, ApiError>
    {
        info!("ability_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryListResponse, ApiError>
    {
        info!("berry_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryReadResponse, ApiError>
    {
        info!("berry_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryFirmnessListResponse, ApiError>
    {
        info!("berry_firmness_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_firmness_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryFirmnessReadResponse, ApiError>
    {
        info!("berry_firmness_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryFlavorListResponse, ApiError>
    {
        info!("berry_flavor_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn berry_flavor_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryFlavorReadResponse, ApiError>
    {
        info!("berry_flavor_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<CharacteristicListResponse, ApiError>
    {
        info!("characteristic_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn characteristic_read(
        &self,
        id: i32,
        context: &C) -> Result<CharacteristicReadResponse, ApiError>
    {
        info!("characteristic_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ContestEffectListResponse, ApiError>
    {
        info!("contest_effect_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn contest_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<ContestEffectReadResponse, ApiError>
    {
        info!("contest_effect_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ContestTypeListResponse, ApiError>
    {
        info!("contest_type_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn contest_type_read(
        &self,
        id: i32,
        context: &C) -> Result<ContestTypeReadResponse, ApiError>
    {
        info!("contest_type_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EggGroupListResponse, ApiError>
    {
        info!("egg_group_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn egg_group_read(
        &self,
        id: i32,
        context: &C) -> Result<EggGroupReadResponse, ApiError>
    {
        info!("egg_group_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterConditionListResponse, ApiError>
    {
        info!("encounter_condition_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_condition_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterConditionReadResponse, ApiError>
    {
        info!("encounter_condition_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterConditionValueListResponse, ApiError>
    {
        info!("encounter_condition_value_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_condition_value_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterConditionValueReadResponse, ApiError>
    {
        info!("encounter_condition_value_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterMethodListResponse, ApiError>
    {
        info!("encounter_method_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn encounter_method_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterMethodReadResponse, ApiError>
    {
        info!("encounter_method_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EvolutionChainListResponse, ApiError>
    {
        info!("evolution_chain_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn evolution_chain_read(
        &self,
        id: i32,
        context: &C) -> Result<EvolutionChainReadResponse, ApiError>
    {
        info!("evolution_chain_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EvolutionTriggerListResponse, ApiError>
    {
        info!("evolution_trigger_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn evolution_trigger_read(
        &self,
        id: i32,
        context: &C) -> Result<EvolutionTriggerReadResponse, ApiError>
    {
        info!("evolution_trigger_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GenderListResponse, ApiError>
    {
        info!("gender_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn gender_read(
        &self,
        id: i32,
        context: &C) -> Result<GenderReadResponse, ApiError>
    {
        info!("gender_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GenerationListResponse, ApiError>
    {
        info!("generation_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn generation_read(
        &self,
        id: i32,
        context: &C) -> Result<GenerationReadResponse, ApiError>
    {
        info!("generation_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GrowthRateListResponse, ApiError>
    {
        info!("growth_rate_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn growth_rate_read(
        &self,
        id: i32,
        context: &C) -> Result<GrowthRateReadResponse, ApiError>
    {
        info!("growth_rate_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemListResponse, ApiError>
    {
        info!("item_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemReadResponse, ApiError>
    {
        info!("item_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemAttributeListResponse, ApiError>
    {
        info!("item_attribute_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_attribute_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemAttributeReadResponse, ApiError>
    {
        info!("item_attribute_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemCategoryListResponse, ApiError>
    {
        info!("item_category_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_category_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemCategoryReadResponse, ApiError>
    {
        info!("item_category_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemFlingEffectListResponse, ApiError>
    {
        info!("item_fling_effect_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_fling_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemFlingEffectReadResponse, ApiError>
    {
        info!("item_fling_effect_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemPocketListResponse, ApiError>
    {
        info!("item_pocket_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn item_pocket_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemPocketReadResponse, ApiError>
    {
        info!("item_pocket_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LanguageListResponse, ApiError>
    {
        info!("language_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn language_read(
        &self,
        id: i32,
        context: &C) -> Result<LanguageReadResponse, ApiError>
    {
        info!("language_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationListResponse, ApiError>
    {
        info!("location_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn location_read(
        &self,
        id: i32,
        context: &C) -> Result<LocationReadResponse, ApiError>
    {
        info!("location_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationAreaListResponse, ApiError>
    {
        info!("location_area_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn location_area_read(
        &self,
        id: i32,
        context: &C) -> Result<LocationAreaReadResponse, ApiError>
    {
        info!("location_area_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MachineListResponse, ApiError>
    {
        info!("machine_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn machine_read(
        &self,
        id: i32,
        context: &C) -> Result<MachineReadResponse, ApiError>
    {
        info!("machine_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveListResponse, ApiError>
    {
        info!("move_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveReadResponse, ApiError>
    {
        info!("move_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveAilmentListResponse, ApiError>
    {
        info!("move_ailment_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_ailment_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveAilmentReadResponse, ApiError>
    {
        info!("move_ailment_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveBattleStyleListResponse, ApiError>
    {
        info!("move_battle_style_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_battle_style_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveBattleStyleReadResponse, ApiError>
    {
        info!("move_battle_style_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveCategoryListResponse, ApiError>
    {
        info!("move_category_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_category_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveCategoryReadResponse, ApiError>
    {
        info!("move_category_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveDamageClassListResponse, ApiError>
    {
        info!("move_damage_class_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_damage_class_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveDamageClassReadResponse, ApiError>
    {
        info!("move_damage_class_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveLearnMethodListResponse, ApiError>
    {
        info!("move_learn_method_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_learn_method_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveLearnMethodReadResponse, ApiError>
    {
        info!("move_learn_method_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveTargetListResponse, ApiError>
    {
        info!("move_target_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn move_target_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveTargetReadResponse, ApiError>
    {
        info!("move_target_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<NatureListResponse, ApiError>
    {
        info!("nature_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn nature_read(
        &self,
        id: i32,
        context: &C) -> Result<NatureReadResponse, ApiError>
    {
        info!("nature_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PalParkAreaListResponse, ApiError>
    {
        info!("pal_park_area_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pal_park_area_read(
        &self,
        id: i32,
        context: &C) -> Result<PalParkAreaReadResponse, ApiError>
    {
        info!("pal_park_area_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokeathlonStatListResponse, ApiError>
    {
        info!("pokeathlon_stat_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokeathlon_stat_read(
        &self,
        id: i32,
        context: &C) -> Result<PokeathlonStatReadResponse, ApiError>
    {
        info!("pokeathlon_stat_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokedexListResponse, ApiError>
    {
        info!("pokedex_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokedex_read(
        &self,
        id: i32,
        context: &C) -> Result<PokedexReadResponse, ApiError>
    {
        info!("pokedex_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonListResponse, ApiError>
    {
        info!("pokemon_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonReadResponse, ApiError>
    {
        info!("pokemon_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonColorListResponse, ApiError>
    {
        info!("pokemon_color_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_color_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonColorReadResponse, ApiError>
    {
        info!("pokemon_color_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonFormListResponse, ApiError>
    {
        info!("pokemon_form_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_form_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonFormReadResponse, ApiError>
    {
        info!("pokemon_form_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonHabitatListResponse, ApiError>
    {
        info!("pokemon_habitat_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_habitat_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonHabitatReadResponse, ApiError>
    {
        info!("pokemon_habitat_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonShapeListResponse, ApiError>
    {
        info!("pokemon_shape_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_shape_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonShapeReadResponse, ApiError>
    {
        info!("pokemon_shape_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonSpeciesListResponse, ApiError>
    {
        info!("pokemon_species_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn pokemon_species_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonSpeciesReadResponse, ApiError>
    {
        info!("pokemon_species_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<RegionListResponse, ApiError>
    {
        info!("region_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn region_read(
        &self,
        id: i32,
        context: &C) -> Result<RegionReadResponse, ApiError>
    {
        info!("region_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<StatListResponse, ApiError>
    {
        info!("stat_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn stat_read(
        &self,
        id: i32,
        context: &C) -> Result<StatReadResponse, ApiError>
    {
        info!("stat_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<SuperContestEffectListResponse, ApiError>
    {
        info!("super_contest_effect_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn super_contest_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<SuperContestEffectReadResponse, ApiError>
    {
        info!("super_contest_effect_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<TypeListResponse, ApiError>
    {
        info!("type_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn type_read(
        &self,
        id: i32,
        context: &C) -> Result<TypeReadResponse, ApiError>
    {
        info!("type_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<VersionListResponse, ApiError>
    {
        info!("version_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn version_read(
        &self,
        id: i32,
        context: &C) -> Result<VersionReadResponse, ApiError>
    {
        info!("version_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<VersionGroupListResponse, ApiError>
    {
        info!("version_group_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn version_group_read(
        &self,
        id: i32,
        context: &C) -> Result<VersionGroupReadResponse, ApiError>
    {
        info!("version_group_read({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
