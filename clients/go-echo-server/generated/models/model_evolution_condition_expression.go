package models

type EvolutionConditionExpression struct {

	// Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
	Expression string `json:"expression"`

	// Percentage chance of evolution under this condition (0-100)
	PercentageChance *float64 `json:"percentage_chance"`

	// Evolution variables referenced in the expression
	Variables []EvolutionVariableSummary `json:"variables"`
}
