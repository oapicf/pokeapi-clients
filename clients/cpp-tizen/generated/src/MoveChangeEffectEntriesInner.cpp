#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveChange_effect_entries_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveChange_effect_entries_inner::MoveChange_effect_entries_inner()
{
	//__init();
}

MoveChange_effect_entries_inner::~MoveChange_effect_entries_inner()
{
	//__cleanup();
}

void
MoveChange_effect_entries_inner::__init()
{
	//effect = std::string();
	//short_effect = std::string();
	//language = new AbilityDetail_pokemon_inner_pokemon();
}

void
MoveChange_effect_entries_inner::__cleanup()
{
	//if(effect != NULL) {
	//
	//delete effect;
	//effect = NULL;
	//}
	//if(short_effect != NULL) {
	//
	//delete short_effect;
	//short_effect = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
MoveChange_effect_entries_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *effectKey = "effect";
	node = json_object_get_member(pJsonObject, effectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&effect, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *short_effectKey = "short_effect";
	node = json_object_get_member(pJsonObject, short_effectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&short_effect, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&language, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveChange_effect_entries_inner::MoveChange_effect_entries_inner(char* json)
{
	this->fromJson(json);
}

char*
MoveChange_effect_entries_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEffect();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *effectKey = "effect";
	json_object_set_member(pJsonObject, effectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShortEffect();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *short_effectKey = "short_effect";
	json_object_set_member(pJsonObject, short_effectKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getLanguage();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MoveChange_effect_entries_inner::getEffect()
{
	return effect;
}

void
MoveChange_effect_entries_inner::setEffect(std::string  effect)
{
	this->effect = effect;
}

std::string
MoveChange_effect_entries_inner::getShortEffect()
{
	return short_effect;
}

void
MoveChange_effect_entries_inner::setShortEffect(std::string  short_effect)
{
	this->short_effect = short_effect;
}

AbilityDetail_pokemon_inner_pokemon
MoveChange_effect_entries_inner::getLanguage()
{
	return language;
}

void
MoveChange_effect_entries_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}


