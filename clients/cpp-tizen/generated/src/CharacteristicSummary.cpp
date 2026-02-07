#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CharacteristicSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CharacteristicSummary::CharacteristicSummary()
{
	//__init();
}

CharacteristicSummary::~CharacteristicSummary()
{
	//__cleanup();
}

void
CharacteristicSummary::__init()
{
	//url = std::string();
}

void
CharacteristicSummary::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
CharacteristicSummary::fromJson(char* jsonStr)
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

CharacteristicSummary::CharacteristicSummary(char* json)
{
	this->fromJson(json);
}

char*
CharacteristicSummary::toJson()
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
CharacteristicSummary::getUrl()
{
	return url;
}

void
CharacteristicSummary::setUrl(std::string  url)
{
	this->url = url;
}


