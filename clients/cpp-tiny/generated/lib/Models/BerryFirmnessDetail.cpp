

#include "BerryFirmnessDetail.h"

using namespace Tiny;

BerryFirmnessDetail::BerryFirmnessDetail()
{
	id = int(0);
	name = std::string();
	berries = std::list<BerrySummary>();
	names = std::list<BerryFirmnessName>();
}

BerryFirmnessDetail::BerryFirmnessDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFirmnessDetail::~BerryFirmnessDetail()
{

}

void
BerryFirmnessDetail::fromJson(std::string jsonObj)
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

    const char *berriesKey = "berries";

    if(object.has_key(berriesKey))
    {
        bourne::json value = object[berriesKey];


        std::list<BerrySummary> berries_list;
        BerrySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            berries_list.push_back(element);
        }
        berries = berries_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<BerryFirmnessName> names_list;
        BerryFirmnessName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
BerryFirmnessDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<BerrySummary> berries_list = getBerries();
    bourne::json berries_arr = bourne::json::array();

    for(auto& var : berries_list)
    {
        BerrySummary obj = var;
        berries_arr.append(obj.toJson());
    }
    object["berries"] = berries_arr;






    std::list<BerryFirmnessName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        BerryFirmnessName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
BerryFirmnessDetail::getId()
{
	return id;
}

void
BerryFirmnessDetail::setId(int id)
{
	this->id = id;
}

std::string
BerryFirmnessDetail::getName()
{
	return name;
}

void
BerryFirmnessDetail::setName(std::string name)
{
	this->name = name;
}

std::list<BerrySummary>
BerryFirmnessDetail::getBerries()
{
	return berries;
}

void
BerryFirmnessDetail::setBerries(std::list<BerrySummary> berries)
{
	this->berries = berries;
}

std::list<BerryFirmnessName>
BerryFirmnessDetail::getNames()
{
	return names;
}

void
BerryFirmnessDetail::setNames(std::list<BerryFirmnessName> names)
{
	this->names = names;
}



