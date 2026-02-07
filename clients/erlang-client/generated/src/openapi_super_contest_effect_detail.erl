-module(openapi_super_contest_effect_detail).

-export([encode/1]).

-export_type([openapi_super_contest_effect_detail/0]).

-type openapi_super_contest_effect_detail() ::
    #{ 'id' := integer(),
       'appeal' := integer(),
       'flavor_text_entries' := list(),
       'moves' := list()
     }.

encode(#{ 'id' := Id,
          'appeal' := Appeal,
          'flavor_text_entries' := FlavorTextEntries,
          'moves' := Moves
        }) ->
    #{ 'id' => Id,
       'appeal' => Appeal,
       'flavor_text_entries' => FlavorTextEntries,
       'moves' => Moves
     }.
