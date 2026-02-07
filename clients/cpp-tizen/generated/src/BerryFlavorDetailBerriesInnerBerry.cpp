#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFlavorDetail_berries_inner_berry.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFlavorDetail_berries_inner_berry::BerryFlavorDetail_berries_inner_berry()
{
	//__init();
}

BerryFlavorDetail_berries_inner_berry::~BerryFlavorDetail_berries_inner_berry()
{
	//__cleanup();
}

void
BerryFlavorDetail_berries_inner_berry::__init()
{
	//name = std::string();
	//url = std::string();
}

void
BerryFlavorDetail_berries_inner_berry::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
BerryFlavorDetail_berries_inner_berry::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

BerryFlavorDetail_berries_inner_berry::BerryFlavorDetail_berries_inner_berry(char* json)
{
	this->fromJson(json);
}

char*
BerryFlavorDetail_berries_inner_berry::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
BerryFlavorDetail_berries_inner_berry::getName()
{
	return name;
}

void
BerryFlavorDetail_berries_inner_berry::setName(std::string  name)
{
	this->name = name;
}

std::string
BerryFlavorDetail_berries_inner_berry::getUrl()
{
	return url;
}

void
BerryFlavorDetail_berries_inner_berry::setUrl(std::string  url)
{
	this->url = url;
}


