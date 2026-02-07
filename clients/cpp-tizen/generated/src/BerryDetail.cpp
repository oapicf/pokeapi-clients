#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryDetail::BerryDetail()
{
	//__init();
}

BerryDetail::~BerryDetail()
{
	//__cleanup();
}

void
BerryDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//growth_time = int(0);
	//max_harvest = int(0);
	//natural_gift_power = int(0);
	//size = int(0);
	//smoothness = int(0);
	//soil_dryness = int(0);
	//firmness = new BerryFirmnessSummary();
	//new std::list()std::list> flavors;
	//item = new ItemSummary();
	//natural_gift_type = new TypeSummary();
}

void
BerryDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(growth_time != NULL) {
	//
	//delete growth_time;
	//growth_time = NULL;
	//}
	//if(max_harvest != NULL) {
	//
	//delete max_harvest;
	//max_harvest = NULL;
	//}
	//if(natural_gift_power != NULL) {
	//
	//delete natural_gift_power;
	//natural_gift_power = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(smoothness != NULL) {
	//
	//delete smoothness;
	//smoothness = NULL;
	//}
	//if(soil_dryness != NULL) {
	//
	//delete soil_dryness;
	//soil_dryness = NULL;
	//}
	//if(firmness != NULL) {
	//
	//delete firmness;
	//firmness = NULL;
	//}
	//if(flavors != NULL) {
	//flavors.RemoveAll(true);
	//delete flavors;
	//flavors = NULL;
	//}
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//if(natural_gift_type != NULL) {
	//
	//delete natural_gift_type;
	//natural_gift_type = NULL;
	//}
	//
}

