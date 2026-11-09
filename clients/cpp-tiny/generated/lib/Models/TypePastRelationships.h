
/*
 * TypePastRelationships.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypePastRelationships_H_
#define TINY_CPP_CLIENT_TypePastRelationships_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include "TypeRelationships.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypePastRelationships{
public:

    /*! \brief Constructor.
	 */
    TypePastRelationships();
    TypePastRelationships(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypePastRelationships();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The last generation in which the referenced type had the listed damage relations
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced type had the listed damage relations
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get The damage relations the referenced type had up to and including the listed generation
	 */
	TypeRelationships getDamageRelations();

	/*! \brief Set The damage relations the referenced type had up to and including the listed generation
	 */
	void setDamageRelations(TypeRelationships damage_relations);


    private:
    GenerationSummary generation;
    TypeRelationships damage_relations;
};
}

#endif /* TINY_CPP_CLIENT_TypePastRelationships_H_ */
