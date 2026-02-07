-module(openapi_experience).

-export([encode/1]).

-export_type([openapi_experience/0]).

-type openapi_experience() ::
    #{ 'level' := integer(),
       'experience' := integer()
     }.

encode(#{ 'level' := Level,
          'experience' := Experience
        }) ->
    #{ 'level' => Level,
       'experience' => Experience
     }.
