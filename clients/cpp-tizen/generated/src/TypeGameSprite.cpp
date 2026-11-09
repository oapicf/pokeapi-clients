#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeGameSprite.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeGameSprite::TypeGameSprite()
{
	//__init();
}

TypeGameSprite::~TypeGameSprite()
{
	//__cleanup();
}

void
TypeGameSprite::__init()
{
	//name_icon = std::string();
	//symbol_icon = std::string();
}

void
TypeGameSprite::__cleanup()
{
	//if(name_icon != NULL) {
	//
	//delete name_icon;
	//name_icon = NULL;
	//}
	//if(symbol_icon != NULL) {
	//
	//delete symbol_icon;
	//symbol_icon = NULL;
	//}
	//
}

void
TypeGameSprite::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *name_iconKey = "name_icon";
	node = json_object_get_member(pJsonObject, name_iconKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name_icon, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *symbol_iconKey = "symbol_icon";
	node = json_object_get_member(pJsonObject, symbol_iconKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&symbol_icon, node, "std::string", "");
		} else {
			
		}
	}
}

TypeGameSprite::TypeGameSprite(char* json)
{
	this->fromJson(json);
}

char*
TypeGameSprite::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getNameIcon();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *name_iconKey = "name_icon";
	json_object_set_member(pJsonObject, name_iconKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSymbolIcon();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *symbol_iconKey = "symbol_icon";
	json_object_set_member(pJsonObject, symbol_iconKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TypeGameSprite::getNameIcon()
{
	return name_icon;
}

void
TypeGameSprite::setNameIcon(std::string  name_icon)
{
	this->name_icon = name_icon;
}

std::string
TypeGameSprite::getSymbolIcon()
{
	return symbol_icon;
}

void
TypeGameSprite::setSymbolIcon(std::string  symbol_icon)
{
	this->symbol_icon = symbol_icon;
}


