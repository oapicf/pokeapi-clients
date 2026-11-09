-module(openapi_item_price).

-export([encode/1]).

-export_type([openapi_item_price/0]).

-type openapi_item_price() ::
    #{ 'purchase_price' => integer(),
       'sell_price' => integer(),
       'currency' := openapi_currency_summary:openapi_currency_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary()
     }.

encode(#{ 'purchase_price' := PurchasePrice,
          'sell_price' := SellPrice,
          'currency' := Currency,
          'version_group' := VersionGroup
        }) ->
    #{ 'purchase_price' => PurchasePrice,
       'sell_price' => SellPrice,
       'currency' => Currency,
       'version_group' => VersionGroup
     }.
