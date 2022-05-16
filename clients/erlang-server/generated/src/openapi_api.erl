-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('AbilityList') ->
    [
        'limit',
        'offset'
    ];

request_params('AbilityRead') ->
    [
        'id'
    ];


request_params('BerryList') ->
    [
        'limit',
        'offset'
    ];

request_params('BerryRead') ->
    [
        'id'
    ];


request_params('BerryFirmnessList') ->
    [
        'limit',
        'offset'
    ];

request_params('BerryFirmnessRead') ->
    [
        'id'
    ];


request_params('BerryFlavorList') ->
    [
        'limit',
        'offset'
    ];

request_params('BerryFlavorRead') ->
    [
        'id'
    ];


request_params('CharacteristicList') ->
    [
        'limit',
        'offset'
    ];

request_params('CharacteristicRead') ->
    [
        'id'
    ];


request_params('ContestEffectList') ->
    [
        'limit',
        'offset'
    ];

request_params('ContestEffectRead') ->
    [
        'id'
    ];


request_params('ContestTypeList') ->
    [
        'limit',
        'offset'
    ];

request_params('ContestTypeRead') ->
    [
        'id'
    ];


request_params('EggGroupList') ->
    [
        'limit',
        'offset'
    ];

request_params('EggGroupRead') ->
    [
        'id'
    ];


request_params('EncounterConditionList') ->
    [
        'limit',
        'offset'
    ];

request_params('EncounterConditionRead') ->
    [
        'id'
    ];


request_params('EncounterConditionValueList') ->
    [
        'limit',
        'offset'
    ];

request_params('EncounterConditionValueRead') ->
    [
        'id'
    ];


request_params('EncounterMethodList') ->
    [
        'limit',
        'offset'
    ];

request_params('EncounterMethodRead') ->
    [
        'id'
    ];


request_params('EvolutionChainList') ->
    [
        'limit',
        'offset'
    ];

request_params('EvolutionChainRead') ->
    [
        'id'
    ];


request_params('EvolutionTriggerList') ->
    [
        'limit',
        'offset'
    ];

request_params('EvolutionTriggerRead') ->
    [
        'id'
    ];


request_params('GenderList') ->
    [
        'limit',
        'offset'
    ];

request_params('GenderRead') ->
    [
        'id'
    ];


request_params('GenerationList') ->
    [
        'limit',
        'offset'
    ];

request_params('GenerationRead') ->
    [
        'id'
    ];


request_params('GrowthRateList') ->
    [
        'limit',
        'offset'
    ];

request_params('GrowthRateRead') ->
    [
        'id'
    ];


request_params('ItemList') ->
    [
        'limit',
        'offset'
    ];

request_params('ItemRead') ->
    [
        'id'
    ];


request_params('ItemAttributeList') ->
    [
        'limit',
        'offset'
    ];

request_params('ItemAttributeRead') ->
    [
        'id'
    ];


request_params('ItemCategoryList') ->
    [
        'limit',
        'offset'
    ];

request_params('ItemCategoryRead') ->
    [
        'id'
    ];


request_params('ItemFlingEffectList') ->
    [
        'limit',
        'offset'
    ];

request_params('ItemFlingEffectRead') ->
    [
        'id'
    ];


request_params('ItemPocketList') ->
    [
        'limit',
        'offset'
    ];

request_params('ItemPocketRead') ->
    [
        'id'
    ];


request_params('LanguageList') ->
    [
        'limit',
        'offset'
    ];

request_params('LanguageRead') ->
    [
        'id'
    ];


request_params('LocationList') ->
    [
        'limit',
        'offset'
    ];

request_params('LocationRead') ->
    [
        'id'
    ];


request_params('LocationAreaList') ->
    [
        'limit',
        'offset'
    ];

request_params('LocationAreaRead') ->
    [
        'id'
    ];


request_params('MachineList') ->
    [
        'limit',
        'offset'
    ];

request_params('MachineRead') ->
    [
        'id'
    ];


request_params('MoveList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveRead') ->
    [
        'id'
    ];


request_params('MoveAilmentList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveAilmentRead') ->
    [
        'id'
    ];


request_params('MoveBattleStyleList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveBattleStyleRead') ->
    [
        'id'
    ];


request_params('MoveCategoryList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveCategoryRead') ->
    [
        'id'
    ];


request_params('MoveDamageClassList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveDamageClassRead') ->
    [
        'id'
    ];


request_params('MoveLearnMethodList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveLearnMethodRead') ->
    [
        'id'
    ];


request_params('MoveTargetList') ->
    [
        'limit',
        'offset'
    ];

request_params('MoveTargetRead') ->
    [
        'id'
    ];


request_params('NatureList') ->
    [
        'limit',
        'offset'
    ];

request_params('NatureRead') ->
    [
        'id'
    ];


request_params('PalParkAreaList') ->
    [
        'limit',
        'offset'
    ];

request_params('PalParkAreaRead') ->
    [
        'id'
    ];


request_params('PokeathlonStatList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokeathlonStatRead') ->
    [
        'id'
    ];


request_params('PokedexList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokedexRead') ->
    [
        'id'
    ];


request_params('PokemonList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonRead') ->
    [
        'id'
    ];


request_params('PokemonColorList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonColorRead') ->
    [
        'id'
    ];


request_params('PokemonFormList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonFormRead') ->
    [
        'id'
    ];


request_params('PokemonHabitatList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonHabitatRead') ->
    [
        'id'
    ];


