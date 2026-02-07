-module(openapi_language_detail).

-export([encode/1]).

-export_type([openapi_language_detail/0]).

-type openapi_language_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'official' => boolean(),
       'iso639' := binary(),
       'iso3166' := binary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'official' := Official,
          'iso639' := Iso639,
          'iso3166' := Iso3166,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'official' => Official,
       'iso639' => Iso639,
       'iso3166' => Iso3166,
       'names' => Names
     }.
