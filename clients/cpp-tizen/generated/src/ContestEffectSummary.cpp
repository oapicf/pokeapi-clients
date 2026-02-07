#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ContestEffectSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ContestEffectSummary::ContestEffectSummary()
{
	//__init();
}

ContestEffectSummary::~ContestEffectSummary()
{
	//__cleanup();
}

void
ContestEffectSummary::__init()
{
	//url = std::string();
}

void
ContestEffectSummary::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
ContestEffectSummary::fromJson(char* jsonStr)
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

ContestEffectSummary::ContestEffectSummary(char* json)
{
	this->fromJson(json);
}

char*
ContestEffectSummary::toJson()
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
ContestEffectSummary::getUrl()
{
	return url;
}

void
ContestEffectSummary::setUrl(std::string  url)
{
	this->url = url;
}


