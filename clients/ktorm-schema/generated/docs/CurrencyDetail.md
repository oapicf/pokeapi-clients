
# Table `CurrencyDetail`
(mapped from: CurrencyDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CurrencyName&gt;**](CurrencyName.md) | The name of this resource listed in different languages. |  [readonly]




# **Table `CurrencyDetailCurrencyName`**
(mapped from: CurrencyDetailCurrencyName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
currencyDetail | currencyDetail | long | | kotlin.Long | Primary Key | *one*
currencyName | currencyName | long | | kotlin.Long | Foreign Key | *many*



