#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonFormTriggerCondition.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonFormTriggerCondition::PokemonFormTriggerCondition()
{
	//__init();
}

PokemonFormTriggerCondition::~PokemonFormTriggerCondition()
{
	//__cleanup();
}

void
PokemonFormTriggerCondition::__init()
{
	//trigger = std::string();
	//name = std::string();
	//url = std::string();
	//base_form = null;
}

void
PokemonFormTriggerCondition::__cleanup()
{
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(base_form != NULL) {
	//
	//delete base_form;
	//base_form = NULL;
	//}
	//
}

void
PokemonFormTriggerCondition::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trigger, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *base_formKey = "base_form";
	node = json_object_get_member(pJsonObject, base_formKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonFormSummary")) {
			jsonToValue(&base_form, node, "PokemonFormSummary", "PokemonFormSummary");
		} else {
			
			PokemonFormSummary* obj = static_cast<PokemonFormSummary*> (&base_form);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonFormTriggerCondition::PokemonFormTriggerCondition(char* json)
{
	this->fromJson(json);
}

char*
PokemonFormTriggerCondition::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTrigger();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("PokemonFormSummary")) {
		PokemonFormSummary obj = getBaseForm();
		node = converttoJson(&obj, "PokemonFormSummary", "");
	}
	else {
		
		PokemonFormSummary obj = static_cast<PokemonFormSummary> (getBaseForm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *base_formKey = "base_form";
	json_object_set_member(pJsonObject, base_formKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonFormTriggerCondition::getTrigger()
{
	return trigger;
}

void
PokemonFormTriggerCondition::setTrigger(std::string  trigger)
{
	this->trigger = trigger;
}

std::string
PokemonFormTriggerCondition::getName()
{
	return name;
}

void
PokemonFormTriggerCondition::setName(std::string  name)
{
	this->name = name;
}

std::string
PokemonFormTriggerCondition::getUrl()
{
	return url;
}

void
PokemonFormTriggerCondition::setUrl(std::string  url)
{
	this->url = url;
}

PokemonFormSummary
PokemonFormTriggerCondition::getBaseForm()
{
	return base_form;
}

void
PokemonFormTriggerCondition::setBaseForm(PokemonFormSummary  base_form)
{
	this->base_form = base_form;
}


