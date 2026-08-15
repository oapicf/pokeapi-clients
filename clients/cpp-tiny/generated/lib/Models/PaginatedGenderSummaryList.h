
/*
 * PaginatedGenderSummaryList.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PaginatedGenderSummaryList_H_
#define TINY_CPP_CLIENT_PaginatedGenderSummaryList_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenderSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedGenderSummaryList{
public:

    /*! \brief Constructor.
	 */
    PaginatedGenderSummaryList();
    PaginatedGenderSummaryList(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PaginatedGenderSummaryList();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<GenderSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <GenderSummary> results);


    private:
    int count{};
    std::string next{};
    std::string previous{};
    std::list<GenderSummary> results;
};
}

#endif /* TINY_CPP_CLIENT_PaginatedGenderSummaryList_H_ */
