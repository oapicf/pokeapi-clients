-module(openapi_move_flavor_text).

-export([encode/1]).

-export_type([openapi_move_flavor_text/0]).

-type openapi_move_flavor_text() ::
    #{ 'flavor_text' := binary(),
       'language' := openapi_language_summary:openapi_language_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary()
     }.

encode(#{ 'flavor_text' := FlavorText,
          'language' := Language,
          'version_group' := VersionGroup
        }) ->
    #{ 'flavor_text' => FlavorText,
       'language' => Language,
       'version_group' => VersionGroup
     }.
