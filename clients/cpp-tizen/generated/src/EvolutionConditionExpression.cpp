#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionConditionExpression.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionConditionExpression::EvolutionConditionExpression()
{
	//__init();
}

EvolutionConditionExpression::~EvolutionConditionExpression()
{
	//__cleanup();
}

void
EvolutionConditionExpression::__init()
{
	//expression = std::string();
	//percentage_chance = double(0);
	//new std::list()std::list> variables;
}

void
EvolutionConditionExpression::__cleanup()
{
	//if(expression != NULL) {
	//
	//delete expression;
	//expression = NULL;
	//}
	//if(percentage_chance != NULL) {
	//
	//delete percentage_chance;
	//percentage_chance = NULL;
	//}
	//if(variables != NULL) {
	//variables.RemoveAll(true);
	//delete variables;
	//variables = NULL;
	//}
	//
}

void
EvolutionConditionExpression::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *expressionKey = "expression";
	node = json_object_get_member(pJsonObject, expressionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&expression, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *percentage_chanceKey = "percentage_chance";
	node = json_object_get_member(pJsonObject, percentage_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&percentage_chance, node, "double", "");
		} else {
			
		}
	}
	const gchar *variablesKey = "variables";
	node = json_object_get_member(pJsonObject, variablesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EvolutionVariableSummary> new_list;
			EvolutionVariableSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionVariableSummary")) {
					jsonToValue(&inst, temp_json, "EvolutionVariableSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			variables = new_list;
		}
		
	}
}

EvolutionConditionExpression::EvolutionConditionExpression(char* json)
{
	this->fromJson(json);
}

char*
EvolutionConditionExpression::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getExpression();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *expressionKey = "expression";
	json_object_set_member(pJsonObject, expressionKey, node);
	if (isprimitive("double")) {
		double obj = getPercentageChance();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *percentage_chanceKey = "percentage_chance";
	json_object_set_member(pJsonObject, percentage_chanceKey, node);
	if (isprimitive("EvolutionVariableSummary")) {
		list<EvolutionVariableSummary> new_list = static_cast<list <EvolutionVariableSummary> > (getVariables());
		node = converttoJson(&new_list, "EvolutionVariableSummary", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionVariableSummary> new_list = static_cast<list <EvolutionVariableSummary> > (getVariables());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionVariableSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionVariableSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *variablesKey = "variables";
	json_object_set_member(pJsonObject, variablesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
EvolutionConditionExpression::getExpression()
{
	return expression;
}

void
EvolutionConditionExpression::setExpression(std::string  expression)
{
	this->expression = expression;
}

double
EvolutionConditionExpression::getPercentageChance()
{
	return percentage_chance;
}

void
EvolutionConditionExpression::setPercentageChance(double  percentage_chance)
{
	this->percentage_chance = percentage_chance;
}

std::list<EvolutionVariableSummary>
EvolutionConditionExpression::getVariables()
{
	return variables;
}

void
EvolutionConditionExpression::setVariables(std::list <EvolutionVariableSummary> variables)
{
	this->variables = variables;
}


