use std::error;
use std::fmt;

#[derive(Debug, Clone)]
pub struct ResponseContent<T> {
    pub status: reqwest::StatusCode,
    pub content: String,
    pub entity: Option<T>,
}

#[derive(Debug)]
pub enum Error<T> {
    Reqwest(reqwest::Error),
    Serde(serde_json::Error),
    Io(std::io::Error),
    ResponseError(ResponseContent<T>),
}

impl <T> fmt::Display for Error<T> {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let (module, e) = match self {
            Error::Reqwest(e) => ("reqwest", e.to_string()),
            Error::Serde(e) => ("serde", e.to_string()),
            Error::Io(e) => ("IO", e.to_string()),
            Error::ResponseError(e) => ("response", format!("status code {}", e.status)),
        };
        write!(f, "error in {}: {}", module, e)
    }
}

impl <T: fmt::Debug> error::Error for Error<T> {
    fn source(&self) -> Option<&(dyn error::Error + 'static)> {
        Some(match self {
            Error::Reqwest(e) => e,
            Error::Serde(e) => e,
            Error::Io(e) => e,
            Error::ResponseError(_) => return None,
        })
    }
}

impl <T> From<reqwest::Error> for Error<T> {
    fn from(e: reqwest::Error) -> Self {
        Error::Reqwest(e)
    }
}

impl <T> From<serde_json::Error> for Error<T> {
    fn from(e: serde_json::Error) -> Self {
        Error::Serde(e)
    }
}

impl <T> From<std::io::Error> for Error<T> {
    fn from(e: std::io::Error) -> Self {
        Error::Io(e)
    }
}

pub fn urlencode<T: AsRef<str>>(s: T) -> String {
    ::url::form_urlencoded::byte_serialize(s.as_ref().as_bytes()).collect()
}

pub fn parse_deep_object(prefix: &str, value: &serde_json::Value) -> Vec<(String, String)> {
    if let serde_json::Value::Object(object) = value {
        let mut params = vec![];

        for (key, value) in object {
            match value {
                serde_json::Value::Object(_) => params.append(&mut parse_deep_object(
                    &format!("{}[{}]", prefix, key),
                    value,
                )),
                serde_json::Value::Array(array) => {
                    for (i, value) in array.iter().enumerate() {
                        params.append(&mut parse_deep_object(
                            &format!("{}[{}][{}]", prefix, key, i),
                            value,
                        ));
                    }
                },
                serde_json::Value::String(s) => params.push((format!("{}[{}]", prefix, key), s.clone())),
                _ => params.push((format!("{}[{}]", prefix, key), value.to_string())),
            }
        }

        return params;
    }

    unimplemented!("Only objects are supported with style=deepObject")
}

pub mod ability_api;
pub mod berry_api;
pub mod berry_firmness_api;
pub mod berry_flavor_api;
pub mod characteristic_api;
pub mod contest_effect_api;
pub mod contest_type_api;
pub mod egg_group_api;
pub mod encounter_condition_api;
pub mod encounter_condition_value_api;
pub mod encounter_method_api;
pub mod evolution_chain_api;
pub mod evolution_trigger_api;
pub mod gender_api;
pub mod generation_api;
pub mod growth_rate_api;
pub mod item_api;
pub mod item_attribute_api;
pub mod item_category_api;
pub mod item_fling_effect_api;
pub mod item_pocket_api;
pub mod language_api;
pub mod location_api;
pub mod location_area_api;
pub mod machine_api;
pub mod move_api;
pub mod move_ailment_api;
pub mod move_battle_style_api;
pub mod move_category_api;
pub mod move_damage_class_api;
pub mod move_learn_method_api;
pub mod move_target_api;
pub mod nature_api;
pub mod pal_park_area_api;
pub mod pokeathlon_stat_api;
pub mod pokedex_api;
pub mod pokemon_api;
pub mod pokemon_color_api;
pub mod pokemon_form_api;
pub mod pokemon_habitat_api;
pub mod pokemon_shape_api;
pub mod pokemon_species_api;
pub mod region_api;
pub mod stat_api;
pub mod super_contest_effect_api;
pub mod type_api;
pub mod version_api;
pub mod version_group_api;

pub mod configuration;
