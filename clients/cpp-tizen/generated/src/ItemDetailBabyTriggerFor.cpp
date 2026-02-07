#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDetail_baby_trigger_for.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDetail_baby_trigger_for::ItemDetail_baby_trigger_for()
{
	//__init();
}

ItemDetail_baby_trigger_for::~ItemDetail_baby_trigger_for()
{
	//__cleanup();
}

void
ItemDetail_baby_trigger_for::__init()
{
	//url = std::string();
}

void
ItemDetail_baby_trigger_for::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
ItemDetail_baby_trigger_for::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

ItemDetail_baby_trigger_for::ItemDetail_baby_trigger_for(char* json)
{
	this->fromJson(json);
}

char*
ItemDetail_baby_trigger_for::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemDetail_baby_trigger_for::getUrl()
{
	return url;
}

void
ItemDetail_baby_trigger_for::setUrl(std::string  url)
{
	this->url = url;
}


