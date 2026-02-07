-module(openapi_router).

-export([get_paths/1]).

-type method() :: binary().
-type operations() :: #{method() => openapi_api:operation_id()}.
-type init_opts()  :: {operations(), module()}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: module()) -> cowboy_router:routes().
get_paths(LogicHandler) ->
    PreparedPaths = maps:fold(
                      fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
                              [{Path, Handler, Operations} | Acc]
                      end, [], group_paths()
                     ),
    [{'_', [{P, H, {O, LogicHandler}} || {P, H, O} <- PreparedPaths]}].

group_paths() ->
    maps:fold(
      fun(OperationID, #{servers := Servers, base_path := BasePath, path := Path,
                         method := Method, handler := Handler}, Acc) ->
              FullPaths = build_full_paths(Servers, BasePath, Path),
              merge_paths(FullPaths, OperationID, Method, Handler, Acc)
      end, #{}, get_operations()).

build_full_paths([], BasePath, Path) ->
    [lists:append([BasePath, Path])];
build_full_paths(Servers, _BasePath, Path) ->
    [lists:append([Server, Path]) || Server <- Servers ].

merge_paths(FullPaths, OperationID, Method, Handler, Acc) ->
    lists:foldl(
      fun(Path, Acc0) ->
              case maps:find(Path, Acc0) of
                  {ok, PathInfo0 = #{operations := Operations0}} ->
                      Operations = Operations0#{Method => OperationID},
                      PathInfo = PathInfo0#{operations => Operations},
                      Acc0#{Path => PathInfo};
                  error ->
                      Operations = #{Method => OperationID},
                      PathInfo = #{handler => Handler, operations => Operations},
                      Acc0#{Path => PathInfo}
              end
      end, Acc, FullPaths).

get_operations() ->
    #{ 
       'berry_firmness_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-firmness/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'berry_firmness_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-firmness/:id/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'berry_flavor_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-flavor/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'berry_flavor_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-flavor/:id/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'berry_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'berry_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry/:id/",
            method => <<"GET">>,
            handler => 'openapi_berries_handler'
        },
       'contest_effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'contest_effect_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'contest_type_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-type/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'contest_type_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-type/:id/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'super_contest_effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/super-contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'super_contest_effect_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/super-contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_contests_handler'
        },
       'encounter_condition_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'encounter_condition_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'encounter_condition_value_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition-value/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'encounter_condition_value_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition-value/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'encounter_method_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-method/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'encounter_method_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounters_handler'
        },
       'evolution_chain_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-chain/",
            method => <<"GET">>,
            handler => 'openapi_evolution_handler'
        },
       'evolution_chain_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-chain/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_handler'
        },
       'evolution_trigger_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-trigger/",
            method => <<"GET">>,
            handler => 'openapi_evolution_handler'
        },
       'evolution_trigger_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-trigger/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_handler'
        },
       'generation_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/generation/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'generation_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/generation/:id/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'pokedex_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokedex/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'pokedex_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokedex/:id/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'version_group_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version-group/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'version_group_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'version_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'version_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version/:id/",
            method => <<"GET">>,
            handler => 'openapi_games_handler'
        },
       'item_attribute_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-attribute/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_attribute_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-attribute/:id/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_category_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-category/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_category_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_fling_effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-fling-effect/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_fling_effect_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-fling-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_pocket_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-pocket/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_pocket_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-pocket/:id/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'item_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item/:id/",
            method => <<"GET">>,
            handler => 'openapi_items_handler'
        },
       'location_area_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location-area/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'location_area_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'location_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'location_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'pal_park_area_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pal-park-area/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'pal_park_area_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pal-park-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'region_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/region/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'region_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/region/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'machine_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/machine/",
            method => <<"GET">>,
            handler => 'openapi_machines_handler'
        },
       'machine_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/machine/:id/",
            method => <<"GET">>,
            handler => 'openapi_machines_handler'
        },
       'move_ailment_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-ailment/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_ailment_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-ailment/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_battle_style_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-battle-style/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_battle_style_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-battle-style/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_category_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-category/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_category_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_learn_method_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-learn-method/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_learn_method_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-learn-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_target_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-target/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'move_target_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-target/:id/",
            method => <<"GET">>,
            handler => 'openapi_moves_handler'
        },
       'ability_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/ability/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'ability_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/ability/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'characteristic_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/characteristic/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'characteristic_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/characteristic/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'egg_group_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/egg-group/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'egg_group_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/egg-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'gender_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/gender/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'gender_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/gender/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'growth_rate_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/growth-rate/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'growth_rate_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/growth-rate/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'move_damage_class_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-damage-class/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'move_damage_class_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-damage-class/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'nature_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/nature/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'nature_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/nature/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokeathlon_stat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokeathlon-stat/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokeathlon_stat_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokeathlon-stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_color_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-color/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_color_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-color/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_form_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-form/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_form_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-form/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_habitat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-habitat/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_habitat_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-habitat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_shape_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-shape/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_shape_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-shape/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_species_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-species/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_species_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-species/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'stat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/stat/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'stat_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'type_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/type/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'type_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/type/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'language_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/language/",
            method => <<"GET">>,
            handler => 'openapi_utility_handler'
        },
       'language_retrieve' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/language/:id/",
            method => <<"GET">>,
            handler => 'openapi_utility_handler'
        }
    }.
