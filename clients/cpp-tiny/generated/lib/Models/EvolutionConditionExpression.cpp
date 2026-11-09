

#include "EvolutionConditionExpression.h"

using namespace Tiny;

EvolutionConditionExpression::EvolutionConditionExpression()
{
	expression = std::string();
	percentage_chance = float(0);
	variables = std::list<EvolutionVariableSummary>();
}

EvolutionConditionExpression::EvolutionConditionExpression(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionConditionExpression::~EvolutionConditionExpression()
{

}

void
EvolutionConditionExpression::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *expressionKey = "expression";

    if(object.has_key(expressionKey))
    {
        bourne::json value = object[expressionKey];



        jsonToValue(&expression, value, "std::string");


    }

    const char *percentage_chanceKey = "percentage_chance";

    if(object.has_key(percentage_chanceKey))
    {
        bourne::json value = object[percentage_chanceKey];



        jsonToValue(&percentage_chance, value, "double");


    }

    const char *variablesKey = "variables";

    if(object.has_key(variablesKey))
    {
        bourne::json value = object[variablesKey];


        std::list<EvolutionVariableSummary> variables_list;
        EvolutionVariableSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            variables_list.push_back(element);
        }
        variables = variables_list;


    }


}

bourne::json
EvolutionConditionExpression::toJson()
{
    bourne::json object = bourne::json::object();





    object["expression"] = getExpression();






    object["percentage_chance"] = getPercentageChance();





    std::list<EvolutionVariableSummary> variables_list = getVariables();
    bourne::json variables_arr = bourne::json::array();

    for(auto& var : variables_list)
    {
        EvolutionVariableSummary obj = var;
        variables_arr.append(obj.toJson());
    }
    object["variables"] = variables_arr;




    return object;

}

std::string
EvolutionConditionExpression::getExpression()
{
	return expression;
}

void
EvolutionConditionExpression::setExpression(std::string expression)
{
	this->expression = expression;
}

double
EvolutionConditionExpression::getPercentageChance()
{
	return percentage_chance;
}

void
EvolutionConditionExpression::setPercentageChance(double percentage_chance)
{
	this->percentage_chance = percentage_chance;
}

std::list<EvolutionVariableSummary>
EvolutionConditionExpression::getVariables()
{
	return variables;
}

void
EvolutionConditionExpression::setVariables(std::list<EvolutionVariableSummary> variables)
{
	this->variables = variables;
}



