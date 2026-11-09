
# Table `StatAffectingNatures`
(mapped from: StatAffectingNatures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**increase** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureSummary&gt;**](NatureSummary.md) | A list of natures and how they change the referenced stat. | 
**decrease** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureSummary&gt;**](NatureSummary.md) | A list of nature sand how they change the referenced stat. | 


# **Table `StatAffectingNaturesNatureSummary`**
(mapped from: StatAffectingNaturesNatureSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statAffectingNatures | statAffectingNatures | long | | kotlin.Long | Primary Key | *one*
natureSummary | natureSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `StatAffectingNaturesNatureSummary`**
(mapped from: StatAffectingNaturesNatureSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statAffectingNatures | statAffectingNatures | long | | kotlin.Long | Primary Key | *one*
natureSummary | natureSummary | long | | kotlin.Long | Foreign Key | *many*



