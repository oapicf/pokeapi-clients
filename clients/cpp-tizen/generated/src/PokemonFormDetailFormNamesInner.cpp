#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonFormDetail_form_names_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonFormDetail_form_names_inner::PokemonFormDetail_form_names_inner()
{
	//__init();
}

PokemonFormDetail_form_names_inner::~PokemonFormDetail_form_names_inner()
{
	//__cleanup();
}

void
PokemonFormDetail_form_names_inner::__init()
{
	//language = new AbilityDetail_pokemon_inner_pokemon();
	//name = std::string();
}

void
PokemonFormDetail_form_names_inner::__cleanup()
{
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
PokemonFormDetail_form_names_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonFormDetail_form_names_inner::PokemonFormDetail_form_names_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonFormDetail_form_names_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
PokemonFormDetail_form_names_inner::getLanguage()
{
	return language;
}

void
PokemonFormDetail_form_names_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}

std::string
PokemonFormDetail_form_names_inner::getName()
{
	return name;
}

void
PokemonFormDetail_form_names_inner::setName(std::string  name)
{
	this->name = name;
}


