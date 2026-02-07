-module(openapi_type_detail_past_damage_relations_inner_damage_relations).

-include("openapi.hrl").

-export([openapi_type_detail_past_damage_relations_inner_damage_relations/0]).

-export([openapi_type_detail_past_damage_relations_inner_damage_relations/1]).

-export_type([openapi_type_detail_past_damage_relations_inner_damage_relations/0]).

-type openapi_type_detail_past_damage_relations_inner_damage_relations() ::
  [ {'no_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'half_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'double_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'no_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'half_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'double_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_type_detail_past_damage_relations_inner_damage_relations() ->
    openapi_type_detail_past_damage_relations_inner_damage_relations([]).

openapi_type_detail_past_damage_relations_inner_damage_relations(Fields) ->
  Default = [ {'no_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'half_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'double_damage_to', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'no_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'half_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'double_damage_from', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

