#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonColorName.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonColorName::PokemonColorName()
{
	//__init();
}

PokemonColorName::~PokemonColorName()
{
	//__cleanup();
}

void
PokemonColorName::__init()
{
	//name = std::string();
	//language = new LanguageSummary();
}

void
PokemonColorName::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
PokemonColorName::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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

PokemonColorName::PokemonColorName(char* json)
{
	this->fromJson(json);
}

char*
PokemonColorName::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
PokemonColorName::getName()
{
	return name;
}

void
PokemonColorName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
PokemonColorName::getLanguage()
{
	return language;
}

void
PokemonColorName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


