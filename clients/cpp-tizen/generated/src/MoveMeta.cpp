#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveMeta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveMeta::MoveMeta()
{
	//__init();
}

MoveMeta::~MoveMeta()
{
	//__cleanup();
}

void
MoveMeta::__init()
{
	//ailment = new MoveMetaAilmentSummary();
	//category = new MoveMetaCategorySummary();
	//min_hits = int(0);
	//max_hits = int(0);
	//min_turns = int(0);
	//max_turns = int(0);
	//drain = int(0);
	//healing = int(0);
	//crit_rate = int(0);
	//ailment_chance = int(0);
	//flinch_chance = int(0);
	//stat_chance = int(0);
}

void
MoveMeta::__cleanup()
{
	//if(ailment != NULL) {
	//
	//delete ailment;
	//ailment = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(min_hits != NULL) {
	//
	//delete min_hits;
	//min_hits = NULL;
	//}
	//if(max_hits != NULL) {
	//
	//delete max_hits;
	//max_hits = NULL;
	//}
	//if(min_turns != NULL) {
	//
	//delete min_turns;
	//min_turns = NULL;
	//}
	//if(max_turns != NULL) {
	//
	//delete max_turns;
	//max_turns = NULL;
	//}
	//if(drain != NULL) {
	//
	//delete drain;
	//drain = NULL;
	//}
	//if(healing != NULL) {
	//
	//delete healing;
	//healing = NULL;
	//}
	//if(crit_rate != NULL) {
	//
	//delete crit_rate;
	//crit_rate = NULL;
	//}
	//if(ailment_chance != NULL) {
	//
	//delete ailment_chance;
	//ailment_chance = NULL;
	//}
	//if(flinch_chance != NULL) {
	//
	//delete flinch_chance;
	//flinch_chance = NULL;
	//}
	//if(stat_chance != NULL) {
	//
	//delete stat_chance;
	//stat_chance = NULL;
	//}
	//
}

void
MoveMeta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ailmentKey = "ailment";
	node = json_object_get_member(pJsonObject, ailmentKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveMetaAilmentSummary")) {
			jsonToValue(&ailment, node, "MoveMetaAilmentSummary", "MoveMetaAilmentSummary");
		} else {
			
			MoveMetaAilmentSummary* obj = static_cast<MoveMetaAilmentSummary*> (&ailment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveMetaCategorySummary")) {
			jsonToValue(&category, node, "MoveMetaCategorySummary", "MoveMetaCategorySummary");
		} else {
			
			MoveMetaCategorySummary* obj = static_cast<MoveMetaCategorySummary*> (&category);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *min_hitsKey = "min_hits";
	node = json_object_get_member(pJsonObject, min_hitsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_hits, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_hitsKey = "max_hits";
	node = json_object_get_member(pJsonObject, max_hitsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_hits, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_turnsKey = "min_turns";
	node = json_object_get_member(pJsonObject, min_turnsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_turns, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_turnsKey = "max_turns";
	node = json_object_get_member(pJsonObject, max_turnsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_turns, node, "int", "");
		} else {
			
		}
	}
	const gchar *drainKey = "drain";
	node = json_object_get_member(pJsonObject, drainKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&drain, node, "int", "");
		} else {
			
		}
	}
	const gchar *healingKey = "healing";
	node = json_object_get_member(pJsonObject, healingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&healing, node, "int", "");
		} else {
			
		}
	}
	const gchar *crit_rateKey = "crit_rate";
	node = json_object_get_member(pJsonObject, crit_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&crit_rate, node, "int", "");
		} else {
			
		}
	}
	const gchar *ailment_chanceKey = "ailment_chance";
	node = json_object_get_member(pJsonObject, ailment_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&ailment_chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *flinch_chanceKey = "flinch_chance";
	node = json_object_get_member(pJsonObject, flinch_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&flinch_chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *stat_chanceKey = "stat_chance";
	node = json_object_get_member(pJsonObject, stat_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stat_chance, node, "int", "");
		} else {
			
		}
	}
}

MoveMeta::MoveMeta(char* json)
{
	this->fromJson(json);
}

