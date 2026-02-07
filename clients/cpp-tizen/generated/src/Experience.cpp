#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Experience.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Experience::Experience()
{
	//__init();
}

Experience::~Experience()
{
	//__cleanup();
}

void
Experience::__init()
{
	//level = int(0);
	//experience = int(0);
}

void
Experience::__cleanup()
{
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(experience != NULL) {
	//
	//delete experience;
	//experience = NULL;
	//}
	//
}

void
Experience::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&level, node, "int", "");
		} else {
			
		}
	}
	const gchar *experienceKey = "experience";
	node = json_object_get_member(pJsonObject, experienceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&experience, node, "int", "");
		} else {
			
		}
	}
}

Experience::Experience(char* json)
{
	this->fromJson(json);
}

char*
Experience::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("int")) {
		int obj = getExperience();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *experienceKey = "experience";
	json_object_set_member(pJsonObject, experienceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Experience::getLevel()
{
	return level;
}

void
Experience::setLevel(int  level)
{
	this->level = level;
}

int
Experience::getExperience()
{
	return experience;
}

void
Experience::setExperience(int  experience)
{
	this->experience = experience;
}


