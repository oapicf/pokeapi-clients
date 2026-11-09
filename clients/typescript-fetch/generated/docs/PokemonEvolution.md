
# PokemonEvolution


## Properties

Name | Type
------------ | -------------
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`isDefault` | boolean
`item` | [ItemSummary](ItemSummary.md)
`trigger` | [EvolutionTriggerSummary](EvolutionTriggerSummary.md)
`gender` | number
`heldItem` | [ItemSummary](ItemSummary.md)
`knownMove` | [PokemonEvolutionKnownMove](PokemonEvolutionKnownMove.md)
`knownMoveType` | [PokemonEvolutionKnownMove](PokemonEvolutionKnownMove.md)
`location` | [LocationSummary](LocationSummary.md)
`minLevel` | number
`minHappiness` | number
`minBeauty` | number
`minAffection` | number
`nearSpecialRock` | boolean
`needsMultiplayer` | boolean
`needsOverworldRain` | boolean
`partySpecies` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`partyType` | [TypeSummary](TypeSummary.md)
`relativePhysicalStats` | number
`timeOfDay` | string
`tradeSpecies` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`turnUpsideDown` | boolean
`region` | [RegionSummary](RegionSummary.md)
`requiredPokemonForm` | [PokemonFormSummary](PokemonFormSummary.md)
`evolvedPokemonForm` | [PokemonFormSummary](PokemonFormSummary.md)
`usedMove` | [MoveSummary](MoveSummary.md)
`minMoveCount` | number
`minSteps` | number
`minDamageTaken` | number
`allowedNatures` | [Array&lt;NatureSummary&gt;](NatureSummary.md)
`conditionExpression` | [EvolutionConditionExpression](EvolutionConditionExpression.md)

## Example

```typescript
import type { PokemonEvolution } from ''

// TODO: Update the object below with actual values
const example = {
  "versionGroup": null,
  "isDefault": null,
  "item": null,
  "trigger": null,
  "gender": null,
  "heldItem": null,
  "knownMove": null,
  "knownMoveType": null,
  "location": null,
  "minLevel": null,
  "minHappiness": null,
  "minBeauty": null,
  "minAffection": null,
  "nearSpecialRock": null,
  "needsMultiplayer": null,
  "needsOverworldRain": null,
  "partySpecies": null,
  "partyType": null,
  "relativePhysicalStats": null,
  "timeOfDay": null,
  "tradeSpecies": null,
  "turnUpsideDown": null,
  "region": null,
  "requiredPokemonForm": null,
  "evolvedPokemonForm": null,
  "usedMove": null,
  "minMoveCount": null,
  "minSteps": null,
  "minDamageTaken": null,
  "allowedNatures": null,
  "conditionExpression": null,
} satisfies PokemonEvolution

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonEvolution
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


