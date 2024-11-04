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
       'ability_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/ability/",
            method => <<"GET">>,
            handler => 'openapi_ability_handler'
        },
       'ability_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/ability/:id/",
            method => <<"GET">>,
            handler => 'openapi_ability_handler'
        },
       'berry_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry/",
            method => <<"GET">>,
            handler => 'openapi_berry_handler'
        },
       'berry_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_handler'
        },
       'berry-firmness_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-firmness/",
            method => <<"GET">>,
            handler => 'openapi_berry_firmness_handler'
        },
       'berry-firmness_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-firmness/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_firmness_handler'
        },
       'berry-flavor_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-flavor/",
            method => <<"GET">>,
            handler => 'openapi_berry_flavor_handler'
        },
       'berry-flavor_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/berry-flavor/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_flavor_handler'
        },
       'characteristic_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/characteristic/",
            method => <<"GET">>,
            handler => 'openapi_characteristic_handler'
        },
       'characteristic_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/characteristic/:id/",
            method => <<"GET">>,
            handler => 'openapi_characteristic_handler'
        },
       'contest-effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_contest_effect_handler'
        },
       'contest-effect_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_contest_effect_handler'
        },
       'contest-type_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-type/",
            method => <<"GET">>,
            handler => 'openapi_contest_type_handler'
        },
       'contest-type_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/contest-type/:id/",
            method => <<"GET">>,
            handler => 'openapi_contest_type_handler'
        },
       'egg-group_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/egg-group/",
            method => <<"GET">>,
            handler => 'openapi_egg_group_handler'
        },
       'egg-group_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/egg-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_egg_group_handler'
        },
       'encounter-condition_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_handler'
        },
       'encounter-condition_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_handler'
        },
       'encounter-condition-value_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition-value/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_value_handler'
        },
       'encounter-condition-value_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-condition-value/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_value_handler'
        },
       'encounter-method_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-method/",
            method => <<"GET">>,
            handler => 'openapi_encounter_method_handler'
        },
       'encounter-method_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/encounter-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_method_handler'
        },
       'evolution-chain_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-chain/",
            method => <<"GET">>,
            handler => 'openapi_evolution_chain_handler'
        },
       'evolution-chain_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-chain/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_chain_handler'
        },
       'evolution-trigger_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-trigger/",
            method => <<"GET">>,
            handler => 'openapi_evolution_trigger_handler'
        },
       'evolution-trigger_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/evolution-trigger/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_trigger_handler'
        },
       'gender_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/gender/",
            method => <<"GET">>,
            handler => 'openapi_gender_handler'
        },
       'gender_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/gender/:id/",
            method => <<"GET">>,
            handler => 'openapi_gender_handler'
        },
       'generation_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/generation/",
            method => <<"GET">>,
            handler => 'openapi_generation_handler'
        },
       'generation_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/generation/:id/",
            method => <<"GET">>,
            handler => 'openapi_generation_handler'
        },
       'growth-rate_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/growth-rate/",
            method => <<"GET">>,
            handler => 'openapi_growth_rate_handler'
        },
       'growth-rate_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/growth-rate/:id/",
            method => <<"GET">>,
            handler => 'openapi_growth_rate_handler'
        },
       'item_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item/",
            method => <<"GET">>,
            handler => 'openapi_item_handler'
        },
       'item_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_handler'
        },
       'item-attribute_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-attribute/",
            method => <<"GET">>,
            handler => 'openapi_item_attribute_handler'
        },
       'item-attribute_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-attribute/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_attribute_handler'
        },
       'item-category_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-category/",
            method => <<"GET">>,
            handler => 'openapi_item_category_handler'
        },
       'item-category_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_category_handler'
        },
       'item-fling-effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-fling-effect/",
            method => <<"GET">>,
            handler => 'openapi_item_fling_effect_handler'
        },
       'item-fling-effect_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-fling-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_fling_effect_handler'
        },
       'item-pocket_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-pocket/",
            method => <<"GET">>,
            handler => 'openapi_item_pocket_handler'
        },
       'item-pocket_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/item-pocket/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_pocket_handler'
        },
       'language_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/language/",
            method => <<"GET">>,
            handler => 'openapi_language_handler'
        },
       'language_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/language/:id/",
            method => <<"GET">>,
            handler => 'openapi_language_handler'
        },
       'location_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'location_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'location-area_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location-area/",
            method => <<"GET">>,
            handler => 'openapi_location_area_handler'
        },
       'location-area_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/location-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_area_handler'
        },
       'machine_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/machine/",
            method => <<"GET">>,
            handler => 'openapi_machine_handler'
        },
       'machine_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/machine/:id/",
            method => <<"GET">>,
            handler => 'openapi_machine_handler'
        },
       'move_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move/",
            method => <<"GET">>,
            handler => 'openapi_move_handler'
        },
       'move_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_handler'
        },
       'move-ailment_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-ailment/",
            method => <<"GET">>,
            handler => 'openapi_move_ailment_handler'
        },
       'move-ailment_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-ailment/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_ailment_handler'
        },
       'move-battle-style_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-battle-style/",
            method => <<"GET">>,
            handler => 'openapi_move_battle_style_handler'
        },
       'move-battle-style_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-battle-style/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_battle_style_handler'
        },
       'move-category_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-category/",
            method => <<"GET">>,
            handler => 'openapi_move_category_handler'
        },
       'move-category_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_category_handler'
        },
       'move-damage-class_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-damage-class/",
            method => <<"GET">>,
            handler => 'openapi_move_damage_class_handler'
        },
       'move-damage-class_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-damage-class/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_damage_class_handler'
        },
       'move-learn-method_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-learn-method/",
            method => <<"GET">>,
            handler => 'openapi_move_learn_method_handler'
        },
       'move-learn-method_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-learn-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_learn_method_handler'
        },
       'move-target_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-target/",
            method => <<"GET">>,
            handler => 'openapi_move_target_handler'
        },
       'move-target_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/move-target/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_target_handler'
        },
       'nature_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/nature/",
            method => <<"GET">>,
            handler => 'openapi_nature_handler'
        },
       'nature_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/nature/:id/",
            method => <<"GET">>,
            handler => 'openapi_nature_handler'
        },
       'pal-park-area_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pal-park-area/",
            method => <<"GET">>,
            handler => 'openapi_pal_park_area_handler'
        },
       'pal-park-area_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pal-park-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_pal_park_area_handler'
        },
       'pokeathlon-stat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokeathlon-stat/",
            method => <<"GET">>,
            handler => 'openapi_pokeathlon_stat_handler'
        },
       'pokeathlon-stat_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokeathlon-stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokeathlon_stat_handler'
        },
       'pokedex_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokedex/",
            method => <<"GET">>,
            handler => 'openapi_pokedex_handler'
        },
       'pokedex_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokedex/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokedex_handler'
        },
       'pokemon_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
       'pokemon-color_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-color/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_color_handler'
        },
       'pokemon-color_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-color/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_color_handler'
        },
       'pokemon-form_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-form/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_form_handler'
        },
       'pokemon-form_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-form/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_form_handler'
        },
       'pokemon-habitat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-habitat/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_habitat_handler'
        },
       'pokemon-habitat_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-habitat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_habitat_handler'
        },
       'pokemon-shape_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-shape/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_shape_handler'
        },
       'pokemon-shape_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-shape/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_shape_handler'
        },
       'pokemon-species_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-species/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_species_handler'
        },
       'pokemon-species_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/pokemon-species/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_species_handler'
        },
       'region_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/region/",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
       'region_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/region/:id/",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
       'stat_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/stat/",
            method => <<"GET">>,
            handler => 'openapi_stat_handler'
        },
       'stat_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_stat_handler'
        },
       'super-contest-effect_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/super-contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_super_contest_effect_handler'
        },
       'super-contest-effect_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/super-contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_super_contest_effect_handler'
        },
       'type_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/type/",
            method => <<"GET">>,
            handler => 'openapi_type_handler'
        },
       'type_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/type/:id/",
            method => <<"GET">>,
            handler => 'openapi_type_handler'
        },
       'version_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version/",
            method => <<"GET">>,
            handler => 'openapi_version_handler'
        },
       'version_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version/:id/",
            method => <<"GET">>,
            handler => 'openapi_version_handler'
        },
       'version-group_list' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version-group/",
            method => <<"GET">>,
            handler => 'openapi_version_group_handler'
        },
       'version-group_read' => #{
            servers => [],
            base_path => "",
            path => "/api/v2/version-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_version_group_handler'
        }
    }.
