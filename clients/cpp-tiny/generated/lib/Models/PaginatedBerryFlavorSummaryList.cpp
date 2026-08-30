

#include "PaginatedBerryFlavorSummaryList.h"

using namespace Tiny;

PaginatedBerryFlavorSummaryList::PaginatedBerryFlavorSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<BerryFlavorSummary>();
}

PaginatedBerryFlavorSummaryList::PaginatedBerryFlavorSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedBerryFlavorSummaryList::~PaginatedBerryFlavorSummaryList()
{

}

void
PaginatedBerryFlavorSummaryList::fromJson(std::string jsonObj)
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


        std::list<BerryFlavorSummary> results_list;
        BerryFlavorSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedBerryFlavorSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<BerryFlavorSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        BerryFlavorSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedBerryFlavorSummaryList::getCount()
{
	return count;
}

void
PaginatedBerryFlavorSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedBerryFlavorSummaryList::getNext()
{
	return next;
}

void
PaginatedBerryFlavorSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedBerryFlavorSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedBerryFlavorSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<BerryFlavorSummary>
PaginatedBerryFlavorSummaryList::getResults()
{
	return results;
}

void
PaginatedBerryFlavorSummaryList::setResults(std::list<BerryFlavorSummary> results)
{
	this->results = results;
}



