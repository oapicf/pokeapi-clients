#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_sprites.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_sprites::PokemonDetail_sprites()
{
	//__init();
}

PokemonDetail_sprites::~PokemonDetail_sprites()
{
	//__cleanup();
}

void
PokemonDetail_sprites::__init()
{
	//front_default = std::string();
}

void
PokemonDetail_sprites::__cleanup()
{
	//if(front_default != NULL) {
	//
	//delete front_default;
	//front_default = NULL;
	//}
	//
}

void
PokemonDetail_sprites::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *front_defaultKey = "front_default";
	node = json_object_get_member(pJsonObject, front_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&front_default, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonDetail_sprites::PokemonDetail_sprites(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_sprites::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFrontDefault();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_defaultKey = "front_default";
	json_object_set_member(pJsonObject, front_defaultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonDetail_sprites::getFrontDefault()
{
	return front_default;
}

void
PokemonDetail_sprites::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}


