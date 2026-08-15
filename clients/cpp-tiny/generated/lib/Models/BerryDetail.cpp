

#include "BerryDetail.h"

using namespace Tiny;

BerryDetail::BerryDetail()
{
	id = int(0);
	name = std::string();
	growth_time = int(0);
	max_harvest = int(0);
	natural_gift_power = int(0);
	size = int(0);
	smoothness = int(0);
	soil_dryness = int(0);
	firmness = BerryFirmnessSummary();
	flavors = std::list<BerryDetail_flavors_inner>();
	item = ItemSummary();
	natural_gift_type = TypeSummary();
}

BerryDetail::BerryDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryDetail::~BerryDetail()
{

}

void
BerryDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *growth_timeKey = "growth_time";

    if(object.has_key(growth_timeKey))
    {
        bourne::json value = object[growth_timeKey];



        jsonToValue(&growth_time, value, "int");


    }

    const char *max_harvestKey = "max_harvest";

    if(object.has_key(max_harvestKey))
    {
        bourne::json value = object[max_harvestKey];



        jsonToValue(&max_harvest, value, "int");


    }

    const char *natural_gift_powerKey = "natural_gift_power";

    if(object.has_key(natural_gift_powerKey))
    {
        bourne::json value = object[natural_gift_powerKey];



        jsonToValue(&natural_gift_power, value, "int");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "int");


    }

    const char *smoothnessKey = "smoothness";

    if(object.has_key(smoothnessKey))
    {
        bourne::json value = object[smoothnessKey];



        jsonToValue(&smoothness, value, "int");


    }

    const char *soil_drynessKey = "soil_dryness";

    if(object.has_key(soil_drynessKey))
    {
        bourne::json value = object[soil_drynessKey];



        jsonToValue(&soil_dryness, value, "int");


    }

    const char *firmnessKey = "firmness";

    if(object.has_key(firmnessKey))
    {
        bourne::json value = object[firmnessKey];




        BerryFirmnessSummary* obj = &firmness;
		obj->fromJson(value.dump());

    }

    const char *flavorsKey = "flavors";

    if(object.has_key(flavorsKey))
    {
        bourne::json value = object[flavorsKey];


        std::list<BerryDetail_flavors_inner> flavors_list;
        BerryDetail_flavors_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavors_list.push_back(element);
        }
        flavors = flavors_list;


    }

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        ItemSummary* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *natural_gift_typeKey = "natural_gift_type";

    if(object.has_key(natural_gift_typeKey))
    {
        bourne::json value = object[natural_gift_typeKey];




        TypeSummary* obj = &natural_gift_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
BerryDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["growth_time"] = getGrowthTime();






    object["max_harvest"] = getMaxHarvest();






    object["natural_gift_power"] = getNaturalGiftPower();






    object["size"] = getSize();






    object["smoothness"] = getSmoothness();






    object["soil_dryness"] = getSoilDryness();







	object["firmness"] = getFirmness().toJson();




    std::list<BerryDetail_flavors_inner> flavors_list = getFlavors();
    bourne::json flavors_arr = bourne::json::array();

    for(auto& var : flavors_list)
    {
        BerryDetail_flavors_inner obj = var;
        flavors_arr.append(obj.toJson());
    }
    object["flavors"] = flavors_arr;








	object["item"] = getItem().toJson();






	object["natural_gift_type"] = getNaturalGiftType().toJson();


    return object;

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



