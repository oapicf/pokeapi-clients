package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.AbilityName;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.TypeDetailDamageRelations;
import org.openapitools.server.model.TypeDetailPastDamageRelationsInner;
import org.openapitools.server.model.TypeDetailPokemonInner;
import org.openapitools.server.model.TypeDetailSpritesValueValue;
import org.openapitools.server.model.TypeGameIndex;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Serializer for the Type resource
 */
public class TypeDetail   {

    private Integer id;
    private String name;
    private TypeDetailDamageRelations damageRelations;
    private List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();
    private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();
    private GenerationSummary generation;
    private MoveDamageClassSummary moveDamageClass;
    private List<@Valid AbilityName> names = new ArrayList<>();
    private List<@Valid TypeDetailPokemonInner> pokemon = new ArrayList<>();
    private List<@Valid MoveSummary> moves = new ArrayList<>();
    private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

    /**
     * Default constructor.
     */
    public TypeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetail.
     *
     * @param id id
     * @param name name
     * @param damageRelations damageRelations
     * @param pastDamageRelations pastDamageRelations
     * @param gameIndices gameIndices
     * @param generation generation
     * @param moveDamageClass moveDamageClass
     * @param names names
     * @param pokemon pokemon
     * @param moves moves
     * @param sprites sprites
     */
    public TypeDetail(
        Integer id, 
        String name, 
        TypeDetailDamageRelations damageRelations, 
        List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations, 
        List<@Valid TypeGameIndex> gameIndices, 
        GenerationSummary generation, 
        MoveDamageClassSummary moveDamageClass, 
        List<@Valid AbilityName> names, 
        List<@Valid TypeDetailPokemonInner> pokemon, 
        List<@Valid MoveSummary> moves, 
        Map<String, Map<String, TypeDetailSpritesValueValue>> sprites
    ) {
        this.id = id;
        this.name = name;
        this.damageRelations = damageRelations;
        this.pastDamageRelations = pastDamageRelations;
        this.gameIndices = gameIndices;
        this.generation = generation;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
        this.pokemon = pokemon;
        this.moves = moves;
        this.sprites = sprites;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get damageRelations
     * @return damageRelations
     */
    public TypeDetailDamageRelations getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
     * Get pastDamageRelations
     * @return pastDamageRelations
     */
    public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
        return pastDamageRelations;
    }

    public void setPastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
        this.pastDamageRelations = pastDamageRelations;
    }

    /**
     * Get gameIndices
     * @return gameIndices
     */
    public List<@Valid TypeGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get generation
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * Get moveDamageClass
     * @return moveDamageClass
     */
    public MoveDamageClassSummary getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid AbilityName> getNames() {
        return names;
    }

    public void setNames(List<@Valid AbilityName> names) {
        this.names = names;
    }

    /**
     * Get pokemon
     * @return pokemon
     */
    public List<@Valid TypeDetailPokemonInner> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
     * Get sprites
     * @return sprites
     */
    public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
        return sprites;
    }

    public void setSprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
        this.sprites = sprites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
        sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

