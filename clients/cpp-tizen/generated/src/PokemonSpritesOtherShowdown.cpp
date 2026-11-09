#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpritesOtherShowdown.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpritesOtherShowdown::PokemonSpritesOtherShowdown()
{
	//__init();
}

PokemonSpritesOtherShowdown::~PokemonSpritesOtherShowdown()
{
	//__cleanup();
}

void
PokemonSpritesOtherShowdown::__init()
{
	//front_default = std::string();
	//front_female = std::string();
	//front_shiny = std::string();
	//front_shiny_female = std::string();
	//back_default = std::string();
	//back_female = std::string();
	//back_shiny = std::string();
	//back_shiny_female = std::string();
}

void
PokemonSpritesOtherShowdown::__cleanup()
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
	//if(back_default != NULL) {
	//
	//delete back_default;
	//back_default = NULL;
	//}
	//if(back_female != NULL) {
	//
	//delete back_female;
	//back_female = NULL;
	//}
	//if(back_shiny != NULL) {
	//
	//delete back_shiny;
	//back_shiny = NULL;
	//}
	//if(back_shiny_female != NULL) {
	//
	//delete back_shiny_female;
	//back_shiny_female = NULL;
	//}
	//
}

void
PokemonSpritesOtherShowdown::fromJson(char* jsonStr)
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
	const gchar *back_defaultKey = "back_default";
	node = json_object_get_member(pJsonObject, back_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_default, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *back_femaleKey = "back_female";
	node = json_object_get_member(pJsonObject, back_femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_female, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *back_shinyKey = "back_shiny";
	node = json_object_get_member(pJsonObject, back_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_shiny, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *back_shiny_femaleKey = "back_shiny_female";
	node = json_object_get_member(pJsonObject, back_shiny_femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_shiny_female, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonSpritesOtherShowdown::PokemonSpritesOtherShowdown(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpritesOtherShowdown::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getBackDefault();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_defaultKey = "back_default";
	json_object_set_member(pJsonObject, back_defaultKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBackFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_femaleKey = "back_female";
	json_object_set_member(pJsonObject, back_femaleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBackShiny();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_shinyKey = "back_shiny";
	json_object_set_member(pJsonObject, back_shinyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBackShinyFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_shiny_femaleKey = "back_shiny_female";
	json_object_set_member(pJsonObject, back_shiny_femaleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonSpritesOtherShowdown::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherShowdown::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherShowdown::getFrontFemale()
{
	return front_female;
}

void
PokemonSpritesOtherShowdown::setFrontFemale(std::string  front_female)
{
	this->front_female = front_female;
}

std::string
PokemonSpritesOtherShowdown::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSpritesOtherShowdown::setFrontShiny(std::string  front_shiny)
{
	this->front_shiny = front_shiny;
}

std::string
PokemonSpritesOtherShowdown::getFrontShinyFemale()
{
	return front_shiny_female;
}

void
PokemonSpritesOtherShowdown::setFrontShinyFemale(std::string  front_shiny_female)
{
	this->front_shiny_female = front_shiny_female;
}

std::string
PokemonSpritesOtherShowdown::getBackDefault()
{
	return back_default;
}

void
PokemonSpritesOtherShowdown::setBackDefault(std::string  back_default)
{
	this->back_default = back_default;
}

std::string
PokemonSpritesOtherShowdown::getBackFemale()
{
	return back_female;
}

void
PokemonSpritesOtherShowdown::setBackFemale(std::string  back_female)
{
	this->back_female = back_female;
}

std::string
PokemonSpritesOtherShowdown::getBackShiny()
{
	return back_shiny;
}

void
PokemonSpritesOtherShowdown::setBackShiny(std::string  back_shiny)
{
	this->back_shiny = back_shiny;
}

std::string
PokemonSpritesOtherShowdown::getBackShinyFemale()
{
	return back_shiny_female;
}

void
PokemonSpritesOtherShowdown::setBackShinyFemale(std::string  back_shiny_female)
{
	this->back_shiny_female = back_shiny_female;
}


