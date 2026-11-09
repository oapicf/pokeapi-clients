#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesPalParkEncounter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesPalParkEncounter::PokemonSpeciesPalParkEncounter()
{
	//__init();
}

PokemonSpeciesPalParkEncounter::~PokemonSpeciesPalParkEncounter()
{
	//__cleanup();
}

void
PokemonSpeciesPalParkEncounter::__init()
{
	//base_score = int(0);
	//rate = int(0);
	//area = null;
}

void
PokemonSpeciesPalParkEncounter::__cleanup()
{
	//if(base_score != NULL) {
	//
	//delete base_score;
	//base_score = NULL;
	//}
	//if(rate != NULL) {
	//
	//delete rate;
	//rate = NULL;
	//}
	//if(area != NULL) {
	//
	//delete area;
	//area = NULL;
	//}
	//
}

void
PokemonSpeciesPalParkEncounter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *base_scoreKey = "base_score";
	node = json_object_get_member(pJsonObject, base_scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&base_score, node, "int", "");
		} else {
			
		}
	}
	const gchar *rateKey = "rate";
	node = json_object_get_member(pJsonObject, rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rate, node, "int", "");
		} else {
			
		}
	}
	const gchar *areaKey = "area";
	node = json_object_get_member(pJsonObject, areaKey);
	if (node !=NULL) {
	

		if (isprimitive("PalParkAreaSummary")) {
			jsonToValue(&area, node, "PalParkAreaSummary", "PalParkAreaSummary");
		} else {
			
			PalParkAreaSummary* obj = static_cast<PalParkAreaSummary*> (&area);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonSpeciesPalParkEncounter::PokemonSpeciesPalParkEncounter(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesPalParkEncounter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBaseScore();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *base_scoreKey = "base_score";
	json_object_set_member(pJsonObject, base_scoreKey, node);
	if (isprimitive("int")) {
		int obj = getRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rateKey = "rate";
	json_object_set_member(pJsonObject, rateKey, node);
	if (isprimitive("PalParkAreaSummary")) {
		PalParkAreaSummary obj = getArea();
		node = converttoJson(&obj, "PalParkAreaSummary", "");
	}
	else {
		
		PalParkAreaSummary obj = static_cast<PalParkAreaSummary> (getArea());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *areaKey = "area";
	json_object_set_member(pJsonObject, areaKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonSpeciesPalParkEncounter::getBaseScore()
{
	return base_score;
}

void
PokemonSpeciesPalParkEncounter::setBaseScore(int  base_score)
{
	this->base_score = base_score;
}

int
PokemonSpeciesPalParkEncounter::getRate()
{
	return rate;
}

void
PokemonSpeciesPalParkEncounter::setRate(int  rate)
{
	this->rate = rate;
}

PalParkAreaSummary
PokemonSpeciesPalParkEncounter::getArea()
{
	return area;
}

void
PokemonSpeciesPalParkEncounter::setArea(PalParkAreaSummary  area)
{
	this->area = area;
}