char*
MoveMeta::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveMetaAilmentSummary")) {
		MoveMetaAilmentSummary obj = getAilment();
		node = converttoJson(&obj, "MoveMetaAilmentSummary", "");
	}
	else {
		
		MoveMetaAilmentSummary obj = static_cast<MoveMetaAilmentSummary> (getAilment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ailmentKey = "ailment";
	json_object_set_member(pJsonObject, ailmentKey, node);
	if (isprimitive("MoveMetaCategorySummary")) {
		MoveMetaCategorySummary obj = getCategory();
		node = converttoJson(&obj, "MoveMetaCategorySummary", "");
	}
	else {
		
		MoveMetaCategorySummary obj = static_cast<MoveMetaCategorySummary> (getCategory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("int")) {
		int obj = getMinHits();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_hitsKey = "min_hits";
	json_object_set_member(pJsonObject, min_hitsKey, node);
	if (isprimitive("int")) {
		int obj = getMaxHits();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_hitsKey = "max_hits";
	json_object_set_member(pJsonObject, max_hitsKey, node);
	if (isprimitive("int")) {
		int obj = getMinTurns();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_turnsKey = "min_turns";
	json_object_set_member(pJsonObject, min_turnsKey, node);
	if (isprimitive("int")) {
		int obj = getMaxTurns();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_turnsKey = "max_turns";
	json_object_set_member(pJsonObject, max_turnsKey, node);
	if (isprimitive("int")) {
		int obj = getDrain();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *drainKey = "drain";
	json_object_set_member(pJsonObject, drainKey, node);
	if (isprimitive("int")) {
		int obj = getHealing();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *healingKey = "healing";
	json_object_set_member(pJsonObject, healingKey, node);
	if (isprimitive("int")) {
		int obj = getCritRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *crit_rateKey = "crit_rate";
	json_object_set_member(pJsonObject, crit_rateKey, node);
	if (isprimitive("int")) {
		int obj = getAilmentChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ailment_chanceKey = "ailment_chance";
	json_object_set_member(pJsonObject, ailment_chanceKey, node);
	if (isprimitive("int")) {
		int obj = getFlinchChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *flinch_chanceKey = "flinch_chance";
	json_object_set_member(pJsonObject, flinch_chanceKey, node);
	if (isprimitive("int")) {
		int obj = getStatChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stat_chanceKey = "stat_chance";
	json_object_set_member(pJsonObject, stat_chanceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MoveMetaAilmentSummary
MoveMeta::getAilment()
{
	return ailment;
}

void
MoveMeta::setAilment(MoveMetaAilmentSummary  ailment)
{
	this->ailment = ailment;
}

MoveMetaCategorySummary
MoveMeta::getCategory()
{
	return category;
}

void
MoveMeta::setCategory(MoveMetaCategorySummary  category)
{
	this->category = category;
}

int
MoveMeta::getMinHits()
{
	return min_hits;
}

void
MoveMeta::setMinHits(int  min_hits)
{
	this->min_hits = min_hits;
}

int
MoveMeta::getMaxHits()
{
	return max_hits;
}

void
MoveMeta::setMaxHits(int  max_hits)
{
	this->max_hits = max_hits;
}

int
MoveMeta::getMinTurns()
{
	return min_turns;
}

void
MoveMeta::setMinTurns(int  min_turns)
{
	this->min_turns = min_turns;
}

int
MoveMeta::getMaxTurns()
{
	return max_turns;
}

void
MoveMeta::setMaxTurns(int  max_turns)
{
	this->max_turns = max_turns;
}

int
MoveMeta::getDrain()
{
	return drain;
}

void
MoveMeta::setDrain(int  drain)
{
	this->drain = drain;
}

int
MoveMeta::getHealing()
{
	return healing;
}

void
MoveMeta::setHealing(int  healing)
{
	this->healing = healing;
}

int
MoveMeta::getCritRate()
{
	return crit_rate;
}

void
MoveMeta::setCritRate(int  crit_rate)
{
	this->crit_rate = crit_rate;
}

int
MoveMeta::getAilmentChance()
{
	return ailment_chance;
}

void
MoveMeta::setAilmentChance(int  ailment_chance)
{
	this->ailment_chance = ailment_chance;
}

int
MoveMeta::getFlinchChance()
{
	return flinch_chance;
}

void
MoveMeta::setFlinchChance(int  flinch_chance)
{
	this->flinch_chance = flinch_chance;
}

int
MoveMeta::getStatChance()
{
	return stat_chance;
}

void
MoveMeta::setStatChance(int  stat_chance)
{
	this->stat_chance = stat_chance;
}


