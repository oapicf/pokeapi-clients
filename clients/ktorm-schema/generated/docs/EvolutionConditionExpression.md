
# Table `EvolutionConditionExpression`
(mapped from: EvolutionConditionExpression)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**expression** | expression | text NOT NULL |  | **kotlin.String** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) | 
**percentageChance** | percentage_chance | double NOT NULL |  | **kotlin.Double** | Percentage chance of evolution under this condition (0-100) | 
**variables** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionVariableSummary&gt;**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | 




# **Table `EvolutionConditionExpressionEvolutionVariableSummary`**
(mapped from: EvolutionConditionExpressionEvolutionVariableSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionConditionExpression | evolutionConditionExpression | long | | kotlin.Long | Primary Key | *one*
evolutionVariableSummary | evolutionVariableSummary | long | | kotlin.Long | Foreign Key | *many*



