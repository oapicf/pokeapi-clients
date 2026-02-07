#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EggGroupDetail_pokemon_species_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EggGroupDetail_pokemon_species_inner::EggGroupDetail_pokemon_species_inner()
{
	//__init();
}

EggGroupDetail_pokemon_species_inner::~EggGroupDetail_pokemon_species_inner()
{
	//__cleanup();
}

void
EggGroupDetail_pokemon_species_inner::__init()
{
	//name = std::string();
	//url = std::string();
}

void
EggGroupDetail_pokemon_species_inner::__cleanup()
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
EggGroupDetail_pokemon_species_inner::fromJson(char* jsonStr)
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

EggGroupDetail_pokemon_species_inner::EggGroupDetail_pokemon_species_inner(char* json)
{
	this->fromJson(json);
}

char*
EggGroupDetail_pokemon_species_inner::toJson()
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
EggGroupDetail_pokemon_species_inner::getName()
{
	return name;
}

void
EggGroupDetail_pokemon_species_inner::setName(std::string  name)
{
	this->name = name;
}

std::string
EggGroupDetail_pokemon_species_inner::getUrl()
{
	return url;
}

void
EggGroupDetail_pokemon_species_inner::setUrl(std::string  url)
{
	this->url = url;
}


