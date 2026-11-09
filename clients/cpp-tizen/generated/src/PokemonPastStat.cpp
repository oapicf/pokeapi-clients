#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonPastStat.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonPastStat::PokemonPastStat()
{
	//__init();
}

PokemonPastStat::~PokemonPastStat()
{
	//__cleanup();
}

void
PokemonPastStat::__init()
{
	//generation = null;
	//new std::list()std::list> stats;
}

void
PokemonPastStat::__cleanup()
{
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(stats != NULL) {
	//stats.RemoveAll(true);
	//delete stats;
	//stats = NULL;
	//}
	//
}

void
PokemonPastStat::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *statsKey = "stats";
	node = json_object_get_member(pJsonObject, statsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonStat> new_list;
			PokemonStat inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonStat")) {
					jsonToValue(&inst, temp_json, "PokemonStat", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stats = new_list;
		}
		
	}
}

PokemonPastStat::PokemonPastStat(char* json)
{
	this->fromJson(json);
}

char*
PokemonPastStat::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("PokemonStat")) {
		list<PokemonStat> new_list = static_cast<list <PokemonStat> > (getStats());
		node = converttoJson(&new_list, "PokemonStat", "array");
	} else {
		node = json_node_alloc();
		list<PokemonStat> new_list = static_cast<list <PokemonStat> > (getStats());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonStat>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonStat obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statsKey = "stats";
	json_object_set_member(pJsonObject, statsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

GenerationSummary
PokemonPastStat::getGeneration()
{
	return generation;
}

void
PokemonPastStat::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

std::list<PokemonStat>
PokemonPastStat::getStats()
{
	return stats;
}

void
PokemonPastStat::setStats(std::list <PokemonStat> stats)
{
	this->stats = stats;
}


