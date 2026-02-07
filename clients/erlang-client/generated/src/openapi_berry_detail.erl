-module(openapi_berry_detail).

-export([encode/1]).

-export_type([openapi_berry_detail/0]).

-type openapi_berry_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'growth_time' := integer(),
       'max_harvest' := integer(),
       'natural_gift_power' := integer(),
       'size' := integer(),
       'smoothness' := integer(),
       'soil_dryness' := integer(),
       'firmness' := openapi_berry_firmness_summary:openapi_berry_firmness_summary(),
       'flavors' := list(),
       'item' := openapi_item_summary:openapi_item_summary(),
       'natural_gift_type' := openapi_type_summary:openapi_type_summary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'growth_time' := GrowthTime,
          'max_harvest' := MaxHarvest,
          'natural_gift_power' := NaturalGiftPower,
          'size' := Size,
          'smoothness' := Smoothness,
          'soil_dryness' := SoilDryness,
          'firmness' := Firmness,
          'flavors' := Flavors,
          'item' := Item,
          'natural_gift_type' := NaturalGiftType
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'growth_time' => GrowthTime,
       'max_harvest' => MaxHarvest,
       'natural_gift_power' => NaturalGiftPower,
       'size' => Size,
       'smoothness' => Smoothness,
       'soil_dryness' => SoilDryness,
       'firmness' => Firmness,
       'flavors' => Flavors,
       'item' => Item,
       'natural_gift_type' => NaturalGiftType
     }.
