-module(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner).

-export([encode/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner() ::
    #{ 'gender' := openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(),
       'held_item' := openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(),
       'item' := openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(),
       'known_move' := maps:map(),
       'known_move_type' := maps:map(),
       'location' := openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender:openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(),
       'min_affection' := integer(),
       'min_beauty' := integer(),
       'min_happiness' := integer(),
       'min_level' := integer(),
       'needs_overworld_rain' := boolean(),
       'party_species' := binary(),
       'party_type' := binary(),
       'relative_physical_stats' := binary(),
       'time_of_day' := binary(),
       'trade_species' := binary(),
       'trigger' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'turn_upside_down' := boolean()
     }.

encode(#{ 'gender' := Gender,
          'held_item' := HeldItem,
          'item' := Item,
          'known_move' := KnownMove,
          'known_move_type' := KnownMoveType,
          'location' := Location,
          'min_affection' := MinAffection,
          'min_beauty' := MinBeauty,
          'min_happiness' := MinHappiness,
          'min_level' := MinLevel,
          'needs_overworld_rain' := NeedsOverworldRain,
          'party_species' := PartySpecies,
          'party_type' := PartyType,
          'relative_physical_stats' := RelativePhysicalStats,
          'time_of_day' := TimeOfDay,
          'trade_species' := TradeSpecies,
          'trigger' := Trigger,
          'turn_upside_down' := TurnUpsideDown
        }) ->
    #{ 'gender' => Gender,
       'held_item' => HeldItem,
       'item' => Item,
       'known_move' => KnownMove,
       'known_move_type' => KnownMoveType,
       'location' => Location,
       'min_affection' => MinAffection,
       'min_beauty' => MinBeauty,
       'min_happiness' => MinHappiness,
       'min_level' => MinLevel,
       'needs_overworld_rain' => NeedsOverworldRain,
       'party_species' => PartySpecies,
       'party_type' => PartyType,
       'relative_physical_stats' => RelativePhysicalStats,
       'time_of_day' => TimeOfDay,
       'trade_species' => TradeSpecies,
       'trigger' => Trigger,
       'turn_upside_down' => TurnUpsideDown
     }.