void
BerryDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *growth_timeKey = "growth_time";
	node = json_object_get_member(pJsonObject, growth_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&growth_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_harvestKey = "max_harvest";
	node = json_object_get_member(pJsonObject, max_harvestKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_harvest, node, "int", "");
		} else {
			
		}
	}
	const gchar *natural_gift_powerKey = "natural_gift_power";
	node = json_object_get_member(pJsonObject, natural_gift_powerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&natural_gift_power, node, "int", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *smoothnessKey = "smoothness";
	node = json_object_get_member(pJsonObject, smoothnessKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&smoothness, node, "int", "");
		} else {
			
		}
	}
	const gchar *soil_drynessKey = "soil_dryness";
	node = json_object_get_member(pJsonObject, soil_drynessKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&soil_dryness, node, "int", "");
		} else {
			
		}
	}
	const gchar *firmnessKey = "firmness";
	node = json_object_get_member(pJsonObject, firmnessKey);
	if (node !=NULL) {
	

		if (isprimitive("BerryFirmnessSummary")) {
			jsonToValue(&firmness, node, "BerryFirmnessSummary", "BerryFirmnessSummary");
		} else {
			
			BerryFirmnessSummary* obj = static_cast<BerryFirmnessSummary*> (&firmness);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *flavorsKey = "flavors";
	node = json_object_get_member(pJsonObject, flavorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BerryDetail_flavors_inner> new_list;
			BerryDetail_flavors_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BerryDetail_flavors_inner")) {
					jsonToValue(&inst, temp_json, "BerryDetail_flavors_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavors = new_list;
		}
		
	}
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *natural_gift_typeKey = "natural_gift_type";
	node = json_object_get_member(pJsonObject, natural_gift_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeSummary")) {
			jsonToValue(&natural_gift_type, node, "TypeSummary", "TypeSummary");
		} else {
			
			TypeSummary* obj = static_cast<TypeSummary*> (&natural_gift_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BerryDetail::BerryDetail(char* json)
{
	this->fromJson(json);
}

char*
BerryDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getGrowthTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *growth_timeKey = "growth_time";
	json_object_set_member(pJsonObject, growth_timeKey, node);
	if (isprimitive("int")) {
		int obj = getMaxHarvest();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_harvestKey = "max_harvest";
	json_object_set_member(pJsonObject, max_harvestKey, node);
	if (isprimitive("int")) {
		int obj = getNaturalGiftPower();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *natural_gift_powerKey = "natural_gift_power";
	json_object_set_member(pJsonObject, natural_gift_powerKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("int")) {
		int obj = getSmoothness();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *smoothnessKey = "smoothness";
	json_object_set_member(pJsonObject, smoothnessKey, node);
	if (isprimitive("int")) {
		int obj = getSoilDryness();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *soil_drynessKey = "soil_dryness";
	json_object_set_member(pJsonObject, soil_drynessKey, node);
	if (isprimitive("BerryFirmnessSummary")) {
		BerryFirmnessSummary obj = getFirmness();
		node = converttoJson(&obj, "BerryFirmnessSummary", "");
	}
	else {
		
		BerryFirmnessSummary obj = static_cast<BerryFirmnessSummary> (getFirmness());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *firmnessKey = "firmness";
	json_object_set_member(pJsonObject, firmnessKey, node);
	if (isprimitive("BerryDetail_flavors_inner")) {
		list<BerryDetail_flavors_inner> new_list = static_cast<list <BerryDetail_flavors_inner> > (getFlavors());
		node = converttoJson(&new_list, "BerryDetail_flavors_inner", "array");
	} else {
		node = json_node_alloc();
		list<BerryDetail_flavors_inner> new_list = static_cast<list <BerryDetail_flavors_inner> > (getFlavors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BerryDetail_flavors_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BerryDetail_flavors_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavorsKey = "flavors";
	json_object_set_member(pJsonObject, flavorsKey, node);
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("TypeSummary")) {
		TypeSummary obj = getNaturalGiftType();
		node = converttoJson(&obj, "TypeSummary", "");
	}
	else {
		
		TypeSummary obj = static_cast<TypeSummary> (getNaturalGiftType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *natural_gift_typeKey = "natural_gift_type";
	json_object_set_member(pJsonObject, natural_gift_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BerryDetail::getId()
{
	return id;
}

void
BerryDetail::setId(int  id)
{
	this->id = id;
}

std::string
BerryDetail::getName()
{
	return name;
}

void
BerryDetail::setName(std::string  name)
{
	this->name = name;
}

int
BerryDetail::getGrowthTime()
{
	return growth_time;
}

void
BerryDetail::setGrowthTime(int  growth_time)
{
	this->growth_time = growth_time;
}

int
BerryDetail::getMaxHarvest()
{
	return max_harvest;
}

void
BerryDetail::setMaxHarvest(int  max_harvest)
{
	this->max_harvest = max_harvest;
}

int
BerryDetail::getNaturalGiftPower()
{
	return natural_gift_power;
}

void
BerryDetail::setNaturalGiftPower(int  natural_gift_power)
{
	this->natural_gift_power = natural_gift_power;
}

int
BerryDetail::getSize()
{
	return size;
}

void
BerryDetail::setSize(int  size)
{
	this->size = size;
}

int
BerryDetail::getSmoothness()
{
	return smoothness;
}

void
BerryDetail::setSmoothness(int  smoothness)
{
	this->smoothness = smoothness;
}

int
BerryDetail::getSoilDryness()
{
	return soil_dryness;
}

void
BerryDetail::setSoilDryness(int  soil_dryness)
{
	this->soil_dryness = soil_dryness;
}

BerryFirmnessSummary
BerryDetail::getFirmness()
{
	return firmness;
}

void
BerryDetail::setFirmness(BerryFirmnessSummary  firmness)
{
	this->firmness = firmness;
}

std::list<BerryDetail_flavors_inner>
BerryDetail::getFlavors()
{
	return flavors;
}

void
BerryDetail::setFlavors(std::list <BerryDetail_flavors_inner> flavors)
{
	this->flavors = flavors;
}

ItemSummary
BerryDetail::getItem()
{
	return item;
}

void
BerryDetail::setItem(ItemSummary  item)
{
	this->item = item;
}

TypeSummary
BerryDetail::getNaturalGiftType()
{
	return natural_gift_type;
}

void
BerryDetail::setNaturalGiftType(TypeSummary  natural_gift_type)
{
	this->natural_gift_type = natural_gift_type;
}


