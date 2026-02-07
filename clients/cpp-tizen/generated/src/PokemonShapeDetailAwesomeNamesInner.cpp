#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonShapeDetail_awesome_names_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonShapeDetail_awesome_names_inner::PokemonShapeDetail_awesome_names_inner()
{
	//__init();
}

PokemonShapeDetail_awesome_names_inner::~PokemonShapeDetail_awesome_names_inner()
{
	//__cleanup();
}

void
PokemonShapeDetail_awesome_names_inner::__init()
{
	//awesome_name = std::string();
	//language = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokemonShapeDetail_awesome_names_inner::__cleanup()
{
	//if(awesome_name != NULL) {
	//
	//delete awesome_name;
	//awesome_name = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
PokemonShapeDetail_awesome_names_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *awesome_nameKey = "awesome_name";
	node = json_object_get_member(pJsonObject, awesome_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&awesome_name, node, "std::string", "");
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

PokemonShapeDetail_awesome_names_inner::PokemonShapeDetail_awesome_names_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonShapeDetail_awesome_names_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAwesomeName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *awesome_nameKey = "awesome_name";
	json_object_set_member(pJsonObject, awesome_nameKey, node);
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
PokemonShapeDetail_awesome_names_inner::getAwesomeName()
{
	return awesome_name;
}

void
PokemonShapeDetail_awesome_names_inner::setAwesomeName(std::string  awesome_name)
{
	this->awesome_name = awesome_name;
}

AbilityDetail_pokemon_inner_pokemon
PokemonShapeDetail_awesome_names_inner::getLanguage()
{
	return language;
}

void
PokemonShapeDetail_awesome_names_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}


