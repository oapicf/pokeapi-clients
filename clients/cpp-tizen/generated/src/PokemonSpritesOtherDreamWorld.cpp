#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpritesOtherDreamWorld.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpritesOtherDreamWorld::PokemonSpritesOtherDreamWorld()
{
	//__init();
}

PokemonSpritesOtherDreamWorld::~PokemonSpritesOtherDreamWorld()
{
	//__cleanup();
}

void
PokemonSpritesOtherDreamWorld::__init()
{
	//front_default = std::string();
	//front_female = std::string();
}

void
PokemonSpritesOtherDreamWorld::__cleanup()
{
	//if(front_default != NULL) {
	//
	//delete front_default;
	//front_default = NULL;
	//}
	//if(front_female != NULL) {
	//
	//delete front_female;
	//front_female = NULL;
	//}
	//
}

void
PokemonSpritesOtherDreamWorld::fromJson(char* jsonStr)
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
	const gchar *front_femaleKey = "front_female";
	node = json_object_get_member(pJsonObject, front_femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&front_female, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonSpritesOtherDreamWorld::PokemonSpritesOtherDreamWorld(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpritesOtherDreamWorld::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFrontFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_femaleKey = "front_female";
	json_object_set_member(pJsonObject, front_femaleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonSpritesOtherDreamWorld::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherDreamWorld::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherDreamWorld::getFrontFemale()
{
	return front_female;
}

void
PokemonSpritesOtherDreamWorld::setFrontFemale(std::string  front_female)
{
	this->front_female = front_female;
}


