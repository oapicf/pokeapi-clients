#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemEffectText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemEffectText::ItemEffectText()
{
	//__init();
}

ItemEffectText::~ItemEffectText()
{
	//__cleanup();
}

void
ItemEffectText::__init()
{
	//effect = std::string();
	//short_effect = std::string();
	//language = new LanguageSummary();
}

void
ItemEffectText::__cleanup()
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
ItemEffectText::fromJson(char* jsonStr)
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
	

		if (isprimitive("LanguageSummary")) {
			jsonToValue(&language, node, "LanguageSummary", "LanguageSummary");
		} else {
			
			LanguageSummary* obj = static_cast<LanguageSummary*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemEffectText::ItemEffectText(char* json)
{
	this->fromJson(json);
}

char*
ItemEffectText::toJson()
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
ItemEffectText::getEffect()
{
	return effect;
}

void
ItemEffectText::setEffect(std::string  effect)
{
	this->effect = effect;
}

std::string
ItemEffectText::getShortEffect()
{
	return short_effect;
}

void
ItemEffectText::setShortEffect(std::string  short_effect)
{
	this->short_effect = short_effect;
}

LanguageSummary
ItemEffectText::getLanguage()
{
	return language;
}

void
ItemEffectText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


