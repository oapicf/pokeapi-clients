#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonShapeDetail_names_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonShapeDetail_names_inner::PokemonShapeDetail_names_inner()
{
	//__init();
}

PokemonShapeDetail_names_inner::~PokemonShapeDetail_names_inner()
{
	//__cleanup();
}

void
PokemonShapeDetail_names_inner::__init()
{
	//url = std::string();
	//name = std::string();
}

void
PokemonShapeDetail_names_inner::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
PokemonShapeDetail_names_inner::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonShapeDetail_names_inner::PokemonShapeDetail_names_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonShapeDetail_names_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonShapeDetail_names_inner::getUrl()
{
	return url;
}

void
PokemonShapeDetail_names_inner::setUrl(std::string  url)
{
	this->url = url;
}

std::string
PokemonShapeDetail_names_inner::getName()
{
	return name;
}

void
PokemonShapeDetail_names_inner::setName(std::string  name)
{
	this->name = name;
}


