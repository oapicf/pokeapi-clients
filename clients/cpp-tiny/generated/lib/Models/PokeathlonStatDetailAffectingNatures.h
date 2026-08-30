
/*
 * PokeathlonStatDetail_affecting_natures.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_H_
#define TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokeathlonStatDetail_affecting_natures_decrease_inner.h"
#include "PokeathlonStatDetail_affecting_natures_increase_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatDetail_affecting_natures{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatDetail_affecting_natures();
    PokeathlonStatDetail_affecting_natures(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatDetail_affecting_natures();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> getDecrease();

	/*! \brief Set 
	 */
	void setDecrease(std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> decrease);
	/*! \brief Get 
	 */
	std::list<PokeathlonStatDetail_affecting_natures_increase_inner> getIncrease();

	/*! \brief Set 
	 */
	void setIncrease(std::list<PokeathlonStatDetail_affecting_natures_increase_inner> increase);


    private:
    std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> decrease;
    std::list<PokeathlonStatDetail_affecting_natures_increase_inner> increase;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_H_ */
