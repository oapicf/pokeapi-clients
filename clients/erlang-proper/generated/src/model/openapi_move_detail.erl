-module(openapi_move_detail).

-include("openapi.hrl").

-export([openapi_move_detail/0]).

-export([openapi_move_detail/1]).

-export_type([openapi_move_detail/0]).

-type openapi_move_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'accuracy', integer() }
  | {'effect_chance', integer() }
  | {'pp', integer() }
  | {'priority', integer() }
  | {'power', integer() }
  | {'contest_combos', openapi_move_detail_contest_combos:openapi_move_detail_contest_combos() }
  | {'contest_type', openapi_contest_type_summary:openapi_contest_type_summary() }
  | {'contest_effect', openapi_contest_effect_summary:openapi_contest_effect_summary() }
  | {'damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
  | {'effect_entries', list(openapi_move_change_effect_entries_inner:openapi_move_change_effect_entries_inner()) }
  | {'effect_changes', list(openapi_move_detail_effect_changes_inner:openapi_move_detail_effect_changes_inner()) }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'meta', openapi_move_meta:openapi_move_meta() }
  | {'names', list(openapi_move_name:openapi_move_name()) }
  | {'past_values', list(openapi_move_change:openapi_move_change()) }
  | {'stat_changes', list(openapi_move_detail_stat_changes_inner:openapi_move_detail_stat_changes_inner()) }
  | {'super_contest_effect', openapi_super_contest_effect_summary:openapi_super_contest_effect_summary() }
  | {'target', openapi_move_target_summary:openapi_move_target_summary() }
  | {'type', openapi_type_summary:openapi_type_summary() }
  | {'machines', list(openapi_move_detail_machines_inner:openapi_move_detail_machines_inner()) }
  | {'flavor_text_entries', list(openapi_move_flavor_text:openapi_move_flavor_text()) }
  | {'learned_by_pokemon', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_move_detail() ->
    openapi_move_detail([]).

openapi_move_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'accuracy', integer() }
            , {'effect_chance', integer() }
            , {'pp', integer() }
            , {'priority', integer() }
            , {'power', integer() }
            , {'contest_combos', openapi_move_detail_contest_combos:openapi_move_detail_contest_combos() }
            , {'contest_type', openapi_contest_type_summary:openapi_contest_type_summary() }
            , {'contest_effect', openapi_contest_effect_summary:openapi_contest_effect_summary() }
            , {'damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
            , {'effect_entries', list(openapi_move_change_effect_entries_inner:openapi_move_change_effect_entries_inner()) }
            , {'effect_changes', list(openapi_move_detail_effect_changes_inner:openapi_move_detail_effect_changes_inner()) }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'meta', openapi_move_meta:openapi_move_meta() }
            , {'names', list(openapi_move_name:openapi_move_name()) }
            , {'past_values', list(openapi_move_change:openapi_move_change()) }
            , {'stat_changes', list(openapi_move_detail_stat_changes_inner:openapi_move_detail_stat_changes_inner()) }
            , {'super_contest_effect', openapi_super_contest_effect_summary:openapi_super_contest_effect_summary() }
            , {'target', openapi_move_target_summary:openapi_move_target_summary() }
            , {'type', openapi_type_summary:openapi_type_summary() }
            , {'machines', list(openapi_move_detail_machines_inner:openapi_move_detail_machines_inner()) }
            , {'flavor_text_entries', list(openapi_move_flavor_text:openapi_move_flavor_text()) }
            , {'learned_by_pokemon', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

