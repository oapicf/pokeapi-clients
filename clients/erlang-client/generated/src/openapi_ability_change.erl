-module(openapi_ability_change).

-export([encode/1]).

-export_type([openapi_ability_change/0]).

-type openapi_ability_change() ::
    #{ 'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'effect_entries' := list()
     }.

encode(#{ 'version_group' := VersionGroup,
          'effect_entries' := EffectEntries
        }) ->
    #{ 'version_group' => VersionGroup,
       'effect_entries' => EffectEntries
     }.
