-module(openapi_type_detail_past_damage_relations_inner).

-include("openapi.hrl").

-export([openapi_type_detail_past_damage_relations_inner/0]).

-export([openapi_type_detail_past_damage_relations_inner/1]).

-export_type([openapi_type_detail_past_damage_relations_inner/0]).

-type openapi_type_detail_past_damage_relations_inner() ::
  [ {'generation', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'damage_relations', openapi_type_detail_past_damage_relations_inner_damage_relations:openapi_type_detail_past_damage_relations_inner_damage_relations() }
  ].


openapi_type_detail_past_damage_relations_inner() ->
    openapi_type_detail_past_damage_relations_inner([]).

openapi_type_detail_past_damage_relations_inner(Fields) ->
  Default = [ {'generation', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'damage_relations', openapi_type_detail_past_damage_relations_inner_damage_relations:openapi_type_detail_past_damage_relations_inner_damage_relations() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

