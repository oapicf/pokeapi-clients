#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpritesOtherHome.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpritesOtherHome::PokemonSpritesOtherHome()
{
	//__init();
}

PokemonSpritesOtherHome::~PokemonSpritesOtherHome()
{
	//__cleanup();
}

void
PokemonSpritesOtherHome::__init()
{
	//front_default = std::string();
	//front_female = std::string();
	//front_shiny = std::string();
	//front_shiny_female = std::string();
}

void
PokemonSpritesOtherHome::__cleanup()
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
	//if(front_shiny != NULL) {
	//
	//delete front_shiny;
	//front_shiny = NULL;
	//}
	//if(front_shiny_female != NULL) {
	//
	//delete front_shiny_female;
	//front_shiny_female = NULL;
	//}
	//
}

void
PokemonSpritesOtherHome::fromJson(char* jsonStr)
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
	const gchar *front_shinyKey = "front_shiny";
	node = json_object_get_member(pJsonObject, front_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&front_shiny, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *front_shiny_femaleKey = "front_shiny_female";
	node = json_object_get_member(pJsonObject, front_shiny_femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&front_shiny_female, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonSpritesOtherHome::PokemonSpritesOtherHome(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpritesOtherHome::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFrontShiny();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_shinyKey = "front_shiny";
	json_object_set_member(pJsonObject, front_shinyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFrontShinyFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_shiny_femaleKey = "front_shiny_female";
	json_object_set_member(pJsonObject, front_shiny_femaleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonSpritesOtherHome::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherHome::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherHome::getFrontFemale()
{
	return front_female;
}

void
PokemonSpritesOtherHome::setFrontFemale(std::string  front_female)
{
	this->front_female = front_female;
}

std::string
PokemonSpritesOtherHome::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSpritesOtherHome::setFrontShiny(std::string  front_shiny)
{
	this->front_shiny = front_shiny;
}

std::string
PokemonSpritesOtherHome::getFrontShinyFemale()
{
	return front_shiny_female;
}

void
PokemonSpritesOtherHome::setFrontShinyFemale(std::string  front_shiny_female)
{
	this->front_shiny_female = front_shiny_female;
}


