#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SuperContestEffectFlavorText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SuperContestEffectFlavorText::SuperContestEffectFlavorText()
{
	//__init();
}

SuperContestEffectFlavorText::~SuperContestEffectFlavorText()
{
	//__cleanup();
}

void
SuperContestEffectFlavorText::__init()
{
	//flavor_text = std::string();
	//language = new LanguageSummary();
}

void
SuperContestEffectFlavorText::__cleanup()
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
SuperContestEffectFlavorText::fromJson(char* jsonStr)
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

SuperContestEffectFlavorText::SuperContestEffectFlavorText(char* json)
{
	this->fromJson(json);
}

char*
SuperContestEffectFlavorText::toJson()
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
SuperContestEffectFlavorText::getFlavorText()
{
	return flavor_text;
}

void
SuperContestEffectFlavorText::setFlavorText(std::string  flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
SuperContestEffectFlavorText::getLanguage()
{
	return language;
}

void
SuperContestEffectFlavorText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


