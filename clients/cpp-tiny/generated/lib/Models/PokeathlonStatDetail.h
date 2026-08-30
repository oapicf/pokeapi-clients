
/*
 * PokeathlonStatDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatDetail_H_
#define TINY_CPP_CLIENT_PokeathlonStatDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokeathlonStatDetail_affecting_natures.h"
#include "PokeathlonStatName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatDetail{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatDetail();
    PokeathlonStatDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	PokeathlonStatDetail_affecting_natures getAffectingNatures();

	/*! \brief Set 
	 */
	void setAffectingNatures(PokeathlonStatDetail_affecting_natures affecting_natures);
	/*! \brief Get 
	 */
	std::list<PokeathlonStatName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<PokeathlonStatName> names);


    private:
    int id{};
    std::string name{};
    PokeathlonStatDetail_affecting_natures affecting_natures;
    std::list<PokeathlonStatName> names;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatDetail_H_ */
