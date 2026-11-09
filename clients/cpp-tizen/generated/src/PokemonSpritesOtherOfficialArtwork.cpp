#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpritesOtherOfficialArtwork.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpritesOtherOfficialArtwork::PokemonSpritesOtherOfficialArtwork()
{
	//__init();
}

PokemonSpritesOtherOfficialArtwork::~PokemonSpritesOtherOfficialArtwork()
{
	//__cleanup();
}

void
PokemonSpritesOtherOfficialArtwork::__init()
{
	//front_default = std::string();
	//front_shiny = std::string();
	//new std::map()std::map> versions;
}

void
PokemonSpritesOtherOfficialArtwork::__cleanup()
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
	//if(versions != NULL) {
	//versions.RemoveAll(true);
	//delete versions;
	//versions = NULL;
	//}
	//
}

void
PokemonSpritesOtherOfficialArtwork::fromJson(char* jsonStr)
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

PokemonSpritesOtherOfficialArtwork::PokemonSpritesOtherOfficialArtwork(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpritesOtherOfficialArtwork::toJson()
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
PokemonSpritesOtherOfficialArtwork::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherOfficialArtwork::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherOfficialArtwork::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSpritesOtherOfficialArtwork::setFrontShiny(std::string  front_shiny)
{
	this->front_shiny = front_shiny;
}

std::map<string, string>
PokemonSpritesOtherOfficialArtwork::getVersions()
{
	return versions;
}

void
PokemonSpritesOtherOfficialArtwork::setVersions(std::map <string, string> versions)
{
	this->versions = versions;
}


