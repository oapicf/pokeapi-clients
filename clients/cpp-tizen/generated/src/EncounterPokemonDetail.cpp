#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EncounterPokemonDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EncounterPokemonDetail::EncounterPokemonDetail()
{
	//__init();
}

EncounterPokemonDetail::~EncounterPokemonDetail()
{
	//__cleanup();
}

void
EncounterPokemonDetail::__init()
{
	//min_perfect_ivs = int(0);
	//always_shiny = bool(false);
	//never_shiny = bool(false);
	//is_alpha = bool(false);
}

void
EncounterPokemonDetail::__cleanup()
{
	//if(min_perfect_ivs != NULL) {
	//
	//delete min_perfect_ivs;
	//min_perfect_ivs = NULL;
	//}
	//if(always_shiny != NULL) {
	//
	//delete always_shiny;
	//always_shiny = NULL;
	//}
	//if(never_shiny != NULL) {
	//
	//delete never_shiny;
	//never_shiny = NULL;
	//}
	//if(is_alpha != NULL) {
	//
	//delete is_alpha;
	//is_alpha = NULL;
	//}
	//
}

void
EncounterPokemonDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *min_perfect_ivsKey = "min_perfect_ivs";
	node = json_object_get_member(pJsonObject, min_perfect_ivsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_perfect_ivs, node, "int", "");
		} else {
			
		}
	}
	const gchar *always_shinyKey = "always_shiny";
	node = json_object_get_member(pJsonObject, always_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&always_shiny, node, "bool", "");
		} else {
			
		}
	}
	const gchar *never_shinyKey = "never_shiny";
	node = json_object_get_member(pJsonObject, never_shinyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&never_shiny, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_alphaKey = "is_alpha";
	node = json_object_get_member(pJsonObject, is_alphaKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_alpha, node, "bool", "");
		} else {
			
		}
	}
}

EncounterPokemonDetail::EncounterPokemonDetail(char* json)
{
	this->fromJson(json);
}

char*
EncounterPokemonDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMinPerfectIvs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_perfect_ivsKey = "min_perfect_ivs";
	json_object_set_member(pJsonObject, min_perfect_ivsKey, node);
	if (isprimitive("bool")) {
		bool obj = getAlwaysShiny();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *always_shinyKey = "always_shiny";
	json_object_set_member(pJsonObject, always_shinyKey, node);
	if (isprimitive("bool")) {
		bool obj = getNeverShiny();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *never_shinyKey = "never_shiny";
	json_object_set_member(pJsonObject, never_shinyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAlpha();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_alphaKey = "is_alpha";
	json_object_set_member(pJsonObject, is_alphaKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EncounterPokemonDetail::getMinPerfectIvs()
{
	return min_perfect_ivs;
}

void
EncounterPokemonDetail::setMinPerfectIvs(int  min_perfect_ivs)
{
	this->min_perfect_ivs = min_perfect_ivs;
}

bool
EncounterPokemonDetail::getAlwaysShiny()
{
	return always_shiny;
}

void
EncounterPokemonDetail::setAlwaysShiny(bool  always_shiny)
{
	this->always_shiny = always_shiny;
}

bool
EncounterPokemonDetail::getNeverShiny()
{
	return never_shiny;
}

void
EncounterPokemonDetail::setNeverShiny(bool  never_shiny)
{
	this->never_shiny = never_shiny;
}

bool
EncounterPokemonDetail::getIsAlpha()
{
	return is_alpha;
}

void
EncounterPokemonDetail::setIsAlpha(bool  is_alpha)
{
	this->is_alpha = is_alpha;
}


