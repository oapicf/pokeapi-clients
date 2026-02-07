#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CharacteristicDescription.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CharacteristicDescription::CharacteristicDescription()
{
	//__init();
}

CharacteristicDescription::~CharacteristicDescription()
{
	//__cleanup();
}

void
CharacteristicDescription::__init()
{
	//description = std::string();
	//language = new LanguageSummary();
}

void
CharacteristicDescription::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
CharacteristicDescription::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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

CharacteristicDescription::CharacteristicDescription(char* json)
{
	this->fromJson(json);
}

char*
CharacteristicDescription::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
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
CharacteristicDescription::getDescription()
{
	return description;
}

void
CharacteristicDescription::setDescription(std::string  description)
{
	this->description = description;
}

LanguageSummary
CharacteristicDescription::getLanguage()
{
	return language;
}

void
CharacteristicDescription::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


