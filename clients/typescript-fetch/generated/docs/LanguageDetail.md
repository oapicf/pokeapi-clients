
# LanguageDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`official` | boolean
`iso639` | string
`iso3166` | string
`names` | [Array&lt;LanguageName&gt;](LanguageName.md)

## Example

```typescript
import type { LanguageDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "official": null,
  "iso639": null,
  "iso3166": null,
  "names": null,
} satisfies LanguageDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LanguageDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


