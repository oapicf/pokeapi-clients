
# Table `CharacteristicDetail`
(mapped from: CharacteristicDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**geneModulo** | gene_modulo | int NOT NULL |  | **kotlin.Int** |  | 
**possibleValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** |  | 
**highestStat** | highest_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) |  |  [foreignkey]
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) |  | 




# **Table `CharacteristicDetailPossibleValues`**
(mapped from: CharacteristicDetailPossibleValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
characteristicDetail | characteristicDetail | long | | kotlin.Long | Primary Key | *one*
possibleValues | possibleValues | int | | kotlin.Int | Foreign Key | *many*




# **Table `CharacteristicDetailCharacteristicDescription`**
(mapped from: CharacteristicDetailCharacteristicDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
characteristicDetail | characteristicDetail | long | | kotlin.Long | Primary Key | *one*
characteristicDescription | characteristicDescription | long | | kotlin.Long | Foreign Key | *many*



