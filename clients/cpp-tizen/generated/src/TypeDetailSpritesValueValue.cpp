#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeDetail_sprites_value_value.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeDetail_sprites_value_value::TypeDetail_sprites_value_value()
{
	//__init();
}

TypeDetail_sprites_value_value::~TypeDetail_sprites_value_value()
{
	//__cleanup();
}

void
TypeDetail_sprites_value_value::__init()
{
	//nameicon = std::string();
}

void
TypeDetail_sprites_value_value::__cleanup()
{
	//if(nameicon != NULL) {
	//
	//delete nameicon;
	//nameicon = NULL;
	//}
	//
}

void
TypeDetail_sprites_value_value::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameiconKey = "name-icon";
	node = json_object_get_member(pJsonObject, nameiconKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&nameicon, node, "std::string", "");
		} else {
			
		}
	}
}

TypeDetail_sprites_value_value::TypeDetail_sprites_value_value(char* json)
{
	this->fromJson(json);
}

char*
TypeDetail_sprites_value_value::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getNameicon();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameiconKey = "name-icon";
	json_object_set_member(pJsonObject, nameiconKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TypeDetail_sprites_value_value::getNameicon()
{
	return nameicon;
}

void
TypeDetail_sprites_value_value::setNameicon(std::string  nameicon)
{
	this->nameicon = nameicon;
}


