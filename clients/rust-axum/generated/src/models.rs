#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct AbilityListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct AbilityReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryFirmnessListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryFirmnessReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryFlavorListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct BerryFlavorReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct CharacteristicListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct CharacteristicReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ContestEffectListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ContestEffectReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ContestTypeListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ContestTypeReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EggGroupListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EggGroupReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterConditionListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterConditionReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterConditionValueListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterConditionValueReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterMethodListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EncounterMethodReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EvolutionChainListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EvolutionChainReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EvolutionTriggerListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct EvolutionTriggerReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GenderListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GenderReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GenerationListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GenerationReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GrowthRateListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GrowthRateReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemAttributeListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemAttributeReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemCategoryListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemCategoryReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemFlingEffectListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemFlingEffectReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemPocketListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct ItemPocketReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LanguageListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LanguageReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LocationListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LocationReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LocationAreaListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct LocationAreaReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MachineListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MachineReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveAilmentListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveAilmentReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveBattleStyleListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveBattleStyleReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveCategoryListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveCategoryReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveDamageClassListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveDamageClassReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveLearnMethodListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveLearnMethodReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveTargetListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct MoveTargetReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct NatureListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct NatureReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PalParkAreaListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PalParkAreaReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokeathlonStatListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokeathlonStatReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokedexListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokedexReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonColorListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonColorReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonFormListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonFormReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonHabitatListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonHabitatReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonShapeListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonShapeReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonSpeciesListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct PokemonSpeciesReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RegionListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RegionReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct StatListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct StatReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct SuperContestEffectListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct SuperContestEffectReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct TypeListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct TypeReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct VersionListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct VersionReadPathParams {
                pub id: i32,
    }


      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct VersionGroupListQueryParams {
                #[serde(rename = "limit")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub limit: Option<i32>,
                #[serde(rename = "offset")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub offset: Option<i32>,
    }

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct VersionGroupReadPathParams {
                pub id: i32,
    }



