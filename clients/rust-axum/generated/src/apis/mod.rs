pub mod ability;
pub mod berry;
pub mod berry_firmness;
pub mod berry_flavor;
pub mod characteristic;
pub mod contest_effect;
pub mod contest_type;
pub mod egg_group;
pub mod encounter_condition;
pub mod encounter_condition_value;
pub mod encounter_method;
pub mod evolution_chain;
pub mod evolution_trigger;
pub mod gender;
pub mod generation;
pub mod growth_rate;
pub mod item;
pub mod item_attribute;
pub mod item_category;
pub mod item_fling_effect;
pub mod item_pocket;
pub mod language;
pub mod location;
pub mod location_area;
pub mod machine;
pub mod r#move;
pub mod move_ailment;
pub mod move_battle_style;
pub mod move_category;
pub mod move_damage_class;
pub mod move_learn_method;
pub mod move_target;
pub mod nature;
pub mod pal_park_area;
pub mod pokeathlon_stat;
pub mod pokedex;
pub mod pokemon;
pub mod pokemon_color;
pub mod pokemon_form;
pub mod pokemon_habitat;
pub mod pokemon_shape;
pub mod pokemon_species;
pub mod region;
pub mod stat;
pub mod super_contest_effect;
pub mod r#type;
pub mod version;
pub mod version_group;


// Error handler for unhandled errors.
#[async_trait::async_trait]
pub trait ErrorHandler<E: std::fmt::Debug + Send + Sync + 'static = ()> {
    #[allow(unused_variables)]
    #[tracing::instrument(skip_all)]
    async fn handle_error(
        &self,
        method: &::http::Method,
        host: &axum_extra::extract::Host,
        cookies: &axum_extra::extract::CookieJar,
        error: E
    ) -> Result<axum::response::Response, http::StatusCode> {
        tracing::error!("Unhandled error: {:?}", error);
        axum::response::Response::builder()
            .status(http::StatusCode::INTERNAL_SERVER_ERROR)
            .body(axum::body::Body::empty())
            .map_err(|_| http::StatusCode::INTERNAL_SERVER_ERROR)
    }
}
