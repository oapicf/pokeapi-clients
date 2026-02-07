#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesDetail_genera_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesDetail_genera_inner::PokemonSpeciesDetail_genera_inner()
{
	//__init();
}

PokemonSpeciesDetail_genera_inner::~PokemonSpeciesDetail_genera_inner()
{
	//__cleanup();
}

void
PokemonSpeciesDetail_genera_inner::__init()
{
	//genus = std::string();
	//language = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokemonSpeciesDetail_genera_inner::__cleanup()
{
	//if(genus != NULL) {
	//
	//delete genus;
	//genus = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
PokemonSpeciesDetail_genera_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *genusKey = "genus";
	node = json_object_get_member(pJsonObject, genusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&genus, node, "std::string", "");
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

PokemonSpeciesDetail_genera_inner::PokemonSpeciesDetail_genera_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesDetail_genera_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getGenus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *genusKey = "genus";
	json_object_set_member(pJsonObject, genusKey, node);
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
PokemonSpeciesDetail_genera_inner::getGenus()
{
	return genus;
}

void
PokemonSpeciesDetail_genera_inner::setGenus(std::string  genus)
{
	this->genus = genus;
}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_genera_inner::getLanguage()
{
	return language;
}

void
PokemonSpeciesDetail_genera_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}


