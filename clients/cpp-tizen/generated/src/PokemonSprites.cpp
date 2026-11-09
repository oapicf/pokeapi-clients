#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSprites.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSprites::PokemonSprites()
{
	//__init();
}

PokemonSprites::~PokemonSprites()
{
	//__cleanup();
}

void
PokemonSprites::__init()
{
	//front_default = std::string();
	//front_shiny = std::string();
	//front_female = std::string();
	//front_shiny_female = std::string();
	//back_default = std::string();
	//back_shiny = std::string();
	//back_female = std::string();
	//back_shiny_female = std::string();
	//other = null;
	//new std::map()std::map> versions;
}

void
PokemonSprites::__cleanup()
{
	//if(front_default != NULL) {
	//
	//delete front_default;
	//front_default = NULL;
	//}
	//if(front_shiny != NULL) {
	//
	//delete front_shiny;
	//front_shiny = NULL;
	//}
	//if(front_female != NULL) {
	//
	//delete front_female;
	//front_female = NULL;
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
	//if(back_shiny != NULL) {
	//
	//delete back_shiny;
	//back_shiny = NULL;
	//}
	//if(back_female != NULL) {
	//
	//delete back_female;
	//back_female = NULL;
	//}
	//if(back_shiny_female != NULL) {
	//
	//delete back_shiny_female;
	//back_shiny_female = NULL;
	//}
	//if(other != NULL) {
	//
	//delete other;
	//other = NULL;
	//}
	//if(versions != NULL) {
	//versions.RemoveAll(true);
	//delete versions;
	//versions = NULL;
	//}
	//
}

void
PokemonSprites::fromJson(char* jsonStr)
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
	const gchar *front_shinyKey = "front_shiny";
	node = json_object_get_member(pJsonObject, front_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&front_shiny, node, "std::string", "");
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
	const gchar *back_shinyKey = "back_shiny";
	node = json_object_get_member(pJsonObject, back_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_shiny, node, "std::string", "");
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
	const gchar *back_shiny_femaleKey = "back_shiny_female";
	node = json_object_get_member(pJsonObject, back_shiny_femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&back_shiny_female, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *otherKey = "other";
	node = json_object_get_member(pJsonObject, otherKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpritesOther")) {
			jsonToValue(&other, node, "PokemonSpritesOther", "PokemonSpritesOther");
		} else {
			
			PokemonSpritesOther* obj = static_cast<PokemonSpritesOther*> (&other);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionsKey = "versions";
	node = json_object_get_member(pJsonObject, versionsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			versions = new_map;
		}
		
	}
}

PokemonSprites::PokemonSprites(char* json)
{
	this->fromJson(json);
}

char*
PokemonSprites::toJson()
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
		std::string obj = getFrontShiny();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_shinyKey = "front_shiny";
	json_object_set_member(pJsonObject, front_shinyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFrontFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *front_femaleKey = "front_female";
	json_object_set_member(pJsonObject, front_femaleKey, node);
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
		std::string obj = getBackShiny();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_shinyKey = "back_shiny";
	json_object_set_member(pJsonObject, back_shinyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBackFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_femaleKey = "back_female";
	json_object_set_member(pJsonObject, back_femaleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBackShinyFemale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *back_shiny_femaleKey = "back_shiny_female";
	json_object_set_member(pJsonObject, back_shiny_femaleKey, node);
	if (isprimitive("PokemonSpritesOther")) {
		PokemonSpritesOther obj = getOther();
		node = converttoJson(&obj, "PokemonSpritesOther", "");
	}
	else {
		
		PokemonSpritesOther obj = static_cast<PokemonSpritesOther> (getOther());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *otherKey = "other";
	json_object_set_member(pJsonObject, otherKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getVersions());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *versionsKey = "versions";
	json_object_set_member(pJsonObject, versionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonSprites::getFrontDefault()
{
	return front_default;
}

void
PokemonSprites::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSprites::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSprites::setFrontShiny(std::string  front_shiny)
{
	this->front_shiny = front_shiny;
}

std::string
PokemonSprites::getFrontFemale()
{
	return front_female;
}

void
PokemonSprites::setFrontFemale(std::string  front_female)
{
	this->front_female = front_female;
}

std::string
PokemonSprites::getFrontShinyFemale()
{
	return front_shiny_female;
}

void
PokemonSprites::setFrontShinyFemale(std::string  front_shiny_female)
{
	this->front_shiny_female = front_shiny_female;
}

std::string
PokemonSprites::getBackDefault()
{
	return back_default;
}

void
PokemonSprites::setBackDefault(std::string  back_default)
{
	this->back_default = back_default;
}

std::string
PokemonSprites::getBackShiny()
{
	return back_shiny;
}

void
PokemonSprites::setBackShiny(std::string  back_shiny)
{
	this->back_shiny = back_shiny;
}

std::string
PokemonSprites::getBackFemale()
{
	return back_female;
}

void
PokemonSprites::setBackFemale(std::string  back_female)
{
	this->back_female = back_female;
}

std::string
PokemonSprites::getBackShinyFemale()
{
	return back_shiny_female;
}

void
PokemonSprites::setBackShinyFemale(std::string  back_shiny_female)
{
	this->back_shiny_female = back_shiny_female;
}

PokemonSpritesOther
PokemonSprites::getOther()
{
	return other;
}

void
PokemonSprites::setOther(PokemonSpritesOther  other)
{
	this->other = other;
}

std::map<string, string>
PokemonSprites::getVersions()
{
	return versions;
}

void
PokemonSprites::setVersions(std::map <string, string> versions)
{
	this->versions = versions;
}


