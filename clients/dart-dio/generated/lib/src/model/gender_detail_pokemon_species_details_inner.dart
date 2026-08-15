//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_detail_pokemon_species_details_inner.g.dart';

/// GenderDetailPokemonSpeciesDetailsInner
///
/// Properties:
/// * [rate] 
/// * [pokemonSpecies] 
@BuiltValue()
abstract class GenderDetailPokemonSpeciesDetailsInner implements Built<GenderDetailPokemonSpeciesDetailsInner, GenderDetailPokemonSpeciesDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'rate')
  int get rate;

  @BuiltValueField(wireName: r'pokemon_species')
  AbilityDetailPokemonInnerPokemon get pokemonSpecies;

  GenderDetailPokemonSpeciesDetailsInner._();

  factory GenderDetailPokemonSpeciesDetailsInner([void updates(GenderDetailPokemonSpeciesDetailsInnerBuilder b)]) = _$GenderDetailPokemonSpeciesDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderDetailPokemonSpeciesDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderDetailPokemonSpeciesDetailsInner> get serializer => _$GenderDetailPokemonSpeciesDetailsInnerSerializer();
}

class _$GenderDetailPokemonSpeciesDetailsInnerSerializer implements PrimitiveSerializer<GenderDetailPokemonSpeciesDetailsInner> {
  @override
  final Iterable<Type> types = const [GenderDetailPokemonSpeciesDetailsInner, _$GenderDetailPokemonSpeciesDetailsInner];

  @override
  final String wireName = r'GenderDetailPokemonSpeciesDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderDetailPokemonSpeciesDetailsInner object, {
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
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderDetailPokemonSpeciesDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderDetailPokemonSpeciesDetailsInnerBuilder result,
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
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
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
  GenderDetailPokemonSpeciesDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderDetailPokemonSpeciesDetailsInnerBuilder();
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

