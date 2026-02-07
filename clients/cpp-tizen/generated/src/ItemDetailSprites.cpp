#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDetail_sprites.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDetail_sprites::ItemDetail_sprites()
{
	//__init();
}

ItemDetail_sprites::~ItemDetail_sprites()
{
	//__cleanup();
}

void
ItemDetail_sprites::__init()
{
	//r_default = std::string();
}

void
ItemDetail_sprites::__cleanup()
{
	//if(r_default != NULL) {
	//
	//delete r_default;
	//r_default = NULL;
	//}
	//
}

void
ItemDetail_sprites::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *r_defaultKey = "default";
	node = json_object_get_member(pJsonObject, r_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&r_default, node, "std::string", "");
		} else {
			
		}
	}
}

ItemDetail_sprites::ItemDetail_sprites(char* json)
{
	this->fromJson(json);
}

char*
ItemDetail_sprites::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRDefault();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *r_defaultKey = "default";
	json_object_set_member(pJsonObject, r_defaultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemDetail_sprites::getRDefault()
{
	return r_default;
}

void
ItemDetail_sprites::setRDefault(std::string  r_default)
{
	this->r_default = r_default;
}


