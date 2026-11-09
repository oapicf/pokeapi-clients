#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonShapeAwesomeName.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonShapeAwesomeName::PokemonShapeAwesomeName()
{
	//__init();
}

PokemonShapeAwesomeName::~PokemonShapeAwesomeName()
{
	//__cleanup();
}

void
PokemonShapeAwesomeName::__init()
{
	//awesome_name = std::string();
	//language = null;
}

void
PokemonShapeAwesomeName::__cleanup()
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
PokemonShapeAwesomeName::fromJson(char* jsonStr)
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
	

		if (isprimitive("LanguageSummary")) {
			jsonToValue(&language, node, "LanguageSummary", "LanguageSummary");
		} else {
			
			LanguageSummary* obj = static_cast<LanguageSummary*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonShapeAwesomeName::PokemonShapeAwesomeName(char* json)
{
	this->fromJson(json);
}

char*
PokemonShapeAwesomeName::toJson()
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
PokemonShapeAwesomeName::getAwesomeName()
{
	return awesome_name;
}

void
PokemonShapeAwesomeName::setAwesomeName(std::string  awesome_name)
{
	this->awesome_name = awesome_name;
}

LanguageSummary
PokemonShapeAwesomeName::getLanguage()
{
	return language;
}

void
PokemonShapeAwesomeName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


