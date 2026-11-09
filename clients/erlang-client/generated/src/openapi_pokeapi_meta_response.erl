-module(openapi_pokeapi_meta_response).

-export([encode/1]).

-export_type([openapi_pokeapi_meta_response/0]).

-type openapi_pokeapi_meta_response() ::
    #{ 'deploy_date' := binary(),
       'hash' := binary(),
       'tag' := binary()
     }.

encode(#{ 'deploy_date' := DeployDate,
          'hash' := Hash,
          'tag' := Tag
        }) ->
    #{ 'deploy_date' => DeployDate,
       'hash' => Hash,
       'tag' => Tag
     }.
