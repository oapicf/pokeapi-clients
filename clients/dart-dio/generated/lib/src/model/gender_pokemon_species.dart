//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_pokemon_species.g.dart';

/// GenderPokemonSpecies
///
/// Properties:
/// * [rate] - The chance of this Pokémon being female, in eighths; or -1 for genderless.
/// * [pokemonSpecies] - A Pokémon species that can be the referenced gender.
@BuiltValue()
abstract class GenderPokemonSpecies implements Built<GenderPokemonSpecies, GenderPokemonSpeciesBuilder> {
  /// The chance of this Pokémon being female, in eighths; or -1 for genderless.
  @BuiltValueField(wireName: r'rate')
  int get rate;

  /// A Pokémon species that can be the referenced gender.
  @BuiltValueField(wireName: r'pokemon_species')
  PokemonSpeciesSummary get pokemonSpecies;

  GenderPokemonSpecies._();

  factory GenderPokemonSpecies([void updates(GenderPokemonSpeciesBuilder b)]) = _$GenderPokemonSpecies;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderPokemonSpeciesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderPokemonSpecies> get serializer => _$GenderPokemonSpeciesSerializer();
}

class _$GenderPokemonSpeciesSerializer implements PrimitiveSerializer<GenderPokemonSpecies> {
  @override
  final Iterable<Type> types = const [GenderPokemonSpecies, _$GenderPokemonSpecies];

  @override
  final String wireName = r'GenderPokemonSpecies';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderPokemonSpecies object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'rate';
    yield serializers.serialize(
      object.rate,
      specifiedType: const FullType(int),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderPokemonSpecies object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderPokemonSpeciesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rate = valueDes;
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
          result.pokemonSpecies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GenderPokemonSpecies deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderPokemonSpeciesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


