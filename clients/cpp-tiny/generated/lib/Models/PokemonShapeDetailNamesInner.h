
/*
 * PokemonShapeDetail_names_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonShapeDetail_names_inner_H_
#define TINY_CPP_CLIENT_PokemonShapeDetail_names_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonShapeDetail_names_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonShapeDetail_names_inner();
    PokemonShapeDetail_names_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonShapeDetail_names_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string url{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonShapeDetail_names_inner_H_ */
