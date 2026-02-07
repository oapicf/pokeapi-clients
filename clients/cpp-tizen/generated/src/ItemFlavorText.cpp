#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemFlavorText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemFlavorText::ItemFlavorText()
{
	//__init();
}

ItemFlavorText::~ItemFlavorText()
{
	//__cleanup();
}

void
ItemFlavorText::__init()
{
	//text = std::string();
	//version_group = new VersionGroupSummary();
	//language = new LanguageSummary();
}

void
ItemFlavorText::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
ItemFlavorText::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
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

ItemFlavorText::ItemFlavorText(char* json)
{
	this->fromJson(json);
}

char*
ItemFlavorText::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
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
ItemFlavorText::getText()
{
	return text;
}

void
ItemFlavorText::setText(std::string  text)
{
	this->text = text;
}

VersionGroupSummary
ItemFlavorText::getVersionGroup()
{
	return version_group;
}

void
ItemFlavorText::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

LanguageSummary
ItemFlavorText::getLanguage()
{
	return language;
}

void
ItemFlavorText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}


