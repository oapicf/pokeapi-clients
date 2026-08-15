

#include "PaginatedGrowthRateSummaryList.h"

using namespace Tiny;

PaginatedGrowthRateSummaryList::PaginatedGrowthRateSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<GrowthRateSummary>();
}

PaginatedGrowthRateSummaryList::PaginatedGrowthRateSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedGrowthRateSummaryList::~PaginatedGrowthRateSummaryList()
{

}

void
PaginatedGrowthRateSummaryList::fromJson(std::string jsonObj)
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


        std::list<GrowthRateSummary> results_list;
        GrowthRateSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedGrowthRateSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<GrowthRateSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        GrowthRateSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedGrowthRateSummaryList::getCount()
{
	return count;
}

void
PaginatedGrowthRateSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedGrowthRateSummaryList::getNext()
{
	return next;
}

void
PaginatedGrowthRateSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedGrowthRateSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedGrowthRateSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<GrowthRateSummary>
PaginatedGrowthRateSummaryList::getResults()
{
	return results;
}

void
PaginatedGrowthRateSummaryList::setResults(std::list <GrowthRateSummary> results)
{
	this->results = results;
}



