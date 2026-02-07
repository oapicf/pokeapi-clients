#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ContestEffectFlavorText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ContestEffectFlavorText::ContestEffectFlavorText()
{
	//__init();
}

ContestEffectFlavorText::~ContestEffectFlavorText()
{
	//__cleanup();
}

void
ContestEffectFlavorText::__init()
{
	//flavor_text = std::string();
	//language = new LanguageSummary();
}

void
ContestEffectFlavorText::__cleanup()
{
	//if(flavor_text != NULL) {
	//
	//delete flavor_text;
	//flavor_text = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
ContestEffectFlavorText::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *flavor_textKey = "flavor_text";
	node = json_object_get_member(pJsonObject, flavor_textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&flavor_text, node, "std::string", "");
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

ContestEffectFlavorText::ContestEffectFlavorText(char* json)
{
	this->fromJson(json);
}

char*
ContestEffectFlavorText::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFlavorText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *flavor_textKey = "flavor_text";
	json_object_set_member(pJsonObject, flavor_textKey, node);
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
ContestEffectFlavorText::getFlavorText()
{
	return flavor_text;
}

void
ContestEffectFlavorText::setFlavorText(std::string  flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
ContestEffectFlavorText::getLanguage()
{
	return language;
}

void
ContestEffectFlavorText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


