-module(openapi_pokemon_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/v2/ability/`, OperationId: `ability_list`:
.
Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

- `GET` to `/api/v2/ability/:id/`, OperationId: `ability_retrieve`:
.
Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

- `GET` to `/api/v2/characteristic/`, OperationId: `characteristic_list`:
List charecterictics.
Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

- `GET` to `/api/v2/characteristic/:id/`, OperationId: `characteristic_retrieve`:
Get characteristic.
Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

- `GET` to `/api/v2/egg-group/`, OperationId: `egg_group_list`:
List egg groups.
Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

- `GET` to `/api/v2/egg-group/:id/`, OperationId: `egg_group_retrieve`:
Get egg group.
Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

- `GET` to `/api/v2/gender/`, OperationId: `gender_list`:
List genders.
Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

- `GET` to `/api/v2/gender/:id/`, OperationId: `gender_retrieve`:
Get gender.
Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

- `GET` to `/api/v2/growth-rate/`, OperationId: `growth_rate_list`:
List growth rates.
Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

- `GET` to `/api/v2/growth-rate/:id/`, OperationId: `growth_rate_retrieve`:
Get growth rate.
Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

- `GET` to `/api/v2/move-damage-class/`, OperationId: `move_damage_class_list`:
List move damage classes.
Damage classes moves can have, e.g. physical, special, or non-damaging.

- `GET` to `/api/v2/move-damage-class/:id/`, OperationId: `move_damage_class_retrieve`:
Get move damage class.
Damage classes moves can have, e.g. physical, special, or non-damaging.

- `GET` to `/api/v2/nature/`, OperationId: `nature_list`:
List natures.
Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

- `GET` to `/api/v2/nature/:id/`, OperationId: `nature_retrieve`:
Get nature.
Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

- `GET` to `/api/v2/pokeathlon-stat/`, OperationId: `pokeathlon_stat_list`:
List pokeathlon stats.
Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

- `GET` to `/api/v2/pokeathlon-stat/:id/`, OperationId: `pokeathlon_stat_retrieve`:
Get pokeathlon stat.
Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

- `GET` to `/api/v2/pokemon-color/`, OperationId: `pokemon_color_list`:
List pokemon colors.
Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

- `GET` to `/api/v2/pokemon-color/:id/`, OperationId: `pokemon_color_retrieve`:
Get pokemon color.
Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

- `GET` to `/api/v2/pokemon-form/`, OperationId: `pokemon_form_list`:
List pokemon forms.
Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

- `GET` to `/api/v2/pokemon-form/:id/`, OperationId: `pokemon_form_retrieve`:
Get pokemon form.
Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

- `GET` to `/api/v2/pokemon-habitat/`, OperationId: `pokemon_habitat_list`:
List pokemom habitas.
Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

- `GET` to `/api/v2/pokemon-habitat/:id/`, OperationId: `pokemon_habitat_retrieve`:
Get pokemom habita.
Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

- `GET` to `/api/v2/pokemon/`, OperationId: `pokemon_list`:
List pokemon.
Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

- `GET` to `/api/v2/pokemon/:id/`, OperationId: `pokemon_retrieve`:
Get pokemon.
Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

- `GET` to `/api/v2/pokemon-shape/`, OperationId: `pokemon_shape_list`:
List pokemon shapes.
Shapes used for sorting Pokémon in a Pokédex.

- `GET` to `/api/v2/pokemon-shape/:id/`, OperationId: `pokemon_shape_retrieve`:
Get pokemon shape.
Shapes used for sorting Pokémon in a Pokédex.

- `GET` to `/api/v2/pokemon-species/`, OperationId: `pokemon_species_list`:
List pokemon species.
A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

- `GET` to `/api/v2/pokemon-species/:id/`, OperationId: `pokemon_species_retrieve`:
Get pokemon species.
A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

- `GET` to `/api/v2/stat/`, OperationId: `stat_list`:
List stats.
Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

- `GET` to `/api/v2/stat/:id/`, OperationId: `stat_retrieve`:
Get stat.
Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

- `GET` to `/api/v2/type/`, OperationId: `type_list`:
List types.
Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

- `GET` to `/api/v2/type/:id/`, OperationId: `type_retrieve`:
Get types.
Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'pokemon'.

-type operation_id() ::
    'ability_list' %% 
    | 'ability_retrieve' %% 
    | 'characteristic_list' %% List charecterictics
    | 'characteristic_retrieve' %% Get characteristic
    | 'egg_group_list' %% List egg groups
    | 'egg_group_retrieve' %% Get egg group
    | 'gender_list' %% List genders
    | 'gender_retrieve' %% Get gender
    | 'growth_rate_list' %% List growth rates
    | 'growth_rate_retrieve' %% Get growth rate
    | 'move_damage_class_list' %% List move damage classes
    | 'move_damage_class_retrieve' %% Get move damage class
    | 'nature_list' %% List natures
    | 'nature_retrieve' %% Get nature
    | 'pokeathlon_stat_list' %% List pokeathlon stats
    | 'pokeathlon_stat_retrieve' %% Get pokeathlon stat
    | 'pokemon_color_list' %% List pokemon colors
    | 'pokemon_color_retrieve' %% Get pokemon color
    | 'pokemon_form_list' %% List pokemon forms
    | 'pokemon_form_retrieve' %% Get pokemon form
    | 'pokemon_habitat_list' %% List pokemom habitas
    | 'pokemon_habitat_retrieve' %% Get pokemom habita
    | 'pokemon_list' %% List pokemon
    | 'pokemon_retrieve' %% Get pokemon
    | 'pokemon_shape_list' %% List pokemon shapes
    | 'pokemon_shape_retrieve' %% Get pokemon shape
    | 'pokemon_species_list' %% List pokemon species
    | 'pokemon_species_retrieve' %% Get pokemon species
    | 'stat_list' %% List stats
    | 'stat_retrieve' %% Get stat
    | 'type_list' %% List types
    | 'type_retrieve'. %% Get types


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'ability_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'ability_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'characteristic_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'characteristic_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'egg_group_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'egg_group_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'gender_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'gender_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'growth_rate_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'growth_rate_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_damage_class_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_damage_class_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'nature_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'nature_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokeathlon_stat_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokeathlon_stat_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_color_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_color_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_form_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_form_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_habitat_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_habitat_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_shape_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_shape_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_species_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pokemon_species_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'stat_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'stat_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'type_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'type_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'ability_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'ability_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'characteristic_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'characteristic_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'egg_group_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'egg_group_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'gender_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'gender_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'growth_rate_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'growth_rate_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_damage_class_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_damage_class_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'nature_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'nature_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokeathlon_stat_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokeathlon_stat_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_color_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_color_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_form_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_form_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_habitat_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_habitat_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_shape_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_shape_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_species_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pokemon_species_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'stat_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'stat_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'type_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'type_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'ability_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'ability_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'characteristic_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'characteristic_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'egg_group_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'egg_group_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'gender_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'gender_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'growth_rate_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'growth_rate_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_damage_class_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_damage_class_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'nature_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'nature_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokeathlon_stat_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokeathlon_stat_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_color_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_color_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_form_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_form_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_habitat_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_habitat_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_shape_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_shape_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_species_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pokemon_species_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'stat_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'stat_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'type_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'type_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'ability_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'ability_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'characteristic_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'characteristic_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'egg_group_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'egg_group_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'gender_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'gender_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'growth_rate_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'growth_rate_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_damage_class_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_damage_class_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'nature_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'nature_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokeathlon_stat_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokeathlon_stat_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_color_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_color_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_form_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_form_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_habitat_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_habitat_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_shape_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_shape_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_species_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pokemon_species_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'stat_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'stat_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'type_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'type_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'ability_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'ability_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'characteristic_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'characteristic_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'egg_group_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'egg_group_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'gender_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'gender_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'growth_rate_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'growth_rate_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_damage_class_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_damage_class_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'nature_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'nature_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokeathlon_stat_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokeathlon_stat_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_color_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_color_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_form_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_form_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_habitat_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_habitat_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_shape_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_shape_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_species_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pokemon_species_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'stat_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'stat_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'type_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'type_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(pokemon, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(pokemon, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
