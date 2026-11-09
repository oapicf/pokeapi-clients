#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesGenus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesGenus::PokemonSpeciesGenus()
{
	//__init();
}

PokemonSpeciesGenus::~PokemonSpeciesGenus()
{
	//__cleanup();
}

void
PokemonSpeciesGenus::__init()
{
	//genus = std::string();
	//language = null;
}

void
PokemonSpeciesGenus::__cleanup()
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
PokemonSpeciesGenus::fromJson(char* jsonStr)
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
	

		if (isprimitive("LanguageSummary")) {
			jsonToValue(&language, node, "LanguageSummary", "LanguageSummary");
		} else {
			
			LanguageSummary* obj = static_cast<LanguageSummary*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonSpeciesGenus::PokemonSpeciesGenus(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesGenus::toJson()
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
	if (isprimitive("LanguageSummary")) {
		LanguageSummary obj = getLanguage();
		node = converttoJson(&obj, "LanguageSummary", "");
	}
	else {
		
		LanguageSummary obj = static_cast<LanguageSummary> (getLanguage());
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
PokemonSpeciesGenus::getGenus()
{
	return genus;
}

void
PokemonSpeciesGenus::setGenus(std::string  genus)
{
	this->genus = genus;
}

LanguageSummary
PokemonSpeciesGenus::getLanguage()
{
	return language;
}

void
PokemonSpeciesGenus::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


