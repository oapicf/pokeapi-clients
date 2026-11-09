# openapi::ItemPrice


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchase_price** | **integer** | The purchase price in this currency and version group, or null if unavailable. | [optional] [Max: 2147483647] [Min: -2147483648] 
**sell_price** | **integer** | The sell price in this currency and version group, or null if unavailable. | [optional] [Max: 2147483647] [Min: -2147483648] 
**currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. | 


