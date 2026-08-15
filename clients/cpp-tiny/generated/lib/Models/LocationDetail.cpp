

#include "LocationDetail.h"

using namespace Tiny;

LocationDetail::LocationDetail()
{
	id = int(0);
	name = std::string();
	region = RegionSummary();
	names = std::list<LocationName>();
	game_indices = std::list<LocationGameIndex>();
	areas = std::list<LocationAreaSummary>();
}

LocationDetail::LocationDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationDetail::~LocationDetail()
{

}

void
LocationDetail::fromJson(std::string jsonObj)
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

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionSummary* obj = &region;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<LocationName> names_list;
        LocationName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *game_indicesKey = "game_indices";

    if(object.has_key(game_indicesKey))
    {
        bourne::json value = object[game_indicesKey];


        std::list<LocationGameIndex> game_indices_list;
        LocationGameIndex element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            game_indices_list.push_back(element);
        }
        game_indices = game_indices_list;


    }

    const char *areasKey = "areas";

    if(object.has_key(areasKey))
    {
        bourne::json value = object[areasKey];


        std::list<LocationAreaSummary> areas_list;
        LocationAreaSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            areas_list.push_back(element);
        }
        areas = areas_list;


    }


}

bourne::json
LocationDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["region"] = getRegion().toJson();




    std::list<LocationName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        LocationName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<LocationGameIndex> game_indices_list = getGameIndices();
    bourne::json game_indices_arr = bourne::json::array();

    for(auto& var : game_indices_list)
    {
        LocationGameIndex obj = var;
        game_indices_arr.append(obj.toJson());
    }
    object["game_indices"] = game_indices_arr;






    std::list<LocationAreaSummary> areas_list = getAreas();
    bourne::json areas_arr = bourne::json::array();

    for(auto& var : areas_list)
    {
        LocationAreaSummary obj = var;
        areas_arr.append(obj.toJson());
    }
    object["areas"] = areas_arr;




    return object;

}

int
LocationDetail::getId()
{
	return id;
}

void
LocationDetail::setId(int  id)
{
	this->id = id;
}

std::string
LocationDetail::getName()
{
	return name;
}

void
LocationDetail::setName(std::string  name)
{
	this->name = name;
}

RegionSummary
LocationDetail::getRegion()
{
	return region;
}

void
LocationDetail::setRegion(RegionSummary  region)
{
	this->region = region;
}

std::list<LocationName>
LocationDetail::getNames()
{
	return names;
}

void
LocationDetail::setNames(std::list <LocationName> names)
{
	this->names = names;
}

std::list<LocationGameIndex>
LocationDetail::getGameIndices()
{
	return game_indices;
}

void
LocationDetail::setGameIndices(std::list <LocationGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

std::list<LocationAreaSummary>
LocationDetail::getAreas()
{
	return areas;
}

void
LocationDetail::setAreas(std::list <LocationAreaSummary> areas)
{
	this->areas = areas;
}



