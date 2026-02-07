#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeGameIndex.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeGameIndex::TypeGameIndex()
{
	//__init();
}

TypeGameIndex::~TypeGameIndex()
{
	//__cleanup();
}

void
TypeGameIndex::__init()
{
	//game_index = int(0);
	//generation = new GenerationSummary();
}

void
TypeGameIndex::__cleanup()
{
	//if(game_index != NULL) {
	//
	//delete game_index;
	//game_index = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//
}

void
TypeGameIndex::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *game_indexKey = "game_index";
	node = json_object_get_member(pJsonObject, game_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&game_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TypeGameIndex::TypeGameIndex(char* json)
{
	this->fromJson(json);
}

char*
TypeGameIndex::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getGameIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *game_indexKey = "game_index";
	json_object_set_member(pJsonObject, game_indexKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TypeGameIndex::getGameIndex()
{
	return game_index;
}

void
TypeGameIndex::setGameIndex(int  game_index)
{
	this->game_index = game_index;
}

GenerationSummary
TypeGameIndex::getGeneration()
{
	return generation;
}

void
TypeGameIndex::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}


