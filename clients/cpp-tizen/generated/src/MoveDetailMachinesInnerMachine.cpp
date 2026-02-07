#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_machines_inner_machine.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_machines_inner_machine::MoveDetail_machines_inner_machine()
{
	//__init();
}

MoveDetail_machines_inner_machine::~MoveDetail_machines_inner_machine()
{
	//__cleanup();
}

void
MoveDetail_machines_inner_machine::__init()
{
	//url = std::string();
}

void
MoveDetail_machines_inner_machine::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
MoveDetail_machines_inner_machine::fromJson(char* jsonStr)
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

MoveDetail_machines_inner_machine::MoveDetail_machines_inner_machine(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_machines_inner_machine::toJson()
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
MoveDetail_machines_inner_machine::getUrl()
{
	return url;
}

void
MoveDetail_machines_inner_machine::setUrl(std::string  url)
{
	this->url = url;
}


