-module(openapi_item_flavor_text).

-export([encode/1]).

-export_type([openapi_item_flavor_text/0]).

-type openapi_item_flavor_text() ::
    #{ 'text' := binary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'text' := Text,
          'version_group' := VersionGroup,
          'language' := Language
        }) ->
    #{ 'text' => Text,
       'version_group' => VersionGroup,
       'language' => Language
     }.