request_params('PokemonShapeList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonShapeRead') ->
    [
        'id'
    ];


request_params('PokemonSpeciesList') ->
    [
        'limit',
        'offset'
    ];

request_params('PokemonSpeciesRead') ->
    [
        'id'
    ];


request_params('RegionList') ->
    [
        'limit',
        'offset'
    ];

request_params('RegionRead') ->
    [
        'id'
    ];


request_params('StatList') ->
    [
        'limit',
        'offset'
    ];

request_params('StatRead') ->
    [
        'id'
    ];


request_params('SuperContestEffectList') ->
    [
        'limit',
        'offset'
    ];

request_params('SuperContestEffectRead') ->
    [
        'id'
    ];


request_params('TypeList') ->
    [
        'limit',
        'offset'
    ];

request_params('TypeRead') ->
    [
        'id'
    ];


request_params('VersionList') ->
    [
        'limit',
        'offset'
    ];

request_params('VersionRead') ->
    [
        'id'
    ];


request_params('VersionGroupList') ->
    [
        'limit',
        'offset'
    ];

request_params('VersionGroupRead') ->
    [
        'id'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('AbilityList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('AbilityList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('AbilityRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('BerryList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('BerryFirmnessList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryFirmnessList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryFirmnessRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('BerryFlavorList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryFlavorList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('BerryFlavorRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('CharacteristicList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('CharacteristicList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('CharacteristicRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ContestEffectList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ContestEffectList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ContestEffectRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ContestTypeList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ContestTypeList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ContestTypeRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EggGroupList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EggGroupList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EggGroupRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EncounterConditionList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterConditionList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterConditionRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EncounterConditionValueList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterConditionValueList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterConditionValueRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EncounterMethodList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterMethodList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EncounterMethodRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EvolutionChainList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EvolutionChainList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EvolutionChainRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('EvolutionTriggerList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EvolutionTriggerList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('EvolutionTriggerRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('GenderList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GenderList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GenderRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('GenerationList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GenerationList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GenerationRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('GrowthRateList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GrowthRateList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GrowthRateRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ItemList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ItemAttributeList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemAttributeList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemAttributeRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ItemCategoryList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemCategoryList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemCategoryRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ItemFlingEffectList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemFlingEffectList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemFlingEffectRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('ItemPocketList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemPocketList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('ItemPocketRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('LanguageList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LanguageList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LanguageRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('LocationList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LocationList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LocationRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('LocationAreaList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LocationAreaList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('LocationAreaRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MachineList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MachineList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MachineRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveAilmentList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveAilmentList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveAilmentRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveBattleStyleList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveBattleStyleList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveBattleStyleRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveCategoryList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveCategoryList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveCategoryRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveDamageClassList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveDamageClassList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveDamageClassRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveLearnMethodList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveLearnMethodList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveLearnMethodRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('MoveTargetList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveTargetList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('MoveTargetRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('NatureList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('NatureList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('NatureRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PalParkAreaList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PalParkAreaList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PalParkAreaRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokeathlonStatList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokeathlonStatList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokeathlonStatRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokedexList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokedexList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokedexRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonColorList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonColorList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonColorRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonFormList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonFormList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonFormRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonHabitatList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonHabitatList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonHabitatRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonShapeList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonShapeList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonShapeRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('PokemonSpeciesList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonSpeciesList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PokemonSpeciesRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('RegionList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('RegionList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('RegionRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('StatList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('StatList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('StatRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('SuperContestEffectList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('SuperContestEffectList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('SuperContestEffectRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('TypeList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('TypeList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('TypeRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('VersionList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('VersionList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('VersionRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('VersionGroupList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('VersionGroupList', 'offset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('VersionGroupRead', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('AbilityList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('AbilityRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('BerryList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('BerryRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('BerryFirmnessList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('BerryFirmnessRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('BerryFlavorList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('BerryFlavorRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('CharacteristicList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CharacteristicRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ContestEffectList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ContestEffectRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ContestTypeList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ContestTypeRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EggGroupList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EggGroupRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EncounterConditionList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EncounterConditionRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EncounterConditionValueList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EncounterConditionValueRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EncounterMethodList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EncounterMethodRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EvolutionChainList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EvolutionChainRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('EvolutionTriggerList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('EvolutionTriggerRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GenderList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GenderRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GenerationList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GenerationRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GrowthRateList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GrowthRateRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ItemList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ItemRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ItemAttributeList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ItemAttributeRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ItemCategoryList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ItemCategoryRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ItemFlingEffectList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ItemFlingEffectRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('ItemPocketList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ItemPocketRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('LanguageList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('LanguageRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('LocationList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('LocationRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('LocationAreaList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('LocationAreaRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MachineList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MachineRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveAilmentList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveAilmentRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveBattleStyleList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveBattleStyleRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveCategoryList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveCategoryRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveDamageClassList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveDamageClassRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveLearnMethodList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveLearnMethodRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('MoveTargetList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('MoveTargetRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('NatureList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('NatureRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PalParkAreaList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PalParkAreaRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokeathlonStatList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokeathlonStatRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokedexList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokedexRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonColorList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonColorRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonFormList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonFormRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonHabitatList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonHabitatRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonShapeList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonShapeRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('PokemonSpeciesList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PokemonSpeciesRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('RegionList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('RegionRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('StatList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('StatRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('SuperContestEffectList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('SuperContestEffectRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('TypeList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('TypeRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('VersionList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('VersionRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('VersionGroupList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('VersionGroupRead', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps])
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
