

#include "PaginatedBerryFirmnessSummaryList.h"

using namespace Tiny;

PaginatedBerryFirmnessSummaryList::PaginatedBerryFirmnessSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<BerryFirmnessSummary>();
}

PaginatedBerryFirmnessSummaryList::PaginatedBerryFirmnessSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedBerryFirmnessSummaryList::~PaginatedBerryFirmnessSummaryList()
{

}

void
PaginatedBerryFirmnessSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<BerryFirmnessSummary> results_list;
        BerryFirmnessSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedBerryFirmnessSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<BerryFirmnessSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        BerryFirmnessSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedBerryFirmnessSummaryList::getCount()
{
	return count;
}

void
PaginatedBerryFirmnessSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedBerryFirmnessSummaryList::getNext()
{
	return next;
}

void
PaginatedBerryFirmnessSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedBerryFirmnessSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedBerryFirmnessSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<BerryFirmnessSummary>
PaginatedBerryFirmnessSummaryList::getResults()
{
	return results;
}

void
PaginatedBerryFirmnessSummaryList::setResults(std::list<BerryFirmnessSummary> results)
{
	this->results = results;
}



