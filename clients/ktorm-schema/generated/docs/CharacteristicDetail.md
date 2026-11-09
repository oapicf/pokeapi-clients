
# Table `CharacteristicDetail`
(mapped from: CharacteristicDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**geneModulo** | gene_modulo | int NOT NULL |  | **kotlin.Int** | The remainder of the highest stat/IV divided by 5. | 
**possibleValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. |  [readonly]
**highestStat** | highest_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. |  [foreignkey]
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. |  [readonly]




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



