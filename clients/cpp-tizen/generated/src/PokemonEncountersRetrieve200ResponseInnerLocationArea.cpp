#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pokemon_encounters_retrieve_200_response_inner_location_area.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pokemon_encounters_retrieve_200_response_inner_location_area::Pokemon_encounters_retrieve_200_response_inner_location_area()
{
	//__init();
}

Pokemon_encounters_retrieve_200_response_inner_location_area::~Pokemon_encounters_retrieve_200_response_inner_location_area()
{
	//__cleanup();
}

void
Pokemon_encounters_retrieve_200_response_inner_location_area::__init()
{
	//name = std::string();
	//url = std::string();
}

void
Pokemon_encounters_retrieve_200_response_inner_location_area::__cleanup()
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
Pokemon_encounters_retrieve_200_response_inner_location_area::fromJson(char* jsonStr)
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

Pokemon_encounters_retrieve_200_response_inner_location_area::Pokemon_encounters_retrieve_200_response_inner_location_area(char* json)
{
	this->fromJson(json);
}

char*
Pokemon_encounters_retrieve_200_response_inner_location_area::toJson()
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
Pokemon_encounters_retrieve_200_response_inner_location_area::getName()
{
	return name;
}

void
Pokemon_encounters_retrieve_200_response_inner_location_area::setName(std::string  name)
{
	this->name = name;
}

std::string
Pokemon_encounters_retrieve_200_response_inner_location_area::getUrl()
{
	return url;
}

void
Pokemon_encounters_retrieve_200_response_inner_location_area::setUrl(std::string  url)
{
	this->url = url;
}


