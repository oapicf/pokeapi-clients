use std::collections::HashMap;

use axum::{body::Body, extract::*, response::Response, routing::*};
use axum_extra::extract::{CookieJar, Host, Query as QueryExtra};
use bytes::Bytes;
use http::{header::CONTENT_TYPE, HeaderMap, HeaderName, HeaderValue, Method, StatusCode};
use tracing::error;
use validator::{Validate, ValidationErrors};

use crate::{header, types::*};

#[allow(unused_imports)]
use crate::{apis, models};

#[allow(unused_imports)]
use crate::{models::check_xss_string, models::check_xss_vec_string, models::check_xss_map_string, models::check_xss_map_nested, models::check_xss_map};


/// Setup API Server.
pub fn new<I, A, E, C>(api_impl: I) -> Router
where
    I: AsRef<A> + Clone + Send + Sync + 'static,
    A: apis::berries::Berries<E, Claims = C> + apis::contests::Contests<E, Claims = C> + apis::encounters::Encounters<E, Claims = C> + apis::evolution::Evolution<E, Claims = C> + apis::games::Games<E, Claims = C> + apis::items::Items<E, Claims = C> + apis::location::Location<E, Claims = C> + apis::machines::Machines<E, Claims = C> + apis::moves::Moves<E, Claims = C> + apis::pokemon::Pokemon<E, Claims = C> + apis::utility::Utility<E, Claims = C> + apis::ApiAuthBasic<Claims = C> + apis::CookieAuthentication<Claims = C> + Send + Sync + 'static,
    E: std::fmt::Debug + Send + Sync + 'static,
    C: Send + Sync + 'static,
{
    // build our application with a route
    Router::new()
        .route("/api/v2/ability/",
            get(ability_list::<I, A, E, C>)
        )
        .route("/api/v2/ability/{id}/",
            get(ability_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/berry-firmness/",
            get(berry_firmness_list::<I, A, E, C>)
        )
        .route("/api/v2/berry-firmness/{id}/",
            get(berry_firmness_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/berry-flavor/",
            get(berry_flavor_list::<I, A, E, C>)
        )
        .route("/api/v2/berry-flavor/{id}/",
            get(berry_flavor_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/berry/",
            get(berry_list::<I, A, E, C>)
        )
        .route("/api/v2/berry/{id}/",
            get(berry_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/characteristic/",
            get(characteristic_list::<I, A, E, C>)
        )
        .route("/api/v2/characteristic/{id}/",
            get(characteristic_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/contest-effect/",
            get(contest_effect_list::<I, A, E, C>)
        )
        .route("/api/v2/contest-effect/{id}/",
            get(contest_effect_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/contest-type/",
            get(contest_type_list::<I, A, E, C>)
        )
        .route("/api/v2/contest-type/{id}/",
            get(contest_type_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/egg-group/",
            get(egg_group_list::<I, A, E, C>)
        )
        .route("/api/v2/egg-group/{id}/",
            get(egg_group_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/encounter-condition-value/",
            get(encounter_condition_value_list::<I, A, E, C>)
        )
        .route("/api/v2/encounter-condition-value/{id}/",
            get(encounter_condition_value_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/encounter-condition/",
            get(encounter_condition_list::<I, A, E, C>)
        )
        .route("/api/v2/encounter-condition/{id}/",
            get(encounter_condition_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/encounter-method/",
            get(encounter_method_list::<I, A, E, C>)
        )
        .route("/api/v2/encounter-method/{id}/",
            get(encounter_method_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/evolution-chain/",
            get(evolution_chain_list::<I, A, E, C>)
        )
        .route("/api/v2/evolution-chain/{id}/",
            get(evolution_chain_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/evolution-trigger/",
            get(evolution_trigger_list::<I, A, E, C>)
        )
        .route("/api/v2/evolution-trigger/{id}/",
            get(evolution_trigger_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/gender/",
            get(gender_list::<I, A, E, C>)
        )
        .route("/api/v2/gender/{id}/",
            get(gender_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/generation/",
            get(generation_list::<I, A, E, C>)
        )
        .route("/api/v2/generation/{id}/",
            get(generation_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/growth-rate/",
            get(growth_rate_list::<I, A, E, C>)
        )
        .route("/api/v2/growth-rate/{id}/",
            get(growth_rate_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/item-attribute/",
            get(item_attribute_list::<I, A, E, C>)
        )
        .route("/api/v2/item-attribute/{id}/",
            get(item_attribute_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/item-category/",
            get(item_category_list::<I, A, E, C>)
        )
        .route("/api/v2/item-category/{id}/",
            get(item_category_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/item-fling-effect/",
            get(item_fling_effect_list::<I, A, E, C>)
        )
        .route("/api/v2/item-fling-effect/{id}/",
            get(item_fling_effect_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/item-pocket/",
            get(item_pocket_list::<I, A, E, C>)
        )
        .route("/api/v2/item-pocket/{id}/",
            get(item_pocket_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/item/",
            get(item_list::<I, A, E, C>)
        )
        .route("/api/v2/item/{id}/",
            get(item_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/language/",
            get(language_list::<I, A, E, C>)
        )
        .route("/api/v2/language/{id}/",
            get(language_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/location-area/",
            get(location_area_list::<I, A, E, C>)
        )
        .route("/api/v2/location-area/{id}/",
            get(location_area_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/location/",
            get(location_list::<I, A, E, C>)
        )
        .route("/api/v2/location/{id}/",
            get(location_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/machine/",
            get(machine_list::<I, A, E, C>)
        )
        .route("/api/v2/machine/{id}/",
            get(machine_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-ailment/",
            get(move_ailment_list::<I, A, E, C>)
        )
        .route("/api/v2/move-ailment/{id}/",
            get(move_ailment_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-battle-style/",
            get(move_battle_style_list::<I, A, E, C>)
        )
        .route("/api/v2/move-battle-style/{id}/",
            get(move_battle_style_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-category/",
            get(move_category_list::<I, A, E, C>)
        )
        .route("/api/v2/move-category/{id}/",
            get(move_category_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-damage-class/",
            get(move_damage_class_list::<I, A, E, C>)
        )
        .route("/api/v2/move-damage-class/{id}/",
            get(move_damage_class_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-learn-method/",
            get(move_learn_method_list::<I, A, E, C>)
        )
        .route("/api/v2/move-learn-method/{id}/",
            get(move_learn_method_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move-target/",
            get(move_target_list::<I, A, E, C>)
        )
        .route("/api/v2/move-target/{id}/",
            get(move_target_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/move/",
            get(move_list::<I, A, E, C>)
        )
        .route("/api/v2/move/{id}/",
            get(move_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/nature/",
            get(nature_list::<I, A, E, C>)
        )
        .route("/api/v2/nature/{id}/",
            get(nature_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pal-park-area/",
            get(pal_park_area_list::<I, A, E, C>)
        )
        .route("/api/v2/pal-park-area/{id}/",
            get(pal_park_area_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokeathlon-stat/",
            get(pokeathlon_stat_list::<I, A, E, C>)
        )
        .route("/api/v2/pokeathlon-stat/{id}/",
            get(pokeathlon_stat_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokedex/",
            get(pokedex_list::<I, A, E, C>)
        )
        .route("/api/v2/pokedex/{id}/",
            get(pokedex_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-color/",
            get(pokemon_color_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-color/{id}/",
            get(pokemon_color_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-form/",
            get(pokemon_form_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-form/{id}/",
            get(pokemon_form_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-habitat/",
            get(pokemon_habitat_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-habitat/{id}/",
            get(pokemon_habitat_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-shape/",
            get(pokemon_shape_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-shape/{id}/",
            get(pokemon_shape_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-species/",
            get(pokemon_species_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon-species/{id}/",
            get(pokemon_species_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon/",
            get(pokemon_list::<I, A, E, C>)
        )
        .route("/api/v2/pokemon/{id}/",
            get(pokemon_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/pokemon/{pokemon_id}/encounters",
            get(pokemon_encounters_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/region/",
            get(region_list::<I, A, E, C>)
        )
        .route("/api/v2/region/{id}/",
            get(region_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/stat/",
            get(stat_list::<I, A, E, C>)
        )
        .route("/api/v2/stat/{id}/",
            get(stat_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/super-contest-effect/",
            get(super_contest_effect_list::<I, A, E, C>)
        )
        .route("/api/v2/super-contest-effect/{id}/",
            get(super_contest_effect_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/type/",
            get(type_list::<I, A, E, C>)
        )
        .route("/api/v2/type/{id}/",
            get(type_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/version-group/",
            get(version_group_list::<I, A, E, C>)
        )
        .route("/api/v2/version-group/{id}/",
            get(version_group_retrieve::<I, A, E, C>)
        )
        .route("/api/v2/version/",
            get(version_list::<I, A, E, C>)
        )
        .route("/api/v2/version/{id}/",
            get(version_retrieve::<I, A, E, C>)
        )
        .with_state(api_impl)
}


#[tracing::instrument(skip_all)]
fn berry_firmness_list_validation(
  query_params: models::BerryFirmnessListQueryParams,
) -> std::result::Result<(
  models::BerryFirmnessListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// BerryFirmnessList - GET /api/v2/berry-firmness/
#[tracing::instrument(skip_all)]
async fn berry_firmness_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::BerryFirmnessListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_firmness_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_firmness_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryFirmnessListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn berry_firmness_retrieve_validation(
  path_params: models::BerryFirmnessRetrievePathParams,
) -> std::result::Result<(
  models::BerryFirmnessRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// BerryFirmnessRetrieve - GET /api/v2/berry-firmness/{id}/
#[tracing::instrument(skip_all)]
async fn berry_firmness_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::BerryFirmnessRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_firmness_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_firmness_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryFirmnessRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn berry_flavor_list_validation(
  query_params: models::BerryFlavorListQueryParams,
) -> std::result::Result<(
  models::BerryFlavorListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// BerryFlavorList - GET /api/v2/berry-flavor/
#[tracing::instrument(skip_all)]
async fn berry_flavor_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::BerryFlavorListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_flavor_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_flavor_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryFlavorListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn berry_flavor_retrieve_validation(
  path_params: models::BerryFlavorRetrievePathParams,
) -> std::result::Result<(
  models::BerryFlavorRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// BerryFlavorRetrieve - GET /api/v2/berry-flavor/{id}/
#[tracing::instrument(skip_all)]
async fn berry_flavor_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::BerryFlavorRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_flavor_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_flavor_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryFlavorRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn berry_list_validation(
  query_params: models::BerryListQueryParams,
) -> std::result::Result<(
  models::BerryListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// BerryList - GET /api/v2/berry/
#[tracing::instrument(skip_all)]
async fn berry_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::BerryListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn berry_retrieve_validation(
  path_params: models::BerryRetrievePathParams,
) -> std::result::Result<(
  models::BerryRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// BerryRetrieve - GET /api/v2/berry/{id}/
#[tracing::instrument(skip_all)]
async fn berry_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::BerryRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::berries::Berries<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    berry_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().berry_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::berries::BerryRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn contest_effect_list_validation(
  query_params: models::ContestEffectListQueryParams,
) -> std::result::Result<(
  models::ContestEffectListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ContestEffectList - GET /api/v2/contest-effect/
#[tracing::instrument(skip_all)]
async fn contest_effect_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ContestEffectListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    contest_effect_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().contest_effect_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::ContestEffectListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn contest_effect_retrieve_validation(
  path_params: models::ContestEffectRetrievePathParams,
) -> std::result::Result<(
  models::ContestEffectRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ContestEffectRetrieve - GET /api/v2/contest-effect/{id}/
#[tracing::instrument(skip_all)]
async fn contest_effect_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ContestEffectRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    contest_effect_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().contest_effect_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::ContestEffectRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn contest_type_list_validation(
  query_params: models::ContestTypeListQueryParams,
) -> std::result::Result<(
  models::ContestTypeListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ContestTypeList - GET /api/v2/contest-type/
#[tracing::instrument(skip_all)]
async fn contest_type_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ContestTypeListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    contest_type_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().contest_type_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::ContestTypeListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn contest_type_retrieve_validation(
  path_params: models::ContestTypeRetrievePathParams,
) -> std::result::Result<(
  models::ContestTypeRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ContestTypeRetrieve - GET /api/v2/contest-type/{id}/
#[tracing::instrument(skip_all)]
async fn contest_type_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ContestTypeRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    contest_type_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().contest_type_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::ContestTypeRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn super_contest_effect_list_validation(
  query_params: models::SuperContestEffectListQueryParams,
) -> std::result::Result<(
  models::SuperContestEffectListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// SuperContestEffectList - GET /api/v2/super-contest-effect/
#[tracing::instrument(skip_all)]
async fn super_contest_effect_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::SuperContestEffectListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    super_contest_effect_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().super_contest_effect_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::SuperContestEffectListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn super_contest_effect_retrieve_validation(
  path_params: models::SuperContestEffectRetrievePathParams,
) -> std::result::Result<(
  models::SuperContestEffectRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// SuperContestEffectRetrieve - GET /api/v2/super-contest-effect/{id}/
#[tracing::instrument(skip_all)]
async fn super_contest_effect_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::SuperContestEffectRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::contests::Contests<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    super_contest_effect_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().super_contest_effect_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::contests::SuperContestEffectRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_condition_list_validation(
  query_params: models::EncounterConditionListQueryParams,
) -> std::result::Result<(
  models::EncounterConditionListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EncounterConditionList - GET /api/v2/encounter-condition/
#[tracing::instrument(skip_all)]
async fn encounter_condition_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EncounterConditionListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_condition_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_condition_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterConditionListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_condition_retrieve_validation(
  path_params: models::EncounterConditionRetrievePathParams,
) -> std::result::Result<(
  models::EncounterConditionRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EncounterConditionRetrieve - GET /api/v2/encounter-condition/{id}/
#[tracing::instrument(skip_all)]
async fn encounter_condition_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EncounterConditionRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_condition_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_condition_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterConditionRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_condition_value_list_validation(
  query_params: models::EncounterConditionValueListQueryParams,
) -> std::result::Result<(
  models::EncounterConditionValueListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EncounterConditionValueList - GET /api/v2/encounter-condition-value/
#[tracing::instrument(skip_all)]
async fn encounter_condition_value_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EncounterConditionValueListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_condition_value_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_condition_value_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterConditionValueListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_condition_value_retrieve_validation(
  path_params: models::EncounterConditionValueRetrievePathParams,
) -> std::result::Result<(
  models::EncounterConditionValueRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EncounterConditionValueRetrieve - GET /api/v2/encounter-condition-value/{id}/
#[tracing::instrument(skip_all)]
async fn encounter_condition_value_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EncounterConditionValueRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_condition_value_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_condition_value_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterConditionValueRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_method_list_validation(
  query_params: models::EncounterMethodListQueryParams,
) -> std::result::Result<(
  models::EncounterMethodListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EncounterMethodList - GET /api/v2/encounter-method/
#[tracing::instrument(skip_all)]
async fn encounter_method_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EncounterMethodListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_method_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_method_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterMethodListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn encounter_method_retrieve_validation(
  path_params: models::EncounterMethodRetrievePathParams,
) -> std::result::Result<(
  models::EncounterMethodRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EncounterMethodRetrieve - GET /api/v2/encounter-method/{id}/
#[tracing::instrument(skip_all)]
async fn encounter_method_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EncounterMethodRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    encounter_method_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().encounter_method_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::EncounterMethodRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_encounters_retrieve_validation(
  path_params: models::PokemonEncountersRetrievePathParams,
) -> std::result::Result<(
  models::PokemonEncountersRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonEncountersRetrieve - GET /api/v2/pokemon/{pokemon_id}/encounters
#[tracing::instrument(skip_all)]
async fn pokemon_encounters_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonEncountersRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::encounters::Encounters<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_encounters_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_encounters_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::encounters::PokemonEncountersRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn evolution_chain_list_validation(
  query_params: models::EvolutionChainListQueryParams,
) -> std::result::Result<(
  models::EvolutionChainListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EvolutionChainList - GET /api/v2/evolution-chain/
#[tracing::instrument(skip_all)]
async fn evolution_chain_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EvolutionChainListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::evolution::Evolution<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    evolution_chain_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().evolution_chain_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::evolution::EvolutionChainListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn evolution_chain_retrieve_validation(
  path_params: models::EvolutionChainRetrievePathParams,
) -> std::result::Result<(
  models::EvolutionChainRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EvolutionChainRetrieve - GET /api/v2/evolution-chain/{id}/
#[tracing::instrument(skip_all)]
async fn evolution_chain_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EvolutionChainRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::evolution::Evolution<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    evolution_chain_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().evolution_chain_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::evolution::EvolutionChainRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn evolution_trigger_list_validation(
  query_params: models::EvolutionTriggerListQueryParams,
) -> std::result::Result<(
  models::EvolutionTriggerListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EvolutionTriggerList - GET /api/v2/evolution-trigger/
#[tracing::instrument(skip_all)]
async fn evolution_trigger_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EvolutionTriggerListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::evolution::Evolution<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    evolution_trigger_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().evolution_trigger_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::evolution::EvolutionTriggerListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn evolution_trigger_retrieve_validation(
  path_params: models::EvolutionTriggerRetrievePathParams,
) -> std::result::Result<(
  models::EvolutionTriggerRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EvolutionTriggerRetrieve - GET /api/v2/evolution-trigger/{id}/
#[tracing::instrument(skip_all)]
async fn evolution_trigger_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EvolutionTriggerRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::evolution::Evolution<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    evolution_trigger_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().evolution_trigger_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::evolution::EvolutionTriggerRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn generation_list_validation(
  query_params: models::GenerationListQueryParams,
) -> std::result::Result<(
  models::GenerationListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// GenerationList - GET /api/v2/generation/
#[tracing::instrument(skip_all)]
async fn generation_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::GenerationListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    generation_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().generation_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::GenerationListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn generation_retrieve_validation(
  path_params: models::GenerationRetrievePathParams,
) -> std::result::Result<(
  models::GenerationRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GenerationRetrieve - GET /api/v2/generation/{id}/
#[tracing::instrument(skip_all)]
async fn generation_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GenerationRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    generation_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().generation_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::GenerationRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokedex_list_validation(
  query_params: models::PokedexListQueryParams,
) -> std::result::Result<(
  models::PokedexListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokedexList - GET /api/v2/pokedex/
#[tracing::instrument(skip_all)]
async fn pokedex_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokedexListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokedex_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokedex_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::PokedexListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokedex_retrieve_validation(
  path_params: models::PokedexRetrievePathParams,
) -> std::result::Result<(
  models::PokedexRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokedexRetrieve - GET /api/v2/pokedex/{id}/
#[tracing::instrument(skip_all)]
async fn pokedex_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokedexRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokedex_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokedex_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::PokedexRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn version_group_list_validation(
  query_params: models::VersionGroupListQueryParams,
) -> std::result::Result<(
  models::VersionGroupListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// VersionGroupList - GET /api/v2/version-group/
#[tracing::instrument(skip_all)]
async fn version_group_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::VersionGroupListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    version_group_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().version_group_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::VersionGroupListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn version_group_retrieve_validation(
  path_params: models::VersionGroupRetrievePathParams,
) -> std::result::Result<(
  models::VersionGroupRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// VersionGroupRetrieve - GET /api/v2/version-group/{id}/
#[tracing::instrument(skip_all)]
async fn version_group_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::VersionGroupRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    version_group_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().version_group_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::VersionGroupRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn version_list_validation(
  query_params: models::VersionListQueryParams,
) -> std::result::Result<(
  models::VersionListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// VersionList - GET /api/v2/version/
#[tracing::instrument(skip_all)]
async fn version_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::VersionListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    version_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().version_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::VersionListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn version_retrieve_validation(
  path_params: models::VersionRetrievePathParams,
) -> std::result::Result<(
  models::VersionRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// VersionRetrieve - GET /api/v2/version/{id}/
#[tracing::instrument(skip_all)]
async fn version_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::VersionRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::games::Games<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    version_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().version_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::games::VersionRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_attribute_list_validation(
  query_params: models::ItemAttributeListQueryParams,
) -> std::result::Result<(
  models::ItemAttributeListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ItemAttributeList - GET /api/v2/item-attribute/
#[tracing::instrument(skip_all)]
async fn item_attribute_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ItemAttributeListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_attribute_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_attribute_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemAttributeListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_attribute_retrieve_validation(
  path_params: models::ItemAttributeRetrievePathParams,
) -> std::result::Result<(
  models::ItemAttributeRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ItemAttributeRetrieve - GET /api/v2/item-attribute/{id}/
#[tracing::instrument(skip_all)]
async fn item_attribute_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ItemAttributeRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_attribute_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_attribute_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemAttributeRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_category_list_validation(
  query_params: models::ItemCategoryListQueryParams,
) -> std::result::Result<(
  models::ItemCategoryListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ItemCategoryList - GET /api/v2/item-category/
#[tracing::instrument(skip_all)]
async fn item_category_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ItemCategoryListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_category_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_category_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemCategoryListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_category_retrieve_validation(
  path_params: models::ItemCategoryRetrievePathParams,
) -> std::result::Result<(
  models::ItemCategoryRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ItemCategoryRetrieve - GET /api/v2/item-category/{id}/
#[tracing::instrument(skip_all)]
async fn item_category_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ItemCategoryRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_category_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_category_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemCategoryRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_fling_effect_list_validation(
  query_params: models::ItemFlingEffectListQueryParams,
) -> std::result::Result<(
  models::ItemFlingEffectListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ItemFlingEffectList - GET /api/v2/item-fling-effect/
#[tracing::instrument(skip_all)]
async fn item_fling_effect_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ItemFlingEffectListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_fling_effect_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_fling_effect_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemFlingEffectListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_fling_effect_retrieve_validation(
  path_params: models::ItemFlingEffectRetrievePathParams,
) -> std::result::Result<(
  models::ItemFlingEffectRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ItemFlingEffectRetrieve - GET /api/v2/item-fling-effect/{id}/
#[tracing::instrument(skip_all)]
async fn item_fling_effect_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ItemFlingEffectRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_fling_effect_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_fling_effect_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemFlingEffectRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_list_validation(
  query_params: models::ItemListQueryParams,
) -> std::result::Result<(
  models::ItemListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ItemList - GET /api/v2/item/
#[tracing::instrument(skip_all)]
async fn item_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ItemListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_pocket_list_validation(
  query_params: models::ItemPocketListQueryParams,
) -> std::result::Result<(
  models::ItemPocketListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// ItemPocketList - GET /api/v2/item-pocket/
#[tracing::instrument(skip_all)]
async fn item_pocket_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::ItemPocketListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_pocket_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_pocket_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemPocketListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_pocket_retrieve_validation(
  path_params: models::ItemPocketRetrievePathParams,
) -> std::result::Result<(
  models::ItemPocketRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ItemPocketRetrieve - GET /api/v2/item-pocket/{id}/
#[tracing::instrument(skip_all)]
async fn item_pocket_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ItemPocketRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_pocket_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_pocket_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemPocketRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn item_retrieve_validation(
  path_params: models::ItemRetrievePathParams,
) -> std::result::Result<(
  models::ItemRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// ItemRetrieve - GET /api/v2/item/{id}/
#[tracing::instrument(skip_all)]
async fn item_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::ItemRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::items::Items<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    item_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().item_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::items::ItemRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn location_area_list_validation(
  query_params: models::LocationAreaListQueryParams,
) -> std::result::Result<(
  models::LocationAreaListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// LocationAreaList - GET /api/v2/location-area/
#[tracing::instrument(skip_all)]
async fn location_area_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::LocationAreaListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    location_area_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().location_area_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::LocationAreaListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn location_area_retrieve_validation(
  path_params: models::LocationAreaRetrievePathParams,
) -> std::result::Result<(
  models::LocationAreaRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// LocationAreaRetrieve - GET /api/v2/location-area/{id}/
#[tracing::instrument(skip_all)]
async fn location_area_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::LocationAreaRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    location_area_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().location_area_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::LocationAreaRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn location_list_validation(
  query_params: models::LocationListQueryParams,
) -> std::result::Result<(
  models::LocationListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// LocationList - GET /api/v2/location/
#[tracing::instrument(skip_all)]
async fn location_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::LocationListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    location_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().location_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::LocationListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn location_retrieve_validation(
  path_params: models::LocationRetrievePathParams,
) -> std::result::Result<(
  models::LocationRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// LocationRetrieve - GET /api/v2/location/{id}/
#[tracing::instrument(skip_all)]
async fn location_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::LocationRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    location_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().location_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::LocationRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pal_park_area_list_validation(
  query_params: models::PalParkAreaListQueryParams,
) -> std::result::Result<(
  models::PalParkAreaListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PalParkAreaList - GET /api/v2/pal-park-area/
#[tracing::instrument(skip_all)]
async fn pal_park_area_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PalParkAreaListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pal_park_area_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pal_park_area_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::PalParkAreaListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pal_park_area_retrieve_validation(
  path_params: models::PalParkAreaRetrievePathParams,
) -> std::result::Result<(
  models::PalParkAreaRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PalParkAreaRetrieve - GET /api/v2/pal-park-area/{id}/
#[tracing::instrument(skip_all)]
async fn pal_park_area_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PalParkAreaRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pal_park_area_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pal_park_area_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::PalParkAreaRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn region_list_validation(
  query_params: models::RegionListQueryParams,
) -> std::result::Result<(
  models::RegionListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// RegionList - GET /api/v2/region/
#[tracing::instrument(skip_all)]
async fn region_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::RegionListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    region_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().region_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::RegionListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn region_retrieve_validation(
  path_params: models::RegionRetrievePathParams,
) -> std::result::Result<(
  models::RegionRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// RegionRetrieve - GET /api/v2/region/{id}/
#[tracing::instrument(skip_all)]
async fn region_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::RegionRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::location::Location<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    region_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().region_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::location::RegionRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn machine_list_validation(
  query_params: models::MachineListQueryParams,
) -> std::result::Result<(
  models::MachineListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MachineList - GET /api/v2/machine/
#[tracing::instrument(skip_all)]
async fn machine_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MachineListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::machines::Machines<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    machine_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().machine_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::machines::MachineListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn machine_retrieve_validation(
  path_params: models::MachineRetrievePathParams,
) -> std::result::Result<(
  models::MachineRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MachineRetrieve - GET /api/v2/machine/{id}/
#[tracing::instrument(skip_all)]
async fn machine_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MachineRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::machines::Machines<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    machine_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().machine_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::machines::MachineRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_ailment_list_validation(
  query_params: models::MoveAilmentListQueryParams,
) -> std::result::Result<(
  models::MoveAilmentListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveAilmentList - GET /api/v2/move-ailment/
#[tracing::instrument(skip_all)]
async fn move_ailment_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveAilmentListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_ailment_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_ailment_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveAilmentListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_ailment_retrieve_validation(
  path_params: models::MoveAilmentRetrievePathParams,
) -> std::result::Result<(
  models::MoveAilmentRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveAilmentRetrieve - GET /api/v2/move-ailment/{id}/
#[tracing::instrument(skip_all)]
async fn move_ailment_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveAilmentRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_ailment_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_ailment_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveAilmentRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_battle_style_list_validation(
  query_params: models::MoveBattleStyleListQueryParams,
) -> std::result::Result<(
  models::MoveBattleStyleListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveBattleStyleList - GET /api/v2/move-battle-style/
#[tracing::instrument(skip_all)]
async fn move_battle_style_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveBattleStyleListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_battle_style_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_battle_style_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveBattleStyleListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_battle_style_retrieve_validation(
  path_params: models::MoveBattleStyleRetrievePathParams,
) -> std::result::Result<(
  models::MoveBattleStyleRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveBattleStyleRetrieve - GET /api/v2/move-battle-style/{id}/
#[tracing::instrument(skip_all)]
async fn move_battle_style_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveBattleStyleRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_battle_style_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_battle_style_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveBattleStyleRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_category_list_validation(
  query_params: models::MoveCategoryListQueryParams,
) -> std::result::Result<(
  models::MoveCategoryListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveCategoryList - GET /api/v2/move-category/
#[tracing::instrument(skip_all)]
async fn move_category_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveCategoryListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_category_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_category_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveCategoryListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_category_retrieve_validation(
  path_params: models::MoveCategoryRetrievePathParams,
) -> std::result::Result<(
  models::MoveCategoryRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveCategoryRetrieve - GET /api/v2/move-category/{id}/
#[tracing::instrument(skip_all)]
async fn move_category_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveCategoryRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_category_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_category_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveCategoryRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_learn_method_list_validation(
  query_params: models::MoveLearnMethodListQueryParams,
) -> std::result::Result<(
  models::MoveLearnMethodListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveLearnMethodList - GET /api/v2/move-learn-method/
#[tracing::instrument(skip_all)]
async fn move_learn_method_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveLearnMethodListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_learn_method_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_learn_method_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveLearnMethodListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_learn_method_retrieve_validation(
  path_params: models::MoveLearnMethodRetrievePathParams,
) -> std::result::Result<(
  models::MoveLearnMethodRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveLearnMethodRetrieve - GET /api/v2/move-learn-method/{id}/
#[tracing::instrument(skip_all)]
async fn move_learn_method_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveLearnMethodRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_learn_method_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_learn_method_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveLearnMethodRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_list_validation(
  query_params: models::MoveListQueryParams,
) -> std::result::Result<(
  models::MoveListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveList - GET /api/v2/move/
#[tracing::instrument(skip_all)]
async fn move_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_retrieve_validation(
  path_params: models::MoveRetrievePathParams,
) -> std::result::Result<(
  models::MoveRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveRetrieve - GET /api/v2/move/{id}/
#[tracing::instrument(skip_all)]
async fn move_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_target_list_validation(
  query_params: models::MoveTargetListQueryParams,
) -> std::result::Result<(
  models::MoveTargetListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveTargetList - GET /api/v2/move-target/
#[tracing::instrument(skip_all)]
async fn move_target_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveTargetListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_target_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_target_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveTargetListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_target_retrieve_validation(
  path_params: models::MoveTargetRetrievePathParams,
) -> std::result::Result<(
  models::MoveTargetRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveTargetRetrieve - GET /api/v2/move-target/{id}/
#[tracing::instrument(skip_all)]
async fn move_target_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveTargetRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::moves::Moves<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_target_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_target_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::moves::MoveTargetRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn ability_list_validation(
  query_params: models::AbilityListQueryParams,
) -> std::result::Result<(
  models::AbilityListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// AbilityList - GET /api/v2/ability/
#[tracing::instrument(skip_all)]
async fn ability_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::AbilityListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    ability_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().ability_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::AbilityListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn ability_retrieve_validation(
  path_params: models::AbilityRetrievePathParams,
) -> std::result::Result<(
  models::AbilityRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// AbilityRetrieve - GET /api/v2/ability/{id}/
#[tracing::instrument(skip_all)]
async fn ability_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::AbilityRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    ability_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().ability_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::AbilityRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn characteristic_list_validation(
  query_params: models::CharacteristicListQueryParams,
) -> std::result::Result<(
  models::CharacteristicListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// CharacteristicList - GET /api/v2/characteristic/
#[tracing::instrument(skip_all)]
async fn characteristic_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::CharacteristicListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    characteristic_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().characteristic_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::CharacteristicListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn characteristic_retrieve_validation(
  path_params: models::CharacteristicRetrievePathParams,
) -> std::result::Result<(
  models::CharacteristicRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// CharacteristicRetrieve - GET /api/v2/characteristic/{id}/
#[tracing::instrument(skip_all)]
async fn characteristic_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::CharacteristicRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    characteristic_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().characteristic_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::CharacteristicRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn egg_group_list_validation(
  query_params: models::EggGroupListQueryParams,
) -> std::result::Result<(
  models::EggGroupListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// EggGroupList - GET /api/v2/egg-group/
#[tracing::instrument(skip_all)]
async fn egg_group_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::EggGroupListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    egg_group_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().egg_group_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::EggGroupListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn egg_group_retrieve_validation(
  path_params: models::EggGroupRetrievePathParams,
) -> std::result::Result<(
  models::EggGroupRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// EggGroupRetrieve - GET /api/v2/egg-group/{id}/
#[tracing::instrument(skip_all)]
async fn egg_group_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::EggGroupRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    egg_group_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().egg_group_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::EggGroupRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn gender_list_validation(
  query_params: models::GenderListQueryParams,
) -> std::result::Result<(
  models::GenderListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// GenderList - GET /api/v2/gender/
#[tracing::instrument(skip_all)]
async fn gender_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::GenderListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    gender_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().gender_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::GenderListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn gender_retrieve_validation(
  path_params: models::GenderRetrievePathParams,
) -> std::result::Result<(
  models::GenderRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GenderRetrieve - GET /api/v2/gender/{id}/
#[tracing::instrument(skip_all)]
async fn gender_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GenderRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    gender_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().gender_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::GenderRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn growth_rate_list_validation(
  query_params: models::GrowthRateListQueryParams,
) -> std::result::Result<(
  models::GrowthRateListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// GrowthRateList - GET /api/v2/growth-rate/
#[tracing::instrument(skip_all)]
async fn growth_rate_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::GrowthRateListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    growth_rate_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().growth_rate_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::GrowthRateListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn growth_rate_retrieve_validation(
  path_params: models::GrowthRateRetrievePathParams,
) -> std::result::Result<(
  models::GrowthRateRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GrowthRateRetrieve - GET /api/v2/growth-rate/{id}/
#[tracing::instrument(skip_all)]
async fn growth_rate_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GrowthRateRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    growth_rate_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().growth_rate_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::GrowthRateRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_damage_class_list_validation(
  query_params: models::MoveDamageClassListQueryParams,
) -> std::result::Result<(
  models::MoveDamageClassListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// MoveDamageClassList - GET /api/v2/move-damage-class/
#[tracing::instrument(skip_all)]
async fn move_damage_class_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::MoveDamageClassListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_damage_class_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_damage_class_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::MoveDamageClassListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn move_damage_class_retrieve_validation(
  path_params: models::MoveDamageClassRetrievePathParams,
) -> std::result::Result<(
  models::MoveDamageClassRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// MoveDamageClassRetrieve - GET /api/v2/move-damage-class/{id}/
#[tracing::instrument(skip_all)]
async fn move_damage_class_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::MoveDamageClassRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    move_damage_class_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().move_damage_class_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::MoveDamageClassRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn nature_list_validation(
  query_params: models::NatureListQueryParams,
) -> std::result::Result<(
  models::NatureListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// NatureList - GET /api/v2/nature/
#[tracing::instrument(skip_all)]
async fn nature_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::NatureListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    nature_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().nature_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::NatureListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn nature_retrieve_validation(
  path_params: models::NatureRetrievePathParams,
) -> std::result::Result<(
  models::NatureRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// NatureRetrieve - GET /api/v2/nature/{id}/
#[tracing::instrument(skip_all)]
async fn nature_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::NatureRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    nature_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().nature_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::NatureRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokeathlon_stat_list_validation(
  query_params: models::PokeathlonStatListQueryParams,
) -> std::result::Result<(
  models::PokeathlonStatListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokeathlonStatList - GET /api/v2/pokeathlon-stat/
#[tracing::instrument(skip_all)]
async fn pokeathlon_stat_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokeathlonStatListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokeathlon_stat_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokeathlon_stat_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokeathlonStatListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokeathlon_stat_retrieve_validation(
  path_params: models::PokeathlonStatRetrievePathParams,
) -> std::result::Result<(
  models::PokeathlonStatRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokeathlonStatRetrieve - GET /api/v2/pokeathlon-stat/{id}/
#[tracing::instrument(skip_all)]
async fn pokeathlon_stat_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokeathlonStatRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokeathlon_stat_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokeathlon_stat_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokeathlonStatRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_color_list_validation(
  query_params: models::PokemonColorListQueryParams,
) -> std::result::Result<(
  models::PokemonColorListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonColorList - GET /api/v2/pokemon-color/
#[tracing::instrument(skip_all)]
async fn pokemon_color_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonColorListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_color_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_color_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonColorListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_color_retrieve_validation(
  path_params: models::PokemonColorRetrievePathParams,
) -> std::result::Result<(
  models::PokemonColorRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonColorRetrieve - GET /api/v2/pokemon-color/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_color_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonColorRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_color_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_color_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonColorRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_form_list_validation(
  query_params: models::PokemonFormListQueryParams,
) -> std::result::Result<(
  models::PokemonFormListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonFormList - GET /api/v2/pokemon-form/
#[tracing::instrument(skip_all)]
async fn pokemon_form_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonFormListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_form_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_form_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonFormListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_form_retrieve_validation(
  path_params: models::PokemonFormRetrievePathParams,
) -> std::result::Result<(
  models::PokemonFormRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonFormRetrieve - GET /api/v2/pokemon-form/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_form_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonFormRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_form_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_form_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonFormRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_habitat_list_validation(
  query_params: models::PokemonHabitatListQueryParams,
) -> std::result::Result<(
  models::PokemonHabitatListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonHabitatList - GET /api/v2/pokemon-habitat/
#[tracing::instrument(skip_all)]
async fn pokemon_habitat_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonHabitatListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_habitat_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_habitat_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonHabitatListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_habitat_retrieve_validation(
  path_params: models::PokemonHabitatRetrievePathParams,
) -> std::result::Result<(
  models::PokemonHabitatRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonHabitatRetrieve - GET /api/v2/pokemon-habitat/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_habitat_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonHabitatRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_habitat_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_habitat_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonHabitatRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_list_validation(
  query_params: models::PokemonListQueryParams,
) -> std::result::Result<(
  models::PokemonListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonList - GET /api/v2/pokemon/
#[tracing::instrument(skip_all)]
async fn pokemon_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_retrieve_validation(
  path_params: models::PokemonRetrievePathParams,
) -> std::result::Result<(
  models::PokemonRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonRetrieve - GET /api/v2/pokemon/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_shape_list_validation(
  query_params: models::PokemonShapeListQueryParams,
) -> std::result::Result<(
  models::PokemonShapeListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonShapeList - GET /api/v2/pokemon-shape/
#[tracing::instrument(skip_all)]
async fn pokemon_shape_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonShapeListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_shape_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_shape_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonShapeListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_shape_retrieve_validation(
  path_params: models::PokemonShapeRetrievePathParams,
) -> std::result::Result<(
  models::PokemonShapeRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonShapeRetrieve - GET /api/v2/pokemon-shape/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_shape_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonShapeRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_shape_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_shape_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonShapeRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_species_list_validation(
  query_params: models::PokemonSpeciesListQueryParams,
) -> std::result::Result<(
  models::PokemonSpeciesListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PokemonSpeciesList - GET /api/v2/pokemon-species/
#[tracing::instrument(skip_all)]
async fn pokemon_species_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PokemonSpeciesListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_species_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_species_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonSpeciesListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn pokemon_species_retrieve_validation(
  path_params: models::PokemonSpeciesRetrievePathParams,
) -> std::result::Result<(
  models::PokemonSpeciesRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PokemonSpeciesRetrieve - GET /api/v2/pokemon-species/{id}/
#[tracing::instrument(skip_all)]
async fn pokemon_species_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PokemonSpeciesRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    pokemon_species_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().pokemon_species_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::PokemonSpeciesRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn stat_list_validation(
  query_params: models::StatListQueryParams,
) -> std::result::Result<(
  models::StatListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// StatList - GET /api/v2/stat/
#[tracing::instrument(skip_all)]
async fn stat_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::StatListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    stat_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().stat_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::StatListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn stat_retrieve_validation(
  path_params: models::StatRetrievePathParams,
) -> std::result::Result<(
  models::StatRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// StatRetrieve - GET /api/v2/stat/{id}/
#[tracing::instrument(skip_all)]
async fn stat_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::StatRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    stat_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().stat_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::StatRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn type_list_validation(
  query_params: models::TypeListQueryParams,
) -> std::result::Result<(
  models::TypeListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// TypeList - GET /api/v2/type/
#[tracing::instrument(skip_all)]
async fn type_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::TypeListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    type_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().type_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::TypeListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn type_retrieve_validation(
  path_params: models::TypeRetrievePathParams,
) -> std::result::Result<(
  models::TypeRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// TypeRetrieve - GET /api/v2/type/{id}/
#[tracing::instrument(skip_all)]
async fn type_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::TypeRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::pokemon::Pokemon<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    type_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().type_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::pokemon::TypeRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn language_list_validation(
  query_params: models::LanguageListQueryParams,
) -> std::result::Result<(
  models::LanguageListQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// LanguageList - GET /api/v2/language/
#[tracing::instrument(skip_all)]
async fn language_list<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::LanguageListQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::utility::Utility<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    language_list_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().language_list(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::utility::LanguageListResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn language_retrieve_validation(
  path_params: models::LanguageRetrievePathParams,
) -> std::result::Result<(
  models::LanguageRetrievePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// LanguageRetrieve - GET /api/v2/language/{id}/
#[tracing::instrument(skip_all)]
async fn language_retrieve<I, A, E, C>(
  method: Method,
  host: Host,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::LanguageRetrievePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::utility::Utility<E, Claims = C>+ apis::CookieAuthentication<Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_cookie = api_impl.as_ref().extract_claims_from_cookie(&cookies, "sessionid").await;
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_cookie)
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    language_retrieve_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



let result = api_impl.as_ref().language_retrieve(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::utility::LanguageRetrieveResponse::Status200
                                                    (body)
                                                => {
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[allow(dead_code)]
#[inline]
fn response_with_status_code_only(code: StatusCode) -> Result<Response, StatusCode> {
   Response::builder()
          .status(code)
          .body(Body::empty())
          .map_err(|_| code)
}
