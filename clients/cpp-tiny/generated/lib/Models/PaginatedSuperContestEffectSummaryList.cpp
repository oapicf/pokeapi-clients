

#include "PaginatedSuperContestEffectSummaryList.h"

using namespace Tiny;

PaginatedSuperContestEffectSummaryList::PaginatedSuperContestEffectSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<SuperContestEffectSummary>();
}

PaginatedSuperContestEffectSummaryList::PaginatedSuperContestEffectSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedSuperContestEffectSummaryList::~PaginatedSuperContestEffectSummaryList()
{

}

void
PaginatedSuperContestEffectSummaryList::fromJson(std::string jsonObj)
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


        std::list<SuperContestEffectSummary> results_list;
        SuperContestEffectSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedSuperContestEffectSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<SuperContestEffectSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        SuperContestEffectSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedSuperContestEffectSummaryList::getCount()
{
	return count;
}

void
PaginatedSuperContestEffectSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedSuperContestEffectSummaryList::getNext()
{
	return next;
}

void
PaginatedSuperContestEffectSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedSuperContestEffectSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedSuperContestEffectSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<SuperContestEffectSummary>
PaginatedSuperContestEffectSummaryList::getResults()
{
	return results;
}

void
PaginatedSuperContestEffectSummaryList::setResults(std::list <SuperContestEffectSummary> results)
{
	this->results = results;
}



