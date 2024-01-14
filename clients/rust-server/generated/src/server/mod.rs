use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

use crate::{Api,
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
     VersionGroupReadResponse
};

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/api/v2/ability/$",
            r"^/api/v2/ability/(?P<id>[^/?#]*)/$",
            r"^/api/v2/berry-firmness/$",
            r"^/api/v2/berry-firmness/(?P<id>[^/?#]*)/$",
            r"^/api/v2/berry-flavor/$",
            r"^/api/v2/berry-flavor/(?P<id>[^/?#]*)/$",
            r"^/api/v2/berry/$",
            r"^/api/v2/berry/(?P<id>[^/?#]*)/$",
            r"^/api/v2/characteristic/$",
            r"^/api/v2/characteristic/(?P<id>[^/?#]*)/$",
            r"^/api/v2/contest-effect/$",
            r"^/api/v2/contest-effect/(?P<id>[^/?#]*)/$",
            r"^/api/v2/contest-type/$",
            r"^/api/v2/contest-type/(?P<id>[^/?#]*)/$",
            r"^/api/v2/egg-group/$",
            r"^/api/v2/egg-group/(?P<id>[^/?#]*)/$",
            r"^/api/v2/encounter-condition-value/$",
            r"^/api/v2/encounter-condition-value/(?P<id>[^/?#]*)/$",
            r"^/api/v2/encounter-condition/$",
            r"^/api/v2/encounter-condition/(?P<id>[^/?#]*)/$",
            r"^/api/v2/encounter-method/$",
            r"^/api/v2/encounter-method/(?P<id>[^/?#]*)/$",
            r"^/api/v2/evolution-chain/$",
            r"^/api/v2/evolution-chain/(?P<id>[^/?#]*)/$",
            r"^/api/v2/evolution-trigger/$",
            r"^/api/v2/evolution-trigger/(?P<id>[^/?#]*)/$",
            r"^/api/v2/gender/$",
            r"^/api/v2/gender/(?P<id>[^/?#]*)/$",
            r"^/api/v2/generation/$",
            r"^/api/v2/generation/(?P<id>[^/?#]*)/$",
            r"^/api/v2/growth-rate/$",
            r"^/api/v2/growth-rate/(?P<id>[^/?#]*)/$",
            r"^/api/v2/item-attribute/$",
            r"^/api/v2/item-attribute/(?P<id>[^/?#]*)/$",
            r"^/api/v2/item-category/$",
            r"^/api/v2/item-category/(?P<id>[^/?#]*)/$",
            r"^/api/v2/item-fling-effect/$",
            r"^/api/v2/item-fling-effect/(?P<id>[^/?#]*)/$",
            r"^/api/v2/item-pocket/$",
            r"^/api/v2/item-pocket/(?P<id>[^/?#]*)/$",
            r"^/api/v2/item/$",
            r"^/api/v2/item/(?P<id>[^/?#]*)/$",
            r"^/api/v2/language/$",
            r"^/api/v2/language/(?P<id>[^/?#]*)/$",
            r"^/api/v2/location-area/$",
            r"^/api/v2/location-area/(?P<id>[^/?#]*)/$",
            r"^/api/v2/location/$",
            r"^/api/v2/location/(?P<id>[^/?#]*)/$",
            r"^/api/v2/machine/$",
            r"^/api/v2/machine/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-ailment/$",
            r"^/api/v2/move-ailment/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-battle-style/$",
            r"^/api/v2/move-battle-style/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-category/$",
            r"^/api/v2/move-category/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-damage-class/$",
            r"^/api/v2/move-damage-class/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-learn-method/$",
            r"^/api/v2/move-learn-method/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move-target/$",
            r"^/api/v2/move-target/(?P<id>[^/?#]*)/$",
            r"^/api/v2/move/$",
            r"^/api/v2/move/(?P<id>[^/?#]*)/$",
            r"^/api/v2/nature/$",
            r"^/api/v2/nature/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pal-park-area/$",
            r"^/api/v2/pal-park-area/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokeathlon-stat/$",
            r"^/api/v2/pokeathlon-stat/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokedex/$",
            r"^/api/v2/pokedex/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon-color/$",
            r"^/api/v2/pokemon-color/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon-form/$",
            r"^/api/v2/pokemon-form/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon-habitat/$",
            r"^/api/v2/pokemon-habitat/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon-shape/$",
            r"^/api/v2/pokemon-shape/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon-species/$",
            r"^/api/v2/pokemon-species/(?P<id>[^/?#]*)/$",
            r"^/api/v2/pokemon/$",
            r"^/api/v2/pokemon/(?P<id>[^/?#]*)/$",
            r"^/api/v2/region/$",
            r"^/api/v2/region/(?P<id>[^/?#]*)/$",
            r"^/api/v2/stat/$",
            r"^/api/v2/stat/(?P<id>[^/?#]*)/$",
            r"^/api/v2/super-contest-effect/$",
            r"^/api/v2/super-contest-effect/(?P<id>[^/?#]*)/$",
            r"^/api/v2/type/$",
            r"^/api/v2/type/(?P<id>[^/?#]*)/$",
            r"^/api/v2/version-group/$",
            r"^/api/v2/version-group/(?P<id>[^/?#]*)/$",
            r"^/api/v2/version/$",
            r"^/api/v2/version/(?P<id>[^/?#]*)/$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_API_V2_ABILITY_: usize = 0;
    pub(crate) static ID_API_V2_ABILITY_ID_: usize = 1;
    lazy_static! {
        pub static ref REGEX_API_V2_ABILITY_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/ability/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ABILITY_ID_");
    }
    pub(crate) static ID_API_V2_BERRY_FIRMNESS_: usize = 2;
    pub(crate) static ID_API_V2_BERRY_FIRMNESS_ID_: usize = 3;
    lazy_static! {
        pub static ref REGEX_API_V2_BERRY_FIRMNESS_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/berry-firmness/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_BERRY_FIRMNESS_ID_");
    }
    pub(crate) static ID_API_V2_BERRY_FLAVOR_: usize = 4;
    pub(crate) static ID_API_V2_BERRY_FLAVOR_ID_: usize = 5;
    lazy_static! {
        pub static ref REGEX_API_V2_BERRY_FLAVOR_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/berry-flavor/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_BERRY_FLAVOR_ID_");
    }
    pub(crate) static ID_API_V2_BERRY_: usize = 6;
    pub(crate) static ID_API_V2_BERRY_ID_: usize = 7;
    lazy_static! {
        pub static ref REGEX_API_V2_BERRY_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/berry/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_BERRY_ID_");
    }
    pub(crate) static ID_API_V2_CHARACTERISTIC_: usize = 8;
    pub(crate) static ID_API_V2_CHARACTERISTIC_ID_: usize = 9;
    lazy_static! {
        pub static ref REGEX_API_V2_CHARACTERISTIC_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/characteristic/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_CHARACTERISTIC_ID_");
    }
    pub(crate) static ID_API_V2_CONTEST_EFFECT_: usize = 10;
    pub(crate) static ID_API_V2_CONTEST_EFFECT_ID_: usize = 11;
    lazy_static! {
        pub static ref REGEX_API_V2_CONTEST_EFFECT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/contest-effect/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_CONTEST_EFFECT_ID_");
    }
    pub(crate) static ID_API_V2_CONTEST_TYPE_: usize = 12;
    pub(crate) static ID_API_V2_CONTEST_TYPE_ID_: usize = 13;
    lazy_static! {
        pub static ref REGEX_API_V2_CONTEST_TYPE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/contest-type/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_CONTEST_TYPE_ID_");
    }
    pub(crate) static ID_API_V2_EGG_GROUP_: usize = 14;
    pub(crate) static ID_API_V2_EGG_GROUP_ID_: usize = 15;
    lazy_static! {
        pub static ref REGEX_API_V2_EGG_GROUP_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/egg-group/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_EGG_GROUP_ID_");
    }
    pub(crate) static ID_API_V2_ENCOUNTER_CONDITION_VALUE_: usize = 16;
    pub(crate) static ID_API_V2_ENCOUNTER_CONDITION_VALUE_ID_: usize = 17;
    lazy_static! {
        pub static ref REGEX_API_V2_ENCOUNTER_CONDITION_VALUE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/encounter-condition-value/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ENCOUNTER_CONDITION_VALUE_ID_");
    }
    pub(crate) static ID_API_V2_ENCOUNTER_CONDITION_: usize = 18;
    pub(crate) static ID_API_V2_ENCOUNTER_CONDITION_ID_: usize = 19;
    lazy_static! {
        pub static ref REGEX_API_V2_ENCOUNTER_CONDITION_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/encounter-condition/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ENCOUNTER_CONDITION_ID_");
    }
    pub(crate) static ID_API_V2_ENCOUNTER_METHOD_: usize = 20;
    pub(crate) static ID_API_V2_ENCOUNTER_METHOD_ID_: usize = 21;
    lazy_static! {
        pub static ref REGEX_API_V2_ENCOUNTER_METHOD_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/encounter-method/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ENCOUNTER_METHOD_ID_");
    }
    pub(crate) static ID_API_V2_EVOLUTION_CHAIN_: usize = 22;
    pub(crate) static ID_API_V2_EVOLUTION_CHAIN_ID_: usize = 23;
    lazy_static! {
        pub static ref REGEX_API_V2_EVOLUTION_CHAIN_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/evolution-chain/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_EVOLUTION_CHAIN_ID_");
    }
    pub(crate) static ID_API_V2_EVOLUTION_TRIGGER_: usize = 24;
    pub(crate) static ID_API_V2_EVOLUTION_TRIGGER_ID_: usize = 25;
    lazy_static! {
        pub static ref REGEX_API_V2_EVOLUTION_TRIGGER_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/evolution-trigger/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_EVOLUTION_TRIGGER_ID_");
    }
    pub(crate) static ID_API_V2_GENDER_: usize = 26;
    pub(crate) static ID_API_V2_GENDER_ID_: usize = 27;
    lazy_static! {
        pub static ref REGEX_API_V2_GENDER_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/gender/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_GENDER_ID_");
    }
    pub(crate) static ID_API_V2_GENERATION_: usize = 28;
    pub(crate) static ID_API_V2_GENERATION_ID_: usize = 29;
    lazy_static! {
        pub static ref REGEX_API_V2_GENERATION_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/generation/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_GENERATION_ID_");
    }
    pub(crate) static ID_API_V2_GROWTH_RATE_: usize = 30;
    pub(crate) static ID_API_V2_GROWTH_RATE_ID_: usize = 31;
    lazy_static! {
        pub static ref REGEX_API_V2_GROWTH_RATE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/growth-rate/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_GROWTH_RATE_ID_");
    }
    pub(crate) static ID_API_V2_ITEM_ATTRIBUTE_: usize = 32;
    pub(crate) static ID_API_V2_ITEM_ATTRIBUTE_ID_: usize = 33;
    lazy_static! {
        pub static ref REGEX_API_V2_ITEM_ATTRIBUTE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/item-attribute/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ITEM_ATTRIBUTE_ID_");
    }
    pub(crate) static ID_API_V2_ITEM_CATEGORY_: usize = 34;
    pub(crate) static ID_API_V2_ITEM_CATEGORY_ID_: usize = 35;
    lazy_static! {
        pub static ref REGEX_API_V2_ITEM_CATEGORY_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/item-category/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ITEM_CATEGORY_ID_");
    }
    pub(crate) static ID_API_V2_ITEM_FLING_EFFECT_: usize = 36;
    pub(crate) static ID_API_V2_ITEM_FLING_EFFECT_ID_: usize = 37;
    lazy_static! {
        pub static ref REGEX_API_V2_ITEM_FLING_EFFECT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/item-fling-effect/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ITEM_FLING_EFFECT_ID_");
    }
    pub(crate) static ID_API_V2_ITEM_POCKET_: usize = 38;
    pub(crate) static ID_API_V2_ITEM_POCKET_ID_: usize = 39;
    lazy_static! {
        pub static ref REGEX_API_V2_ITEM_POCKET_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/item-pocket/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ITEM_POCKET_ID_");
    }
    pub(crate) static ID_API_V2_ITEM_: usize = 40;
    pub(crate) static ID_API_V2_ITEM_ID_: usize = 41;
    lazy_static! {
        pub static ref REGEX_API_V2_ITEM_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/item/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_ITEM_ID_");
    }
    pub(crate) static ID_API_V2_LANGUAGE_: usize = 42;
    pub(crate) static ID_API_V2_LANGUAGE_ID_: usize = 43;
    lazy_static! {
        pub static ref REGEX_API_V2_LANGUAGE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/language/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_LANGUAGE_ID_");
    }
    pub(crate) static ID_API_V2_LOCATION_AREA_: usize = 44;
    pub(crate) static ID_API_V2_LOCATION_AREA_ID_: usize = 45;
    lazy_static! {
        pub static ref REGEX_API_V2_LOCATION_AREA_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/location-area/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_LOCATION_AREA_ID_");
    }
    pub(crate) static ID_API_V2_LOCATION_: usize = 46;
    pub(crate) static ID_API_V2_LOCATION_ID_: usize = 47;
    lazy_static! {
        pub static ref REGEX_API_V2_LOCATION_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/location/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_LOCATION_ID_");
    }
    pub(crate) static ID_API_V2_MACHINE_: usize = 48;
    pub(crate) static ID_API_V2_MACHINE_ID_: usize = 49;
    lazy_static! {
        pub static ref REGEX_API_V2_MACHINE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/machine/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MACHINE_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_AILMENT_: usize = 50;
    pub(crate) static ID_API_V2_MOVE_AILMENT_ID_: usize = 51;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_AILMENT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-ailment/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_AILMENT_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_BATTLE_STYLE_: usize = 52;
    pub(crate) static ID_API_V2_MOVE_BATTLE_STYLE_ID_: usize = 53;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_BATTLE_STYLE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-battle-style/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_BATTLE_STYLE_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_CATEGORY_: usize = 54;
    pub(crate) static ID_API_V2_MOVE_CATEGORY_ID_: usize = 55;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_CATEGORY_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-category/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_CATEGORY_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_DAMAGE_CLASS_: usize = 56;
    pub(crate) static ID_API_V2_MOVE_DAMAGE_CLASS_ID_: usize = 57;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_DAMAGE_CLASS_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-damage-class/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_DAMAGE_CLASS_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_LEARN_METHOD_: usize = 58;
    pub(crate) static ID_API_V2_MOVE_LEARN_METHOD_ID_: usize = 59;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_LEARN_METHOD_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-learn-method/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_LEARN_METHOD_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_TARGET_: usize = 60;
    pub(crate) static ID_API_V2_MOVE_TARGET_ID_: usize = 61;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_TARGET_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move-target/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_TARGET_ID_");
    }
    pub(crate) static ID_API_V2_MOVE_: usize = 62;
    pub(crate) static ID_API_V2_MOVE_ID_: usize = 63;
    lazy_static! {
        pub static ref REGEX_API_V2_MOVE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/move/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_MOVE_ID_");
    }
    pub(crate) static ID_API_V2_NATURE_: usize = 64;
    pub(crate) static ID_API_V2_NATURE_ID_: usize = 65;
    lazy_static! {
        pub static ref REGEX_API_V2_NATURE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/nature/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_NATURE_ID_");
    }
    pub(crate) static ID_API_V2_PAL_PARK_AREA_: usize = 66;
    pub(crate) static ID_API_V2_PAL_PARK_AREA_ID_: usize = 67;
    lazy_static! {
        pub static ref REGEX_API_V2_PAL_PARK_AREA_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pal-park-area/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_PAL_PARK_AREA_ID_");
    }
    pub(crate) static ID_API_V2_POKEATHLON_STAT_: usize = 68;
    pub(crate) static ID_API_V2_POKEATHLON_STAT_ID_: usize = 69;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEATHLON_STAT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokeathlon-stat/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEATHLON_STAT_ID_");
    }
    pub(crate) static ID_API_V2_POKEDEX_: usize = 70;
    pub(crate) static ID_API_V2_POKEDEX_ID_: usize = 71;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEDEX_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokedex/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEDEX_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_COLOR_: usize = 72;
    pub(crate) static ID_API_V2_POKEMON_COLOR_ID_: usize = 73;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_COLOR_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon-color/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_COLOR_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_FORM_: usize = 74;
    pub(crate) static ID_API_V2_POKEMON_FORM_ID_: usize = 75;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_FORM_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon-form/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_FORM_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_HABITAT_: usize = 76;
    pub(crate) static ID_API_V2_POKEMON_HABITAT_ID_: usize = 77;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_HABITAT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon-habitat/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_HABITAT_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_SHAPE_: usize = 78;
    pub(crate) static ID_API_V2_POKEMON_SHAPE_ID_: usize = 79;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_SHAPE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon-shape/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_SHAPE_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_SPECIES_: usize = 80;
    pub(crate) static ID_API_V2_POKEMON_SPECIES_ID_: usize = 81;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_SPECIES_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon-species/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_SPECIES_ID_");
    }
    pub(crate) static ID_API_V2_POKEMON_: usize = 82;
    pub(crate) static ID_API_V2_POKEMON_ID_: usize = 83;
    lazy_static! {
        pub static ref REGEX_API_V2_POKEMON_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/pokemon/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_POKEMON_ID_");
    }
    pub(crate) static ID_API_V2_REGION_: usize = 84;
    pub(crate) static ID_API_V2_REGION_ID_: usize = 85;
    lazy_static! {
        pub static ref REGEX_API_V2_REGION_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/region/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_REGION_ID_");
    }
    pub(crate) static ID_API_V2_STAT_: usize = 86;
    pub(crate) static ID_API_V2_STAT_ID_: usize = 87;
    lazy_static! {
        pub static ref REGEX_API_V2_STAT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/stat/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_STAT_ID_");
    }
    pub(crate) static ID_API_V2_SUPER_CONTEST_EFFECT_: usize = 88;
    pub(crate) static ID_API_V2_SUPER_CONTEST_EFFECT_ID_: usize = 89;
    lazy_static! {
        pub static ref REGEX_API_V2_SUPER_CONTEST_EFFECT_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/super-contest-effect/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_SUPER_CONTEST_EFFECT_ID_");
    }
    pub(crate) static ID_API_V2_TYPE_: usize = 90;
    pub(crate) static ID_API_V2_TYPE_ID_: usize = 91;
    lazy_static! {
        pub static ref REGEX_API_V2_TYPE_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/type/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_TYPE_ID_");
    }
    pub(crate) static ID_API_V2_VERSION_GROUP_: usize = 92;
    pub(crate) static ID_API_V2_VERSION_GROUP_ID_: usize = 93;
    lazy_static! {
        pub static ref REGEX_API_V2_VERSION_GROUP_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/version-group/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_VERSION_GROUP_ID_");
    }
    pub(crate) static ID_API_V2_VERSION_: usize = 94;
    pub(crate) static ID_API_V2_VERSION_ID_: usize = 95;
    lazy_static! {
        pub static ref REGEX_API_V2_VERSION_ID_: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/v2/version/(?P<id>[^/?#]*)/$")
                .expect("Unable to create regex for API_V2_VERSION_ID_");
    }
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        futures::future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker,
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString>  + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match method {

            // AbilityList - GET /api/v2/ability/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ABILITY_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ability_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AbilityListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ABILITY_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AbilityRead - GET /api/v2/ability/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ABILITY_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ABILITY_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ABILITY_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ABILITY_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.ability_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AbilityReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ABILITY_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryList - GET /api/v2/berry/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.berry_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryRead - GET /api/v2/berry/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_BERRY_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_BERRY_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_BERRY_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.berry_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryFirmnessList - GET /api/v2/berry-firmness/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.berry_firmness_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryFirmnessListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_FIRMNESS_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryFirmnessRead - GET /api/v2/berry-firmness/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_BERRY_FIRMNESS_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_BERRY_FIRMNESS_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_BERRY_FIRMNESS_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.berry_firmness_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryFirmnessReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_FIRMNESS_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryFlavorList - GET /api/v2/berry-flavor/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FLAVOR_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.berry_flavor_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryFlavorListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_FLAVOR_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BerryFlavorRead - GET /api/v2/berry-flavor/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FLAVOR_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_BERRY_FLAVOR_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_BERRY_FLAVOR_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_BERRY_FLAVOR_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.berry_flavor_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BerryFlavorReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for BERRY_FLAVOR_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CharacteristicList - GET /api/v2/characteristic/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CHARACTERISTIC_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.characteristic_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CharacteristicListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CHARACTERISTIC_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CharacteristicRead - GET /api/v2/characteristic/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CHARACTERISTIC_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_CHARACTERISTIC_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_CHARACTERISTIC_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_CHARACTERISTIC_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.characteristic_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CharacteristicReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CHARACTERISTIC_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ContestEffectList - GET /api/v2/contest-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_EFFECT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.contest_effect_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ContestEffectListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CONTEST_EFFECT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ContestEffectRead - GET /api/v2/contest-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_EFFECT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_CONTEST_EFFECT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_CONTEST_EFFECT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_CONTEST_EFFECT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.contest_effect_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ContestEffectReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CONTEST_EFFECT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ContestTypeList - GET /api/v2/contest-type/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_TYPE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.contest_type_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ContestTypeListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CONTEST_TYPE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ContestTypeRead - GET /api/v2/contest-type/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_TYPE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_CONTEST_TYPE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_CONTEST_TYPE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_CONTEST_TYPE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.contest_type_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ContestTypeReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for CONTEST_TYPE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EggGroupList - GET /api/v2/egg-group/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EGG_GROUP_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.egg_group_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EggGroupListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EGG_GROUP_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EggGroupRead - GET /api/v2/egg-group/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EGG_GROUP_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_EGG_GROUP_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_EGG_GROUP_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_EGG_GROUP_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.egg_group_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EggGroupReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EGG_GROUP_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterConditionList - GET /api/v2/encounter-condition/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.encounter_condition_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterConditionListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_CONDITION_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterConditionRead - GET /api/v2/encounter-condition/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ENCOUNTER_CONDITION_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ENCOUNTER_CONDITION_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ENCOUNTER_CONDITION_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.encounter_condition_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterConditionReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_CONDITION_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterConditionValueList - GET /api/v2/encounter-condition-value/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.encounter_condition_value_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterConditionValueListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_CONDITION_VALUE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterConditionValueRead - GET /api/v2/encounter-condition-value/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ENCOUNTER_CONDITION_VALUE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ENCOUNTER_CONDITION_VALUE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ENCOUNTER_CONDITION_VALUE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.encounter_condition_value_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterConditionValueReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_CONDITION_VALUE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterMethodList - GET /api/v2/encounter-method/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.encounter_method_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterMethodListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_METHOD_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EncounterMethodRead - GET /api/v2/encounter-method/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ENCOUNTER_METHOD_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ENCOUNTER_METHOD_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ENCOUNTER_METHOD_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.encounter_method_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EncounterMethodReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ENCOUNTER_METHOD_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EvolutionChainList - GET /api/v2/evolution-chain/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.evolution_chain_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EvolutionChainListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EVOLUTION_CHAIN_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EvolutionChainRead - GET /api/v2/evolution-chain/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_EVOLUTION_CHAIN_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_EVOLUTION_CHAIN_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_EVOLUTION_CHAIN_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.evolution_chain_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EvolutionChainReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EVOLUTION_CHAIN_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EvolutionTriggerList - GET /api/v2/evolution-trigger/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.evolution_trigger_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EvolutionTriggerListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EVOLUTION_TRIGGER_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EvolutionTriggerRead - GET /api/v2/evolution-trigger/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_EVOLUTION_TRIGGER_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_EVOLUTION_TRIGGER_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_EVOLUTION_TRIGGER_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.evolution_trigger_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EvolutionTriggerReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for EVOLUTION_TRIGGER_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GenderList - GET /api/v2/gender/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENDER_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.gender_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GenderListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GENDER_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GenderRead - GET /api/v2/gender/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENDER_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_GENDER_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_GENDER_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_GENDER_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.gender_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GenderReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GENDER_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GenerationList - GET /api/v2/generation/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENERATION_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.generation_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GenerationListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GENERATION_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GenerationRead - GET /api/v2/generation/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENERATION_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_GENERATION_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_GENERATION_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_GENERATION_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.generation_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GenerationReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GENERATION_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GrowthRateList - GET /api/v2/growth-rate/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GROWTH_RATE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.growth_rate_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GrowthRateListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GROWTH_RATE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GrowthRateRead - GET /api/v2/growth-rate/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GROWTH_RATE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_GROWTH_RATE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_GROWTH_RATE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_GROWTH_RATE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.growth_rate_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GrowthRateReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GROWTH_RATE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemList - GET /api/v2/item/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.item_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemRead - GET /api/v2/item/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ITEM_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ITEM_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ITEM_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.item_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemAttributeList - GET /api/v2/item-attribute/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.item_attribute_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemAttributeListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_ATTRIBUTE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemAttributeRead - GET /api/v2/item-attribute/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ITEM_ATTRIBUTE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ITEM_ATTRIBUTE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ITEM_ATTRIBUTE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.item_attribute_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemAttributeReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_ATTRIBUTE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemCategoryList - GET /api/v2/item-category/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_CATEGORY_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.item_category_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemCategoryListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_CATEGORY_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemCategoryRead - GET /api/v2/item-category/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_CATEGORY_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ITEM_CATEGORY_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ITEM_CATEGORY_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ITEM_CATEGORY_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.item_category_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemCategoryReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_CATEGORY_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemFlingEffectList - GET /api/v2/item-fling-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.item_fling_effect_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemFlingEffectListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_FLING_EFFECT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemFlingEffectRead - GET /api/v2/item-fling-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ITEM_FLING_EFFECT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ITEM_FLING_EFFECT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ITEM_FLING_EFFECT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.item_fling_effect_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemFlingEffectReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_FLING_EFFECT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemPocketList - GET /api/v2/item-pocket/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_POCKET_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.item_pocket_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemPocketListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_POCKET_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemPocketRead - GET /api/v2/item-pocket/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_POCKET_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_ITEM_POCKET_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_ITEM_POCKET_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_ITEM_POCKET_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.item_pocket_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemPocketReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for ITEM_POCKET_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LanguageList - GET /api/v2/language/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LANGUAGE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.language_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LanguageListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LANGUAGE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LanguageRead - GET /api/v2/language/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LANGUAGE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_LANGUAGE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_LANGUAGE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_LANGUAGE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.language_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LanguageReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LANGUAGE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LocationList - GET /api/v2/location/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.location_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LocationListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LOCATION_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LocationRead - GET /api/v2/location/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_LOCATION_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_LOCATION_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_LOCATION_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.location_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LocationReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LOCATION_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LocationAreaList - GET /api/v2/location-area/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_AREA_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.location_area_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LocationAreaListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LOCATION_AREA_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // LocationAreaRead - GET /api/v2/location-area/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_AREA_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_LOCATION_AREA_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_LOCATION_AREA_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_LOCATION_AREA_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.location_area_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                LocationAreaReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for LOCATION_AREA_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MachineList - GET /api/v2/machine/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MACHINE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.machine_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MachineListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MACHINE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MachineRead - GET /api/v2/machine/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MACHINE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MACHINE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MACHINE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MACHINE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.machine_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MachineReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MACHINE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveList - GET /api/v2/move/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveRead - GET /api/v2/move/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveAilmentList - GET /api/v2/move-ailment/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_AILMENT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_ailment_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveAilmentListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_AILMENT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveAilmentRead - GET /api/v2/move-ailment/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_AILMENT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_AILMENT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_AILMENT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_AILMENT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_ailment_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveAilmentReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_AILMENT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveBattleStyleList - GET /api/v2/move-battle-style/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_battle_style_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveBattleStyleListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_BATTLE_STYLE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveBattleStyleRead - GET /api/v2/move-battle-style/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_BATTLE_STYLE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_BATTLE_STYLE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_BATTLE_STYLE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_battle_style_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveBattleStyleReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_BATTLE_STYLE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveCategoryList - GET /api/v2/move-category/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_CATEGORY_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_category_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveCategoryListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_CATEGORY_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveCategoryRead - GET /api/v2/move-category/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_CATEGORY_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_CATEGORY_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_CATEGORY_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_CATEGORY_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_category_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveCategoryReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_CATEGORY_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveDamageClassList - GET /api/v2/move-damage-class/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_damage_class_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveDamageClassListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_DAMAGE_CLASS_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveDamageClassRead - GET /api/v2/move-damage-class/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_DAMAGE_CLASS_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_DAMAGE_CLASS_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_DAMAGE_CLASS_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_damage_class_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveDamageClassReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_DAMAGE_CLASS_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveLearnMethodList - GET /api/v2/move-learn-method/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_learn_method_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveLearnMethodListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_LEARN_METHOD_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveLearnMethodRead - GET /api/v2/move-learn-method/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_LEARN_METHOD_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_LEARN_METHOD_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_LEARN_METHOD_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_learn_method_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveLearnMethodReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_LEARN_METHOD_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveTargetList - GET /api/v2/move-target/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_TARGET_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.move_target_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveTargetListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_TARGET_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MoveTargetRead - GET /api/v2/move-target/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_TARGET_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_MOVE_TARGET_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_MOVE_TARGET_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_MOVE_TARGET_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.move_target_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MoveTargetReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for MOVE_TARGET_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // NatureList - GET /api/v2/nature/
            hyper::Method::GET if path.matched(paths::ID_API_V2_NATURE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.nature_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                NatureListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for NATURE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // NatureRead - GET /api/v2/nature/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_NATURE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_NATURE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_NATURE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_NATURE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.nature_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                NatureReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for NATURE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PalParkAreaList - GET /api/v2/pal-park-area/
            hyper::Method::GET if path.matched(paths::ID_API_V2_PAL_PARK_AREA_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pal_park_area_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PalParkAreaListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for PAL_PARK_AREA_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PalParkAreaRead - GET /api/v2/pal-park-area/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_PAL_PARK_AREA_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_PAL_PARK_AREA_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_PAL_PARK_AREA_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_PAL_PARK_AREA_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pal_park_area_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PalParkAreaReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for PAL_PARK_AREA_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokeathlonStatList - GET /api/v2/pokeathlon-stat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEATHLON_STAT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokeathlon_stat_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokeathlonStatListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEATHLON_STAT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokeathlonStatRead - GET /api/v2/pokeathlon-stat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEATHLON_STAT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEATHLON_STAT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEATHLON_STAT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEATHLON_STAT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokeathlon_stat_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokeathlonStatReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEATHLON_STAT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokedexList - GET /api/v2/pokedex/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEDEX_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokedex_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokedexListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEDEX_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokedexRead - GET /api/v2/pokedex/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEDEX_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEDEX_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEDEX_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEDEX_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokedex_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokedexReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEDEX_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonList - GET /api/v2/pokemon/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonRead - GET /api/v2/pokemon/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonColorList - GET /api/v2/pokemon-color/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_COLOR_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_color_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonColorListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_COLOR_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonColorRead - GET /api/v2/pokemon-color/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_COLOR_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_COLOR_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_COLOR_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_COLOR_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_color_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonColorReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_COLOR_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonFormList - GET /api/v2/pokemon-form/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_FORM_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_form_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonFormListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_FORM_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonFormRead - GET /api/v2/pokemon-form/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_FORM_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_FORM_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_FORM_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_FORM_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_form_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonFormReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_FORM_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonHabitatList - GET /api/v2/pokemon-habitat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_HABITAT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_habitat_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonHabitatListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_HABITAT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonHabitatRead - GET /api/v2/pokemon-habitat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_HABITAT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_HABITAT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_HABITAT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_HABITAT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_habitat_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonHabitatReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_HABITAT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonShapeList - GET /api/v2/pokemon-shape/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SHAPE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_shape_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonShapeListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_SHAPE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonShapeRead - GET /api/v2/pokemon-shape/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SHAPE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_SHAPE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_SHAPE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_SHAPE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_shape_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonShapeReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_SHAPE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonSpeciesList - GET /api/v2/pokemon-species/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SPECIES_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pokemon_species_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonSpeciesListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_SPECIES_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PokemonSpeciesRead - GET /api/v2/pokemon-species/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SPECIES_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_POKEMON_SPECIES_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_POKEMON_SPECIES_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_POKEMON_SPECIES_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pokemon_species_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PokemonSpeciesReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POKEMON_SPECIES_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RegionList - GET /api/v2/region/
            hyper::Method::GET if path.matched(paths::ID_API_V2_REGION_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.region_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RegionListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for REGION_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RegionRead - GET /api/v2/region/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_REGION_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_REGION_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_REGION_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_REGION_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.region_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RegionReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for REGION_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // StatList - GET /api/v2/stat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_STAT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.stat_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                StatListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for STAT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // StatRead - GET /api/v2/stat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_STAT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_STAT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_STAT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_STAT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.stat_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                StatReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for STAT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // SuperContestEffectList - GET /api/v2/super-contest-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.super_contest_effect_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SuperContestEffectListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for SUPER_CONTEST_EFFECT_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // SuperContestEffectRead - GET /api/v2/super-contest-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_SUPER_CONTEST_EFFECT_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_SUPER_CONTEST_EFFECT_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_SUPER_CONTEST_EFFECT_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.super_contest_effect_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SuperContestEffectReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for SUPER_CONTEST_EFFECT_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // TypeList - GET /api/v2/type/
            hyper::Method::GET if path.matched(paths::ID_API_V2_TYPE_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.type_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                TypeListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for TYPE_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // TypeRead - GET /api/v2/type/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_TYPE_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_TYPE_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_TYPE_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_TYPE_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.type_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                TypeReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for TYPE_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // VersionList - GET /api/v2/version/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.version_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                VersionListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for VERSION_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // VersionRead - GET /api/v2/version/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_VERSION_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_VERSION_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_VERSION_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.version_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                VersionReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for VERSION_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // VersionGroupList - GET /api/v2/version-group/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_GROUP_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_offset = query_params.iter().filter(|e| e.0 == "offset").map(|e| e.1.clone())
                    .next();
                let param_offset = match param_offset {
                    Some(param_offset) => {
                        let param_offset =
                            <i32 as std::str::FromStr>::from_str
                                (&param_offset);
                        match param_offset {
                            Ok(param_offset) => Some(param_offset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter offset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter offset")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.version_group_list(
                                            param_limit,
                                            param_offset,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                VersionGroupListResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for VERSION_GROUP_LIST_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // VersionGroupRead - GET /api/v2/version-group/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_GROUP_ID_) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_V2_VERSION_GROUP_ID_
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V2_VERSION_GROUP_ID_ in set but failed match against \"{}\"", path, paths::REGEX_API_V2_VERSION_GROUP_ID_.as_str())
                    );

                let param_id = match percent_encoding::percent_decode(path_params["id"].as_bytes()).decode_utf8() {
                    Ok(param_id) => match param_id.parse::<i32>() {
                        Ok(param_id) => param_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.version_group_read(
                                            param_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                VersionGroupReadResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for VERSION_GROUP_READ_DEFAULT_RESPONSE"));
                                                    let body_content = body;
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_API_V2_ABILITY_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ABILITY_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_FLAVOR_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_FLAVOR_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_BERRY_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CHARACTERISTIC_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CHARACTERISTIC_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CONTEST_EFFECT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CONTEST_EFFECT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CONTEST_TYPE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_CONTEST_TYPE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EGG_GROUP_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EGG_GROUP_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GENDER_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GENDER_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GENERATION_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GENERATION_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GROWTH_RATE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_GROWTH_RATE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_CATEGORY_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_CATEGORY_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_POCKET_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_POCKET_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_ITEM_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LANGUAGE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LANGUAGE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LOCATION_AREA_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LOCATION_AREA_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LOCATION_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_LOCATION_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MACHINE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MACHINE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_AILMENT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_AILMENT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_CATEGORY_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_CATEGORY_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_TARGET_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_TARGET_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_MOVE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_NATURE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_NATURE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_PAL_PARK_AREA_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_PAL_PARK_AREA_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEATHLON_STAT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEATHLON_STAT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEDEX_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEDEX_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_COLOR_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_COLOR_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_FORM_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_FORM_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_HABITAT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_HABITAT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_SHAPE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_SHAPE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_SPECIES_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_SPECIES_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_POKEMON_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_REGION_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_REGION_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_STAT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_STAT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_TYPE_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_TYPE_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_VERSION_GROUP_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_VERSION_GROUP_ID_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_VERSION_) => method_not_allowed(),
            _ if path.matched(paths::ID_API_V2_VERSION_ID_) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // AbilityList - GET /api/v2/ability/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ABILITY_) => Some("AbilityList"),
            // AbilityRead - GET /api/v2/ability/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ABILITY_ID_) => Some("AbilityRead"),
            // BerryList - GET /api/v2/berry/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_) => Some("BerryList"),
            // BerryRead - GET /api/v2/berry/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_ID_) => Some("BerryRead"),
            // BerryFirmnessList - GET /api/v2/berry-firmness/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_) => Some("BerryFirmnessList"),
            // BerryFirmnessRead - GET /api/v2/berry-firmness/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FIRMNESS_ID_) => Some("BerryFirmnessRead"),
            // BerryFlavorList - GET /api/v2/berry-flavor/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FLAVOR_) => Some("BerryFlavorList"),
            // BerryFlavorRead - GET /api/v2/berry-flavor/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_BERRY_FLAVOR_ID_) => Some("BerryFlavorRead"),
            // CharacteristicList - GET /api/v2/characteristic/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CHARACTERISTIC_) => Some("CharacteristicList"),
            // CharacteristicRead - GET /api/v2/characteristic/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CHARACTERISTIC_ID_) => Some("CharacteristicRead"),
            // ContestEffectList - GET /api/v2/contest-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_EFFECT_) => Some("ContestEffectList"),
            // ContestEffectRead - GET /api/v2/contest-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_EFFECT_ID_) => Some("ContestEffectRead"),
            // ContestTypeList - GET /api/v2/contest-type/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_TYPE_) => Some("ContestTypeList"),
            // ContestTypeRead - GET /api/v2/contest-type/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_CONTEST_TYPE_ID_) => Some("ContestTypeRead"),
            // EggGroupList - GET /api/v2/egg-group/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EGG_GROUP_) => Some("EggGroupList"),
            // EggGroupRead - GET /api/v2/egg-group/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EGG_GROUP_ID_) => Some("EggGroupRead"),
            // EncounterConditionList - GET /api/v2/encounter-condition/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_) => Some("EncounterConditionList"),
            // EncounterConditionRead - GET /api/v2/encounter-condition/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_ID_) => Some("EncounterConditionRead"),
            // EncounterConditionValueList - GET /api/v2/encounter-condition-value/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_) => Some("EncounterConditionValueList"),
            // EncounterConditionValueRead - GET /api/v2/encounter-condition-value/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_CONDITION_VALUE_ID_) => Some("EncounterConditionValueRead"),
            // EncounterMethodList - GET /api/v2/encounter-method/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_) => Some("EncounterMethodList"),
            // EncounterMethodRead - GET /api/v2/encounter-method/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ENCOUNTER_METHOD_ID_) => Some("EncounterMethodRead"),
            // EvolutionChainList - GET /api/v2/evolution-chain/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_) => Some("EvolutionChainList"),
            // EvolutionChainRead - GET /api/v2/evolution-chain/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_CHAIN_ID_) => Some("EvolutionChainRead"),
            // EvolutionTriggerList - GET /api/v2/evolution-trigger/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_) => Some("EvolutionTriggerList"),
            // EvolutionTriggerRead - GET /api/v2/evolution-trigger/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_EVOLUTION_TRIGGER_ID_) => Some("EvolutionTriggerRead"),
            // GenderList - GET /api/v2/gender/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENDER_) => Some("GenderList"),
            // GenderRead - GET /api/v2/gender/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENDER_ID_) => Some("GenderRead"),
            // GenerationList - GET /api/v2/generation/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENERATION_) => Some("GenerationList"),
            // GenerationRead - GET /api/v2/generation/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GENERATION_ID_) => Some("GenerationRead"),
            // GrowthRateList - GET /api/v2/growth-rate/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GROWTH_RATE_) => Some("GrowthRateList"),
            // GrowthRateRead - GET /api/v2/growth-rate/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_GROWTH_RATE_ID_) => Some("GrowthRateRead"),
            // ItemList - GET /api/v2/item/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_) => Some("ItemList"),
            // ItemRead - GET /api/v2/item/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ID_) => Some("ItemRead"),
            // ItemAttributeList - GET /api/v2/item-attribute/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_) => Some("ItemAttributeList"),
            // ItemAttributeRead - GET /api/v2/item-attribute/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_ATTRIBUTE_ID_) => Some("ItemAttributeRead"),
            // ItemCategoryList - GET /api/v2/item-category/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_CATEGORY_) => Some("ItemCategoryList"),
            // ItemCategoryRead - GET /api/v2/item-category/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_CATEGORY_ID_) => Some("ItemCategoryRead"),
            // ItemFlingEffectList - GET /api/v2/item-fling-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_) => Some("ItemFlingEffectList"),
            // ItemFlingEffectRead - GET /api/v2/item-fling-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_FLING_EFFECT_ID_) => Some("ItemFlingEffectRead"),
            // ItemPocketList - GET /api/v2/item-pocket/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_POCKET_) => Some("ItemPocketList"),
            // ItemPocketRead - GET /api/v2/item-pocket/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_ITEM_POCKET_ID_) => Some("ItemPocketRead"),
            // LanguageList - GET /api/v2/language/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LANGUAGE_) => Some("LanguageList"),
            // LanguageRead - GET /api/v2/language/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LANGUAGE_ID_) => Some("LanguageRead"),
            // LocationList - GET /api/v2/location/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_) => Some("LocationList"),
            // LocationRead - GET /api/v2/location/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_ID_) => Some("LocationRead"),
            // LocationAreaList - GET /api/v2/location-area/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_AREA_) => Some("LocationAreaList"),
            // LocationAreaRead - GET /api/v2/location-area/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_LOCATION_AREA_ID_) => Some("LocationAreaRead"),
            // MachineList - GET /api/v2/machine/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MACHINE_) => Some("MachineList"),
            // MachineRead - GET /api/v2/machine/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MACHINE_ID_) => Some("MachineRead"),
            // MoveList - GET /api/v2/move/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_) => Some("MoveList"),
            // MoveRead - GET /api/v2/move/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_ID_) => Some("MoveRead"),
            // MoveAilmentList - GET /api/v2/move-ailment/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_AILMENT_) => Some("MoveAilmentList"),
            // MoveAilmentRead - GET /api/v2/move-ailment/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_AILMENT_ID_) => Some("MoveAilmentRead"),
            // MoveBattleStyleList - GET /api/v2/move-battle-style/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_) => Some("MoveBattleStyleList"),
            // MoveBattleStyleRead - GET /api/v2/move-battle-style/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_BATTLE_STYLE_ID_) => Some("MoveBattleStyleRead"),
            // MoveCategoryList - GET /api/v2/move-category/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_CATEGORY_) => Some("MoveCategoryList"),
            // MoveCategoryRead - GET /api/v2/move-category/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_CATEGORY_ID_) => Some("MoveCategoryRead"),
            // MoveDamageClassList - GET /api/v2/move-damage-class/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_) => Some("MoveDamageClassList"),
            // MoveDamageClassRead - GET /api/v2/move-damage-class/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_DAMAGE_CLASS_ID_) => Some("MoveDamageClassRead"),
            // MoveLearnMethodList - GET /api/v2/move-learn-method/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_) => Some("MoveLearnMethodList"),
            // MoveLearnMethodRead - GET /api/v2/move-learn-method/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_LEARN_METHOD_ID_) => Some("MoveLearnMethodRead"),
            // MoveTargetList - GET /api/v2/move-target/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_TARGET_) => Some("MoveTargetList"),
            // MoveTargetRead - GET /api/v2/move-target/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_MOVE_TARGET_ID_) => Some("MoveTargetRead"),
            // NatureList - GET /api/v2/nature/
            hyper::Method::GET if path.matched(paths::ID_API_V2_NATURE_) => Some("NatureList"),
            // NatureRead - GET /api/v2/nature/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_NATURE_ID_) => Some("NatureRead"),
            // PalParkAreaList - GET /api/v2/pal-park-area/
            hyper::Method::GET if path.matched(paths::ID_API_V2_PAL_PARK_AREA_) => Some("PalParkAreaList"),
            // PalParkAreaRead - GET /api/v2/pal-park-area/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_PAL_PARK_AREA_ID_) => Some("PalParkAreaRead"),
            // PokeathlonStatList - GET /api/v2/pokeathlon-stat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEATHLON_STAT_) => Some("PokeathlonStatList"),
            // PokeathlonStatRead - GET /api/v2/pokeathlon-stat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEATHLON_STAT_ID_) => Some("PokeathlonStatRead"),
            // PokedexList - GET /api/v2/pokedex/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEDEX_) => Some("PokedexList"),
            // PokedexRead - GET /api/v2/pokedex/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEDEX_ID_) => Some("PokedexRead"),
            // PokemonList - GET /api/v2/pokemon/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_) => Some("PokemonList"),
            // PokemonRead - GET /api/v2/pokemon/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_ID_) => Some("PokemonRead"),
            // PokemonColorList - GET /api/v2/pokemon-color/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_COLOR_) => Some("PokemonColorList"),
            // PokemonColorRead - GET /api/v2/pokemon-color/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_COLOR_ID_) => Some("PokemonColorRead"),
            // PokemonFormList - GET /api/v2/pokemon-form/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_FORM_) => Some("PokemonFormList"),
            // PokemonFormRead - GET /api/v2/pokemon-form/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_FORM_ID_) => Some("PokemonFormRead"),
            // PokemonHabitatList - GET /api/v2/pokemon-habitat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_HABITAT_) => Some("PokemonHabitatList"),
            // PokemonHabitatRead - GET /api/v2/pokemon-habitat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_HABITAT_ID_) => Some("PokemonHabitatRead"),
            // PokemonShapeList - GET /api/v2/pokemon-shape/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SHAPE_) => Some("PokemonShapeList"),
            // PokemonShapeRead - GET /api/v2/pokemon-shape/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SHAPE_ID_) => Some("PokemonShapeRead"),
            // PokemonSpeciesList - GET /api/v2/pokemon-species/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SPECIES_) => Some("PokemonSpeciesList"),
            // PokemonSpeciesRead - GET /api/v2/pokemon-species/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_POKEMON_SPECIES_ID_) => Some("PokemonSpeciesRead"),
            // RegionList - GET /api/v2/region/
            hyper::Method::GET if path.matched(paths::ID_API_V2_REGION_) => Some("RegionList"),
            // RegionRead - GET /api/v2/region/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_REGION_ID_) => Some("RegionRead"),
            // StatList - GET /api/v2/stat/
            hyper::Method::GET if path.matched(paths::ID_API_V2_STAT_) => Some("StatList"),
            // StatRead - GET /api/v2/stat/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_STAT_ID_) => Some("StatRead"),
            // SuperContestEffectList - GET /api/v2/super-contest-effect/
            hyper::Method::GET if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_) => Some("SuperContestEffectList"),
            // SuperContestEffectRead - GET /api/v2/super-contest-effect/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_SUPER_CONTEST_EFFECT_ID_) => Some("SuperContestEffectRead"),
            // TypeList - GET /api/v2/type/
            hyper::Method::GET if path.matched(paths::ID_API_V2_TYPE_) => Some("TypeList"),
            // TypeRead - GET /api/v2/type/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_TYPE_ID_) => Some("TypeRead"),
            // VersionList - GET /api/v2/version/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_) => Some("VersionList"),
            // VersionRead - GET /api/v2/version/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_ID_) => Some("VersionRead"),
            // VersionGroupList - GET /api/v2/version-group/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_GROUP_) => Some("VersionGroupList"),
            // VersionGroupRead - GET /api/v2/version-group/{id}/
            hyper::Method::GET if path.matched(paths::ID_API_V2_VERSION_GROUP_ID_) => Some("VersionGroupRead"),
            _ => None,
        }
    }
}
