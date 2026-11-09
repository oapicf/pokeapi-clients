#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonAbilityPast.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonAbilityPast::PokemonAbilityPast()
{
	//__init();
}

PokemonAbilityPast::~PokemonAbilityPast()
{
	//__cleanup();
}

void
PokemonAbilityPast::__init()
{
	//is_hidden = bool(false);
	//slot = int(0);
	//ability = null;
}

void
PokemonAbilityPast::__cleanup()
{
	//if(is_hidden != NULL) {
	//
	//delete is_hidden;
	//is_hidden = NULL;
	//}
	//if(slot != NULL) {
	//
	//delete slot;
	//slot = NULL;
	//}
	//if(ability != NULL) {
	//
	//delete ability;
	//ability = NULL;
	//}
	//
}

void
PokemonAbilityPast::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_hiddenKey = "is_hidden";
	node = json_object_get_member(pJsonObject, is_hiddenKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_hidden, node, "bool", "");
		} else {
			
		}
	}
	const gchar *slotKey = "slot";
	node = json_object_get_member(pJsonObject, slotKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&slot, node, "int", "");
		} else {
			
		}
	}
	const gchar *abilityKey = "ability";
	node = json_object_get_member(pJsonObject, abilityKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilitySummary")) {
			jsonToValue(&ability, node, "AbilitySummary", "AbilitySummary");
		} else {
			
			AbilitySummary* obj = static_cast<AbilitySummary*> (&ability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonAbilityPast::PokemonAbilityPast(char* json)
{
	this->fromJson(json);
}

char*
PokemonAbilityPast::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsHidden();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_hiddenKey = "is_hidden";
	json_object_set_member(pJsonObject, is_hiddenKey, node);
	if (isprimitive("int")) {
		int obj = getSlot();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *slotKey = "slot";
	json_object_set_member(pJsonObject, slotKey, node);
	if (isprimitive("AbilitySummary")) {
		AbilitySummary obj = getAbility();
		node = converttoJson(&obj, "AbilitySummary", "");
	}
	else {
		
		AbilitySummary obj = static_cast<AbilitySummary> (getAbility());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *abilityKey = "ability";
	json_object_set_member(pJsonObject, abilityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
PokemonAbilityPast::getIsHidden()
{
	return is_hidden;
}

void
PokemonAbilityPast::setIsHidden(bool  is_hidden)
{
	this->is_hidden = is_hidden;
}

int
PokemonAbilityPast::getSlot()
{
	return slot;
}

void
PokemonAbilityPast::setSlot(int  slot)
{
	this->slot = slot;
}

AbilitySummary
PokemonAbilityPast::getAbility()
{
	return ability;
}

void
PokemonAbilityPast::setAbility(AbilitySummary  ability)
{
	this->ability = ability;
}


