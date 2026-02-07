#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveMetaAilmentSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveMetaAilmentSummary::MoveMetaAilmentSummary()
{
	//__init();
}

MoveMetaAilmentSummary::~MoveMetaAilmentSummary()
{
	//__cleanup();
}

void
MoveMetaAilmentSummary::__init()
{
	//name = std::string();
	//url = std::string();
}

void
MoveMetaAilmentSummary::__cleanup()
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
MoveMetaAilmentSummary::fromJson(char* jsonStr)
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

MoveMetaAilmentSummary::MoveMetaAilmentSummary(char* json)
{
	this->fromJson(json);
}

char*
MoveMetaAilmentSummary::toJson()
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
MoveMetaAilmentSummary::getName()
{
	return name;
}

void
MoveMetaAilmentSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
MoveMetaAilmentSummary::getUrl()
{
	return url;
}

void
MoveMetaAilmentSummary::setUrl(std::string  url)
{
	this->url = url;
}


